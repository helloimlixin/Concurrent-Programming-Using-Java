/**
 * HelloRunnable
 * The <code>Runnable</code> interface defines a single method,
 * <code>run</code>, to contain the code executed in the thread.
 * The <code>Runnable</code> object is passed to the
 * <code>Thread</code> constructor, as in the following example.
 * 
 * @author xin li
 */
public class HelloRunnable implements Runnable {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String[] args) {
        (new Thread(new HelloRunnable())).start();
    }
}