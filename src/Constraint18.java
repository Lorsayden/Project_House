public class Constraint18 extends AConstraint{

    @Override
    public boolean check(int[][] state) {
        int fA = getHouse(1,0,state);
        int fB = getHouse(5,1, state);
        return fA < fB;
    }
}
