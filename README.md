# Addressing_SOLID_Principles
# Addressing SOLID Principles

## Overview
This project demonstrates how to apply the **SOLID Principles** in a Car Sales Management System. Each principle is showcased with both violated and solved implementations to highlight the importance of these design principles in achieving clean and maintainable code.

---

## SOLID Principles
### 1. Single Responsibility Principle (SRP)
**Definition**: A class should have only one responsibility, meaning it should have only one reason to change. This ensures that the class focuses on a single functionality.

#### **Violated Example**:
- **Class**: `CarSalesManager`
  - Handles multiple responsibilities:
    1. Inventory management (e.g., adding cars to inventory).
    2. Sales operations (e.g., selling cars).
    3. Invoicing (e.g., generating invoices for sales).
- **Problem**:
  - Bundling multiple responsibilities into one class makes it difficult to maintain, test, and extend. Any change to one responsibility may inadvertently affect others.

#### **Solved Example**:
- Responsibilities are divided into three classes:
  1. **CarInventoryManager** - Handles inventory-related operations (e.g., adding cars).
  2. **CarSalesManager** - Handles car sales operations (e.g., selling cars).
  3. **InvoiceManager** - Handles invoicing operations (e.g., generating invoices).
- **Benefits**:
  - Each class has a single responsibility and is easier to maintain and extend without affecting other functionalities.

---

### 2. Open/Closed Principle (OCP)
**Definition**: Classes should be open for extension but closed for modification. This means you can add new functionality without altering existing code.

#### **Violated Example**:
- **Class**: `DiscountCalculator`
  - Contains `if-else` logic to calculate discounts for specific types (e.g., Seasonal, Clearance).
- **Problem**:
  - Adding a new discount type (e.g., Festival Discount) requires modifying the `DiscountCalculator` class, risking the introduction of bugs in existing logic.

#### **Solved Example**:
- Introduced an abstract class `Discount` to define the behavior for discounts.
- Specific discount types (`SeasonalDiscount`, `ClearanceDiscount`) extend the `Discount` class.
- **Benefits**:
  - Adding new discount types requires creating a new subclass without modifying existing classes.

---

### 3. Dependency Inversion Principle (DIP)
**Definition**: High-level modules should not depend on low-level modules. Both should depend on abstractions. This decouples high-level and low-level code, making it more flexible.

#### **Violated Example**:
- **Class**: `CarNotificationManager`
  - Directly depends on the concrete class `EmailNotificationService`.
- **Problem**:
  - Adding new notification services (e.g., SMS) requires modifying `CarNotificationManager`, creating tight coupling between high-level and low-level modules.

#### **Solved Example**:
- Introduced an interface `NotificationService` to abstract the notification functionality.
- Created separate implementations (`EmailNotificationService`, `SMSNotificationService`) for different notification methods.
- **Benefits**:
  - `CarNotificationManager` depends on the abstraction (`NotificationService`), making it flexible and scalable.

---

## Folder Structure
The folder structure separates **violated** and **solved** implementations for clarity:

```plaintext
src/main/java/LabExamples/SOLID/
├── solved/
│   ├── SRP/
│   │   ├── CarInventoryManager.java
│   │   ├── CarSalesManager.java
│   │   ├── InvoiceManager.java
│   │   └── Main.java
│   ├── OCP/
│   │   ├── Discount.java
│   │   ├── SeasonalDiscount.java
│   │   ├── ClearanceDiscount.java
│   │   ├── DiscountCalculator.java
│   │   └── Main.java
│   └── DIP/
│       ├── NotificationService.java
│       ├── EmailNotificationService.java
│       ├── SMSNotificationService.java
│       ├── CarNotificationManager.java
│       └── Main.java
└── violated/
    ├── SRP/
    │   └── CarSalesManager.java
    ├── OCP/
    │   └── DiscountCalculator.java
    └── DIP/
        └── CarNotificationManager.java
