package com.example.expeditionsupportapp;

public class VideoClass {
    String videoUri;
    String videoName;

    public VideoClass() {
    }

    public VideoClass(String videoUri, String videoName) {
        this.videoUri = videoUri;
        this.videoName = videoName;
    }

    public String getVideoUri() {
        return videoUri;
    }

    public void setVideoUri(String videoUri) {
        this.videoUri = videoUri;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }
}
