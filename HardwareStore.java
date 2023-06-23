import java.util.ArrayList;
import java.util.List;

public class HardwareStore {
    private String name;
    private String contact;
    private String location;
    private List<Product> products;

    public HardwareStore(String name, String contact, String location) {
        this.name = name;
        this.contact = contact;
        this.location = location;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(int productId, String newProductName, int newStockCount) {
        // Find the product with the given ID and update its name and stock count
        for (Product product : products) {
            if (product.getId() == productId) {
                product.setName(newProductName);
                product.setStockCount(newStockCount);
                break;
            }
        }
    }

    public void deleteProduct(int productId) {
        // Remove the product with the given ID from the list
        products.removeIf(product -> product.getId() == productId);
    }

    public void displayProductList() {
        System.out.println("Product List:");
        System.out.println("--------------");
        // Iterate over the products and display their details
        for (Product product : products) {
            System.out.println("Product ID: " + product.getId());
            System.out.println("Product Name: " + product.getName());
            System.out.println("Stock Count: " + product.getStockCount());
            System.out.println("--------------");
        }
        System.out.println("Total Products: " + products.size());
    }

    public static void main(String[] args) {
        // Create a new instance of HardwareStore
        HardwareStore store = new HardwareStore("ABC Hardware Store", "123-456-7890", "City, Country");

        // Create some products
        Product p1 = new Product(1, "Hammer", 10);
        Product p2 = new Product(2, "Screwdriver", 15);
        Product p3 = new Product(3, "Wrench", 20);

        // Add the products to the store
        store.addProduct(p1);
        store.addProduct(p2);
        store.addProduct(p3);

        // Display the initial product list
        System.out.println("Initial Product List:");
        store.displayProductList();

        // Update a product's details
        System.out.println("\nUpdating product with ID 2...");
        store.updateProduct(2, "Electric Screwdriver", 8);

        // Delete a product
        System.out.println("\nDeleting product with ID 1...");
        store.deleteProduct(1);

        // Create a new product and add it to the store
        Product p4 = new Product(4, "Pliers", 12);
        store.addProduct(p4);

        // Display the final product list
        System.out.println("\nFinal Product List:");
        store.displayProductList();


    }

    static class Product {
        private int id;
        private String name;
        private int stockCount;

        public Product(int id, String name, int stockCount) {
            this.id = id;
            this.name = name;
            this.stockCount = stockCount;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getStockCount() {
            return stockCount;
        }

        public void setStockCount(int stockCount) {
            this.stockCount = stockCount;
        }
    }
}
