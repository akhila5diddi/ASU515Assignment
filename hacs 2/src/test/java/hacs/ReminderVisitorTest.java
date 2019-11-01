package hacs;

import org.junit.Assert;
import org.junit.Test;

public class ReminderVisitorTest {
    @Test
    public void testReminderVisitor(){
        Reminder reminder = new Reminder();
        ReminderVisitor reminderVisitor = new ReminderVisitor(reminder);
        Assert.assertNotNull(reminderVisitor);
    }
}
