package Thread;

public class example1 {

    synchronized void show()  {
        System.out.println("showing the pictures of yours");
        System.out.println("problems error.............");
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("good to go");

    }

    synchronized  void display()  {
        System.out.println("wait solviing problems ................");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Problem fixed....");
        notifyAll();

    }

    public static void main(String[] args) throws InterruptedException {

        example1 f = new example1();
        Thread thread1= new Thread(new Runnable(){
           public void run()
           {
               f.show();
           }

        });
        thread1.start();

        Thread thread2 =  new Thread(new Runnable(){
            public void run()
            {
                f.display();
            }

        });
        thread2.start();
            thread1.join();
         thread2.join();
        System.out.println("Good Bye!!");
    }

}