package com.factory;

public abstract class Theme {

	String author;
	String primaryColor;
	String name;

	// Factory Method
	// factory of ThemecomponentFactory
	public abstract ThemeComponentFactory createThemeComponentFactory();
	
	public abstract boolean changePrimaryColor();
	
}
