public class Main {

    public static void main(String[] args) {

        Tax iss = new ISS();
        Tax icms = new ICMS();

        Budget budget = new Budget(500.0);

        CalculateBudget c = new CalculateBudget();

        System.out.println(c.calcualte(budget, iss));
        System.out.println(c.calcualte(budget, icms));


    }
}
