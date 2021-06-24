package com.techlead.scribblui.Data;

public class Avatar {
    private String name;
    private Integer imageUrl;


    public Avatar(Integer imageUrl,String s) {

        this.imageUrl = imageUrl;
        this.name = s;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }
}
