package tdd.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tdd.model.Employee;
import tdd.model.JobPerformance;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {

    private ReadjustmentService service;
    private Employee employee;

    /** CALL THIS METHOD BEFORE EXECUTE ANY TEST WRITTE ABOVE
     *
     * others:
     * @AfterEach;
     * @BeforeEach;
     * @AfterAll;
     * @BeforeAll;
     * */
    @BeforeEach
    public void initFields(){
        this.service = new ReadjustmentService();
        this.employee = new Employee("Bruno", LocalDate.now(),new BigDecimal("1000").setScale(2));
    }

    /** CENARIOS DE DESEMPENHO : A_DESEJAR reajuste 3% , OTIMO reajuste 15%, ACIMA_DO_ESPERADO reajuste 20% */
    @Test
    public void readjustmentToBeDesiredIncrease3PercentOnBaseSalary(){
        service.applyReadjustment(employee, JobPerformance.TO_BE_DESIRED);
        assertEquals( new BigDecimal("1030.00"), employee.getSalario());
    }

    @Test
    public void readjustmentToBeGreatIncrease15PercentOnBaseSalary(){
        service.applyReadjustment(employee, JobPerformance.GREAT);
        assertEquals( new BigDecimal("1150.00"), employee.getSalario());
    }


    @Test
    public void readjustmentToBeAboveExpectationsIncrease20PercentOnBaseSalary(){
        service.applyReadjustment(employee, JobPerformance.ABOVE_EXPECTATIONS);
        assertEquals( new BigDecimal("1200.00"), employee.getSalario());

    }

}
