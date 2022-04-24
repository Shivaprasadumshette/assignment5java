import arithmetic.addition.Addition;
import arithmetic.division.Division;
import arithmetic.multiplication.Multiplication;
import arithmetic.square.Square;
import arithmetic.square_root.SquareRoot;
import arithmetic.subtraction.Subtraction;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number:");
	int a=sc.nextInt();
	System.out.println("Enter second number:");
	int b=sc.nextInt();
        Addition.add(a,b);
        Subtraction.subtract(a,b);
        Multiplication.mul(a,b);
        Division.div(a,b);
        Square.sqr(a,b);
	SquareRoot.sqrRoot(a,b);

    }
}
