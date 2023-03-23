package designpattern.observer;

public class ObserverPatter {
	public static void main(String[] args) {
		// Subject 객체 생성
		Subject subject = new Subject();

		// Observer 객체 생성
		Observer observer1 = new ConcreteObserver("Observer 1");
		Observer observer2 = new ConcreteObserver("Observer 2");

		// Observer 등록
		subject.registerObserver(observer1);
		subject.registerObserver(observer2);

		// 데이터 업데이트 및 Observer들에게 알림 전송
		subject.notifyObservers("Some data has been updated.");
	}
}
