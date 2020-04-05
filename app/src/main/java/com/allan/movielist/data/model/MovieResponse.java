package com.allan.movielist.data.model;

import com.allan.movielist.data.result.MovieResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieResponse {

    @SerializedName("result")
    @Expose
    private List<MovieResult> result = null;
    @SerializedName("queryParam")
    @Expose
    private QueryParam queryParam;
    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("message")
    @Expose
    private String message;

    public List<MovieResult> getResult() {
        return result;
    }

    public void setResult(List<MovieResult> result) {
        this.result = result;
    }

    public QueryParam getQueryParam() {
        return queryParam;
    }

    public void setQueryParam(QueryParam queryParam) {
        this.queryParam = queryParam;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
