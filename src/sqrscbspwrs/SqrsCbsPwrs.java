/*
 *10/02/20
 *cameron nikolasevic
 * this program promts the user to choose a value from
 * 1-4 to select, input a number to be operated on,
 * and then outputs the results to the console
 */

package sqrscbspwrs;
import java.util.Scanner;

/**
 *
 * @author canik6331
 */
public class SqrsCbsPwrs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int inputNum;  //the input for the operation selection
        int exponent; //exponent value
        int inputVal; //number that the operations will operate on

        prompt();
        inputNum = keyboard.nextInt();
        
        while(inputNum != 4)
        {
            if(inputNum == 1)
            {
                System.out.println("Please enter the number you want to square");
                inputVal = keyboard.nextInt();
                System.out.println(inputVal * inputVal);
                prompt();
                inputNum = keyboard.nextInt();
            }
            else if(inputNum == 2)
            {
                System.out.println("Please enter the number you want to cube");
                inputVal = keyboard.nextInt();
                System.out.println(inputVal * inputVal * inputVal);
                prompt();
                inputNum = keyboard.nextInt();
            }
            else if(inputNum == 3)
            {
                System.out.println("Please enter the base of the power");
                inputVal = keyboard.nextInt();
                System.out.println("Please enter the exponent of the power");
                exponent = keyboard.nextInt();
                System.out.println(Math.pow(inputVal, exponent));
                prompt();
                inputNum = keyboard.nextInt();
            }
            else if(inputNum == 4)
            {
                System.exit(0);
            }
            else
            {
                System.out.println("Invalid response");
                prompt();
                inputNum = keyboard.nextInt();
            }
            
        }
    }
    public static void prompt()
    {
       System.out.println("Choose one of the following operations");
        System.out.println("--------------------------------------");
        System.out.println("1... Square an input value");
        System.out.println("2... Cube an input value");
        System.out.println("3... Raise input value to any exponent");
        System.out.println("4... Exit program");
        System.out.println("---------------------------------------"); 
    }
}
