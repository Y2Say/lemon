package com.lemon.util;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Created by lemon on 2017/8/16.
 */
class CustomerHttpResponseStruct {
    @JSONField
    private int status;
    @JSONField
    private boolean success;
    @JSONField
    private String message;
    @JSONField
    private Object data;

    public CustomerHttpResponseStruct() {
    }

    public int getStatus() {
        return this.status;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public String getMessage() {
        return this.message;
    }

    public Object getData() {
        return this.data;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean equals(Object o) {
        if(o == this) {
            return true;
        } else if(!(o instanceof CustomerHttpResponseStruct)) {
            return false;
        } else {
            CustomerHttpResponseStruct other = (CustomerHttpResponseStruct)o;
            if(!other.canEqual(this)) {
                return false;
            } else if(this.getStatus() != other.getStatus()) {
                return false;
            } else if(this.isSuccess() != other.isSuccess()) {
                return false;
            } else {
                label40: {
                    Object this$message = this.getMessage();
                    Object other$message = other.getMessage();
                    if(this$message == null) {
                        if(other$message == null) {
                            break label40;
                        }
                    } else if(this$message.equals(other$message)) {
                        break label40;
                    }

                    return false;
                }

                Object this$data = this.getData();
                Object other$data = other.getData();
                if(this$data == null) {
                    if(other$data != null) {
                        return false;
                    }
                } else if(!this$data.equals(other$data)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof CustomerHttpResponseStruct;
    }

    @Override
    public int hashCode() {
        int result = getStatus();
        result = 31 * result + (isSuccess() ? 1 : 0);
        result = 31 * result + (getMessage() != null ? getMessage().hashCode() : 0);
        result = 31 * result + (getData() != null ? getData().hashCode() : 0);
        return result;
    }

    public String toString() {
        return "CustomerHttpResponseStruct(status=" + this.getStatus() + ", success=" + this.isSuccess() + ", message=" + this.getMessage() + ", data=" + this.getData() + ")";
    }
}
