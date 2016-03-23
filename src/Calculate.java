import javax.swing.*;
import java.util.Scanner;

/**
 * Created by vovaz on 11.03.2016.
 */
public class Calculate
{
   //YEEEEEE
    private double a;
    private double b;
    private double e;
    private double xMax;
    private double xs;
    private double xMin;
    private int maxIteration;
    public Calculate(double a, double b, double e, int maxIteration)
    {
        this.a = a;
        this.b = b;
        this.e = e;
        this.maxIteration = maxIteration;

        HalfDivision halfDivision = new HalfDivision();
        this.xs =  halfDivision.calculate(a,b,e,maxIteration);

        GoldenSection goldenSection = new GoldenSection();
        this.xMin = goldenSection.calculateMin(a,b,e,maxIteration);
        this.xMax = goldenSection.calculateMax(a,b,e,maxIteration);
    }

    public double getA()
    {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getE() {
        return e;
    }

    public double getXs(){ return xs;}

    public int getMaxIteration() {
        return maxIteration;
    }

    public double getxMax() {
        return xMax;
    }

    public double getxMin() {
        return xMin;
    }
}
