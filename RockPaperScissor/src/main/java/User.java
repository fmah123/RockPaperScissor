import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class User {

    Scanner scanner = new Scanner(System.in);
    private String name;
    private String name1;

    public String GameComp() {
        List<String> Object = new ArrayList<>();
        Object.add("Rock");
        //This is assigned value 0
        Object.add("Paper");
        //This is assigned value 1
        Object.add("Scissor");
        //This is assigned value 2
        Object.add("Lizard");
        Object.add("Spock");
        Random random = new Random();
        Integer randomObject = random.nextInt((Object.size()- 1));
        String randomObject2 = Object.get(randomObject);
        System.out.println("Comp1 anwser is: " + randomObject2);
        return randomObject2;
        //This is the random computer generator for an anwser and takes from Rock, Paper and Scissor
        }


    public String GameComp1() {
        List<String> Object = new ArrayList<>();
        Object.add("Rock");
        //This is assigned Object[0]
        Object.add("Paper");
        //This is assigned [1]
        Object.add("Scissor");
        //This is assigned value [2]
        Object.add("Lizard");
        //This is assigned value [3]
        Object.add("Spock");
        Random random = new Random();
        Integer randomObject = random.nextInt((Object.size()- 1));
        // object.size() - 1 >> accounts for index 0.
        String randomObject2 = Object.get(randomObject);
        System.out.println("Comp2 anwser is: " + randomObject2);
        return randomObject2;
        //This is the random computer generator for an anwser and takes from Rock, Paper and Scissor
    }

    public String SetUser(){
        this.name = scanner.next();
        return name;
    }

    public String SetUser2(){
        this.name1 = scanner.next();
        return name1;
    }

     public String getUser(String message){
        System.out.println(message);
        String UserAns = scanner.next();

        return UserAns;
     }

     public String getUser1(String message1){
        System.out.println(message1);
        String UserAns1 = scanner.next();

        return  UserAns1;
     }



     //The getUser() is for input of an anwser for user, SetUser() sets user name.
    //giveName() provides name for other methods in GameEngine class.
    }

