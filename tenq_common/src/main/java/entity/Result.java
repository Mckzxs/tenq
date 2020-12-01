package entity;

public class Result {
    private boolean flag;//是否成功
    private Integer code;//返回码
    private String message;//返回信息
    private Object object;//返回数据

    public Result() {
    }

    public Result(boolean flag, Integer code, String message, Object object) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.object = object;
    }

    public Result(boolean flag, Integer code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
