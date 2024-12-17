import java.util.LinkedList;
/*
public class GroceryStoreManagement {


public static void main(String[] args) {
	LinkedList<String> list=new LinkedList<>();
	list.add("Chocolates");
	list.add("biscuit");
	list.add("vegetable");
	list.add("fruits");
	
	Product c=new Product("Milkybar",50.00f,"Eatables");
	Product c1=new Product("Biscuit",10.00f,"Eatables");
	Product c3=new Product("Vegetables",70.00f,"Eatables");
	Product c4=new Product("Fruits",100.00f,"Eatables");
	
	 Purchase p1 = new Purchase("Milkybar", 2, 0.10);
     Purchase p2 = new Purchase("Biscuit", 3, 0.05);
     Purchase p3 = new Purchase("Vegetables", 5, 0.30);
     Purchase p4 = new Purchase("Fruits", 4, 0.20);
     
     PurchaseList purchaseList = new PurchaseList();
     purchaseList.addPurchases(p1);
     purchaseList.addPurchases(p2);
     purchaseList.addPurchases(p3);
     purchaseList.addPurchases(p4);
	
     BillingSystem billingSystem = new BillingSystem();
     double finalBill = billingSystem.generateInvoice(purchaseList);
     System.out.println("Final Invoice Amount: " + finalBill);
}
}
class Product{
	private String name;
	private float price;
	private String description;
	//private Purchase purchase;
	Product(String name,float price,String description){
		this.name=name;
		this.price=price;
		this.description=description;
		//this.purchase=purchase;
	}
	public String getName() {
		return name;
	}
	void setName(String name) {
		this.name=name;
	}
	public float getPrice() {
		return price;
	}
	void setName(float price) {
		this.price=price;
	}
	public String getDescription() {
		return description;
	}
	void setDescription(String description) {
		this.description=description;
	}
	public String toString()
	{
		return "Name of the product: "+name+" Price of the product: "+price+" Description"+description;
	}
}
class Purchase{
	private float quantity;
	private double discount;
	private PurchaseList productpurchase;
	private Product product;
	Purchase(float quantity,float discount,PurchaseList productpurchase,Product product){
		this.quantity=quantity;
		this.discount=discount;
		this.product=product;
	}
	public Purchase(String string, int i, double d) {
		// TODO Auto-generated constructor stub
		
	}
	float getQuantity() {
		return quantity;
	}
	double getDiscount() {
		return discount;
	}
	public Product product() {
		return product;
	}
	public double getTotal() {
	      return product.getPrice()-discount;
		}	
}
class PurchaseList{
	private LinkedList<Purchase> purchases;
	public PurchaseList(){
		this.purchases=new LinkedList<>();	
	}
	public LinkedList<Purchase> getPurchases(){
		return purchases;
	}
	void addPurchases(Purchase purchase) {
		purchases.add(purchase);
	}
	public double GrandTotal() {
        double total = 0;
        for (Purchase purchase : purchases) {
            total += purchase.getTotal();
        }
        return total;
    }
}
class TaxCalculator{
	static double tax=0.07;
	public static double calculateTax(double total) {
		return total*tax;
	}
}
class BillingSystem{
	public double generateInvoice(PurchaseList p) {
		double total=p.GrandTotal();
		double totalTax=TaxCalculator.calculateTax(total);
		return total+totalTax;
	}
}*/
import java.util.LinkedList;

public class GroceryStoreManagement {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Chocolates");
        list.add("Biscuit");
        list.add("Vegetable");
        list.add("Fruits");

        Product c = new Product("Milkybar", 50.00f, "Eatables");
        Product c1 = new Product("Biscuit", 10.00f, "Eatables");
        Product c3 = new Product("Vegetables", 70.00f, "Eatables");
        Product c4 = new Product("Fruits", 100.00f, "Eatables");

        Purchase p1 = new Purchase(c, 2, 0.10);
        Purchase p2 = new Purchase(c1, 3, 0.05);
        Purchase p3 = new Purchase(c3, 5, 0.30);
        Purchase p4 = new Purchase(c4, 4, 0.20);

        PurchaseList purchaseList = new PurchaseList();
        purchaseList.addPurchases(p1);
        purchaseList.addPurchases(p2);
        purchaseList.addPurchases(p3);
        purchaseList.addPurchases(p4);

        BillingSystem billingSystem = new BillingSystem();
        double finalBill = billingSystem.generateInvoice(purchaseList);
        System.out.println("Final Invoice Amount: " + finalBill);
    }
}

class Product {
    private String name;
    private float price;
    private String description;

    public Product(String name, float price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Name of the product: " + name + " Price of the product: " + price + " Description: " + description;
    }
}

class Purchase {
    private float quantity;
    private double discount;
    private Product product;

    public Purchase(Product product, float quantity, double discount) {
        this.product = product;
        this.quantity = quantity;
        this.discount = discount;
    }

    public float getQuantity() {
        return quantity;
    }

    public double getDiscount() {
        return discount;
    }

    public Product getProduct() {
        return product;
    }

    public double getTotal() {
        return (product.getPrice() * quantity) * (1 - discount);
    }

    @Override
    public String toString() {
        return "Product: " + product.getName() + " Quantity: " + quantity + " Discount: " + discount;
    }
}

class PurchaseList {
    private LinkedList<Purchase> purchases;

    public PurchaseList() {
        this.purchases = new LinkedList<>();
    }

    public LinkedList<Purchase> getPurchases() {
        return purchases;
    }

    public void addPurchases(Purchase purchase) {
        purchases.add(purchase);
    }

    public double GrandTotal() {
        double total = 0;
        for (Purchase purchase : purchases) {
            total += purchase.getTotal();
        }
        return total;
    }
}

class TaxCalculator {
    static double tax = 0.07;

    public static double calculateTax(double total) {
        return total * tax;
    }
}

class BillingSystem {
    public double generateInvoice(PurchaseList p) {
        double total = p.GrandTotal();
        double totalTax = TaxCalculator.calculateTax(total);
        return total + totalTax;
    }
}
