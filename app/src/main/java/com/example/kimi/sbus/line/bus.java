package com.example.kimi.sbus.line;

import java.util.Set;

/**
 * Created by Kimi on 2016/7/11.
 */
public class bus {
    private String _id;
    private String info;
    private Set<com.example.kimi.sbus.line.stats> stats;
    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
    public Set<stats> getStats() {
        return stats;
    }
    public void setStats(Set<stats> stats) {
        this.stats = stats;
    }
}
