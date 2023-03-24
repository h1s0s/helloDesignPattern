package designpattern.factorymethod.study2.factory;

import designpattern.factorymethod.study2.car.Bus;
import designpattern.factorymethod.study2.car.Car;
import designpattern.factorymethod.study2.car.Taxi;
import designpattern.factorymethod.study2.car.Train;

public class CarFactory {
	private static CarFactory instance = new CarFactory();//팩토리메서드를 싱글톤으로 구현하여 nextId 값을 계속해서 증가시킴
	private int nextId = 1;

	private CarFactory() {}

	public static CarFactory getInstance() {
		return instance;
	}

	public Car createCar(String type){
		switch (type){
			case "Bus":
				return new Bus(nextId++);
			case "Taxi":
				return new Taxi(nextId++);
			case "Train":
				return new Train(nextId++);
			default:
				throw new IllegalArgumentException("Unknwon Car Type");
		}
	}
}
