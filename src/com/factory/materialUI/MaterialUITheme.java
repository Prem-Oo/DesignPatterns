package com.factory.materialUI;

import com.factory.Theme;
import com.factory.ThemeComponentFactory;

public class MaterialUITheme extends Theme {

	@Override
	public ThemeComponentFactory createThemeComponentFactory() {
		
		return new MaterialUIThemeComponentFactory();
	}

	@Override
	public boolean changePrimaryColor() {
		// TODO Auto-generated method stub
		return false;
	}

}
