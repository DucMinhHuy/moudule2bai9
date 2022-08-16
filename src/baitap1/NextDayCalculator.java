package baitap1;

public class NextDayCalculator {
    public static String getNextDay(int dayTest, int monthTest, int yearTest) {
        String result;
        if (dayTest == 31) {
            result = 1 + "/" + (++monthTest) + "/" + yearTest;
            return result;
        } else {
            result=++dayTest+"/"+monthTest+"/"+yearTest;
        }
        return result;
    }
}
