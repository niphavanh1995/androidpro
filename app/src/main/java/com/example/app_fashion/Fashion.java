package com.example.app_fashion;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Fashion {

        @SerializedName("anhMain")
        private  String anh_Interface;
        @SerializedName("ten_Hang")
        private  String tenTin_Interface;
        @SerializedName("moTaMain")
        private  String moTaMain;
        @SerializedName("anh1")
        private  String anh1;
        @SerializedName("moTa1")
        private  String noiDung1;
        @SerializedName("anh2")
        private  String anh2;
        @SerializedName("moTa2")
        private  String noiDung2;
        @SerializedName("anh3")
        private  String anh3;
        @SerializedName("moTa3")
        private  String noiDung3;
        @SerializedName("id_Tin")
        private  String id_TLTin;

    public Fashion(String anh_Interface, String tenTin_Interface, String moTaMain, String anh1, String noiDung1, String anh2, String noiDung2, String anh3, String noiDung3, String id_TLTin) {
        this.anh_Interface = anh_Interface;
        this.tenTin_Interface = tenTin_Interface;
        this.moTaMain = moTaMain;
        this.anh1 = anh1;
        this.noiDung1 = noiDung1;
        this.anh2 = anh2;
        this.noiDung2 = noiDung2;
        this.anh3 = anh3;
        this.noiDung3 = noiDung3;
        this.id_TLTin = id_TLTin;
    }

    public String getAnh_Interface() {
        return anh_Interface;
    }

    public void setAnh_Interface(String anh_Interface) {
        this.anh_Interface = anh_Interface;
    }

    public String getTenTin_Interface() {
        return tenTin_Interface;
    }

    public void setTenTin_Interface(String tenTin_Interface) {
        this.tenTin_Interface = tenTin_Interface;
    }

    public String getMoTaMain() {
        return moTaMain;
    }

    public void setMoTaMain(String moTaMain) {
        this.moTaMain = moTaMain;
    }

    public String getAnh1() {
        return anh1;
    }

    public void setAnh1(String anh1) {
        this.anh1 = anh1;
    }

    public String getNoiDung1() {
        return noiDung1;
    }

    public void setNoiDung1(String noiDung1) {
        this.noiDung1 = noiDung1;
    }

    public String getAnh2() {
        return anh2;
    }

    public void setAnh2(String anh2) {
        this.anh2 = anh2;
    }

    public String getNoiDung2() {
        return noiDung2;
    }

    public void setNoiDung2(String noiDung2) {
        this.noiDung2 = noiDung2;
    }

    public String getAnh3() {
        return anh3;
    }

    public void setAnh3(String anh3) {
        this.anh3 = anh3;
    }

    public String getNoiDung3() {
        return noiDung3;
    }

    public void setNoiDung3(String noiDung3) {
        this.noiDung3 = noiDung3;
    }

    public String getId_TLTin() {
        return id_TLTin;
    }

    public void setId_TLTin(String id_TLTin) {
        this.id_TLTin = id_TLTin;
    }
}
