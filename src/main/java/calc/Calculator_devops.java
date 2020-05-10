package calc;

/**
 * Hello world!
 *
 */
public class Calculator_devops
{
    public static void main( String[] args )
    {
        double number_first = 16.0;
        double number_second = 4.0;

        char operator = '*';

        double output;

        switch(operator)
        {
            case '+':
                output = number_first + number_second;
                break;

            case '-':
                output = number_first - number_second;
                break;

            case '*':
                output = number_first * number_second;
                break;

            case '/':
                output = number_first / number_second;
                break;

            default:
                System.out.printf("This operator is not supported");
                return;
        }

        System.out.printf("output of the operation is %f ", output);
    }   
     }


