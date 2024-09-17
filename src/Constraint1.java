public class Constraint1 extends AConstraint
{
    @Override
    public boolean check(int[][] state) {
        int house = getHouse(0, 5, state);
        return state[4][house] == 3;
    }
}
