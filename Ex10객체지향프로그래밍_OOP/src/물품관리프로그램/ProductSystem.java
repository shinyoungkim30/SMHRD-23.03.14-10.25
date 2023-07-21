package 물품관리프로그램;

import java.util.ArrayList;

public class ProductSystem {

	ArrayList<Product> list = new ArrayList<>();

	public void addList(String name, int unitPrice, int amount) {
		
		Product product = new Product(name, unitPrice, amount);

		list.add(product);
	}
	
	public String getProductList() {
		String a = "";
		
		for(int i=0; i<list.size(); i++) {
			Product temp = list.get(i);
			a += temp.getName() + "\t"+ temp.getUnitPrice()+"\t"+temp.getAmount()+"\t";
		}
		
		return a;
	}
	
	public int getSales() {
		
		for(int i=0; i<list.size(); i++) {
			Product temp = list.get(i);
			
		}
		
		return 0;
		
	}

}
