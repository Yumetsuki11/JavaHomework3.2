public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 78;  // вес в килограммах
        int height = 181; // рост в сантиметрах

        System.out.println("ИМТ = " + service.calculate(weight, height));
    }
}