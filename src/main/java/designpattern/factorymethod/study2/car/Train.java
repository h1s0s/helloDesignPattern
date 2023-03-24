package designpattern.factorymethod.study2.car;

public class Train implements Car{
	private int id;

	public Train(int id){
		System.out.println("Train " + id + " 생성됨");
		this.id = id;
	}

	public void run() {
		System.out.println("기차 "+id+"가 달립니다");
	}

	public void stop() {
		System.out.println("기차 "+id+"가 멈춥니다");
	}

}
