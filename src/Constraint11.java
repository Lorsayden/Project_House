public class Constraint11 extends AConstraint{

    @Override
    public boolean check(int[][] state) {
        int[] neighbours = getNeighbours(0, 5, state);
        for(int i : neighbours)
        {
            if(state[3][i] == 0)
                return true;
        }
        return false;
    }
}
