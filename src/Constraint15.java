public class Constraint15 extends AConstraint{

    @Override
    public boolean check(int[][] state) {
        int[] houses = getNOTHouses(5, 1, state);
        for(int h : houses)
        {
            if(testBothSides(h,1,5,5,0,state)) return true;
        }
        return false;
    }
}
