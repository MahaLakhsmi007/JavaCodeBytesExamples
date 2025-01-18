import java.util.*;
class Main {
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        String s = sc.nextLine(); //getting input from user
    
    //First converting to lower case - and then removing the spaces
    //between the words
    String inp = s.toLowerCase().replaceAll("\\s",""); 
    
    //created a map to store the character & its frequency 
    Map<Character,Integer> m = new HashMap<>();
    
    for(char c : inp.toCharArray())
    {
        m.put(c,m.getOrDefault(c,0)+1);
    }
    
    
    for(Map.Entry<Character,Integer> out : m.entrySet())
    {
        System.out.println(out.getKey() + " ------> "
        + out.getValue());
    }
 }
}
