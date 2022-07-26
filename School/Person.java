package cwiczenia4;

public class Person {
    public Person( String sFirstName, String sSecondName, int nAge ) {
        setFirstName( sFirstName );
        setSecondName( sSecondName );
        setAge( nAge );
    }

    public String getFirstName() {
        return mFirstName;
    }

    public String getSecondName() {
        return mSecondName;
    }

    public int getAge() {
        return mAge;
    }

    public void setFirstName( String sFirstName ) {
        mFirstName = sFirstName;
    }

    public void setSecondName( String sSecondName ) {
        mSecondName = sSecondName;
    }

    public void setAge( int nAge ) {
        mAge = nAge;
    }

    private String mFirstName;
    private String mSecondName;
    private int mAge;
}
