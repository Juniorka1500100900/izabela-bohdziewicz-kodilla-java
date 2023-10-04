package com.kodilla.hibernate.task.dao;


import com.kodilla.hibernate.TaskFinancialDetails;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static sun.tools.jconsole.Messages.DESCRIPTION;


@ExtendWith(SpringExtension.class)
@SpringBootTest
class TaskFinancialDetailsDaoTestSuite {

    @Autowired
    private TaskFinancialDetailsDao taskFinancialDetailsDao;
    @Autowired
    private TaskDao taskDao;

    @Test
    void testFindByPaid() {
        //Given
        TaskFinancialDetails taskFinancialDetails =
                new TaskFinancialDetails(new BigDecimal(115), false);
        taskFinancialDetailsDao.save(taskFinancialDetails);
        int id = taskFinancialDetails.getId();

        //When
        List<TaskFinancialDetails> resultList = taskFinancialDetailsDao.findByPaid(false);

        //Then
        assertEquals(1, resultList.size());

        //CleanUp
        taskFinancialDetailsDao.deleteById(id);
    }
    @Test
    void testTaskDaoSaveWithFinancialDetails() {
        //Given
        Task task = new Task(DESCRIPTION, 30);
        task.setTaskFinancialDetails(new TaskFinancialDetails(new BigDecimal(120), false));

        //When
        taskDao.save(task);
        int id = task.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        //taskDao.deleteById(id);
    }
}
