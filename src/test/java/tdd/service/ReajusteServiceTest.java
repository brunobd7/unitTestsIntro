package tdd.service;

import org.junit.jupiter.api.Test;
import tdd.model.Employee;
import tdd.model.JobPerformance;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusteServiceTest {

    //TODO IMPLEMENTAR TESTE DIRECIONADOS PELOS 2 CENARIOS FALTANTES E SEGUIR REFACTOR CONFORME AULA

    /** CENARIOS DE DESEMPENHO : A_DESEJAR reajuste 3% , OTIMO reajuste 15%, ACIMA_DO_ESPERADO reajuste 20% */

    @Test
    public void readjustmentToBeDesiredIncrease3PercentOnBaseSalary(){

        ReadjustmentService service = new ReadjustmentService();
        Employee employee = new Employee("Bruno", LocalDate.now(),new BigDecimal("1000").setScale(2));

        service.applyReadjustment(employee, JobPerformance.TO_BE_DESIRED);

        assertEquals( new BigDecimal("1030.00"), employee.getSalario());

    }

    @Test
    public void readjustmentToBeGreatIncrease15PercentOnBaseSalary(){

        ReadjustmentService service = new ReadjustmentService();
        Employee employee = new Employee("Bruno", LocalDate.now(),new BigDecimal("1000").setScale(2));

        service.applyReadjustment(employee, JobPerformance.GREAT);

        assertEquals( new BigDecimal("1150.00"), employee.getSalario());

    }


    @Test
    public void readjustmentToBeAboveExpectationsIncrease20PercentOnBaseSalary(){

        ReadjustmentService service = new ReadjustmentService();
        Employee employee = new Employee("Bruno", LocalDate.now(),new BigDecimal("1000").setScale(2));

        service.applyReadjustment(employee, JobPerformance.ABOVE_EXPECTATIONS);

        assertEquals( new BigDecimal("1200.00"), employee.getSalario());

    }

}
