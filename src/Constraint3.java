public class Constraint3 extends AConstraint
{
    @Override
    public boolean check(int[][] state) {
        int house = getHouse(0, 0, state);
        return state[1][house] == 2;
    }
}
