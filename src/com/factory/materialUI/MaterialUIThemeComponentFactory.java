package com.factory.materialUI;

import com.factory.Button;
import com.factory.Dropdown;
import com.factory.Menu;
import com.factory.ThemeComponentFactory;

public class MaterialUIThemeComponentFactory implements ThemeComponentFactory {

	@Override
	public Button createButton() {
		
		return new MaterialUIButton();
	}

	@Override
	public Menu createMenu() {
		
		return new MaterialUIMenu();
	}

	@Override
	public Dropdown createDropdown() {
		
		return new MaterialUIDropdown();
	}

}
