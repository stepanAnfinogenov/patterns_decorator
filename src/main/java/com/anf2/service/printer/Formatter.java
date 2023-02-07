package com.anf2.service.printer;

import java.util.Map;

public class Formatter {
    private static final String SPACE = " ";
    private static final String QUOTE = "\"";
    private static final String DASH = "-";
    private static final String NEW_LINE = "\n";

    public String formOutputString(String request, Map<Character, Integer> charFrequency) {
        StringBuilder result = new StringBuilder(request);

        result.append(NEW_LINE);
        charFrequency.forEach((currentChar, currentFrequency) -> result.append(QUOTE)
            .append(currentChar)
            .append(QUOTE)
            .append(SPACE)
            .append(DASH)
            .append(SPACE)
            .append(currentFrequency)
            .append(NEW_LINE));

        return result.toString();
    }
}
