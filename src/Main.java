public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 80;
        double height = 1.76;
        float mass_index = service.calculate(weight, height );
        System.out.printf("%.1f", mass_index);
    }
}
