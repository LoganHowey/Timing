package Timing;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class TimedTaskExecutor {
    public TimedTaskExecutor() {

    }

    ;

    public TimedTaskResult execute(Supplier<TimedTask> w, int trials) {
        List<Long> results = new ArrayList<>();
        for (int i = 0; i < trials; i++) {
            results.add(w.get().execute());
        }
        return new TimedTaskResult(results);
    }

    public static void main(String[] args) {
        TimedTaskExecutor timedTaskExecutor = new TimedTaskExecutor();
        ArrayList<TimedTaskResult> results = new ArrayList<>();

        results.add(timedTaskExecutor.execute(() -> new selectionSortOperation(1000, "Random"), 1));
        results.add(timedTaskExecutor.execute(() -> new selectionSortOperation(100_000, "Random"), 1));
        results.add(timedTaskExecutor.execute(() -> new selectionSortOperation(1_000_000, "Random"), 1));
        results.add(timedTaskExecutor.execute(() -> new insertionSortOperation(1000, "Random"), 1));
        results.add(timedTaskExecutor.execute(() -> new insertionSortOperation(100_000, "Random"), 1));
        results.add(timedTaskExecutor.execute(() -> new insertionSortOperation(1_000_000, "Random"), 1));
        results.add(timedTaskExecutor.execute(() -> new arraySortOperation(1000, "Random"), 1));
        results.add(timedTaskExecutor.execute(() -> new arraySortOperation(100_000, "Random"), 1));
        results.add(timedTaskExecutor.execute(() -> new arraySortOperation(1_000_000, "Random"), 1));


        System.out.format("| Trials | Max | Mean | Min | Times | %n");
        for (TimedTaskResult execute : results) {
            System.out.format("| %s | %s | %s | %s | %s | %n", execute.trials(), execute.max(), execute.mean(), execute.min(), execute.times());

        }

    }
}
