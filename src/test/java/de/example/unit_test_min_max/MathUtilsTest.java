package de.example.unit_test_min_max;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    @DisplayName("Check which number is greater")
    public void numberIsGreater(){
        int result = MathUtils.max(2,4);
        assertEquals(4,result);
        assertNotEquals(2,result);
    }


    @Test
    @DisplayName("Check which number is smaller")
    public void numberIsSmaller(){
        int result = MathUtils.min(2,4);
        assertEquals(2,result);
    }

}