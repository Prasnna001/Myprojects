package Thread;

public class synchronizedthread {

    public  synchronized void method() throws InterruptedException {
        System.out.println("Hello");
        wait();
        System.out.println("welcome");
    }
    public static void main(String[] args) throws InterruptedException {
        synchronizedthread s = new synchronizedthread();
        Thread thread1=new Thread(new Runnable(){
           public void run()
           {
               try {s.method();} catch (InterruptedException e) {throw new RuntimeException(e);}

           }
        });
        thread1.start();
            thread1.join();
        Thread thread2 = new Thread(new Runnable(){

            @Override
            public void run() {
                try {s.method();} catch (InterruptedException e) {throw new RuntimeException(e);}
            }
        });
        thread2.start();
    }
    }
