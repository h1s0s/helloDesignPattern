package designpattern.command;


public class RemoteControl {

	//Invoker 클래스인 RemoteControl 클래스는 Command 객체를 가지고 있으며, 해당 Command 객체를 실행하는 기능을 수행
	Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void pressButton() {
		command.execute();
	}
}