package Timing;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arraySortOperation implements TimedTask {

    private long i;
    private long[] data = new long[(int) i];

    public arraySortOperation(long i, String type) {
        this.i = i;
        data = new long[(int) this.i];
        if (type.equals("Normal")) {
            for (int index = 0; index < i; index++) {
                data[index] = index;
            }
        }
        if (type.equals("Reverse")) {
            for (int index = 0; index == 0; index--) {
                data[index] = i;
                i--;
            }
        }
        if (type.equals("Random")) {
            for (int index = 0; index < i; index++) {
                long random = (long) (Math.random() * 100);
                data[index] = random;
            }
        }
    }
    public long execute() {
        long startTime = System.currentTimeMillis();
        Arrays.sort(data);
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        return totalTime;
    }
}
