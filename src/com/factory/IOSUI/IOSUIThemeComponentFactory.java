package com.factory.IOSUI;

import com.factory.Button;
import com.factory.Dropdown;
import com.factory.Menu;
import com.factory.ThemeComponentFactory;

public class IOSUIThemeComponentFactory implements ThemeComponentFactory {

	@Override
	public Button createButton() {
		
		return new IOSUIButton();
	}

	@Override
	public Menu createMenu() {
		
		return new IOSUIMenu();
	}

	@Override
	public Dropdown createDropdown() {
		
		return new IOSUIDropdown();
	}

}
