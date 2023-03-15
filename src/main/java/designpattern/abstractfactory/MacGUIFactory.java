package designpattern.abstractfactory;

public class MacGUIFactory extends GUIFactory {
	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public Menu createMenu() {
		return new MacMenu();
	}
}
