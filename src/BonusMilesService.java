public class BonusMilesService {
    public int calculate(int cost) {
        int milePrice = 20;
        int numberMiles = cost / milePrice;
        return numberMiles;
    }
}
