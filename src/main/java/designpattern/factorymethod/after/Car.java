package designpattern.factorymethod.after;

public abstract class Car {
	String productName;

	public Car(String productName){
		this.productName = productName;
	}

	@Override public String toString() {
		return "Car{" +
			   "productName='" + productName + '\'' +
			   '}';
	}
}
