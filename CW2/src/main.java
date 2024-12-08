import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Parents> Parents = new ArrayList<>();

        Parents.add(new Father("mohaa", 30 ,"monk"));
        Parents.add(new Mother("deeqo",35,0526453));
        Parents.add(new Aunt("halima",20,26352));

      for (Parents parents : Parents){
          parents.DisplayInfo();
          parents.PerformAction();
          System.out.println("");
      }
    }
}
