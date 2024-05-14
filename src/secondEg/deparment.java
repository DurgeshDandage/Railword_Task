package secondEg;

public class deparment extends Coll {
    String dename;

    public deparment(String name, int rank, String dename) {
        super(name, rank);
        this.dename = dename;
    }

    void dispaydename(){

        System.out.println("DeparmentName:"+dename);
    }
}
