
/**
 * Write a description of class OrderedPair here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OrderedPair
{

    double X,Y;

    public OrderedPair(){
        X = 0;
        Y = 0;
    }

    public OrderedPair(double x, double y){
        X = x;
        Y = y;

    }

    public String toString(){
        return "("+X+","+Y+")";

    }

    public double getX(){
        return X;
    }

    public double getY(){
        return Y;
    }
    
}
