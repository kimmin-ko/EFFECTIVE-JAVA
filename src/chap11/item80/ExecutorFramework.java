package chap11.item80;

public class ExecutorFramework {

    public static void main(String[] args) {
//        ExecutorService exec = Executors.newSingleThreadExecutor();
//        exec.execute(runnable);
//        exec.shutdown();

        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        };

        task.run();

        Thread thread = new Thread(task);
        thread.start();

        System.out.println("DONE !");
    }

}
