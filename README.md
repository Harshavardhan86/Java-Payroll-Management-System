# Java Payroll Management System

This is a Java console-based Payroll Management System that calculates and displays the salaries of both full-time and part-time employees using object-oriented programming principles such as **abstraction**, **inheritance**, and **polymorphism**.

---

## 🚀 Features

- 📄 Abstract base class `Employe`
- 👨‍💼 `FullTimeEmployee` and `PartTimeEmployee` subclasses
- 💰 Method overriding to calculate salaries based on employment type
- 🗂️ Add and remove employees using a simple menu system
- 📦 Clean and modular project structure

---

## 📂 Project Structure

Employee_Payroll/
├── src/
│ └── payroll/
│ ├── Employe.java
│ ├── FullTimeEmployee.java
│ ├── PartTimeEmployee.java
│ ├── Payroll_system.java
│ └── EmployeMain.java
└── bin/ (compiled .class files – not uploaded)


---

## 🧠 Concepts Used

- **Abstraction:** `Employe` is declared as an abstract class.
- **Inheritance:** `FullTimeEmployee` and `PartTimeEmployee` extend `Employe`.
- **Polymorphism:** Salary is calculated differently using overridden methods.
- **Encapsulation:** Employee details are kept private with public getters.
- **Dynamic Binding:** `calculateSalary()` method is called at runtime.

---

## 💡 How to Run

1. Open the project in any Java IDE (e.g., Eclipse, IntelliJ) or terminal.
2. Compile all `.java` files in the `src/payroll/` directory.
3. Run `EmployeMain.java` as the main class.
4. Follow the prompts to view and remove employees.

---

## 📌 Sample Output

Employees Details
Employe [name = Harsha ; id = 1 ; salary = 25000.0]
Employe [name = Sai ; id = 2 ; salary = 3400.0]
Employe [name = Akhil ; id = 3 ; salary = 20000.0]
Employe [name = Jaffar ; id = 4 ; salary = 3200.0]

Enter id to remove Employe:
2

Employees Details
Employe [name = Harsha ; id = 1 ; salary = 25000.0]
Employe [name = Akhil ; id = 3 ; salary = 20000.0]
Employe [name = Jaffar ; id = 4 ; salary = 3200.0]


---

## 🛠️ Technologies Used

- Java (JDK 8+)
- OOP (Object-Oriented Programming)
- Java Collections (`ArrayList`)
- Console Input/Output

---

## 📎 Author

**Harsha**  
Project created as part of learning OOP concepts in Java.

---

## 📎 License

This project is open-source and free to use for learning and educational purposes.
