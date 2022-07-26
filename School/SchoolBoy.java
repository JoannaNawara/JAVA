package cwiczenia4;

public class SchoolBoy extends Pupil{
    public SchoolBoy( String sFirstName, String sSecondName, int nAge, String sClassName ) {
        super( sFirstName, sSecondName, nAge, sClassName );
        mNonStaticID = "M_" + mNonStaticID;
    }

    public void printOutfit() {
        System.out.println( "Outfit: Biala lub niebieska koszula z krawatem, marynarka, polbuty, spodnie dowolne czarne lub granatowe" );
    }
}
