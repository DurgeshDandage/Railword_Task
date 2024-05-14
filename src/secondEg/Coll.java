package secondEg;

public class Coll extends Uni  {
    int rank;



    public Coll(String name, int rank) {
        super(name);
        this.rank = rank;
    }

    void displayrank(){

        System.out.println("Rank:"+rank);

    }
}
