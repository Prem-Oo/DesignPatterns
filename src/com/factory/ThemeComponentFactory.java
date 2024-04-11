package com.factory;


// Abstract Factory : has all factory methods

//  XFactory :: return type will be related to the X;

// all methods in abstract factory are --> factory methods.
public interface ThemeComponentFactory {

	Button createButton();
	
	Menu createMenu();
	
	Dropdown createDropdown();
}
