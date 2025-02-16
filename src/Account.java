public class Account {
    public int value;
    public String currency;

    public Account(int value, String currency) {
        this.value = value;
        this.currency = currency;
        System.out.println("Конструктор класса Account");
    }

    public void plus(int amount, String client) {
        checkAuthority(client);
        this.value += amount;
    }

    public void minus(int amount, String client) {
        checkAuthority(client);
        this.value -= amount;
    }

    void checkAuthority(String client) {
        System.out.println("Вызван checkAuthority в классе Account");
        // some logic
    }
}
