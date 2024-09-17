public class Constrain17 extends AConstraint{

    @Override
    public boolean check(int[][] state) {
        int[] columns = getNOTHouses(5, 0, state);
        for(int c : columns)
        {
            if(testBothSides(c,2,3,5,5,state)) return true;
        }
        return false;
    }
}
