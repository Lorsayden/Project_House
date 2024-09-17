public class Constraint16 extends AConstraint{

    @Override
    public boolean check(int[][] state) {
        int house = getHouse(3, 2, state);
        return testBothSides(house, 4, 4, 3, 5, state);
    }
}
