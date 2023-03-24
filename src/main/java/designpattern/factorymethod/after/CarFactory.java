package designpattern.factorymethod.after;

public class CarFactory {
	public Car createCar(String productName){//이름값을 받으면 카를 반환해주는 메서드
		Car car = null;

		if ("Sonata".equalsIgnoreCase(productName)) {//equalsIgnoreCase 대소문자 구분하지 않는 equlas
			car = new Sonata(productName);
		} else if ("Grandeur".equalsIgnoreCase(productName)) {
			car = new Grandeur(productName);
		} else if ("Genesis".equalsIgnoreCase(productName)) {
			car = new Genesis(productName);
		}

		return car;
	}

	public CarFactory() {
	}
}
