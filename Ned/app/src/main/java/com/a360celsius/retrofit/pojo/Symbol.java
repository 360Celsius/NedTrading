package com.a360celsius.retrofit.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Symbol {

    @SerializedName("symbol")
    @Expose
    private String symbol;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("date")
    @Expose
    private String date;

    @SerializedName("isEnabled")
    @Expose
    private boolean isEnabled;

    @SerializedName("type")
    @Expose
    private String type;

    @SerializedName("iexId")
    @Expose
    private String iexId;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIexId() {
        return iexId;
    }

    public void setIexId(String iexId) {
        this.iexId = iexId;
    }
}
