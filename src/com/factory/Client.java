package com.factory;

public class Client {

	private static final String THEME="material";// if i need to change theme just change here :)
	
	public static void main(String[] args) {
		
		Theme theme=ThemeFactory.createThemeForIdentifier(THEME);
		ThemeComponentFactory themeComponentFactory = theme.createThemeComponentFactory();
		
		themeComponentFactory.createButton();
		themeComponentFactory.createMenu();
		themeComponentFactory.createDropdown();

	}

}
