import java.util.*;
//Note:Key in hash maps are always unique but value may or may no be same
public class HashMapIntro {
    public static void main(String[] args) {
        //syntax---------------------------------------------------------------------------------------------------
        Map<String , Integer> mpp = new HashMap<>();


        //adding elements (key,value)-------------------------------------------------------------------------------
        mpp.put("Yugam", 20);
        mpp.put("Raghav", 21);
        mpp.put("Tanmay", 24);
        mpp.put("Akshit", 18);


        //getting value--------------------------------------------------------------------------------------------
        System.out.println(mpp.get("Yugam")); //output = 20
        System.out.println(mpp.get("Rakshit")); //output = null because key isn't present


        //changing/updating value of a key-------------------------------------------------------------------------
        mpp.put("Yugam",34);
        System.out.println(mpp.get("Yugam"));//output = 34

        //removing a key-------------------------------------------------------------------------------------------
        System.out.println(mpp.remove("Yugam"));//print its value
        System.out.println(mpp.remove("Rakshit"));//print null because key isn't present 

        //checking if a key is present-----------------------------------------------------------------------------
        System.out.println(mpp.containsKey("Yugam"));//gives false because we just removed it before
        System.out.println(mpp.containsKey("Akshit"));//gives true

        //adding a new entry only if key isn,t currently present---------------------------------------------------
        mpp.putIfAbsent("Yugam", 90);//will put this key 
        mpp.putIfAbsent("Akshit", 18);//will not put this key because already present

        //Get all keys in hash maps--------------------------------------------------------------------------------
        System.out.println(mpp.keySet());//output = [Raghav, Tanmay, Yugam, Akshit]

        //get all values in hash mapps-----------------------------------------------------------------------------
        System.out.println(mpp.values());//output = [21, 24, 90, 18]

        //get key and value both-----------------------------------------------------------------------------------
        System.out.println(mpp.entrySet());//output = [Raghav=21, Tanmay=24, Yugam=90, Akshit=18]

        //traversing through multipe elements in mapp--------------------------------------------------------------
        //1st method:-
        for (String element : mpp.keySet()) {
            System.out.printf("Age of %s is %d\n",element,mpp.get(element));
        }
        System.out.println();
        //2nd method
        for (Map.Entry<String,Integer> element : mpp.entrySet()) {
            System.out.printf("Age of %s is %d\n",element.getKey(),element.getValue());
        }
        System.out.println();
        //3rd Methos
        for (var e : mpp.entrySet()) {
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }
    }
}
