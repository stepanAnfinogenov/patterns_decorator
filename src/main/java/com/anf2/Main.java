package com.anf2;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
      TextProcessor textProcessor = new TextProcessorImpl();
      TextProcessor textProcessorCache = new TextProcessorImplCache(textProcessor);

      String path = "src/main/resources/input1.txt";
      TextFileReader reader = new TextFileReader();
      List<String> strings = reader.readTextFile(path);
      ConsolePrinter printer = new ConsolePrinter();
      Formatter formatter = new Formatter();

      for (String currentString : strings) {
          Map<Character, Integer> response = textProcessorCache.countRepeatingCharacter(currentString);
          printer.consolePrint(formatter.formOutputString(currentString, response));
      }
    }
}
