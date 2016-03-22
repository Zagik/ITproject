/**
 * Created by vovaz on 03.03.2016.
 */
public class GoldenSection
{
    private static double x1,x2,xmin;
    public static int iterationXMin,MaxIteration,iterationXMax;
    static final double RATIO_CONSTANT = 1.618;
    private static double f(double a)
    {
        return (5*a*a-4*a+1);
    }


    private static double x1(double a, double b)
    {
        x1 = b - (b-a) / RATIO_CONSTANT;
        return x1;
    }

    private static double x2(double a, double b)
    {
        x2 = a + (b-a) / RATIO_CONSTANT;
        return x2;
    }

    public static void printHalfDivision()
    {
        System.out.println();
        System.out.println("Minimum = "  + xmin);
    }


    public double calculateMin(double a,double b, double e,int MaxIteration)
    {//algorithm
        this.iterationXMin = 0;
       while ((b-a)>e)
       {
           if (iterationXMin<=MaxIteration)
           {
              x1 = b - (b-a) / RATIO_CONSTANT;
              x2 = a + (b-a) / RATIO_CONSTANT;

              if (f(x1) >= f(x2) ) //search MIN; f(x1) <= f(x2) search MAX
              {
                 a = x1;
                 x1 = x2;
                 x2 = a + (b-a) / RATIO_CONSTANT;
              }
               else
              {
                 b = x2;
                 x2 = x1;
                 x1 = b - (b-a) / RATIO_CONSTANT;
              }
               iterationXMin++;
           }else break;
       }
        this.iterationXMin = iterationXMin - 1;
        xmin = (a+b)/2;
        return xmin;

    }

    public double calculateMax(double a,double b, double e,int MaxIteration)
    {//algorithm
        this.iterationXMax = 0;
        while ((b-a)>e)
        {
            if (iterationXMax<=MaxIteration)
            {
                x1 = b - (b-a) / RATIO_CONSTANT;
                x2 = a + (b-a) / RATIO_CONSTANT;

                if (f(x1) <= f(x2) ) //search MAX; f(x1) >= f(x2) search MIN
                {
                    a = x1;
                    x1 = x2;
                    x2 = a + (b-a) / RATIO_CONSTANT;
                }
                else
                {
                    b = x2;
                    x2 = x1;
                    x1 = b - (b-a) / RATIO_CONSTANT;
                }
                iterationXMax++;
            }else break;
        }
        this.iterationXMax = iterationXMax - 1;
        xmin = (a+b)/2;
        return xmin;

    }




}
