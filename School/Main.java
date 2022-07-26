package cwiczenia4;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        enum courses {POLSKI, MATEMATYKA, FIZYKA, CHEMIA, INFORMATYKA, ANGIELSKI, NIEMIECKI}
        SchoolBoy SB1 = new SchoolBoy("Jan","Kowalski",15,"2a");
        SchoolGirl SG1 = new SchoolGirl("Karolina", "Nowak",14,"1c");
        SchoolGirl SG2 = new SchoolGirl( "Katarzyna", "Nowak", 19, "3b" );


        for( int i = 0; i < 4; i++ ) {
            SB1.setGrade( i, 3.5 );
        }
        for( int i = 4; i < 7; i++ ) {
            SB1.setGrade( i, 5.0 );
        }
        System.out.println( "SchoolBoy's grades: " );
        for( int i = courses.POLSKI.ordinal(); i <= courses.NIEMIECKI.ordinal(); i++ ) {
            System.out.println( i + ": " + SB1.getGrades()[i] );
        }

        //---------------------------

        for( int i = 0; i < 4; i++ ) {
            SG1.setGrade( i, 4.0 );
        }
        for( int i = 4; i < 7; i++ ) {
            SG1.setGrade( i, 4.5 );
        }
        System.out.println( "SchoolGirl's grades: " );
        for( int i = courses.POLSKI.ordinal(); i <= courses.NIEMIECKI.ordinal(); i++ ) {
            System.out.println( i + ": " + SG1.getGrades()[i] );
        }

        for( int i = 0; i < 4; i++ ) {
            SG2.setGrade( i, 4.0 );
        }
        for( int i = 4; i < 7; i++ ) {
            SG2.setGrade( i, 4.5 );
        }

        SG2.setGrade(courses.FIZYKA.ordinal(), 3.5);
        SG2.setGrade(courses.POLSKI.ordinal(), 5.0);

        System.out.println( "Girl's outfit:" );
        SG1.printOutfit();

        System.out.println( "Boy's outfit:" );
        SB1.printOutfit();

        Pupil pupils[] = { SB1, SG1, SG2 };
        System.out.println("\nPupils:");
        showInfo(pupils);


        SG1.clearGrades();
        System.out.println("Schoolgirl's grades after clearing:");
        for( int i = courses.POLSKI.ordinal(); i <= courses.NIEMIECKI.ordinal(); i++ ) {
            System.out.println( i + ": " + SG1.getGrades()[i] );
        }

    }
    static void showInfo( Pupil[] pupil ) {
        for( int i = 0; i < pupil.length; i++ ) {
            System.out.println( pupil[i] );
            pupil[i].printOutfit();
            System.out.println();
        }
    }
}
