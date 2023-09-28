
/**
 * problemset 2c
 *
 * William Zheng
 * september 27, 2023
 */
public class formulas
{
    public static OrderedPair findQuadraticRoots (double a, double b, double c){
        double d = b * b - 4 * a * c;

        double answer1 =  (-b + Math.sqrt(d)) / (2 * a);
        double answer2 =  (-b - Math.sqrt(d)) / (2 * a);
        OrderedPair answer = new OrderedPair(answer1, answer2);
        return answer;
    }

    public static double findSlope (OrderedPair A, OrderedPair B) {

        double x1 = A.getX(); 
        double x2 = B.getX(); 
        double y1 = A.getY();
        double y2 = B.getY();

        double answer = (y2-y1)/(x2-x1);  

        return answer;
    }

    public static OrderedPair findMidpoint (OrderedPair A, OrderedPair B){

        double x1 = A.getX(); 
        double x2 = B.getX(); 
        double y1 = A.getY();
        double y2 = B.getY();
        
        double midpointx =  (x1+x2)/2;
        double midpointy =  (y1+y2)/2;
        OrderedPair answer = new OrderedPair(midpointx, midpointy);
        
        return answer;
    }
    
    public static double findArithmeticSeriesSum (double A, double D, int K){
        double answer = K/2.0*(2*A + (D*(K-1)));
        
        return answer;
    }
    
    public static double findGeometricSeriesSum (double a, double r, int k) {
        double answer = a*((1-Math.pow(r,k))/(1.0-r));
        return answer;
    }
    public static int rollDie (int sides){
        int answer = (int) (Math.random() * sides)+1;
         return answer;
    }



}
