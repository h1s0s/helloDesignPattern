package designpattern.factorymethod.study2.car;

public class Taxi implements Car {

	private int id;

	public Taxi(int id){
		System.out.println("taxi " + id + " 생성됨");
		this.id = id;
	}

	public void run() {
		System.out.println("택시 " + id + "가 달립니다");
	}

	public void stop() {
		System.out.println("택시 " + id + "가 멈춥니다");
	}
}
