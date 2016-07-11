package com.example.kimi.sbus.line;

import java.util.List;

/**
 * Created by Kimi on 2016/7/11.
 */

public class Res {
    private int error_code;
    private String reason;
    private List<bus> result;

    public List<bus> getResult() {
        return result;
    }

    public void setResult(List<bus> result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
