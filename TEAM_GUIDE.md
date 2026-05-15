# Team Collaboration Guide

## 🎯 Welcome to Project Demo!

This guide helps team members understand the project structure, workflow, and best practices.

---

## 📊 Module Assignments

### 1. **CORE Module** (`src/main/java/com/project/core/`)
**Responsibilities:**
- User management and authentication
- Data models and entities
- Business logic

**Key Files:**
- `User.java` - User entity
- `UserManager.java` - User management logic
- `Config.java` - Configuration

**Team Member:** [Assign username]

---

### 2. **API Module** (`src/main/java/com/project/api/`)
**Responsibilities:**
- REST API endpoints
- Request/response handling
- API documentation

**Key Files:**
- `UserController.java` - User endpoints
- `ApiResponse.java` - Response wrapper
- `ErrorHandler.java` - Error handling

**Team Member:** [Assign username]

---

### 3. **SERVICE Module** (`src/main/java/com/project/service/`)
**Responsibilities:**
- Business service logic
- Data processing
- External integrations

**Key Files:**
- `UserService.java` - User services
- `ValidationService.java` - Data validation
- `ExternalService.java` - Third-party integrations

**Team Member:** [Assign username]

---

### 4. **UTIL Module** (`src/main/java/com/project/util/`)
**Responsibilities:**
- Helper utilities
- Common functions
- Logging and monitoring

**Key Files:**
- `DateUtils.java` - Date operations
- `StringUtils.java` - String operations
- `Logger.java` - Logging

**Team Member:** [Assign username]

---

## 🚀 Getting Started

### Step 1: Clone Repository
```bash
git clone https://github.com/saran-csk/Project-demo.git
cd Project-demo
```

### Step 2: Setup Development Environment
```bash
# Install dependencies
mvn clean install

# Verify setup
mvn test
```

### Step 3: Create Your Feature Branch
```bash
# Update main first
git pull origin main

# Create branch for your module
git checkout -b feature/your-module-name
```

---

## 💻 Development Workflow

### Example: Adding a new feature to CORE module

```bash
# 1. Update and create branch
git pull origin main
git checkout -b feature/user-validation

# 2. Make changes
# Edit: src/main/java/com/project/core/UserManager.java
# Add: src/main/java/com/project/core/UserValidator.java
# Add test: src/test/java/com/project/core/UserValidatorTest.java

# 3. Verify changes work
mvn clean test

# 4. Commit with proper message
git add src/
git commit -m "[CORE] Add user validation logic

- Implement email validation
- Implement password strength checker
- Add unit tests"

# 5. Push to remote
git push origin feature/user-validation

# 6. Create Pull Request on GitHub
# - Go to https://github.com/saran-csk/Project-demo
# - Click "Create Pull Request"
# - Fill in title and description
# - Wait for review
```

---

## 📝 Commit Guidelines

### Format
```
[MODULE-NAME] Brief description

Detailed explanation:
- Change 1
- Change 2
- Fixes #123
```

### Examples

✅ **Good:**
```
[CORE] Implement user authentication

- Add login functionality
- Add password hashing with bcrypt
- Add session management
- Fixes #15
```

❌ **Bad:**
```
fixed bugs
```

---

## ✅ Before Creating a Pull Request

Checklist:
- [ ] Code compiles: `mvn clean compile`
- [ ] All tests pass: `mvn test`
- [ ] No console errors or warnings
- [ ] Changes only in your assigned folder
- [ ] Added/updated unit tests
- [ ] Updated documentation if needed
- [ ] Followed code style (Java conventions)
- [ ] Commit messages are clear
- [ ] No unrelated changes

---

## 🔄 Pull Request Process

