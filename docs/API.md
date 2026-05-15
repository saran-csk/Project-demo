# Project Demo - API Documentation

## Base URL
```
http://localhost:8080/api
```

---

## Authentication

All endpoints require JWT token in header:
```
Authorization: Bearer <token>
```

---

## Endpoints

### User Management

#### Get User
```
GET /api/users/{id}
```

**Response:**
```json
{
  "id": "123",
  "username": "john_doe",
  "email": "john@example.com",
  "createdAt": "2026-05-15T10:00:00Z"
}
```

---

#### Create User
```
POST /api/users
```

**Request:**
```json
{
  "username": "john_doe",
  "email": "john@example.com",
  "password": "secure_password"
}
```

**Response:**
```json
{
  "id": "123",
  "username": "john_doe",
  "email": "john@example.com",
  "createdAt": "2026-05-15T10:00:00Z"
}
```

---

#### Update User
```
PUT /api/users/{id}
```

**Request:**
```json
{
  "email": "newemail@example.com"
}
```

---

#### Delete User
```
DELETE /api/users/{id}
```

---

## Error Responses

### 400 Bad Request
```json
{
  "error": "Invalid input",
  "message": "Email is required"
}
```

### 401 Unauthorized
```json
{
  "error": "Unauthorized",
  "message": "Invalid or missing token"
}
```

### 404 Not Found
```json
{
  "error": "Not found",
  "message": "User not found"
}
```

### 500 Internal Server Error
```json
{
  "error": "Internal server error",
  "message": "An unexpected error occurred"
}
```

---

## Status Codes

| Code | Meaning |
|------|----------|
| 200 | OK |
| 201 | Created |
| 400 | Bad Request |
| 401 | Unauthorized |
| 403 | Forbidden |
| 404 | Not Found |
| 500 | Internal Server Error |

---

## Rate Limiting

- **Limit:** 1000 requests per hour
- **Header:** `X-RateLimit-Remaining`

---

## Examples

### Using cURL
```bash
# Get user
curl -H "Authorization: Bearer token123" \
  http://localhost:8080/api/users/123

# Create user
curl -X POST \
  -H "Content-Type: application/json" \
  -d '{"username":"john","email":"john@example.com","password":"pass"}' \
  http://localhost:8080/api/users
```

### Using Java
```java
HttpClient client = HttpClient.newHttpClient();
HttpRequest request = HttpRequest.newBuilder()
    .uri(URI.create("http://localhost:8080/api/users/123"))
    .header("Authorization", "Bearer token123")
    .GET()
    .build();
HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
```

---

**API Version:** 1.0  
**Last Updated:** 2026-05-15