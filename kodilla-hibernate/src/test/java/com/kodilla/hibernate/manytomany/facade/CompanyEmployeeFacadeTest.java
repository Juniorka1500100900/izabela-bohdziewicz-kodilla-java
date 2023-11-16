package com.kodilla.hibernate.manytomany.facade;
import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import javax.transaction.Transactional;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class CompanyEmployeeFacadeTest {

    @Autowired
    private CompanyEmployeeFacade facade;

    @PersistenceContext
    private EntityManager entityManager;

    @Test
    @Transactional
    public void testFindCompaniesByFragmentOfName() {

        List<Company> companies = facade.findCompaniesByFragmentOfName("ABC");
        assertEquals(0, companies.size());

        Company abcCompany = new Company("ABC Company");
        entityManager.persist(abcCompany);

        companies = facade.findCompaniesByFragmentOfName("ABC");
        assertEquals(1, companies.size());
        assertEquals("ABC Company", companies.get(0).getName());
    }

    @Test
    @Transactional
    public void testFindEmployeesByFragmentOfLastName() {

        List<Employee> employees = facade.findEmployeesByFragmentOfLastName("Doe");
        assertEquals(0, employees.size());

        Employee johnDoe = new Employee("John", "Doe");
        entityManager.persist(johnDoe);

        employees = facade.findEmployeesByFragmentOfLastName("Doe");
        assertEquals(1, employees.size());
        assertTrue(employees.stream().anyMatch(e -> e.getLastname().equals("Doe")));
    }
}
