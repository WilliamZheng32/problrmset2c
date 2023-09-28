import java.util.Scanner;
/**
 * Write a description of class formuladriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class formuladriver
{
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);

        System.out.println("QUADRATIC FORMULA: Find the roots of ax^2 + bx + c. Enter a, b, and c:");
        System.out.print("a:");
        double a = scr.nextDouble();
        System.out.print("b:");
        double b = scr.nextDouble();
        System.out.print("c:");
        double c = scr.nextDouble();

        OrderedPair roots = formulas.findQuadraticRoots(a, b, c);
        System.out.println("The solutions for 1x^2 + 5x + 6 are " + roots);

        System.out.println("SLOPE FORMULA: Find the slope between (x1,y1) and (x2,y2)");
        System.out.print("x1:");
        double x1 = scr.nextDouble();
        System.out.print("y1:");
        double y1 = scr.nextDouble();
        System.out.print("x2:");
        double x2 = scr.nextDouble();
        System.out.print("y2:");
        double y2 = scr.nextDouble();

        OrderedPair P1 = new OrderedPair(x1, y1);
        OrderedPair P2 = new OrderedPair(x2, y2);

        double slope = formulas.findSlope(P1,P2);

        System.out.println("A line between " +P1+ " and "+P2+" has a slope of " + slope);

        System.out.println("MIDPOINT FORMULA: Find the midpoint between (x1,y1) and (x2,y2)");
        System.out.print("x1:");
        double X1 = scr.nextDouble();
        System.out.print("y1:");
        double Y1 = scr.nextDouble();
        System.out.print("x2:");
        double X2 = scr.nextDouble();
        System.out.print("y2:");
        double Y2 = scr.nextDouble();

        OrderedPair P3 = new OrderedPair(x1, y1);
        OrderedPair P4 = new OrderedPair(x2, y2);

        OrderedPair midpoint = formulas.findMidpoint(P3,P4);

        System.out.println("The midpoint between "+ P3 + " and " + P4 + " is " + midpoint);

        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.print("number of terms:");
        int K = scr.nextInt();
        System.out.print("starts with:");
        double A = scr.nextDouble();
        System.out.print("increases by:");
        double D = scr.nextDouble();
        
        double ArithmeticSeriesSum = formulas.findArithmeticSeriesSum(A, D, K);
        System.out.println("The sum of the first "+A+" terms of an aritmatic series that starts with "+D+ " and increases by " +K+ " is "+ ArithmeticSeriesSum);
        
        System.out.println("SUM OF A GEOMETRIC SERIES");
        System.out.print("Number of terms:");
        int kk = scr.nextInt();
        System.out.print("Starts with:");
        double aa = scr.nextDouble();
        System.out.print("Rate of growth:");
        double dd = scr.nextDouble();
        
        double GeometricSeriesSum = formulas.findGeometricSeriesSum(aa, dd, kk);
        System.out.println("The sum of the first " +kk+ " terms of a finite geometric series that starts with " +aa+ " and increases by a rate of " +dd+ " is "+ GeometricSeriesSum+".");
        
        System.out.println("DIE ROLLER");
        System.out.print("How many sides does your die have?");
        int sides = scr.nextInt();
        
        int Dieroll = formulas.rollDie(sides);
        System.out.println("Rolling a 20-sided die... you got a " +Dieroll+"!");
    }

}
