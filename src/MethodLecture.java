import java.util.Scanner;

public class MethodLecture {


    public static void main(String[] args) {

        //    TODO: create a new method that accepts the name of a basketball
        //     team (ex: the spurs) and returns a String that says
        //     "[basketballTeam] is the best team.". Invoke that method within
        //     your main method (remember to pass in the name of the basketball
        //     team). print out the result of the new method.

        System.out.println(bTeam("Spurs"));


        //    TODO: create a new method that accepts the string created from the
        //     first method and returns the number of characters in that string.

        System.out.println(charNum(bTeam("Spurs")));

        //    TODO: invoke a method that accepts (and returns) the following:
        //        - accepts: your first name and your last name. returns: A
        //        string that reads: "Hello Laura Ruiz-Roehrs (replace with your
        //        first and last)";

        System.out.println(greeting("Josh", "Borreli"));

        //    WARMUP
        //    TODO: prompt a user to tell us about themselves (age, name, if
        //     they have any pets (true/false). Using method overloading, create
        //     methods that will return the first fact they told us about
        //     themselves. ex: I can input: 18 -- Laura -- false in which case I
        //     expect you to return: 18. but if I tell you my name first: Laura --
        //     false -- 18. I expect you to return "Laura" ... etc.


//        System.out.println("Tell us about yourself: ");
//        System.out.println(info(sc.next()));

        // --- Review on value vs reference ---

//        it's okay if value vs reference isn't clear yet. What will make it more clear is as move forward into making our own objects and collections. The basics of what you need to know is that all objects, when passed as parameters to a method, are shallow copies (copy of the original object's address) of their original.
//        ie (PUT THIS IN YOUR CODE AND PLAY AROUND WITH IT):


//        public static void main(String[] args) {
//            changingThings();
//        }
//        public static void changingThings(){
//            Object myObj = new Object(); // new object is created, and a pointer is created to let our system know where to find it in our memory.
//            // You can see that pointer by using .hashCode() or System.identityHashCode().
//            // Alternatively, you can simply print out the object itself.
//            System.out.println("\nOriginal object BEFORE myMethod runs: \n" + myObj);
//            Object myObj2 = myMethod(myObj);
//            System.out.println("\nOriginal object AFTER myMethod runs: \n" + myObj);
//            System.out.println("\nNEW object AFTER myMethod runs: \n" + myObj2);
//            // This will print out "Casey" because the OBJECT we pass in to myMethod only creates
//            // a 'shallow copy' of the original objects pointer (its place in your memory heap)
//        }
//        public static Object myMethod(Object obj){
//            System.out.println("\nParameter object id: \n" + obj);
//            obj = new Object(); // create a NEW Object. This Object type is immutable. Meaning, once it is created, the object itself cannot be altered.
//            // The properties and fields on the Object type can be changed, just not the whole object.
//            // Therefore when we assign new Object() to obj, we are actually creating a whole new object in memory, NOT changing the original.
//            System.out.println("\nNew object created and assigned to parameter: \n" + obj);
//            return obj;
//            // This will create a NEW object in memory and assign it to the parameter obj.
//            // However, it will not change the object sitting at the original memory address
//        }


//        Note that when we talk about this 'pass by value' what we are really saying is that by passing in an argument to myMethod, we are creating a copy of the pointer to its place in our memory heap. When myMethod assigns a new Object to the parameter obj, it is NOT changing myObj but rather creating a new place in memory for a NEW object.
//                If you change the value of an immutable object (let's say, a String, Integer, or Object) you are actually creating a NEW object in memory, therefore you will see the hashcode (or object id) change because the value of those objects is final (can't be changed). However, the original objects pointer still exists and its original value is still in memory.
//                There is much more to this, but we will talk more about that when we begin making our own classes and using them as objects.



        //    TODO: you are a sports manager. Prompt your client who is training
        //     for a marathon how many miles they have to run today. You're the
        //     coach, so you decide how many miles they ran that day. create a method that takes in how many miles that have left in training and simulate that they check in with you after every 2 miles. print out
        //     how many miles they have left in training until they have 0 miles
        //     left.

        Scanner sc = new Scanner(System.in);
        System.out.println("How many miles do we run today, coach? ");
        int miles = sc.nextInt();
        marathonTraining(miles);



    }

    public static String bTeam(String team) {
        return String.format("%s is the best team.", team);
    }

    public static int charNum(String input) {
        return input.length();
    }

    public static String greeting(String fName, String lName) {
        return String.format("Hello, %s %s.", fName, lName);
    }

    // ------------------
    public static String info(String name) {
        return String.format("Your name is %s", name);
    }
    public static int info(int age) {
        return age;
    }
    public static boolean info(boolean anyPets) {
        return anyPets;
    }
    // ------------------

    public static void marathonTraining(int miles) {
        if (miles > 0) {
            if (miles % 2 == 0) {
                System.out.printf("There are %s more miles to run...", miles);
                System.out.println();
            }
            miles--;
            marathonTraining(miles);
        } else if (miles == 0) {
            System.out.print("You've finished running for the day.");
        }
    }

}


























