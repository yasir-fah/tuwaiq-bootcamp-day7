import java.util.Scanner;

public class day7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ////question 1:-
        System.out.println("Enter 3 Numbers To find the smallest: ");
        System.out.println("first number:");
        int num1 = input.nextInt();

        System.out.println("second number:");
        int num2 = input.nextInt();

        System.out.println("third number:");
        int num3 = input.nextInt();

        //save first function result:-
        int resultFun1 = smallest(num1,num2,num3);
        System.out.println("Smallest number is: " + resultFun1);



        ////question 2-:
        System.out.println("Please Enter a Number: ");
        int number = input.nextInt();

        String numberSign = checkNumber(number);
        System.out.println(numberSign);

        input.nextLine(); //fix the input for the next String Line.



        ///question 3:-
        System.out.println("Input a password (You are agreeing to the above Terms and\n" + "Conditions.):  ");
        String password = input.nextLine();

        String check = passCheck(password);
        System.out.println(check);
    }



    /*1 - Write a Java method to find the smallest number among three
            numbers.*/
    public static int smallest(int a, int b, int c) {

        if(a==b && a==c)      {
            return a;
        }else if(a==b && a>c) {
            return c;
        }else if(a==c && a>b) {
            return b;
        }
        else if(b==c && a>c)  {
            return c;
        }
        else if(a<b && a<c)   {
            return a;
        }else if(b<a && b<c)  {
            return b;
        }else if(c<a && c<b )  {
            return c;
        }
        return 0;
    }








    /*2 - Write a Java method that check if the entered number is negative or
        positive or zero.
     */
    public static String checkNumber(int number){
        if(number<0)        {return "negative number";}
        else if(number >0)  {return "positive number";}
        else                {return "number is zero";}
    }







        /*3 - Write a Java method to check whether a string is a valid password.
            Password rules:
            A password must have at least eight characters. A
            password consists of only letters and digits. A
            password must contain at least two digits.
            */

    public static String passCheck(String password) {
        if (password.length() < 8) {
            return "Password is not valid: "+ password;
        }

        int digitCount = 0;

        for (int i = 0; i < password.length(); i++) {
            char character = password.toLowerCase().charAt(i);

            boolean isLetter = (character >= 'a' && character <= 'z'); //assume it's lowerCase only

            boolean isDigit = (character >= '0' && character <= '9');

            if (!isLetter && !isDigit) {
                return "Password is not valid: "+ password;
            }

            if (isDigit) {
                digitCount++;
            }
        }

        if (digitCount < 2) {
            return "Password is not valid: "+ password;
        }

            return "Password is valid";

    }

}
