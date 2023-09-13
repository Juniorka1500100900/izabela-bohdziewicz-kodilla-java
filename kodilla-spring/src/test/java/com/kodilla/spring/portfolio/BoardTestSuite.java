package com.kodilla.spring.portfolio;

import com.kodilla.spring.reader.Reader;
import com.kodilla.spring.reader.ReaderConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        String taskToDo = "Run 10km.";
        String taskInProgress = "Finish Kodilla task.";
        String taskDone = "Wake up and try not to kill yourself.";
        board.getToDoList().addTask(taskToDo);
        board.getInProgressList().addTask(taskInProgress);
        board.getDoneList().addTask(taskDone);

        //Then
        assertEquals("Run 10km.", board.getToDoList().getTasks().get(0));
        assertEquals("Finish Kodilla task.", board.getInProgressList().getTasks().get(0));
        assertEquals("Wake up and try not to kill yourself.", board.getDoneList().getTasks().get(0));
    }
}
