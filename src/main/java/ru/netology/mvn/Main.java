public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();
         int expected = 150;

        int bonus = (int) service.calculate(5_000,true);
        System.out.println(bonus);
    }
}