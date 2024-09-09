import java.util.Scanner;

public class Main {
    public static String repeatNTimes(String phrase, int num)
    {
        if(num == 0)
        {
            return "";
        }
        return phrase + repeatNTimes(phrase, num-1);
    }

  /*  public static boolean isReverse(String phrase1, String phrase2)
    {
        if (phrase1.equals(isReverse(phrase1, phrase2.substring(0, phrase2.length()-1))))
        {
            return true;
        }
        else
        {
            return false;
        }
    }*/
  public static boolean isReverse(String phrase1, String phrase2) {
      if (phrase1.length() == 0 && phrase2.length() == 0) {
          return true;
      }
      else if (phrase1.length() == 0 || phrase2.length() == 0)
      {
          return false;
      }
      else
      {
          String placeholder1 = phrase1.substring(0, 1);
          String placeholder2 = phrase2.substring(phrase2.length() - 1);
          return (placeholder1.equals(placeholder2) && isReverse(phrase1.substring(1), phrase2.substring(0, phrase2.length() - 1)));
      }
  }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println(repeatNTimes("I must study recursion until it makes sense\n", 100));

        System.out.println("Enter the first string");
        String phrase1 = input.nextLine();
        System.out.println("Enter the second string");
        String phrase2 = input.nextLine();

        if(isReverse(phrase1, phrase2) == true)
        {
            System.out.println(phrase1 + " is the reverse of " + phrase2);
        }
        else
        {
            System.out.println(phrase1 + " is not the reverse of " + phrase2);
        }

        System.out.println();
        System.out.println("**Separate run, ignoring the first 100 lines...**");
        System.out.println("Enter the first string");
        String phrase3 = input.nextLine();
        System.out.println("Enter the second string");
        String phrase4 = input.nextLine();

        if(isReverse(phrase3, phrase4) == true)
        {
            System.out.println(phrase3 + " is the reverse of " + phrase4);
        }
        else
        {
            System.out.println(phrase3 + " is not the reverse of " + phrase4);
        }

        System.out.println();
        System.out.println("**Separate run, ignoring the first 100 lines...**");
        System.out.println("Enter the first string");
        String phrase5 = input.nextLine();
        System.out.println("Enter the second string");
        String phrase6 = input.nextLine();

        if(isReverse(phrase5, phrase6) == true)
        {
            System.out.println(phrase5 + " is the reverse of " + phrase6);
        }
        else
        {
            System.out.println(phrase5 + " is not the reverse of " + phrase6);
        }

        System.out.println();
        System.out.println("**Separate run, ignoring the first 100 lines. Note here we are hitting return for each string, which sends empty string**");
        System.out.println("Enter the first string");
        String phrase7 = input.nextLine();
        System.out.println("Enter the second string");
        String phrase8 = input.nextLine();

        if(isReverse(phrase7, phrase8) == true)
        {
            System.out.println(phrase7 + " is the reverse of " + phrase8);
        }
        else
        {
            System.out.println(phrase7 + " is not the reverse of " + phrase8);
        }
    }
}