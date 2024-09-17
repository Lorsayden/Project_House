import java.util.ArrayList;

public class AllConstraints implements Constraint{

    private ArrayList<Constraint> allConstraints;

    AllConstraints(){
        allConstraints = new ArrayList<>();

    }

    void addConstraint(Constraint cons){
        allConstraints.add(cons);
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
