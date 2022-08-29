package Timing;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import static Timing.TimedTaskResult.*;

public class TimedTaskExecutor {
    public TimedTaskExecutor() {

    }

    ;

    public TimedTaskResult execute(Supplier<TimedTask> w, int trials) {
        for (int i = 0; i < trials; i++) {
            TimedTask timedTask = w.get();
            timedTask.execute();
        }
        return null;
    }

    public static void main(String[] args) {
        TimedTaskExecutor timedTaskExecutor = new TimedTaskExecutor();
        ArrayList<TimedTaskResult> results = new ArrayList<>();

        results.add(timedTaskExecutor.execute(() -> new AddLongOperation(5), 20));

        System.out.format("| Trials | Max | Mean | Min | %n |");
        for (TimedTaskResult execute : results) {
            System.out.format("| %s | %s | %s | %s | %n |", execute.trials(), execute.max(), execute.mean(), execute.min());
        }

    }
}
