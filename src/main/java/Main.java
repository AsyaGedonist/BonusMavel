public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 1_000_000;
        boolean registered = false;
        long expected = 30;

        long actual = service.calculate(amount, registered);
        System.out.println("Ожидаемый результат: " + expected + "; Фактический результат: " + actual);

    }
}
