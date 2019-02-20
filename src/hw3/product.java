package hw3;

public class product {
private String name;
private int price;
private int quantity;

public product() {
	name=null;
	price=0;
	quantity=0;
}

public product(String n,int p,int q) {
	name=n;
	price=p;
	quantity=q;
}

public void set_name(String n) {
	name=n;
}

public void set_price(int p ) {
	price=p;
}

public void set_quantity(int p ) {
	quantity=p;
}

public String get_name( ) {
return name;
}

public double get_price( ) {
return price;
}

public double get_quantity( ) {
return quantity;
}






}
