public class Main {

    public static void main(String[] args) {
        new Main().doWork();
    }

    void doWork() {
        Account acc1 = new PersonalAccount(100_000, "RUB", "Vasya");
        Account acc2 = new PersonalAccount(10_000, "EUR", "Petya");
        Account acc3 = new CorporateAccount(-500, "USD", new String[]{"Stepan", "Vasya"});

        Account[] accounts = new Account[]{acc1, acc2, acc3};

        acc1.plus(50_000, "Vasya");
        acc2.minus(5_000, "Petya");
        acc3.plus(700, "Vasya");

        for (Account acc : accounts) {
            System.out.println(acc.value + " " + acc.currency);
        }
    }

}