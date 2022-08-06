import java.util.HashMap;
import java.util.Scanner;

public class RomanNums
{
    public static void main(String[] args)
    {
        System.out.println("Enter the string: ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int sum=0;
       for (int i=0;i<s.length();i++)
       {
           Character ch=s.charAt(i);
           //System.out.print(ch);
           if(i<s.length()-1 && map.get(ch)<map.get(s.charAt(i+1)))
           {
               sum = sum - map.get(ch);
           }
           else
           {
               sum = sum + map.get(ch);
           }
       }
        System.out.print("The numeric value of roman number is: "+sum);
    }
}
