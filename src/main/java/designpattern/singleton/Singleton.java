package designpattern.singleton;

public class Singleton {
	//싱글톤패턴
	//싱글톤 패턴은 객체를 딱 한번만 생성하도록 보장하는 디자인 패턴입니다.
	//이 패턴은 일반적으로 어떤 클래스의 인스턴스가 프로그램 내에 하나만 있어야 하는 경우 사용

	//JAVA에서 싱글톤 패턴을 구현하는 가장 일반적인 방법은 private 생성자와 static 메서드를 활용하는 방법이 있다.


	private static Singleton instance;// 클래스 내부에서 유일한 인스턴스
	//변수와 생성자를 private으로 막았고, getInstance라는 static 메서드로 인스턴스를 반환함으로써 싱글톤 패턴 구현

	// private 생성자
	private Singleton() {}

	// 인스턴스가 존재하지 않는 경우에는 인스턴스를 생성하고, 이미 존재하는 경우에는 기존 인스턴스를 반환하는 static 메서드
	public static Singleton getInstance() {
		if (instance == null) {//인스턴스가 존재하지 않으면
			instance = new Singleton();
		}
		return instance;
	}
}
