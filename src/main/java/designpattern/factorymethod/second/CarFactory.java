package designpattern.factorymethod.second;

public abstract class CarFactory {
	final public Car menufacturingCar(String name){//이름값을 받으면 카를 반환해주는 메서드
		preparingOthers();
		Car car = createCar(name);
		washCar();

		return car;
	}

	private void washCar() {
		System.out.println("washCar");
	}

	private void preparingOthers() {
		System.out.println("preparingOthers");
	}

	public abstract Car createCar(String name);
}
