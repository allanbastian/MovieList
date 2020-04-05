package com.allan.movielist.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Voted {

    @SerializedName("upVoted")
    @Expose
    private List<Object> upVoted = null;
    @SerializedName("downVoted")
    @Expose
    private List<Object> downVoted = null;
    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("updatedAt")
    @Expose
    private Integer updatedAt;
    @SerializedName("genre")
    @Expose
    private String genre;

    public List<Object> getUpVoted() {
        return upVoted;
    }

    public void setUpVoted(List<Object> upVoted) {
        this.upVoted = upVoted;
    }

    public List<Object> getDownVoted() {
        return downVoted;
    }

    public void setDownVoted(List<Object> downVoted) {
        this.downVoted = downVoted;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
