package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class CompanyEmployeeFacade {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Company> findCompaniesByFragmentOfName(String nameFragment) {
        return entityManager.createNamedQuery("Company.retrieveCompanyNameLike", Company.class)
                .setParameter("NAME", "%" + nameFragment + "%")
                .getResultList();
    }

    public List<Employee> findEmployeesByFragmentOfLastName(String lastNameFragment) {
        return entityManager.createNamedQuery("Employee.retrieveEmployeeLike", Employee.class)
                .setParameter("LASTNAME", "%" + lastNameFragment + "%")
                .getResultList();
    }
}