package FIFO;

import FIFO_templ.ExceptionFIFO;
import FIFO_templ.FIFO;
import TFIFO_templ.TExceptionFIFO;
import TFIFO_templ.TFIFO;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            FIFO q = new FIFO();
            q.QFEnqueue( 6 );
            q.QFEnqueue( 7 );
            q.QFEnqueue( 8 );
            q.QFEnqueue( 9 );
            q.QFDequeue();
            q.QFDequeue();
            q.QFPrint();
            q.QFClear();

        }
        catch( ExceptionFIFO e){
            System.out.printf( e.getReason() );
        }

        Integer Q[] = new Integer[10];
        TFIFO<Integer> q = new TFIFO( Q );

        try {
            q.TQFEnqueue( 1 );
            q.TQFEnqueue( 2 );
            q.TQFEnqueue( 3 );
            q.TQFEnqueue( 4 );
            q.TQFEnqueue( 5 );
            q.TQFDequeue();
            q.TQFDequeue();
            q.TQFPrint();
            q.TQFClear();

        }
        catch( TExceptionFIFO e){
            System.out.printf( e.getReason() );
        }
    }
}
