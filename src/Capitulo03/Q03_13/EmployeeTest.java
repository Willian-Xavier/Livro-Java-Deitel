package Capitulo03.Q03_13;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Jose", "Oliveira", 2_400);
        Employee employee2 = new Employee("Maria", "Santos", 2_000);

//        double salarioAnualEmployee1 = 0;
//        double salarioAnualEmployee2 = 0;
//
//        for (int i = 0; i < 12; i++) {
//            salarioAnualEmployee1 += employee1.getSalarioMensal();
//            salarioAnualEmployee2 += employee2.getSalarioMensal();
//        }
        System.out.printf("Salário Anual employee1: R$%.2f%n", employee1.annualSalary(0));
        System.out.printf("Salário Anual employee2: R$%.2f%n%n", employee2.annualSalary(0));

        System.out.println("Salário com 10% de aumento\n");

        System.out.printf("Salário Anual employee1: R$%.2f%n", employee1.annualSalary(10));
        System.out.printf("Salário Anual employee2: R$%.2f%n", employee2.annualSalary(10));

//        salarioAnualEmployee1 = 0;
//        salarioAnualEmployee2 = 0;
//
//        for (int i = 0; i < 12; i++) {
//            salarioAnualEmployee1 += (employee1.getSalarioMensal() + (employee1.getSalarioMensal() * 0.10));
//            salarioAnualEmployee2 += (employee2.getSalarioMensal() + (employee2.getSalarioMensal() * 0.10));
//        }
//
//        System.out.println("Salário com 10% de aumento");
//        System.out.printf("Salário Anual employee1: R$%.2f%n", salarioAnualEmployee1);
//        System.out.printf("Salário Anual employee2: R$%.2f", salarioAnualEmployee2);
    }
}
