## Brief Report on Application Design and Object-Oriented Principles

#### 1. Application Design Overview

The Inventory Management System is designed as a console-based Java application that allows users to manage products within an inventory. The application provides features such as adding, removing, updating, searching for products, and viewing the overall inventory status. The design is modular, separating concerns into distinct classes, each responsible for a specific part of the system’s functionality.

#### 2. Application of Object-Oriented Principles

The application leverages key Object-Oriented Programming (OOP) principles, including:

1. **Encapsulation:**
   - Encapsulation is achieved through the `Product` class, which contains private fields (`id`, `name`, `category`, `price`, and `quantity`). These fields are accessed and modified via public getter and setter methods, protecting the internal state of the object from unauthorized access or modification.
   - The `InventoryManager` class encapsulates the management of products. It provides methods to add, remove, update, and search for products, keeping the details of how these operations are performed hidden from the `Main` class.

2. **Abstraction:**
   - The `InventoryManager` class abstracts the complexities of managing the inventory. Users interact with simple method calls like `addProduct()`, `removeProduct()`, `updateProduct()`, and `searchProduct()`, without needing to understand the underlying implementation details, such as how products are stored or retrieved.
   - The console-based user interface in the `Main` class interacts with the `InventoryManager` at a high level, abstracting the inventory management logic away from the user.

3. **Responsibility Delegation:**
   - The responsibility of different tasks is well-delegated among classes:
     - The `Product` class handles the properties and behavior of individual products.
     - The `InventoryManager` class manages the collection of products and provides methods to manipulate them.
     - The `Main` class is responsible for user interaction and calling the appropriate methods in `InventoryManager` based on user input.
#### 3. Application Design Diagram
![Application Design Diagram](https://raw.githubusercontent.com/AyushPriyadarshi2000/InventoryManagmentSystem/main/app_design.webp)


#### 4. Conclusion

The design of the Inventory Management System effectively applies Object-Oriented principles to create a modular, extensible, and maintainable application. Encapsulation ensures data protection and control over how data is accessed and modified. Abstraction simplifies interaction with the system for both developers and users. The design is poised for easy extension, making it adaptable to future requirements or more complex use cases.
