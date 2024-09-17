public class Constraint20 extends AConstraint{

    @Override
    public boolean check(int[][] state) {
        int fA = getHouse(0,3,state);
        int fB = getHouse(3,1, state);
        return fA > fB;
    }
}
