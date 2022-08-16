package tap1;

import baitap1.NextDayCalculator;
import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class NextDay{
    @Test
    @DisplayName("case 1/1/2018")
    void testDay1Month1Year2018(){
        int dayTest=1;
        int monthTest=1;
        int yearTest=2018;
        String expected="2/1/2018";
        String result= NextDayCalculator.getNextDay(dayTest,monthTest,yearTest);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("case 31/1/2022")
    void testDay31Month1Year2022(){
        int dayTest=31;
        int monthTest=1;
        int yearTest=2022;
        String expected="1/2/2022";
        String result=NextDayCalculator.getNextDay(dayTest,monthTest,yearTest);
        assertEquals(expected,result);
    }
}
