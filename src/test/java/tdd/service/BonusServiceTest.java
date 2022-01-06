package tdd.service;

import org.junit.jupiter.api.Test;
import tdd.model.Employee;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    /**BONUS DEVE SER ZERO PARA ALTOS SALARIOS*/
    @Test
    public void bonusItShouldZeroToEmployeesDoHaveHighSalary(){

        BonusService  bonusService = new BonusService();
        Employee employee = new Employee("Bruno", LocalDate.now(),new BigDecimal("11000"));

        BigDecimal totalBonus = bonusService.calculateSalary(employee);

        assertEquals(BigDecimal.ZERO, totalBonus);
    }


    @Test
    public void bonusItShouldTenPercentSalary(){

        BonusService  bonusService = new BonusService();
        Employee employee = new Employee("Bruno", LocalDate.now(),new BigDecimal("2500"));

        BigDecimal totalBonus = bonusService.calculateSalary(employee);

        assertEquals(new BigDecimal("250").setScale(2), totalBonus);
    }


    @Test
    public void bonusItShouldTenPercentForExactly10000Salary(){

        BonusService  bonusService = new BonusService();
        Employee employee = new Employee("Bruno", LocalDate.now(),new BigDecimal("10000"));

        BigDecimal totalBonus = bonusService.calculateSalary(employee);

        assertEquals(new BigDecimal("1000").setScale(2), totalBonus);
    }

}