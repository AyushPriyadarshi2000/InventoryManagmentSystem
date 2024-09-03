# Inventory Managment System Documentation

#### 1. How to Run the Application

To run the Inventory Management System:

1. **Compile the Java Files:**
   - Ensure you have all the Java files (`Main.java`, `Product.java`, `InventoryManager.java`) in the same directory.
   - Open a terminal or command prompt, navigate to the directory containing the files, and compile them using the following command:
     ```bash
     javac Main.java Product.java InventoryManager.java
     ```

2. **Run the Application:**
   - After successful compilation, run the `Main` class using:
     ```bash
     java Main
     ```
   - The application will launch with a console-based menu, allowing you to manage inventory through various options.

#### 2. Instructions for Each Feature

**Main Menu Options:**

1. **Add Product:**
   - Select option `1` from the menu.
   - The system will prompt you to enter the product's name, category, price, and quantity.
   - The product will be added to the inventory and assigned a unique product ID.
   - A confirmation message will be displayed with the details of the newly added product.

2. **Remove Product:**
   - Select option `2`.
   - The system will prompt you to enter the product ID of the item you wish to remove.
   - If the product is found, it will be removed from the inventory, and a success message will be displayed.
   - If the product is not found, an appropriate message will be shown.

3. **Update Product:**
   - Select option `3`.
   - The system will prompt you to enter the product ID of the item you wish to update.
   - Next, you'll be asked to enter the new price and quantity for the product.
   - The product's details will be updated, and a confirmation message will be displayed.

4. **Search Product:**
   - Select option `4`.
   - The system will prompt you to enter a keyword (name or category) to search for products.
   - All matching products will be displayed.
   - If no matches are found, the system will inform you.

5. **View Inventory Status:**
   - Select option `5`.
   - The system will display the total number of products and the total inventory value (the sum of all products' prices multiplied by their quantities).

6. **Exit:**
   - Select option `6`.
   - The application will close gracefully.

#### 3. Exception Handling

**Exception Handling Implemented:**

- **Invalid Input Handling:** 
  - If the user enters invalid input (e.g., non-numeric input for price or quantity), an exception is caught, and an error message is displayed.
  - The input buffer is cleared using `scanner.nextLine()` to prevent the program from crashing and to allow the user to try again.
  
- **Product Not Found:**
  - When attempting to remove or update a product by ID, if the product is not found in the inventory, the application handles this by displaying a message indicating the product was not found.

- **General Exception Handling:**
  - The application uses a `try-catch` block around the main menu loop to handle any unexpected exceptions, ensuring the application continues running smoothly and that the user is informed of any issues encountered.
