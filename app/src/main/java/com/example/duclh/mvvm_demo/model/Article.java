package com.example.duclh.mvvm_demo.model;

import java.io.Serializable;

/**
 * Created by duclh on 31/07/2017.
 */

public class Article implements Serializable {
    private String title;
    private String excerpt;
    private boolean highlight;
    private String imageUrl;
    private boolean read;
    private String moreRead;

    public Article(String title, String excerpt, boolean highlight, String imageUrl, String moreRead) {
        this.title = title;
        this.excerpt = excerpt;
        this.highlight = highlight;
        this.imageUrl = imageUrl;
        this.read = false;
        this.moreRead = moreRead;
    }

    public String getMoreRead() {
        return moreRead;
    }

    public void setMoreRead(String moreRead) {
        this.moreRead = moreRead;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    public boolean isHighlight() {
        return highlight;
    }

    public void setHighlight(boolean highlight) {
        this.highlight = highlight;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }
}
