package parkingLot2.exception;

public class BizException extends Exception{
    String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public BizException(String msg) {
        this.msg = msg;
    }
}
