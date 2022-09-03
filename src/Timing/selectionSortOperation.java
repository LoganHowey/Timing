package Timing;

public class selectionSortOperation implements TimedTask {
    private long i;
    private long[] data = new long[(int) i];

    public selectionSortOperation(long i, String type) {
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
        {
            int min; /* index of minimum */
            for (int check = 0; check < i; check++){
                System.out.println(data[check]);}
            System.out.println("end");
            for (int index = 0; index < this.i - 1; index++) {
                min = index;
                long swapping = 0;
                int j;
                for (j = index + 1; j < i; j++) {
                    if (data[j] < data[min]) {
                        min = j;
                        swapping = data[index];
                        data[index] = data[min];
                        data[min] = swapping;
                    }
                }
            }
            for (int check = 0; check < i; check++)
                System.out.println(data[check]);
            long endTime = System.currentTimeMillis();
            long totalTime = endTime - startTime;
            return totalTime;
        }
    }
}
