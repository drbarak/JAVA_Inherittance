package ירושה;

import static Library.Print.p;
import static Library.MyLibrary.*;

/**
 * Write a description of class TesterSun here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TesterSon extends Tester
{
    // instance variables - replace the example below with your own
    private int x;
    public int _x;

    /**
     * Constructor for objects of class TesterSun
     */
    public TesterSon()
    {
        super();
        _x = 2;
        // initialise instance variables
        x = 0;
        //Print.p(x, testerX);
    }

    public int getX1()
    {
        return _x;
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    public void main()
    {
        TesterSon b = new TesterSon();
        p(testerX);
        Tester a = new Tester();
        p(b.getX());
        int[] arr = new int[]{1,2};
        p(arr);
        swap(arr, 1, 0);
        p(arr);
    }
} // TesterSon

