import java.util.ArrayList;

public class AllConstraints implements Constraint{

    private ArrayList<Constraint> allConstraints;

    AllConstraints(){
        allConstraints = new ArrayList<>();
        allConstraints.add(new Constraint1());
        allConstraints.add(new Constraint2());
        allConstraints.add(new Constraint3());
        allConstraints.add(new Constraint4());
        allConstraints.add(new Constraint5());
        allConstraints.add(new Constraint6());
        allConstraints.add(new Constraint7());
        allConstraints.add(new Constraint8());
        allConstraints.add(new Constraint9());
        allConstraints.add(new Constraint10());
        allConstraints.add(new Constraint11());
        allConstraints.add(new Constraint12());
        allConstraints.add(new Constraint13());
        allConstraints.add(new Constraint14());
        allConstraints.add(new Constraint15());
        allConstraints.add(new Constraint16());
        allConstraints.add(new Constraint17());
        allConstraints.add(new Constraint18());
        allConstraints.add(new Constraint19());
        allConstraints.add(new Constraint20());
    }

    @Override
    public boolean check(int[][] state) {

        for(Constraint c : allConstraints){
            if(!c.check(state)){
                return false;
            }
        }
        return true;
    }
}
