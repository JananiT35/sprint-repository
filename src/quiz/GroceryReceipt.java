package quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GroceryReceipt extends GroceryReceiptBase{
public Groceryreceipt(Map<String,Double>prices,Map<String,Integer>discounts) {
	super(prices,discounts);
}
public List<Grocery>Calculate(List<Node>ShoppingList){
	Map<String,Integer>list=new TreeMap<>();
	for(Node s:ShoppingList) {
		String fruit=s.fruit;
		int sum=s.count;
		if(!list.containsKey(fruit)) {
			list.put(fruit, sum);
		}
		else {
			list.put(fruit, list.get(fruit)+sum);
		}
	}
	List<Grocery> res=new ArrayList<>();
	for(Map.entry<String, Integer>entry:list.entrySet()) {
		String fruit=entry.getKey();
		String sum=entry.getValue();
		double price=getPrices().get(fruit);
		double total=0;
		if(getDiscounts().containsKey(fruit)) {
			total=sum*price*(1-(Double)getDiscounts().get(Fruit)/100);
		}else {
			total=sum*price;
		}
		res.add(new Grocery(fruit,price,total));
	}
	return res;
}
}
