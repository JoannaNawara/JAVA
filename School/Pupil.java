package cwiczenia4;

import java.io.IOException;
import java.util.Arrays;
import static java.lang.Math.abs;

abstract public class Pupil extends Person{
    public static final double ZERO = 1e-15;
    private static final int SIZE = 7;

    public Pupil( String sFirstName, String sSecondName, int nAge, String sClassName ) {
        super( sFirstName, sSecondName, nAge );
        setID();
        mGrades = new double[SIZE];
        clearGrades();
        setClassName( sClassName );
    }

    public void setGrade( int nCourseName, double nGrade ) throws IOException {
        if( abs( nGrade - 2.0 ) < ZERO || abs( nGrade - 2.5 ) < ZERO || abs( nGrade - 3.0 ) < ZERO || abs( nGrade - 3.5 ) < ZERO || abs( nGrade - 4.0 ) < ZERO || abs( nGrade - 4.5 ) < ZERO || abs( nGrade - 5.0 ) < ZERO ) {
            mGrades[nCourseName] = nGrade;
        } else {
            throw new IOException( "ERROR: Wrong grade!" );
        }
    }

    public void setClassName( String sClassName ) {
        mClassName = sClassName;
    }

    public double[] getGrades() {
        return mGrades;
    }

    public String getID() {
        return mNonStaticID;
    }

    public String getClassName() {
        return mClassName;
    }

    public double getAverage() {
        double sum = 0;
        int size = 0;
        for( int i = 0; i < mGrades.length; i++ ) {
            if( mGrades[i] >= 2.0 ) {
                sum += mGrades[i];
                size++;
            }
        }
        return ( size != 0 ) ? sum / size : 0;
    }

    public void clearGrades() {
        Arrays.fill( mGrades, 0.0 );
    }

    public String toString() {
        return "ID: " + getID() + "\nFirst Name: " + getFirstName() + "\nSecond Name: " + getSecondName() + "\nGrade average: " + getAverage() + "\nClass: " + getClassName() + "\nAge: " + getAge();
    }

    private void setID() {
        mNonStaticID = Integer.toString( mID++ );
    }

    abstract void printOutfit();

    protected static int mID = 1000;
    protected String mNonStaticID;
    private double[] mGrades;
    private String mClassName;

}
