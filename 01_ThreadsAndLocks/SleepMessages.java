/**
 * SleepMessages
 * 
 * <code>Thread.sleep</code> causes the current thread to suspend execution for a
 * specific period. This is an efficient means of making processor time available to
 * other threads of an application or other applications that might be running on a
 * computer system. The <code>sleep</code> method can also be used for pacing, as
 * shown in the example that follows, and waiting for another thread with duties
 * that are understood to have time requirements.
 * 
 * Two <em>overloaded</em> versions of <code>sleep</code> are provided: one that
 * specifies the sleep time to the millisecond and one that specifies the sleep time
 * to the nanosecond. However, these sleep times are not guaranteed to be precise and
 * are limited to the operating system. Also, the sleep period can be termintated by
 * <em>interrupts</em>.
 * 
 * @author xin li
 */
public class SleepMessages {

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
        String importantInfo[] = {
            "Mares eat oats",
            "Does eat oats",
            "Little lambs eat ivy",
            "A kid will eat ivy too"
        };

        for (int i = 0;
            i < importantInfo.length;
            i++) {
                // Pause for 4 seconds.
                Thread.sleep(4000);
                // Print a message.
                System.out.println(importantInfo[i]);
            }
    }
}