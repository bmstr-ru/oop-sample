import java.util.Arrays;

public class CorporateAccount extends Account {
    public String[] owners;

    public CorporateAccount(int value, String currency, String[] owners) {
        super(value, currency);
        System.out.println("Конструктор класса CorporateAccount");
        this.owners = owners;
    }

    void checkAuthority(String client) {
        System.out.println("Вызван checkAuthority в классе CorporateAccount");

        boolean hasOwner = Arrays.asList(owners).contains(client);
        if (!hasOwner) {
            throw new Error("Unauthorized access! Client " + client + " is trying to access account");
        }
    }
}
