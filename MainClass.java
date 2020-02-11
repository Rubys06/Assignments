package examole;
import java.lang.Math;
import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.print("Enter an operator: ");
        char operator = input.next().charAt(0);
        
        int result;
        switch(operator)
        {
            case '+':
                result =  (num1 + num2);
                break;
            case '-':
                result =  (num1 - num2);
                break;
            case '*':
                result =  (int) (num1 * num2);
                break;
            case '/':
                result = (int) (num1 / num2);
                break;
            case '^':
            	      
            	            result = (int) Math.pow(num1, num2);
              default:
                System.out.printf("Error! operator is not correct");
                return;
        }
        System.out.printf("%d %c %d = %d", num1, operator, num2, result);
    }
}