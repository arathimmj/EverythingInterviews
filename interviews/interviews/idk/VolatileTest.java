import java.util.Scanner;

class trialss
//        extends Thread
        implements Runnable
{
    volatile
        boolean running = true;

    @Override
    public void run() {
        while (running){
            System.out.println("running");
        }
    }

    public void shutDown(){
        running = false;
    }
}
public class VolatileTest {
    public static void main(String[] args) {
        trialss t = new trialss();
//        t.start();
        Thread thread = new Thread(t);
        thread.start();
        Scanner input = new Scanner(System.in);
        input.nextLine();

        t.shutDown();
    }
}
