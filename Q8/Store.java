package Q8;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products;

    public Store() {
        products = new ArrayList<>();
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public void editProduct(String name, double newPrice, int newQuantity) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                product.setPrice(newPrice);
                product.setQuantity(newQuantity);
                System.out.println("Product edited: " + name);
                return;
            }
        }
        System.out.println("Product not found: " + name);
    }
    public void deleteProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                products.remove(product);
                System.out.println("Product deleted: " + name);
                return;
            }
        }
        System.out.println("Product not found: " + name);
    }
    public void displayAllProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }
        for (Product product : products) {
            product.displayProduct();
        }
    }
}
