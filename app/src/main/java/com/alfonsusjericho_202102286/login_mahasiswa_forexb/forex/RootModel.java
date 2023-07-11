package com.alfonsusjericho_202102286.login_mahasiswa_forexb.forex;

import com.google.gson.annotations.SerializedName;

public class RootModel {
    @SerializedName("rates")
    private RatesModel ratesModel;
    public RootModel(){}

    public RatesModel getRatesModel() {
        return ratesModel;
    }

    public void setRatesModel(RatesModel ratesModel) {
        this.ratesModel = ratesModel;
    }
}
