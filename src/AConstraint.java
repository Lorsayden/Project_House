public abstract class AConstraint implements Constraint{

    private final int[][] neighbours = {{1}, {0, 2}, {1, 3}, {2, 4}, {3, 5}, {4}};

    protected int getHouse(int category, int value, int[][] state)
    {
        for(int i = 0; i < 6; ++i)
        {
            if(state[category][i] == value)
            {
                return i;
            }
        }
        throw new RuntimeException("The value: " + value + " was NOT found!");
    }

    protected int[] getNOTHouses(int category, int value, int[][] state)
    {
        int[] res = new int[5];
        int column = getHouse(category, value, state);
        int index = 0;
        for(int i = 0; i < 6; ++i)
        {
            if(i != column)
            {
                res[index++] = i;
            }
        }
        return res;
    }

    protected int[] getNeighbours(int category, int value, int[][] state)
    {
        return neighbours[getHouse(category, value, state)];
    }

    protected boolean testBothSides(int house, int sideACat, int sideAValue, int sideBCat, int sideBValue, int[][] state)
    {
        int[] neighs = neighbours[house];
        if(neighs.length < 2) return false;
        return checkTwo(neighs[0], sideACat, sideAValue, neighs[1], sideBCat, sideBValue, state);
    }

    private boolean checkTwo(int houseA, int categoryA, int valueA, int houseB, int categoryB, int valueB, int[][] state)
    {
        return (state[categoryA][houseA] == valueA && state[categoryB][houseB] == valueB) ||
                (state[categoryA][houseB] == valueA && state[categoryB][houseA] == valueB);
    }
}
