public class BonusMilesService {

    public int calculate(int cost) {
        cost = 20;
        int price = 10_000;
        if (price > cost) {
            cost = price / cost;

        }


        return cost;

    }


}
