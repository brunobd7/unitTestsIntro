package tdd.service;

import tdd.model.Employee;

import java.math.BigDecimal;

public class BonusService {

    public BigDecimal calculateSalary(Employee employee){

        BigDecimal  bonusValue = employee.getSalario().multiply(new BigDecimal("0.1").setScale(2));

        if(bonusValue.compareTo(new BigDecimal("1000").setScale(2)) > 0 )
            throw new IllegalArgumentException("Employee with salary hightest to limit for received bonus values!");

        return bonusValue;

    }
}
