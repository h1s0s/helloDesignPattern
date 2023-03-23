package designpattern.command;

public class Light {
	//Receiver 클래스 (Light 클래스)는 실제 작업을 수행하는 클래스
	public void turnOn() {
		System.out.println("Light is turned on");
	}

	public void turnOff() {
		System.out.println("Light is turned off");
	}
}
