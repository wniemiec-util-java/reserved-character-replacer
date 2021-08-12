/**
 * Copyright (c) William Niemiec.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package wniemiec.util.java;

/**
 * Creates a changer of characters that are reserved from the operating system.
 */
public class ReservedCharactersReplacerFactory {
	
	//-------------------------------------------------------------------------
	//		Constructor
	//-------------------------------------------------------------------------
	private ReservedCharactersReplacerFactory() {
	}
	
	
	//-------------------------------------------------------------------------
	//		Getters
	//-------------------------------------------------------------------------
	public static Replacer getStandardReplacer() {
		return new StandardReservedCharactersReplacer();
	}
}
