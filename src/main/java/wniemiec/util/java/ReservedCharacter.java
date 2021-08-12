/**
 * Copyright (c) William Niemiec.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package wniemiec.util.java;

/**
 * Characters reserved by the Windows operating system.
 */
enum ReservedCharacter {
	
	//-------------------------------------------------------------------------
	//		Enumeration
	//-------------------------------------------------------------------------
	LESS_THAN("<", "\\<"),
	GREATER_THAN(">", "\\>"),
	FORWARD_SLASH("/", "\\/"),
	BACK_SLASH("\\", "\\\\"),
	COLON(":", "\\:"),
	DOUBLE_QUOTES("\"", "\\\""),
	PIPE("|", "\\|"),
	QUESTION_MARK("?", "\\?"),
	ASTERISK("*", "\\*");
	
	
	//-------------------------------------------------------------------------
	//		Attributes
	//-------------------------------------------------------------------------
	private String character;
	private String regex;
	
	
	//-------------------------------------------------------------------------
	//		Constructor
	//-------------------------------------------------------------------------
	private ReservedCharacter(String character, String regex) {
		this.character = character;
		this.regex = regex;
	}
	
	
	//-------------------------------------------------------------------------
	//		Getters
	//-------------------------------------------------------------------------
	public String getCharacter() {
		return character;
	}
	
	public String getRegex() {
		return regex;
	}
}