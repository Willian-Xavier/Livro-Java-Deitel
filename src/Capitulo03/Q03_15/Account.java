package Capitulo03.Q03_15;


public class Account {
    private String name;
    private double balance;

    // Método Construtor
    public Account(String name, double balance) {
        this.name = name;
        if (balance > 0.0)
            this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
        // this.name - se refere à variável de instância declarada fora deste método
        // name - se refere ao argumento fornecido pelo usuário e recebido como parâmetro pelo método
    }

    public String getName() {
        return name;
        // return name informa o valor de nome que se econtra na variável de instância do início do método
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0)
            balance += depositAmount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdrawal(double withdrawalAmount) {
        if (withdrawalAmount <= this.balance && withdrawalAmount > 0)
            this.balance -= withdrawalAmount;
        else if (withdrawalAmount >= this.balance)
            System.out.println("Withdrawal amount exceeded account balance!");
        else
            System.out.println("It's not possible withdrawal 0 value or a negative amount!");
    }

    public static void displayAccount(Account accountToDisplay) {
        System.out.printf("%s%nbalance: $%.2f %n%n", accountToDisplay.name, accountToDisplay.balance);
    }
}
