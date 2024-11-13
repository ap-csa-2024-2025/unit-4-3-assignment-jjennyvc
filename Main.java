import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    String sentence = "Peter Piper Picked a Pack of Pickle Peppers";
    int count = 0;
    for (int i = 0; i < sentence.length()-1; i++)
    {
      String pair = sentence.substring(i, i+2);
      if (pair.equals("pa") || pair.equals("pe") || pair.equals("po") || pair.equals("pi"))
      {
        count++;
      }
      System.out.println("p followed by a vowel appears " + count + "times");
    }
    String sentence = "gagagigo the giga risen";
    String target = "ga";
    int count = 0;

    for (int i = 0; i < sentence.length()-1; i++)
    {
      String length = sentence.substring(i, i+2);
      if (length.equals(target))
      {
        count++; 
      }
      return count;
    }
    Scanner scanner = new scanner(System.in);
    System.out.print("Enter an integer from 0 and 50: ");
    int number = scanner.nextInt();

    if (number <= 0 || number >= 50) 
    {
      System.out.println("error");
    } 
    else 
    {
      for (int i = number; i <= 50; i++)
      {
        System.out.print(i + " ");

        if ((i - number + 1) % 5 == 0)
        {
          System.out.println();
        }
      }
    }
    scanner.close();
  }
}
