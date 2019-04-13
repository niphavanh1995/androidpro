package com.example.app_fashion;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Fashion_ListResponse {
    @SerializedName("status")
    private  boolean status;
    @SerializedName("msg")
    private String mess;
    @SerializedName("data")
    private List<Fashion> newsList;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }

    public List<Fashion> getNewsList() {
        return newsList;
    }

    public void setNewsList(List<Fashion> newsList) {
        this.newsList = newsList;
    }
}
