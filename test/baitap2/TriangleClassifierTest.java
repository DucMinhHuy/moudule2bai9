package baitap2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleClassifierTest {
        @Test
        @DisplayName("deu")
        void equilateralTriangle() {
            int adjacentSide = 2;
            int oppositeSides = 2;
            int hypotenuse = 2;
            String expected="2/2/2";
            String result=TriangleClassifier.getTriang(adjacentSide,oppositeSides,hypotenuse);
            assertEquals(expected,result);
        }
        @Test
    @DisplayName("can")
    void isosceles(){
            int adjacentSide=2;
            int oppositeSides=2;
            int hypotenuse=3;
            String expected="2/2/3";
            String result=TriangleClassifier.getTriang(adjacentSide,oppositeSides,hypotenuse);
            assertEquals(expected,result);
        }
}