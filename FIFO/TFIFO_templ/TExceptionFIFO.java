package TFIFO_templ;

public class TExceptionFIFO extends Exception {

    public enum Error {FIFO_ALLOCATION, FIFO_EMPTY, OTHER_FIFO_ERROR};
    public TExceptionFIFO( Error errCode ){
        m_ErrCode = errCode;
    }
    public String getReason(){
        switch( m_ErrCode ) {
            case FIFO_EMPTY    : return "ERROR: Queue is empty!";
            case FIFO_ALLOCATION : return "ERROR: Queue is overflow!";
            default: return "Other queue error!";
        }
    }
    private Error m_ErrCode;
}
