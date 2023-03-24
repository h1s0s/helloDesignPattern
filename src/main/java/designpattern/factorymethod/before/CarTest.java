package designpattern.factorymethod.before;

public class CarTest {
	//FactoryMethod
	//1.구체적인 것에 의존하지 말고 추상적인 것에 의존한다
	//객체 생성에 new를 사용하여 구체 클래스 인스턴스를 생성하게 되면 대상 인스턴스가 변경되었을 때 프로그램이 수정되어야 함.
	//예 Car car = new Car("소나타");//차종에 따라 여러 종류의 차가 생성 가능함

	//여러 인스턴스가 다양하게 생성될 수 있는 상황에 사용
	//생성될 수 있는 여러 객체를 추상화하고, 팩토리에서는 추상 클래스를 활용하고 생성하는 메소드 제공
	//클라이언트는 실제 인스턴스와 상관없이, 팩토리가 제공해주는생성 메서드를 사용하면 된다. 구체적인 클래스에 종속되지 않음

	public static void main(String[] args) {
		CarTest test = new CarTest();
		Car2 car = test.productCar("Sonatar");

		System.out.println(car);
	}

	public Car2 productCar(String name) {
		Car2 car = null;

		if (Car2.SONATA.equalsIgnoreCase(name)) {
			car = new Car2(Car2.SONATA);
		} else if (Car2.GRANDEUR.equalsIgnoreCase(name)) {
			car = new Car2(Car2.GRANDEUR);
		} else if (Car2.GENESIS.equalsIgnoreCase(name)) {
			car = new Car2(Car2.GENESIS);
		} else {
			car = new Car2("NoBrand");
		}

		return car;
	}
}
