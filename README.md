# Java Recursion Practice

A compact Java playground to practice classic recursion problems and experiment with a simple Red-Black Tree implementation.

## What’s inside
- Practice problems implemented in `src/RecursionSolver.java`
- A small demo runner in `src/MainApplication.java`
- A minimal Red-Black Tree node implementation in `src/redBlackTreeOperations/`
- JUnit 5 tests for tree behavior in `test/RBNodeTest.java`

## Tasks covered
- Factorial ✓
- Fibonacci (N-th member) ✓
- Sum of digits ✓
- Array sum ✓
- Array max ✓
- Count occurrences in array ✓
- GCD (Greatest Common Divisor) ✓
- Palindrome check ✓
- Power (exponentiation) ✓
- Red-Black Tree operations (toy implementation: insert, delete, rotate, traversal, color-fix) ✓

## Project structure
```
java-recursion-practice/
  lib/                         # JUnit 5 & dependencies (JARs)
  src/
    MainApplication.java       # Quick manual demo
    RecursionSolver.java       # Recursion exercises
    redBlackTreeOperations/
      Color.java
      RBNode.java
      RotateCondition.java
      TraversalType.java
  test/
    RBNodeTest.java            # JUnit 5 tests for RBNode
```

## Requirements
- Java 17+ (recommended)
- Gradle Wrapper included (`./gradlew`, `gradlew.bat`)
- Any IDE with Gradle & JUnit 5 support

## Build & run with Gradle
Using the Gradle Wrapper from the project root:

```bash
# Windows PowerShell
./gradlew.bat clean build
./gradlew.bat run
```

This runs `MainApplication` and prints sample outputs for the recursion tasks plus Red-Black Tree traversals.

## Run tests
With Gradle (JUnit 5):

```bash
# Windows PowerShell
./gradlew.bat test
```

Your IDE can also run `RBNodeTest` directly using the Gradle test runner.

## Notes on the Red-Black Tree
The `RBNode` here is intentionally minimal and educational. It exposes basic operations and prints simple traversals. It is not a full production-grade Red-Black Tree, but it’s useful for practicing invariants, rotations, and color adjustments.

## License
This project is provided for educational purposes. Use it freely.
