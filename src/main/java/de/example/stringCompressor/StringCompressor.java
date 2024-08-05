package de.example.stringCompressor;

import java.util.HashMap;

public class StringCompressor {

    public static String compress(String input) {
        if (input.isEmpty()){
            return "String ist leer";
        }
        StringBuilder output = new StringBuilder();

        while (!input.isEmpty()) {
            char c = input.charAt(0);
            int i = 0;
            do {
                input = input.substring(1);
                ++i;
                if (input.isEmpty()) break;
            } while (c == input.charAt(0));
            output.append(c);
            if (i > 1) output.append(i);

        }
        return output.toString();
    }
}
