package Timing;

import java.util.function.Supplier;

public class AddLongOperation implements TimedTask{
    public AddLongOperation(long x){
        long y = 0;
        long startTime = System.currentTimeMillis();
        while (y < x){
            y++;
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime-startTime;
        System.out.println(totalTime);

    }

    public void execute() {

    }


}
