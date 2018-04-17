package com.example.shuchengxiang.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by shuchengxiang on 2018/4/16.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
