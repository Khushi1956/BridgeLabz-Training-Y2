class Product {
    private static double discount = 10; // %
    private String productName;
    private double price;
    private int quantity;
    private final int productID;

    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double d) {
        discount = d;
    }

    void displayDetails() {
        if (this instanceof Product)
            System.out.println("ProductID: " + productID + ", Name: " + productName + ", Price: " + price +
                    ", Qty: " + quantity + ", Discount: " + discount + "%");
    }

    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 50000, 2);
        p1.displayDetails();
        Product.updateDiscount(15);
        p1.displayDetails();
    }
}
