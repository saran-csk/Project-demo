# Project Demo - Team Collaboration Repository

## 🎯 Overview

**Project Demo** is a collaborative Java project designed for team-based development with clear module separation and best practices for code organization.

**Owner:** [saran-csk](https://github.com/saran-csk)  
**Repository:** `saran-csk/Project-demo`  
**Language:** Java (100%)  
**Purpose:** Demo project for understanding and team collaboration

---

## 📋 Quick Start

### Prerequisites
- Java 11 or higher
- Maven 3.6+
- Git

### Setup
```bash
# Clone the repository
git clone https://github.com/saran-csk/Project-demo.git
cd Project-demo

# Build the project
mvn clean install

# Run the application
mvn exec:java -Dexec.mainClass="com.project.Main"

# Run tests
mvn test
```

---

## 📁 Project Structure

```
Project-demo/
├── README.md                          # This file
├── CONTRIBUTING.md                    # Contribution guidelines
├── TEAM_GUIDE.md                      # Team member guide
├── pom.xml                            # Maven configuration
│
├── src/
│   ├── main/java/com/project/
│   │   ├── Main.java                  # Entry point
│   │   ├── core/                      # Core business logic (Module 1)
│   │   ├── api/                       # REST API layer (Module 2)
│   │   ├── service/                   # Service layer (Module 3)
│   │   └── util/                      # Utilities (Module 4)
│   │
│   └── test/java/com/project/
│       └── *Test.java                 # Unit tests
│
├── config/
│   ├── application.properties         # Main config
│   └── application-dev.properties     # Dev config
│
├── docs/
│   ├── ARCHITECTURE.md                # System architecture
│   └── API.md                         # API documentation
│
└── .gitignore                         # Git ignore rules
```

---

## 👥 Team Structure

### Module Assignments

| Module | Folder | Lead | Purpose |
|--------|--------|------|----------|
| **Core** | `src/main/java/com/project/core/` | TBD | Business entities & logic |
| **API** | `src/main/java/com/project/api/` | TBD | REST endpoints |
| **Service** | `src/main/java/com/project/service/` | TBD | Service layer logic |
| **Util** | `src/main/java/com/project/util/` | TBD | Helper utilities |

---

## 🚀 Development Workflow

### 1. Create Feature Branch
```bash
git checkout -b feature/your-module-name
```

**Branch naming:**
- `feature/feature-name` - New features
- `bugfix/bug-name` - Bug fixes
- `hotfix/issue-name` - Critical fixes

### 2. Work on Your Module
- Only modify files in your assigned folder
- Follow Java conventions
- Write clean, documented code

### 3. Commit Changes
```bash
git add .
git commit -m "[MODULE] Description of changes"
```

### 4. Push and Create PR
```bash
git push origin feature/your-module-name
```

### 5. Code Review & Merge
- Wait for owner/maintainer review
- Address feedback
- Merge after approval

---

## 📝 Commit Message Guidelines

Format:
```
[MODULE] Brief description

- Specific change 1
- Specific change 2
- Fixes #issue_number (if applicable)
```

---

## 👥 How to Add Team Members

1. Go to [Repository Settings](https://github.com/saran-csk/Project-demo/settings)
2. Click **Collaborators & teams** (or **Manage access**)
3. Click **Add people**
4. Search for team member username
5. Select permission: **Write** (recommended for developers)
6. Click **Add**

---

## 📚 Documentation

- [TEAM_GUIDE.md](./TEAM_GUIDE.md) - Comprehensive team guidelines
- [CONTRIBUTING.md](./CONTRIBUTING.md) - Contribution standards
- [docs/ARCHITECTURE.md](./docs/ARCHITECTURE.md) - System architecture
- [docs/API.md](./docs/API.md) - API documentation

---

## 🏗️ Build & Test

```bash
# Build
mvn clean install

# Run tests
mvn test

# Build JAR
mvn package

# Run application
mvn exec:java -Dexec.mainClass="com.project.Main"
```

---

## 📜 License

This project is open source and available under the MIT License.

---

**Last Updated:** 2026-05-15