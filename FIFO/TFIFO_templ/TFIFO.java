package TFIFO_templ;

public class TFIFO<T>
{
    private T [] q;
    private int mMaxSize;  // ZBEDNE - mozna uzyc q.length
    private int mHead;     // indeks pierwszego elem do popbrania z kolejki
    private int mTail;     // indeks pierwzego wolnego miejsca w kolejce
    private int mElemNo;   // ilosc elementow w kolejce

    public TFIFO(T[] Q){
        q = Q;
        mMaxSize = q.length; // q.length
        mElemNo = mHead = mTail = 0;
    }
    public boolean TQFEmpty(){
        return mElemNo == 0;
    }
    public void TQFEnqueue( T x  ) throws TExceptionFIFO{
        if( mElemNo >= mMaxSize )
           throw new TExceptionFIFO( TExceptionFIFO.Error.FIFO_ALLOCATION );
        q[mTail] = x;
        mTail = ( mTail + 1 ) % mMaxSize;
        mElemNo++;
    }
    public T TQFDequeue() throws TExceptionFIFO {
        if( TQFEmpty() )
            throw new TExceptionFIFO( TExceptionFIFO.Error.FIFO_EMPTY );
        T key = q[mHead];
        Tdel();
        return key;
    }
    public void  TQFClear() throws TExceptionFIFO {
        while( !TQFEmpty() ){
            TQFDequeue();
        }
        mHead=mTail=0;
    }
    public void TQFPrint(){
        int index = mHead;
        for( int i = 0; i < mElemNo; i++ ) {
            System.out.printf("%d ", q[index]);
            if (index < mMaxSize - 1)
                index += 1;
            else
                index = 0;
        }
    }

    private void Tdel() throws TExceptionFIFO{
        if( TQFEmpty() )
           throw new TExceptionFIFO( TExceptionFIFO.Error.FIFO_EMPTY );
        q[mHead] = null;
        mElemNo--;
        mHead = ( mHead + 1) % mMaxSize;
    }

}
