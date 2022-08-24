package Timing;

import java.util.ArrayList;
import java.util.function.Supplier;

import static Timing.TimedTaskResult.*;

public class TimedTaskExecutor {
    public TimedTaskExecutor(){

    };

    public TimedTaskResult execute(Supplier<TimedTask>, int) {
        return new TimedTaskResult(max(), min(), mean(), times(), trials());
    }

    public static void main(String[] args) {
        TimedTaskExecutor timedTaskExecutor = new TimedTaskExecutor();
        ArrayList<TimedTaskResult> results = new ArrayList<>();

        results.add(timedTaskExecutor.execute(() -> new AddLongOperation(square(1)), 1));
    }
}
