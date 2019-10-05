package src;

/**
 * An <code>interrupt</code> is an indication to a thread that it should stop what it is doing and do
 * something else.
 * A thread sends an interrupt by invoking <code>interrupt</code> on the <code>Thread</code> object
 * for the thread to be interrupted. For the interrupt mechanism to work correctly, the interrupted
 * thread must support its own interruption.
 * <h2>Supporting Interruption</h2>
 * It can do things like throwing an <code>InterruptedException</code>.
 * <h2>The Interrupt Status Flag</h2>
 * The <em>interrupt</em> mechanism is implemented using an internal flag known as the
 * <code>interrupt</code> status. Invoking <code>Thread.interrupt</code> sets this flag. When a thread
 * checks for an interrupt by invoking the <em>static</em> method <code>Thread.interrupted</code>,
 * interrupt status is <em>cleared</em>. Note that the <em>non-static</em> <code>isInterrupted</code>
 * method, which is used by one thread to query the interrupt status of another,
 * <strong>does not</strong> change the status flag.
 *
 * By convention, any method that exits by throwing an <code>InterruptedException</code> clears
 * interrupt status when it does so. However, it's always possible that interrupt status will
 * immediately be set again, by <em>another</em> thread invoking interrupt.
 * @author xinli
 */
public class SleepMessagesWithInterrupts {
    /**
     * Note that the main method throws <code>InterruptedException</code>. This is an
     * exception that <code>sleep</code> throws when another thread interrupts the
     * current thread while <code>sleep</code> is active. Since this application has
     * not defined another thread to cause the interrupt, it does not bother to catch
     * <code>InterruptedException</code>.
     * @param args command line arguments
     * @throws InterruptedException thrown by <code>sleep</code> method.
     */
    public static void main(String[] args) throws InterruptedException {
        String[] importantInfo = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
        };

        // The for loop can also be formed as follows.
        for (int i = 0; i < importantInfo.length; i++) {
//            // Pause for 4 seconds.
//            try {
//                Thread.sleep(4000);
//            } catch (InterruptedException e) {
//                // We've been interrupted: no more messages.
//                return;
//            }
            Thread.sleep(4000);
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            // Print a message.
            System.out.println(importantInfo[i]);
        }
    }
}
