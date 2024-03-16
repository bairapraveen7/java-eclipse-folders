package factory;

import factory.buttons.Button;
import factory.dropdown.Dropdown;
import factory.menu.Menu;

public interface UIFactory {
	public Button createButton();
	public Menu createMenu();
	public Dropdown createDropdown();
}
