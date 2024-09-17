public class Constraint17 extends AConstraint{

    @Override
    public boolean check(int[][] state) {
        int[] houses = getNOTHouses(5, 0, state);
        for(int h : houses)
        {
            if(testBothSides(h,2,3,5,5,state)) return true;
        }
        return false;
    }
}
