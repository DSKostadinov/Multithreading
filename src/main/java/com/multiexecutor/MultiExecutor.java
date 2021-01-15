package main.java.com.multiexecutor;

import java.util.List;

public class MultiExecutor {

    List<Runnable> tasks;

    public MultiExecutor(List<Runnable> tasks) {
        this.tasks = tasks;
    }

    public void executeAll() {
        tasks.forEach(thread -> new Thread(thread).start());
    }
}
