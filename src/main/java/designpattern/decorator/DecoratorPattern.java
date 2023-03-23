package designpattern.decorator;

public class DecoratorPattern {
	//데코레이터 패턴
	//객체에 추가적인 책임을 동적으로 부여하기 위해, 객체를 감싸는 패턴

	//Component 인터페이스인 Coffee는 getCost와 getDescription 메서드를 가지며
	//SimpleCoffee 클래스는 Coffee 인터페이스를 구현합니다.
	//주석을 추가하여 각 요소에 대한 설명을 제공. SimpleCoffee 클래스는 커피의 기본 속성을 나타냄.
	//Milk와 Whip 클래스는 각각 기존 객체에 Milk와 Whip을 추가하는 구체적인 데코레이터 역할.

	public static void main(String[] args) {
		// SimpleCoffee 객체 생성
		Coffee coffee = new SimpleCoffee();
		System.out.println("Cost: " + coffee.getCost() + ", Description: " + coffee.getDescription());

		// Milk 추가
		coffee = new Milk(coffee);
		System.out.println("Cost: " + coffee.getCost() + ", Description: " + coffee.getDescription());

		// Whip 추가
		coffee = new Whip(coffee);
		System.out.println("Cost: " + coffee.getCost() + ", Description: " + coffee.getDescription());
	}
}
