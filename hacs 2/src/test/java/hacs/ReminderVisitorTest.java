package hacs;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Akhila Diddi
 */


public class ReminderVisitorTest {
    @Test
    public void testReminderVisitor() {
        Reminder reminder = new Reminder();
        ReminderVisitor reminderVisitor = new ReminderVisitor(reminder);
        //Checks if reminder object is being created
        Assert.assertNotNull(reminderVisitor);
    }
}
