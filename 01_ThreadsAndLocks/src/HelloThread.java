package src;

/**
 * src.HelloThread
 * 
 * The <code>Thread</code> class itself implements
 * <code>Runnable</code> interface, though its <code>run</code>
 * does nothing. An application can subclass <code>Thread</code>,
 * providing its own implementation of <code>run</code> as in the
 * following example.
 * 
 * @author xin li
 */
public class HelloThread extends Thread {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String[] args) {
        (new HelloThread()).start();
    }
}