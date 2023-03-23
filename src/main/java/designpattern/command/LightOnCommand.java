package designpattern.command;


public class LightOnCommand implements Command {
	//LightOnCommand 클래스는 Receiver 클래스인 Light의 turnOn 메소드를 실행하는 Command 클래스
	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.turnOn();
	}
}