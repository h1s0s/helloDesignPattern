package designpattern.factorymethod.study2.car;

public class Bus implements Car{
	private int id;

	public Bus(int id){
		System.out.println("Bus " + id + " 생성됨");
		this.id = id;
	}

	public void run() {
		System.out.println("버스 "+ id +"가 달립니다");
	}

	public void stop() {
		System.out.println("버스 "+ id +"가 멈춥니다");
	}

}
