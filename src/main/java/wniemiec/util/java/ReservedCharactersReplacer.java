/**
 * Copyright (c) William Niemiec.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package wniemiec.util.java;

import java.util.Map;

/**
 * Responsible for replacing all characters reserved by the operating system
 * with others according to a mapping. 
 */
abstract class ReservedCharactersReplacer implements Replacer {
	
	//-------------------------------------------------------------------------
	//		Attributes
	//-------------------------------------------------------------------------
	private final Map<ReservedCharacter, String> mapping;
	
	
	//-------------------------------------------------------------------------
	//		Constructor
	//-------------------------------------------------------------------------
	/**
	 * Replaces all characters reserved by the operating system with the 
	 * characters provided in the mapping. 
	 * 
	 * @param		mapping Mapping containing reserved characters along with 
	 * substitute characters 
	 * 
	 * @throws		IllegalArgumentException If mapping is null
	 */
	protected ReservedCharactersReplacer(Map<ReservedCharacter, String> mapping) {
		if (mapping == null)
			throw new IllegalArgumentException("Mapping cannot be null");
		
		this.mapping = mapping;
	}
	
	
	//-------------------------------------------------------------------------
	//		Methods
	//-------------------------------------------------------------------------
	@Override
	public String replace(String str) {
		if (str == null)
			throw new IllegalArgumentException("String cannot be null");
		
		String processedStr = str;
		
		for (ReservedCharacter reservedCharacter : mapping.keySet()) {
			processedStr = replaceAllReservedCharacter(processedStr, reservedCharacter);
		}
		
		return processedStr;
	}
	
	private String replaceAllReservedCharacter(String str, ReservedCharacter reservedCharacter) {
		return str.replaceAll(
				reservedCharacter.getRegex(), 
				mapping.get(reservedCharacter)
		);
	}
}
