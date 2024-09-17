public class Constraint9 extends AConstraint{

    @Override
    public boolean check(int[][] state) {
        int[] neighbours = getNeighbours(0, 2, state);
        for(int i : neighbours)
        {
            if(state[5][i] == 0)
                return true;
        }
        return false;
    }
}
