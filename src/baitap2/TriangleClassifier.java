package baitap2;

public class TriangleClassifier {

    public static String getTriang(int adjacentSide, int oppositeSides, int hypotenuse) {
        if(hypotenuse!=adjacentSide){
            return adjacentSide+"/"+oppositeSides+"/"+hypotenuse;
        }else {
            return adjacentSide + "/" + oppositeSides + "/" + hypotenuse;
        }
    }
}
