package cn.bssys.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by Ww on 2018/4/14.
 */
public class EmailBlockingQueue<T> {
    private BlockingQueue<T> emailQueue;

    private int capacity;

    public EmailBlockingQueue() {
        this(10);
    }

    public EmailBlockingQueue(int capacity) {
        emailQueue = new LinkedBlockingQueue<>(capacity);
    }

    public T poll(long timeout, TimeUnit unit) throws InterruptedException {
        return emailQueue.poll(timeout,unit);
    }

    public void offer(T t, long timeout, TimeUnit unit) throws InterruptedException {
        emailQueue.offer(t,timeout,unit);
    }
}
