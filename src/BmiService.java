public class BmiService {
    public double calculate (double height, double weight) {
        double IMT = weight / (height * height); // формула рассчёта ИМТ
        return IMT; // возврат расчёта по формуле ИМТ
    }
}
