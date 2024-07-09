package calculatetime;

public class Timer implements TimerMBean
{
    private long startTime;
    private long elapsedTime;

    @Override
    public void start() {
        startTime = System.nanoTime();
    }

    @Override
    public void stop() {
        elapsedTime = System.nanoTime()-startTime;
    }

    @Override
    public long getTime() {
        return elapsedTime;
    }
}
