public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 100;
        double height = 1.8;
        double bodyMassIndex = service.calculate(weight, height);

        System.out.println("Ваш индес массы тела: " + bodyMassIndex);
    }
}