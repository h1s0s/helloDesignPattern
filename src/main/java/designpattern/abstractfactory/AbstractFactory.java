package designpattern.abstractfactory;

public class AbstractFactory {
	public static void main(String[] args) {
		GUIFactory factory = null;
		String osName = System.getProperty("os.name").toLowerCase();
		if (osName.contains("windows")) {
			factory = new WindowsGUIFactory();
		} else if (osName.contains("mac")) {
			factory = new MacGUIFactory();
		}

		Button button = factory.createButton();
		Menu menu = factory.createMenu();

		button.paint(); // 플랫폼에 따른 Button 출력
		menu.show();    // 플랫폼에 따른 Menu 출력
	}
}
