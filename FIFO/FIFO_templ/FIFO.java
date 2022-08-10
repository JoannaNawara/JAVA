package FIFO_templ;

public class FIFO<T>
{
    private class FifoItem<T>
    {
        private T        mKey;
        private FifoItem<T> mNext;

        public FifoItem( T key  ){
            setNext( null );
            setKey( key );
        }
        private void setKey( T key ) {
            mKey = key;
        }
        public T getKey(){
            return mKey;
        }
        public FifoItem<T> getNext(){
            return mNext;
        }
        public void setNext( FifoItem<T> item ){
            mNext=item;
        }
    }

    public FIFO() throws ExceptionFIFO {
        try{
            mTail = mHead = new FifoItem<T>(null);
        }
        catch( OutOfMemoryError e ){
            throw new ExceptionFIFO( ExceptionFIFO.Error.FIFO_ALLOCATION );
        }
    }
    public boolean  QFEmpty(){
        return mHead.getNext() == null;
    }
    public void QFEnqueue( T x  ) throws ExceptionFIFO{
        try{
            mTail.setNext( new FifoItem( x ) );
        }
        catch( OutOfMemoryError e ){
            throw new ExceptionFIFO( ExceptionFIFO.Error.FIFO_ALLOCATION );
        }
        mTail = mTail.getNext();
    }
    public T QFDequeue() throws ExceptionFIFO{
        if( QFEmpty() )
            throw new ExceptionFIFO( ExceptionFIFO.Error.FIFO_EMPTY);
        T x = (T) mHead.getNext().getKey();
        mHead.setNext( mHead.getNext().getNext() );
        if( QFEmpty() ) mTail = mHead;
        return x;
    }
    public void  QFClear() throws ExceptionFIFO{
       while( !QFEmpty() )
            QFDequeue();
    }
    public void QFPrint(){
        while(!(mHead.getNext() == null))
        {
            System.out.println( mHead.getNext().getKey() );
            mHead.setNext(mHead.getNext().getNext());
        }
    }

    private FifoItem mHead;
    private FifoItem mTail;
}


