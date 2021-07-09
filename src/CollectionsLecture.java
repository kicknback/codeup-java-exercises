import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsLecture {
    public static void main(String[] args) {

        ArrayList<String> stringArr = new ArrayList<>();
        stringArr.add("josh");
//        System.out.println(stringArr.get(0));
//        System.out.println(stringArr.size());
//        System.out.println(stringArr.hashCode());

        stringArr.add("Raul");
//        System.out.println(stringArr);
//        System.out.println(stringArr.hashCode());


//        stringArr.remove("Raul");
//        System.out.println(stringArr.hashCode());

        ArrayList<String> stringArr1 = stringArr;
//        System.out.println();
//        System.out.println(stringArr1.hashCode());


        HashMap<Integer, String> myHashMap = new HashMap<>();
        for (Integer i = 0; i < 11; i++) {
            myHashMap.put(i, String.format("This is a value of #%s", i));
        }

        String myValue = myHashMap.get(5);

        var myDiffVal = myHashMap.getOrDefault(75, "Empty");

        System.out.println(myValue);
        System.out.println(myDiffVal);

    }
}
