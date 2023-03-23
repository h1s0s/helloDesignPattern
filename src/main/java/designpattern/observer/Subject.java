package designpattern.observer;

import java.util.ArrayList;

public class Subject {
	private ArrayList<Observer> observers = new ArrayList<>();

	// Observer 등록 메서드
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	// Observer 해제 메서드
	public void unregisterObserver(Observer observer) {
		observers.remove(observer);
	}

	// Observer들에게 데이터 전송 메서드
	public void notifyObservers(String data) {
		for (Observer observer : observers) {
			observer.update(data);
		}
	}
}
