package Q8;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        Product apple = new Product("Apple", 1.5, 100);
        Product banana = new Product("Banana", 0.8, 150);
        Product milk = new Product("Milk", 2.0, 50);

        store.addProduct(apple);
        store.addProduct(banana);
        store.addProduct(milk);

        System.out.println("All Products in Store:");
        store.displayAllProducts();

        System.out.println("\nEditing product 'Banana':");
        store.editProduct("Banana", 1.0, 120);

        System.out.println("\nUpdated Products in Store:");
        store.displayAllProducts();

        System.out.println("\nDeleting product 'Milk':");
        store.deleteProduct("Milk");

        System.out.println("\nUpdated Products in Store after Deletion:");
        store.displayAllProducts();
    }
}

