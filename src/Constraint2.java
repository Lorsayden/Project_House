public class Constraint2 extends AConstraint
{
    @Override
    public boolean check(int[][] state) {
        int house = getHouse(0, 3, state);
        return state[4][house] == 0 && state[3][house] == 4 && state[5][house] == 4 && state[2][house] == 5;
    }
}
