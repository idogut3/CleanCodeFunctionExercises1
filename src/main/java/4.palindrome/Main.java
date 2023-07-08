import java.util.*;
class Pali
{
    public static void main(String args[])
    {
        String org, rvrs = ""; // Objects of String class
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        org = in.nextLine();
        int length = org.length();
        for ( int i = length - 1; i >= 0; i-- )
            rvrs = rvrs + org.charAt(i);
        if (org.equals(rvrs))
            System.out.println("Entered string/number is a palindrome.");
        else
            System.out.println("Entered string/number isn't a palindrome.");
    }
}  