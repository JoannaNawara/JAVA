package cwiczenia4;

public class SchoolGirl extends Pupil{
    public SchoolGirl( String sFirstName, String sSecondName, int nAge, String sClassName ) {
        super( sFirstName, sSecondName, nAge, sClassName );
        mNonStaticID = "F_" + mNonStaticID;
    }

    public void printOutfit() {
        System.out.println( "Outfit: Biala bluzka z krawatem (opcjonalnie dodatkowo granatowy lub czarny sweterek, "
                + "granatowa (lub czarna) spodniczka, plaskie obuwie" );
    }
}
