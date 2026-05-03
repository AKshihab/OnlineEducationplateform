# Online Education Platform - Simple OOP Java Project

This project demonstrates:

1. Inheritance
2. Polymorphism
3. Encapsulation
4. Use of arrays instead of ArrayList

## Classes

- `User.java` - Abstract base class
- `Student.java` - Student subclass
- `Teacher.java` - Teacher subclass
- `Administrator.java` - Administrator subclass
- `Main.java` - Program testing file

## How to Run in VS Code

Open the folder in VS Code, then run these commands in the terminal:

```bash
javac *.java
java Main
```

## Expected Concepts Shown

- `User` stores common information: name and email.
- `Student`, `Teacher`, and `Administrator` inherit from `User`.
- Each subclass overrides `performRole()`.
- `Student` keeps grade private and gives access using methods.
- `Main.java` uses a `User[]` array to demonstrate polymorphism.
