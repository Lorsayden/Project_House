public class Constraint8 extends AConstraint{

    @Override
    public boolean check(int[][] state) {
        int[] neighbours = getNeighbours(0, 0, state);
        for(int i : neighbours)
        {
            if(state[4][i] == 0)
                return true;
        }
        return false;
    }
}
