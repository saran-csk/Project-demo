# Contributing to Project Demo

## Code of Conduct

Be respectful, collaborative, and professional. We welcome all contributors!

---

## How to Contribute

### 1. Fork & Clone (if external contributor)
```bash
git clone https://github.com/saran-csk/Project-demo.git
cd Project-demo
```

### 2. Create Feature Branch
```bash
git checkout -b feature/your-feature-name
```

### 3. Make Changes
- Follow code style guidelines
- Add tests for new features
- Update documentation
- Keep commits focused and well-messaged

### 4. Test Your Changes
```bash
mvn clean test
```

### 5. Commit & Push
```bash
git commit -m "[MODULE] Description"
git push origin feature/your-feature-name
```

### 6. Create Pull Request
- Clear title and description
- Link related issues
- Wait for review
- Address feedback

---

## Coding Standards

### Java Style
- Follow [Java Coding Conventions](https://www.oracle.com/java/technologies/javase/codeconventions-contents.html)
- Use meaningful variable names
- Keep methods small and focused
- Add JavaDoc comments for public methods

### Example
```java
/**
 * Validates user email address.
 * 
 * @param email the email to validate
 * @return true if email is valid, false otherwise
 */
public static boolean isValidEmail(String email) {
    // Implementation
    return email != null && email.contains("@");
}
```

---

## Testing Requirements

- All new features must have tests
- All tests must pass before PR
- Maintain or improve code coverage
- Run: `mvn test`

---

## Git Workflow

### Branch Naming
- `feature/description` - New features
- `bugfix/description` - Bug fixes
- `hotfix/description` - Critical fixes
- `docs/description` - Documentation

### Commit Messages
```
[MODULE] Brief description

Detailed explanation:
- Point 1
- Point 2
- Fixes #issue_number
```

---

## Pull Request Checklist

- [ ] Branch created from main
- [ ] Code follows style guide
- [ ] Tests added/updated
- [ ] All tests pass locally
- [ ] Documentation updated
- [ ] No unrelated changes
- [ ] Commits are descriptive
- [ ] PR description is clear

---

## Questions?

Open an issue or reach out to the project owner!
