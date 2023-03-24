package designpattern.factorymethod.second;

public class Grandeur extends Car {
	public Grandeur(String productName) {
		super(productName);
	}

	@Override public String toString() {
		return "Granduer{" +
			   "productName='" + productName + '\'' +
			   '}';
	}
}
