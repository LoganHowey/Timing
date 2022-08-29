package Timing;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import static Timing.TimedTaskResult.*;

public class TimedTaskExecutor {
    public TimedTaskExecutor() {

    }

    ;

    public TimedTaskResult execute(Supplier<TimedTask> w, int trials) {
        List<Long> results = new ArrayList<>();
        for (int i = 0; i < trials; i++) {
            TimedTask timedTask = w.get();
            timedTask.execute();
            results.add(w.get().execute());
        }
        return new TimedTaskResult(results);
    }

    public static void main(String[] args) {
        TimedTaskExecutor timedTaskExecutor = new TimedTaskExecutor();
        ArrayList<TimedTaskResult> results = new ArrayList<>();

        results.add(timedTaskExecutor.execute(() -> new AddLongOperation(1), 20));
        results.add(timedTaskExecutor.execute(() -> new AddLongOperation(10), 20));
        results.add(timedTaskExecutor.execute(() -> new AddLongOperation(100), 20));
        results.add(timedTaskExecutor.execute(() -> new AddLongOperation(1000), 20));
        results.add(timedTaskExecutor.execute(() -> new AddLongOperation(10000), 20));
        results.add(timedTaskExecutor.execute(() -> new AddLongOperation(100000), 20));
        results.add(timedTaskExecutor.execute(() -> new AddLongOperation(1000000), 20));
        results.add(timedTaskExecutor.execute(() -> new AddLongOperation(10000000), 20));
        results.add(timedTaskExecutor.execute(() -> new AddLongOperation(100000000), 20));
        results.add(timedTaskExecutor.execute(() -> new AddLongOperation(1000000000), 20));
        System.out.format("| Trials | Max | Mean | Min | %n |");
        for (TimedTaskResult execute : results) {
            System.out.format("| %s | %s | %s | %s | %n |", execute.trials(), execute.max(), execute.mean(), execute.min());
        }

    }
}
