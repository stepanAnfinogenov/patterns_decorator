package com.anf2.service.processor;

import java.util.LinkedHashMap;
import java.util.Map;

public class TextProcessorImpl implements TextProcessor {
	
	@Override
	public Map<Character, Integer> countRepeatingCharacter(String input) {
		Map<Character, Integer> chars = new LinkedHashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (chars.containsKey(currentChar)) {
                chars.put(currentChar, chars.get(currentChar) + 1);
            } else {
                chars.put(currentChar, 1);
            }
        }

        return chars;
	}
}
