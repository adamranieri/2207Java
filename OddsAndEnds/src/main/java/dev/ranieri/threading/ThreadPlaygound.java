package dev.ranieri.threading;

public class ThreadPlaygound {

    public static void main(String[] args) {
        // Threads are a path of execution through a program
        // certain programming languages support running multiple threads/ snippets of code in PARALLEL
        // Almost always done for optimization purposes. Multithreading correctly is very difficult

        Runnable run1 = ()->{
            for (int i = 0; i <10; i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Hello!!!" + Thread.currentThread());
            }

;        };

        Thread thread1 = new Thread(run1); // makes a thread object

        Runnable run2 = ()->{
            for (int i = 0; i <10; i++){
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("hola!!!" +Thread.currentThread());
            }
        };
        Thread thread2 = new Thread(run2);

        thread1.start();
        thread2.start();

        StringBuilder stringBuilder = new StringBuilder("Hello2");

        StringBuffer stringBuffer = new StringBuffer("Hello World");
        // thread safe version of string builder
        Object object = new Object();
        // synchronized blocks or method only allow a single thread to access them at a time
        synchronized (object){

        }



    }
}
