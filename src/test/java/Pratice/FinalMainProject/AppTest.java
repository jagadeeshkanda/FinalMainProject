package Pratice.FinalMainProject;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import Testdata.DataLoader;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
    	String ad = DataLoader.getInstance("Registration.json").getValue(0,"Firstname");
    	System.out.println(ad);
        assertTrue(true);
    }
}
