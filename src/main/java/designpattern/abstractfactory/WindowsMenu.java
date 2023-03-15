package designpattern.abstractfactory;

public class WindowsMenu implements Menu {
	@Override
	public void show() {
		System.out.println("Windows Menu Showed.");
	}
}
