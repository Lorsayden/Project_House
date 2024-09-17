public class Constraint5 extends AConstraint
{
    @Override
    public boolean check(int[][] state) {
        int house = getHouse(3, 1, state);
        return state[1][house] == 1;
    }
}
