package baidoc2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class absolutNumberCalculatorTest {

    @Test
    void testFindAbsolute() {
        int number =0;
        int expected=0;
        int result =absolutNumberCalculator.findAbsolute((number));
        assertEquals(expected,result);
    }
    @Test
    void testFindAbsolute0(){
        int number=1;
        int expected=1;
        int result=absolutNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }
    @Test
    void testFindAbsolute1(){
        int number =-1;
        int expected=1;
        int result=absolutNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }
}
//class AbsoluteNumberCalculator{
//    public static int findAbsolute(int number){
//        if(number<0)
//            return -number;
//        return number;
//    }
//}