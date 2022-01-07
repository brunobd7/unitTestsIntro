package tdd.service;

import tdd.model.Employee;
import tdd.model.JobPerformance;

import java.math.BigDecimal;

public class ReadjustmentService {

    public void applyReadjustment(Employee employee, JobPerformance jobPerformance) {

        if(jobPerformance == JobPerformance.TO_BE_DESIRED){

            BigDecimal readjustment = employee.getSalario().multiply(new BigDecimal("0.03"));

            employee.readjustmentSalary(readjustment);

        }else if (jobPerformance == JobPerformance.GREAT){

            BigDecimal greatReadjustment = employee.getSalario().multiply(new BigDecimal("0.15"));

            employee.readjustmentSalary(greatReadjustment);

        }else{

            BigDecimal aboveExpectReadjustment = employee.getSalario().multiply(new BigDecimal("0.20"));

            employee.readjustmentSalary(aboveExpectReadjustment);

        }

    }
}
