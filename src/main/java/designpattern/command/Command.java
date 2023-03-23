package designpattern.command;

public interface Command {
	//해당 인터페이스는 Command 패턴의 모든 구현체가 구현해야 하는 기본 인터페이스.
	void execute(); //execute 메소드는 해당 명령을 실행하는 기능을 담당.
}
