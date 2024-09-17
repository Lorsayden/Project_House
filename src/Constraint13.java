public class Constraint13 extends AConstraint{
    @Override
    public boolean check(int[][] state) {
        int house = getHouse(2, 5, state);
        return testBothSides(house, 4, 5, 2, 1, state);
    }
}
