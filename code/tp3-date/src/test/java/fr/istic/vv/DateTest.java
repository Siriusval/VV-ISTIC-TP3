package fr.istic.vv;

import org.junit.jupiter.api.Test;

import static fr.istic.vv.Date.isValidDate;
import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    public void testValid(){
        assertFalse(isValidDate(32,45,9898));
    }
}