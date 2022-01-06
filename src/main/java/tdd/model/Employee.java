package tdd.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {

    private String nome;
    private LocalDate dataAdmissao;
    private BigDecimal salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public Employee(String nome, LocalDate dataAdmissao, BigDecimal salario) {
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public void readjustmentSalary(BigDecimal readjustment) {
        this.salario = this.salario.add(readjustment).setScale(2);
    }
}
