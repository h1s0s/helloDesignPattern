package designpattern.factorymethod2.after;

import designpattern.factorymethod2.before.Car2;

public class CarTest {
	public static void main(String[] args) {
		CarTest test = new CarTest();
		CarFactory factory = new CarFactory();
		Car car1 = factory.createCar("Sonata");
		Car car2 = factory.createCar("Genesis");
		System.out.println(car1);
		System.out.println(car2);
	}

}
