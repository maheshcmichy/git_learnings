import java.util.LinkedList;
import java.util.List;

public class DisplayCollections {


    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Venkat");
        names.add("Naresh");
        names.add("Suresh");
        names.add("Srinu");

        DisplayCollections dc = new DisplayCollections();
        dc.printTeamNames(names);
    }


    private void printTeamNames(List<String> names){
        for (String name: names) {
            System.out.println(name);
        }

    }
}
