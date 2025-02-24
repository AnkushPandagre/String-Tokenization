// import java.util.Scanner;
import java.util.*;
// import java.util.StringTokenizer;

class token{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s1 = sc.next();
        System.out.println("Enter character(s) where tokenization must be performed : ");
        String s2 = sc.next();
        StringTokenizer str = new StringTokenizer(s1,s2);
        System.out.println("After tokenization tokens are");
        while (str.hasMoreTokens()) {
            System.out.println(str.nextToken());
        }
    }
}