package com.cloudiip.pojo.ov;

/**
 * @author huangruibin
 * @Date 2021/11/17 14:10
 */
public class SystemResult {
    private Integer status;
    private String msg;
    private Object data;

    public SystemResult() {
    }

    public SystemResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 实现工具方法  ok  build
     * @return
     */
    public static SystemResult ok(){
        //调用返回一个固定status msg data述职的对象
        return new SystemResult(200,"ok",null);
    }

    public static SystemResult build(Integer status,String msg,Object data){
        return new SystemResult(status,msg,data);
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
