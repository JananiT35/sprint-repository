package assignedexample;
public class OnlineShopping {
    public static void main(String[] args) {
        Contact c = new ProductPurchased("Laptop", 5);
        int cost = c.product(70000);
        System.out.println("Cost of product purchased: " + cost);
        int deliveryDays = c.delivery(5);
        System.out.println("Delivered in: " + deliveryDays + " days");
        System.out.println(c);
        c.name("Janani");
        c.otp(123456);
        Contact.Status();
        c.PaymentMethod();
    }
}
class ProductPurchased implements Contact {
    private String nameofProduct;
    private int quantity;
    ProductPurchased(String nameofProduct, int quantity) {
        this.nameofProduct = nameofProduct;
        this.quantity = quantity;
    }
    public int product(int cost) {
        return quantity * cost;
    }
    public int delivery(int days) {
        return 7; // Fixed delivery days
    }
    public String toString() {
        return "Product purchased: " + nameofProduct + " quantity: " + quantity;
    }
    public void name(String name) {
        System.out.println("Name: " + name);
    }
    public void otp(int otp) {
        System.out.println("OTP: " + otp);
    }
}
