package Timing;

import java.util.function.Supplier;

public class AddLongOperation implements TimedTask{
    private long i;
    public AddLongOperation(long i){
    this.i = i;
    }

    public void execute() {
        long y = 0;
        long startTime = System.currentTimeMillis();
        while (y < i){
            y++;
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime-startTime;
    }


}
