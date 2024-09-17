public class Constraint19 extends AConstraint{

    @Override
    public boolean check(int[][] state) {
        int fA = getHouse(5,1,state);
        int fB = getHouse(3,0, state);
        return fA > fB;
    }
}
