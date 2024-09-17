public class Constraint14 extends AConstraint{

    @Override
    public boolean check(int[][] state) {
        int[] houses = getNOTHouses(5, 0, state);
        for(int h : houses)
        {
            if(testBothSides(h,3,1,3,0,state)) return true;
        }
        return false;
    }
}
