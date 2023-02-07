package com.anf2.service.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextFileReader {

	public List<String> readTextFile(String pathTextFile) {
		List<String> result = new ArrayList<>();
		
        try (BufferedReader reader = new BufferedReader(new FileReader(pathTextFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                result.add(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

		return result;
	}	
}
