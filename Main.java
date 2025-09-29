import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("give two words");
    String word1 = scan.nextLine();
    String word2 = scan.nextLine();
    System.out.println("Give me a number");
    int N = scan.nextInt();
    scan.nextLine();
    lastFirstN(word1, word2, N);

  //  lastFirstN("cream", "butter", 3);
  //  stringManip("hello", "hello");

    System.out.println("give me two words again");
    String word1P2 = scan.nextLine();
    String word2P2 = scan.nextLine();
    stringManip(word1P2, word2P2);
  }

  /** Precondition: s1 and s2 are not null
  * Precondition: 0 <= n <= min(s1.length(), s2.length()
  */
  public static void lastFirstN(String s1, String s2, int n)
  {
    String lastNofS1 = s1.substring(s1.length() - n);
    String firstNofS2 = s2.substring(0, n);
    System.out.println(lastNofS1 + firstNofS2);
  }

  /** Precondition: s1 and s2 are not null
  */
  public static void stringManip(String s1, String s2)
  {
    
    String s1Upper = s1.toUpperCase();
    String s2Temp = s2.substring(1);
    String s2First = s2.substring(0,1);
    String s2Final = s2First.toUpperCase() + s2Temp;
    System.out.println(s1Upper);
    System.out.println(s2Final);
  }

  /** Precondition: s1 and s2 are not null
  * Precondition: s2 is a substring of s1 and can be found at least one time in s1
  */
  public static String removeStr(String s1, String s2)
  {
    String output = null;
    return output;
  }
}
