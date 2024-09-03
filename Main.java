import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        Scanner scanner = new Scanner(System.in);

        // Basic Console Menu
        while (true) {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Update Product");
            System.out.println("4. Search Product");
            System.out.println("5. View Inventory Status");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter product name: ");
                        String name = scanner.next();
                        System.out.print("Enter category: ");
                        String category = scanner.next();
                        System.out.print("Enter price: ");
                        double price = scanner.nextDouble();
                        System.out.print("Enter quantity: ");
                        int quantity = scanner.nextInt();
                        manager.addProduct(name, category, price, quantity);
                        break;
                    case 2:
                        System.out.print("Enter product ID to remove: ");
                        int removeId = scanner.nextInt();
                        manager.removeProduct(removeId);
                        break;
                    case 3:
                        System.out.print("Enter product ID to update: ");
                        int updateId = scanner.nextInt();
                        System.out.print("Enter new price: ");
                        double newPrice = scanner.nextDouble();
                        System.out.print("Enter new quantity: ");
                        int newQuantity = scanner.nextInt();
                        manager.updateProduct(updateId, newPrice, newQuantity);
                        break;
                    case 4:
                        System.out.print("Enter name of the product to be searched: ");
                        String keyword = scanner.next();
                        manager.searchProduct(keyword);
                        break;
                    case 5:
                        manager.viewInventoryStatus();
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine();  // Clear the buffer
            }
        }
    }
}