### Step 1: Create PR on GitHub
1. Go to [Pull Requests](https://github.com/saran-csk/Project-demo/pulls)
2. Click **New Pull Request**
3. Select your branch
4. Fill in title and description
5. Click **Create Pull Request**

### Step 2: PR Description Template
```markdown
## Description
Brief description of changes

## Type of Change
- [ ] New feature
- [ ] Bug fix
- [ ] Documentation update

## Related Issues
Fixes #123

## Changes Made
- Change 1
- Change 2

## Testing
How to test these changes:
1. Step 1
2. Step 2

## Screenshots (if applicable)
[Add screenshots here]
```

### Step 3: Code Review
- Owner/maintainer will review
- Address all feedback
- Make requested changes
- Reply to comments

### Step 4: Merge
- After approval, owner merges PR
- Your branch is deleted
- Changes are now in main

---

## 🐛 Bug Reporting

### Create an Issue
1. Go to [Issues](https://github.com/saran-csk/Project-demo/issues)
2. Click **New Issue**
3. Use template:

```markdown
**Title:** [MODULE] Brief bug description

**Description:**
Clear description of the bug

**Steps to Reproduce:**
1. Step 1
2. Step 2
3. Step 3

**Expected Behavior:**
What should happen

**Actual Behavior:**
What actually happened

**Error Message:**
```
error message here
```

**Screenshots:**
[Add if applicable]
```

---

## 📖 Code Style Guide

### Java Naming Conventions
```java
// Classes: PascalCase
public class UserManager { }

// Methods: camelCase
public void validateUser() { }

// Constants: UPPER_SNAKE_CASE
private static final String API_URL = "...";

// Variables: camelCase
String userName = "john";
```

### Formatting
```java
// Good: Clear and readable
public class UserService {
    private UserRepository repository;
    
    public User getUser(String id) {
        return repository.findById(id);
    }
}

// Bad: Hard to read
public class UserService{private UserRepository repository;public User getUser(String id){return repository.findById(id);}}
```

---

## 🧪 Testing Guide

### Writing Unit Tests
```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTest {
    
    @Test
    public void testValidEmail() {
        assertTrue(UserValidator.isValidEmail("user@example.com"));
    }
    
    @Test
    public void testInvalidEmail() {
        assertFalse(UserValidator.isValidEmail("invalid-email"));
    }
}
```

### Run Tests
```bash
# Run all tests
mvn test

# Run specific test
mvn test -Dtest=UserValidatorTest

# Run with coverage
mvn test jacoco:report
```

---

## 🔐 Repository Rules

### ✅ DO
- Use feature branches for all changes
- Create PRs before merging to main
- Write descriptive commit messages
- Test code before pushing
- Review others' code carefully
- Keep modules separated
- Update documentation
- Communicate with team

### ❌ DON'T
- Don't commit directly to main
- Don't force push to main
- Don't ignore failing tests
- Don't make unrelated changes
- Don't skip code reviews
- Don't modify other modules' code
- Don't break the build
- Don't use unclear commit messages

---

## 🆘 Common Issues & Solutions

### Issue: Merge Conflicts
```bash
# Pull latest changes
git pull origin main

# Resolve conflicts in editor
# Files with <<<<<<< ======= >>>>>>> markers

# After resolving
git add .
git commit -m "[MERGE] Resolve conflicts with main"
git push origin your-branch
```

### Issue: Forgot to create branch
```bash
# Create branch with current changes
git checkout -b feature/my-feature

# Now commit and push
git commit -m "[MODULE] Your message"
git push origin feature/my-feature
```

### Issue: Need to update your branch
```bash
# Fetch latest main
git fetch origin

# Rebase your branch
git rebase origin/main

# Push (might need -f for feature branches only)
git push origin your-branch -f
```

---

## 📞 Need Help?

- **Project Owner:** [saran-csk](https://github.com/saran-csk)
- **Issues:** [Report here](https://github.com/saran-csk/Project-demo/issues)
- **Discussions:** [Ask questions](https://github.com/saran-csk/Project-demo/discussions)

---

**Happy Coding! 🚀**