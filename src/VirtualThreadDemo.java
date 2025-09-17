import java.util.concurrent.CountDownLatch;

public class VirtualThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        int tasks = 1_000_000;
        CountDownLatch latch = new CountDownLatch(tasks);

        long start = System.currentTimeMillis();

        for (int i = 0; i < tasks; i++) {
            Thread.startVirtualThread(() -> {
                try {
                    Thread.sleep(1000); // имитируем I/O
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    latch.countDown();
                }
            });
        }

        latch.await();
        long end = System.currentTimeMillis();

        System.out.println("All tasks completed in " + (end - start) + " ms");
    }
}