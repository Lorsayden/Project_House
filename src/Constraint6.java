public class Constraint6 extends AConstraint{

    @Override
    public boolean check(int[][] state) {
        int[] neighbours = getNeighbours(0, 1, state);
        for(int i : neighbours)
        {
            if(state[2][i] == 0)
                return true;
        }
        return false;
    }
}
