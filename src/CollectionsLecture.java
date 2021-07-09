import java.util.ArrayList;

public class CollectionsLecture {
    public static void main(String[] args) {

        ArrayList<String> stringArr = new ArrayList<>();
        stringArr.add("josh");
        System.out.println(stringArr.get(0));
        System.out.println(stringArr.size());
        System.out.println(stringArr.hashCode());

        stringArr.add("Raul");
        System.out.println(stringArr);
        System.out.println(stringArr.hashCode());


//        stringArr.remove("Raul");
//        System.out.println(stringArr.hashCode());

        ArrayList<String> stringArr1 = stringArr;
        System.out.println();
        System.out.println(stringArr1.hashCode());




    }
}
