package designpattern.factorymethod;

public class ShapeFactory {
	//ShapeFactory는 Shape인터페이스를 생성하는 역할을 담당
	//createShape 메서드는 매개변수로 도형의 타입을 받아, 해당 도형의 인스턴스를 생성하여 반환

	//객체의 생성코드가 별도 클래스로 분리되므로, 생성 코드의 변경이 다른 코드에 영향을 주지 않음
	//객체 생성 과정을 캡슐화하여 객체 생성 방식을 변경하고자 할 때, Factory 클래스의 코드만 수정하면 되므로 유지보수가 용이
	//서브클래스에서 객체 생성 로직을 구현하므로, 유연한 확장이 가능.
	//새로운 객체 생성 방식이 필요한 경우, 새로운 서브클래스를 추가하여 해당 로직을 구현하면 됨.

	//클래스 수가 증가할 수 있음.
	//Factory 클래스와 그 서브클래스들이 추가되면 클래스 수가 증가하지만, 객체 생성 로직의 구현이 모두
	//Factory 클래스와 서브클래스에서 이루어지므로, 코드의 가독성과 유지보수성은 높아집니다.
	//객체 생성 과정이 복잡하지 않은 경우, Factory Method Pattern을 적용하는 것이
	//히려 불필요한 코드 추가로 이어질 수 있음
	//해당 패턴은 객체 생성 과정이 복잡하거나 객체 생성 로직을 캡슐화해야 할 필요가 있는 경우에 적용하는 것이 적절

	public Shape createShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}
}
