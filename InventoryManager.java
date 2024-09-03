import java.util.HashMap;

public class InventoryManager {
    private HashMap<Integer, Product> products = new HashMap<>();
    private int productCounter = 1;

    // Add a new product
    public void addProduct(String name, String category, double price, int quantity) {
        Product product = new Product(productCounter++, name, category, price, quantity);
        products.put(product.getId(), product);
        System.out.println("Product added: " + product);
    }

    // Remove a product
    public void removeProduct(int productId) {
        if (products.remove(productId) != null) {
            System.out.println("Product removed successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    // Update product details
    public void updateProduct(int productId, double newPrice, int newQuantity) {
        Product product = products.get(productId);
        if (product != null) {
            product.setPrice(newPrice);
            product.setQuantity(newQuantity);
            System.out.println("Product updated: " + product);
        } else {
            System.out.println("Product not found.");
        }
    }

    // Search for products by name or category
    public void searchProduct(String keyword) {
        boolean found = false;
        for (Product product : products.values()) {
            if (product.getName().toLowerCase().contains(keyword.toLowerCase()) ||
                product.getCategory().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(product);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No products found matching the keyword.");
        }
    }

    // View inventory status
    public void viewInventoryStatus() {
        int totalProducts = 0;
        double totalValue = 0.0;
        for (Product product : products.values()) {
            totalProducts += product.getQuantity();
            totalValue += product.getPrice() * product.getQuantity();
        }
        System.out.println("Total number of products: " + totalProducts);
        System.out.println("Total inventory value: $" + totalValue);
    }
  
}
