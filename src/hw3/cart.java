package hw3;

import java.util.ArrayList;

public class cart {

	private ArrayList <product> Cart=new ArrayList <product> ();;
	
	
	
	
	public void add(product p) {
		Cart.add(p);
		//return Cart.size();
	}
	
	public int size() {
		//Cart.add(p);
		return Cart.size();
	}
	
	public int total_cart() {
		int total=0;
		for(product p:Cart) {
			total+=(p.get_quantity()*p.get_price());
		}
		return total;
	}
	
	
}
