package top.duanhong.steward.response;

/**
 * @author duanhong
 * @description 响应对象
 * @date 2019/3/26
 */
public class BaseResponse<T> {

    public BaseResponse() {
    }

    public BaseResponse(final String message, final String resultCode) {
        this.message = message;
        this.resultCode = resultCode;
    }

    private String message;

    private T data;

    private Object extra;

    private String resultCode;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public void setResultCode(final String resultCode) {
        this.resultCode = resultCode;
    }
}
