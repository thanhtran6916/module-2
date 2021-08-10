package StopWatch;

import javafx.scene.paint.Stop;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {}
    public StopWatch(double a) {}

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public void star() {
        this.startTime = System.currentTimeMillis();
    }

    public void end() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

}


