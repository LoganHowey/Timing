package Timing;

public class AddLongOperation implements TimedTask{
    private long i;
    public AddLongOperation(long i){
    this.i = i;
    }
    @Override
    public long execute() {
        long y = 0;
        long startTime = System.currentTimeMillis();
        while (y < i){
            y++;
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime-startTime;
    return totalTime;}
}

