public class Constraint4 extends AConstraint
{
    @Override
    public boolean check(int[][] state) {
        int house = getHouse(3, 3, state);
        return state[2][house] == 0;
    }
}
