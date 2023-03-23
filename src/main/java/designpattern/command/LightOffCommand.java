package designpattern.command;

public class LightOffCommand implements Command {
	//LightOffCommand 클래스는 Receiver 클래스인 Light의 turnOff 메소드를 실행하는 Command 클래스

	Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.turnOff();
	}
}