package com.azhar.rajaongkir.data.city;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Nur Fauzan Halim on 12-07-2022
 */

public class DataStatus implements Serializable {
    @SerializedName("code")
    @Expose
    public Integer code;
    @SerializedName("description")
    @Expose
    public String description;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
