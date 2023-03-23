package designpattern.command;


public class Client {

	//Client 클래스에서는 RemoteControl과 Command 객체를 생성하고, 해당 Command 객체를 RemoteControl 객체에 등록하여 실행
	public static void main(String[] args) {
		Light light = new Light();
		Command lightOnCommand = new LightOnCommand(light);
		Command lightOffCommand = new LightOffCommand(light);

		RemoteControl remoteControl = new RemoteControl();
		remoteControl.setCommand(lightOnCommand);
		remoteControl.pressButton();

		remoteControl.setCommand(lightOffCommand);
		remoteControl.pressButton();
	}
}