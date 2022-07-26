package cwiczenia4;

public class SchoolGirl extends Pupil{
    public SchoolGirl( String sFirstName, String sSecondName, int nAge, String sClassName ) {
        super( sFirstName, sSecondName, nAge, sClassName );
        mNonStaticID = "F_" + mNonStaticID;
    }

    public void printOutfit() {
        System.out.println( "Outfit: White blouse with a tie (optional navy blue or black sweater, "
                 + "navy blue (or black) skirt, flat shoes" );
    }
}
