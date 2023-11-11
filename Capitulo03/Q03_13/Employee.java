package Capitulo03.Q03_13;

public class Employee {
    private String nome;
    private String sobrenome;
    private double salarioMensal;

    public Employee(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal > 0)
            this.salarioMensal = salarioMensal;
    }

    public double annualSalary(float percent) {
        double annualSalaryEmployee = 0;
        for (int i = 0; i < 12; i++)
            annualSalaryEmployee += (this.salarioMensal + ((this.salarioMensal * percent) / 100));
        return annualSalaryEmployee;
    }
}
