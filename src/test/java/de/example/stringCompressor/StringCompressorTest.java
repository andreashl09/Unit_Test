package de.example.stringCompressor;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class StringCompressorTest {

    @Test
    @DisplayName("string is empty")
    public void test1(){
        String result = StringCompressor.compress("");
        assertEquals("String ist leer", result);
    }

    @Test
    @DisplayName("output the number of individual characters in a string")
    public void test2(){
        String result = StringCompressor.compress("aaabbbcccaaa");
        assertEquals("a3b3c3a3", result);
    }

    @Test
    @DisplayName("output the number of individual characters in a string")
    public void test3(){
        String result = StringCompressor.compress("aabcccccaaa");
        assertEquals("a2bc5a3", result);
    }


}