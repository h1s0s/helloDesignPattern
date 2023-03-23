package designpattern.observer;

class ConcreteObserver implements Observer {
	private String observerName;

	// ConcreteObserver 생성자
	public ConcreteObserver(String name) {
		this.observerName = name;
	}

	// 데이터 업데이트 메서드 구현
	public void update(String data) {
		System.out.println(observerName + " received the update with data: " + data);
	}
}