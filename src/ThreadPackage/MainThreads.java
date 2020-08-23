package ThreadPackage;

public class MainThreads {

    /*  https://www.youtube.com/watch?v=TCd8QIS-2KI */

    /* main method represents main threads */
    public static void main(String[] args) {

        System.out.println("Thread Started");
        Runnable r = new printer2();
        Thread task = new Thread(r);
        task.start();

        for (int i=1;i<=10;i++)
        {
            System.out.println("printing doc "+i+" from printer 1");
        }
        System.out.println("Thread Ended");
    }
}

/* As soon as the run() method is implemented , the main() and run() methods run in parallel
 * If the run() was not implemented, the java will run in sequence */

/* In the below code, we can use "extends Thread" to achieve parallel execution however, we can’t extend any other class which we require
*  i.e if I need to extend any other class to printer2, then it will not be possible. So if we use Runnable interface, then
* we can extend any other class if necessary. Runnable is more preferable. */

class printer2 implements Runnable {


    public void run()
    {
        for (int i=1;i<=10;i++)
        {
            System.out.println("printing doc "+i+" from printer 2");
        }
    }

}
