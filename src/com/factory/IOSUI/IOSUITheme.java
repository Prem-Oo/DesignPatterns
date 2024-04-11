package com.factory.IOSUI;

import com.factory.Theme;
import com.factory.ThemeComponentFactory;

public class IOSUITheme extends Theme {

	@Override
	public ThemeComponentFactory createThemeComponentFactory() {
		return new IOSUIThemeComponentFactory();
	}

	@Override
	public boolean changePrimaryColor() {
		
		return false;
	}

}
