package top.duanhong.steward.response;

import java.util.Map;

/**
 * @author duanhong
 * @description MethodExecuteResult
 * @date 2019/5/18
 */
public class MethodExecuteResult<T> {

    public MethodExecuteResult() {
    }

    public MethodExecuteResult(final String message, final boolean success, final String resultCode) {
        this.message = message;
        this.success = success;
        this.resultCode = resultCode;
    }

    private String message = null;

    private boolean success = true;

    private T data;

    private String resultCode;

    private Map<String, Object> extra;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Map<String, Object> getExtra() {
        return extra;
    }

    public void setExtra(Map<String, Object> extra) {
        this.extra = extra;
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public void setResultCode(final String resultCode) {
        this.resultCode = resultCode;
    }
}
