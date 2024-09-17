public class Constraint12 extends AConstraint{

    @Override
    public boolean check(int[][] state) {
        int[] neighbours = getNeighbours(4, 2, state);
        for(int i : neighbours)
        {
            if(state[2][i] == 4)
                return true;
        }
        return false;
    }
}
