package de.example.stringCompressor;

import java.util.HashMap;

public class StringCompressor {

    public static String compress(String input) {
        if (input.isEmpty()){
            return "String ist leer";
        }

        StringBuilder output = new StringBuilder();

        int index = 0;
        while (index < input.length()) {
            char c = input.charAt(index);
            int i = 1;
            while (++index < input.length() && c == input.charAt(index)){
                ++i;
            }
            output.append(c);
            if (i > 1) output.append(i);

        }
        return output.toString();
    }
}
