package Timing;

import java.util.List;

public class TimedTaskResult {
    public TimedTaskResult(List<Long> resultList) {

    }

    public static Long max() {
        long maximum = 0;
        for (int i = 0; i < resultList.size() i++){
            Long newElement = resultList.get(i);
            if (newElement > maximum)
                newElement = maximum;
        }
        return maximum;
    }

    public static Double mean(){
        int total = 0;
        for (int i = 0; i < resultList.size() i++){
            total += resultList.get(i)};
        }
       Double resultMean = total / resultList.size();
       return resultMean;
    }
    public static Long min(){
        long minimum = 999999999;
        for (int i = 0; i < resultList.size() i++){
            Long newElement = resultList.get(i);
            if (newElement < minimum)
                newElement = minimum;}

        return minimum;
    }
    public static List<Long> times(){
        return null;
    }
    public static int trials(){
        return 0;

    }
}
