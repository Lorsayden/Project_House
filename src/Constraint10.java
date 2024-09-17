public class Constraint10 extends AConstraint{

    @Override
    public boolean check(int[][] state) {
        int[] neighbours = getNeighbours(1, 5, state);
        for(int i : neighbours)
        {
            if(state[5][i] == 3)
                return true;
        }
        return false;
    }
}
