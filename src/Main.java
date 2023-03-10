public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService(); //создание экземпляра класса
        double height = 1.9;
        double weight = 82;
        double mass = service.calculate(height, weight);
        String recommended;

        if (mass >= 0 && mass <= 15.99) {
            recommended = "Выраженный дефицит массы тела.";
        }
        else if (mass >= 16 && mass <= 18.49) {
            recommended = "Недостаточная (дефицит) масса тела.";
        }
        else if (mass >= 18.50 && mass <= 24.99) {
            recommended = "Норма.";
        }
        else if (mass >= 25 && mass <= 29.99) {
            recommended = "Избыточная масса тела (предожирение).";
        }
        else if (mass >= 30 && mass <= 34.99) {
            recommended = "Ожирение первой степени.";
        }
        else if (mass >= 35 && mass <= 39.99) {
            recommended = "Ожирение второй степени.";
        }
        else if (mass >= 40) {
            recommended = "Ожирение третьей степени (морбидное).";
        }
        else {
            recommended = "Затрудняемся предоставить вам рекомендации.";
        }

        String formattedDouble = String.format("%.1f", mass);;
        System.out.println("Ваш индекс массы тела составляет = " + formattedDouble + " Kg/M2. " + recommended);
    }
}