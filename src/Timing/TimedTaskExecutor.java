package Timing;

import java.util.ArrayList;
import java.util.function.Supplier;

import static Timing.TimedTaskResult.*;

public class TimedTaskExecutor {
    public TimedTaskExecutor(){

    };

    public TimedTaskResult execute(Supplier<TimedTask> w, int trials) {
        TimedTask timedTask = w.get();
        timedTask.execute();
        return null;
    }

    public static void main(String[] args) {
        TimedTaskExecutor timedTaskExecutor = new TimedTaskExecutor();
        ArrayList<TimedTaskResult> results = new ArrayList<>();

    }
}
