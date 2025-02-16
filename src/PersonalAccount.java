import java.util.Objects;

public class PersonalAccount extends Account {
    public String owner;

    public PersonalAccount(int value, String currency, String owner) {
        super(value, currency);
        System.out.println("Конструктор класса PersonalAccount");
        this.owner = owner;
    }

    void checkAuthority(String client) {
        System.out.println("Вызван checkAuthority в классе PersonalAccount");

        if (!Objects.equals(owner, client)) {
            throw new Error("Unauthorized access! Client " + client + " is trying to access account");
        }
    }
}
