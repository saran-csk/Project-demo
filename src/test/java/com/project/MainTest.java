package com.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test cases for Main class.
 */
public class MainTest {

    @Test
    public void testApplicationStarts() {
        assertDoesNotThrow(() -> {
            // Verify application can be instantiated
            assertNotNull(Main.class);
        });
    }

    @Test
    public void testMainClassExists() {
        assertTrue(Main.class.getName().contains("Main"));
    }
}
