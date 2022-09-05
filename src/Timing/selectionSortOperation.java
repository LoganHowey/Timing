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
            for (int index = 0; index < this.i - 1; index++) {
                int min = index;
                int j;
                for (j = index + 1; j < i; j++) {
                    if (data[j] < data[min]) {
                        min = j;
                    }
                }
                        long swapping = data[min];
                        data[min] = data[index];
                        data[index] = swapping;
                    }
            long endTime = System.currentTimeMillis();
            long totalTime = endTime - startTime;
            return totalTime;
        }
    }
