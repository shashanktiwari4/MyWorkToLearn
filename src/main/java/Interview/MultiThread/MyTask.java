package Interview.MultiThread;

public class MyTask {

    static ThreadLocal<Integer> balanceCount=ThreadLocal.withInitial(() -> 1);

    public static void main(String[] args) throws InterruptedException {

        Runnable task1=()->{int bal=balanceCount.get().intValue()+1;
        System.out.println("In the task1 to increment balanceCount by Thread1.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(bal);
            System.out.println("Thread1");
        };

        Runnable task2=new Runnable() {
            @Override
            public void run() {

                int bal1=balanceCount.get().intValue()+5;
                System.out.println("In the task2 to increment balanceCount by Thread2.");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(bal1);
                System.out.println("Thread2");
            }
        };

        Thread t1=new Thread(task1);
        Thread t2=new Thread(task2);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        balanceCount.remove();

    }
}
