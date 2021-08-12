/**
 * Copyright (c) William Niemiec.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package wniemiec.util.java;

/**
 * Replace characters in a string according to some criteria.
 */
public interface Replacer {

	/**
	 * Replaces all reserved characters with others.
	 * 
	 * @param		str Path, filename or directory name to be processed
	 * 
	 * @return		String without reserved characters
	 * 
	 * @throws		IllegalArgumentException If str is null
	 */
	public String replace(String str);
}
