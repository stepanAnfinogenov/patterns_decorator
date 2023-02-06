package com.anf2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TextProcessorImplCache implements TextProcessor {
    private final Map<String, Map<Character, Integer>> cache = new HashMap<>();
    private final TextProcessor processor;
    
	public TextProcessorImplCache(TextProcessor processor) {
		this.processor = processor;
	}

	@Override
	public Map<Character, Integer> countRepeatingCharacter(String input) {  
	    
		return new LinkedHashMap<>(cache.computeIfAbsent(input, processor::countRepeatingCharacter));
	}	
}
