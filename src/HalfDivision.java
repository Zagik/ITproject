import javax.swing.*;

/**
 * Created by vovaz on 02.03.2016.
 */
public class HalfDivision
{
    private static double xs;
    public static int iteration;


    private static double f(double a)
    {
        return (5*a*a-4*a+1);
    }

    private static double xs(double a, double b)
    {
        return (a+b)/2;
    }

    public static void printHalfDivision()
    {
        System.out.println();
        System.out.println("The ultimate middle = " + xs);
    }


    public double calculate(double a,double b, double e,int MaxIteration)
    {//algorithm
        this.iteration = 0;
        while ((b-a)>e)
        {
            if (iteration<=MaxIteration){
            xs = xs(a,b);

            if (f(a)*f(xs) <=0)
            {
                b = xs;
            }
            else
            {
                a = xs;
            }
                iteration++;
        }else {break;}
        }
        this.iteration = iteration-1;
        xs = xs(a,b);
        return xs;
    }

}
