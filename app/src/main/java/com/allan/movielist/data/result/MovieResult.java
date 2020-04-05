package com.allan.movielist.data.result;

import com.allan.movielist.data.model.Voted;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieResult {

    @SerializedName("_id")
    @Expose
    private String id;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("director")
    @Expose
    private List<String> director = null;
    @SerializedName("writers")
    @Expose
    private List<String> writers = null;
    @SerializedName("stars")
    @Expose
    private List<String> stars = null;
    @SerializedName("productionCompany")
    @Expose
    private List<String> productionCompany = null;
    @SerializedName("pageViews")
    @Expose
    private Integer pageViews;
    @SerializedName("upVoted")
    @Expose
    private List<String> upVoted = null;
    @SerializedName("downVoted")
    @Expose
    private List<String> downVoted = null;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("runTime")
    @Expose
    private Object runTime;
    @SerializedName("releasedDate")
    @Expose
    private Integer releasedDate;
    @SerializedName("genre")
    @Expose
    private String genre;
    @SerializedName("voted")
    @Expose
    private List<Voted> voted = null;
    @SerializedName("poster")
    @Expose
    private String poster;
    @SerializedName("totalVoted")
    @Expose
    private Integer totalVoted;
    @SerializedName("voting")
    @Expose
    private Integer voting;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getDirector() {
        return director;
    }

    public void setDirector(List<String> director) {
        this.director = director;
    }

    public List<String> getWriters() {
        return writers;
    }

    public void setWriters(List<String> writers) {
        this.writers = writers;
    }

    public List<String> getStars() {
        return stars;
    }

    public void setStars(List<String> stars) {
        this.stars = stars;
    }

    public List<String> getProductionCompany() {
        return productionCompany;
    }

    public void setProductionCompany(List<String> productionCompany) {
        this.productionCompany = productionCompany;
    }

    public Integer getPageViews() {
        return pageViews;
    }

    public void setPageViews(Integer pageViews) {
        this.pageViews = pageViews;
    }

    public List<String> getUpVoted() {
        return upVoted;
    }

    public void setUpVoted(List<String> upVoted) {
        this.upVoted = upVoted;
    }

    public List<String> getDownVoted() {
        return downVoted;
    }

    public void setDownVoted(List<String> downVoted) {
        this.downVoted = downVoted;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Object getRunTime() {
        return runTime;
    }

    public void setRunTime(Object runTime) {
        this.runTime = runTime;
    }

    public Integer getReleasedDate() {
        return releasedDate;
    }

    public void setReleasedDate(Integer releasedDate) {
        this.releasedDate = releasedDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Voted> getVoted() {
        return voted;
    }

    public void setVoted(List<Voted> voted) {
        this.voted = voted;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public Integer getTotalVoted() {
        return totalVoted;
    }

    public void setTotalVoted(Integer totalVoted) {
        this.totalVoted = totalVoted;
    }

    public Integer getVoting() {
        return voting;
    }

    public void setVoting(Integer voting) {
        this.voting = voting;
    }
}
