package Capitulo05.AutoPolicy;

public class AutoPolicyTest {
    public static void main(String[] args) {
        AutoPolicy autoPolicy1 = new AutoPolicy(11111111, "Toyota Camry", "NJ");
        AutoPolicy autoPolicy2 = new AutoPolicy(22222222, "Volvo XC60", "ME");

        policyInNoFaultState(autoPolicy1);
        policyInNoFaultState(autoPolicy2);
    }

    public static void policyInNoFaultState(AutoPolicy policy) { // Onde consta a variável de método policy, é possível
        // utilizar qualquer nome
        System.out.println("The auto policy:");
        System.out.printf("Account #: %d; Car: %s; State %s %s a no-fault state%n%n", policy.getAccountNumber(),
                policy.getMakeAndModel(), policy.getState(), (policy.isNoFaultState() ? "is" : "is not"));
        // (policy.isNoFaultState() ? "is" : "is not") econtra-se dentro de parênteses para testar a condição if...else
        // ternária
    }
}
