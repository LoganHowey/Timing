package Timing;

public class insertionSortOperation implements TimedTask {
    private long i;
    private long[] data = new long[(int) i];

    public insertionSortOperation(long i, String type) {
        this.i = i;
        data = new long[(int) this.i];
        if (type.equals("Normal")) {
            for (int index = 0; index < i; index++) {
                data[index] = index;
            }
        }
            if (type.equals("Reverse")) {
                for (int index = 0; index == 0; index --) {
                    data[index] = i;
                    i--;
                }
            }
            if (type.equals("Random")){
                for (int index = 0; index < i; index++) {
                long random = (long) (Math.random()*100);
                    data[index] = random;
                }
            }
        }

    public long execute() {
        long startTime = System.currentTimeMillis();
        System.out.println(data[0]);
        for (int index = 1; index < i; index++) {
            int j = index;
            long swapping = 0;
            while ((j > 0) && (data[j] < data[j - 1])) {
                swapping = data[j];
                data[j] = data[j - 1];
                data[j - 1] = swapping;
                j--;
            }
        }
        for (int check = 0; check < i; check++)
            System.out.println(data[check]);
        System.out.println(data[0]);
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        return totalTime;
    }
}

