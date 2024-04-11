package com.factory;

import com.factory.IOSUI.IOSUITheme;
import com.factory.materialUI.MaterialUITheme;


/*   simple or pratical factory
 * 
 *   XFactory :: return type of all methods are X.
 * 
 * */
public class ThemeFactory {

	public static Theme createThemeForIdentifier(String theme) {
		if(theme.equals("material")) {
			return new MaterialUITheme();
		}
		else if(theme.equals("ios")) {
			return new IOSUITheme();
		}
		else
			throw new IllegalArgumentException();
	}
}
