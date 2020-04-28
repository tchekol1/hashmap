import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hashmaps {
    public static void main(String[] args) {
        int num;
        String number;
        Scanner scanner= new Scanner(System.in);
        //num= scanner.nextInt();

       String enter="yes";
        Map<Integer, String> myMap = new HashMap<>();

        while(enter.equalsIgnoreCase("yes")){
            System.out.println("Enter a number ");
            num=scanner.nextInt();
            scanner.nextLine();
       if(!(myMap.containsKey(num))){
           System.out.println(num+ " is not in the map ");
           System.out.println("Write "+ num+ " in a plain English ");
           number=scanner.nextLine();
           myMap.put(num,number);

       }
            System.out.println("Do you want to continue ?");
       enter= scanner.nextLine();
       //scanner.nextLine();
        }
        System.out.println("Here is your output of key value entry");
        for (Integer  input:myMap.keySet()) {
            System.out.println(input+ " "+ myMap.get(input));
        }
    }
}


