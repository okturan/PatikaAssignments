# Patika Java Assignments

> **Status:** completed multi-week learning archive. The repository records Java and SQL progression; it is not a single application, library, or supported package.

## Contents

| Area | Evidence |
|---|---|
| Week 1 — fundamentals | Console input, conditionals, loops, numerical exercises, validation, and small calculators |
| Week 2 — arrays and methods | Recursion, matrices, sorting, palindromes, guessing games, grade modeling, boxing simulation, and salary calculation |
| Week 5 — collections and SQL | Comparable/Comparator practice, exception handling, word-frequency counting, and twelve SQL exercise sets |
| Week 6 — file I/O and JDBC | Notepad and file-summing exercises plus a local MySQL JDBC example |

Each Java class is an independent exercise with its own `main` method rather than part of one runtime.

## Compile and run an exercise

Requires a modern JDK. For example:

```bash
mkdir -p out
javac -d out src/week2/NumberGuessingGame.java
java -cp out week2.NumberGuessingGame
```

Compile the complete source archive:

```bash
find src -name '*.java' -print0 | xargs -0 javac -d out
```

## JDBC exercise

The JDBC example targets a disposable local MySQL `company` database and recreates an `employees` table with fictional sample rows. Database credentials are not stored in the repository:

```bash
export PATIKA_JDBC_USER='local-user'
export PATIKA_JDBC_PASSWORD='local-password'
# Optional; defaults to jdbc:mysql://localhost:3306/company
export PATIKA_JDBC_URL='jdbc:mysql://localhost:3306/company'

java -cp 'out:path/to/mysql-connector-j.jar' week6.jdbc.JDBCExample
```

Only run it against a disposable database: the exercise deliberately drops and recreates its sample table.

## Portfolio boundary

This repository is retained to show learning breadth and progression. It deliberately has no release, package, deployment, or showcase status; later standalone Java repositories provide stronger architecture, API, persistence, test, and CI evidence.
