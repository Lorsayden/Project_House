public class Constraint7 extends AConstraint{

    @Override
    public boolean check(int[][] state) {
        int[] neighbours = getNeighbours(3, 1, state);
        for(int i : neighbours)
        {
            if(state[3][i] == 3)
                return true;
        }
        return false;
    }
}
