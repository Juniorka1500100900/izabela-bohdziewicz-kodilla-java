import com.kodilla.patterns2.observer.homework.Homework;
import com.kodilla.patterns2.observer.homework.KodillaMentor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeWorkTestSuite {
    @Test
    public void testHomeworkSystem() {

        Homework johnQueue = new Homework();
        Homework aliceQueue = new Homework();
        KodillaMentor mentor1 = new KodillaMentor("Mentor1");
        KodillaMentor mentor2 = new KodillaMentor("Mentor2");

        johnQueue.addObserver(mentor1);
        aliceQueue.addObserver(mentor2);

        johnQueue.addTask("Task 1 for John");
        johnQueue.addTask("Task 2 for John");
        aliceQueue.addTask("Task 1 for Alice");

        assertEquals(mentor1.getReceivedTasks().size(), 2);
        assertEquals(mentor2.getReceivedTasks().size(), 1);


        System.out.println("Tasks received by Mentor1: " + mentor1.getReceivedTasks());
        System.out.println("Tasks received by Mentor2: " + mentor2.getReceivedTasks());
    }
}

