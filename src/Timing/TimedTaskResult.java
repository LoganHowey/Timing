package Timing;

import java.util.List;

public class TimedTaskResult {
    public List<Long> resultList;
    public TimedTaskResult(List<Long> resultList) {
    this.resultList = resultList;
    }

    public Long max() {
        long maximum = 0;
        for (int i = 0; i < this.resultList.size(); i++){
            long newElement = resultList.get(i);
            if (newElement > maximum){
                maximum = newElement;
                }
        }
        return maximum;
    }

    public Double mean(){
        int total = 0;
        for (int i = 0; i < resultList.size(); i++){
            total += resultList.get(i);
        }

       Double resultMean = Double.valueOf(total / resultList.size());
       return resultMean;
    }
    public Long min(){
        long minimum = 999999999;
        for (int i = 0; i < resultList.size(); i++){
            Long newElement = resultList.get(i);
            if (newElement < minimum)
                minimum = newElement;}

        return minimum;
    }
    public List<Long> times(){
        return resultList;
    }
    public int trials(){
        return resultList.size();

    }
}
