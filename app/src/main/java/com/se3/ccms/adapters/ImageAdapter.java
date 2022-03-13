package com.se3.ccms.adapters;

public class ImageAdapter {
    private String idimage;
    private String idpost;
    private String name;
    private String description;
    private String image;

    public ImageAdapter(String idimage, String idpost,  String name, String description, String image){
        this.idimage = idimage;
        this.idpost = idpost;
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public String getIdimage() {
        return idimage;
    }

    public void setIdimage(String idimage) {
        this.idimage = idimage;
    }

    public String getIdpost() {
        return idpost;
    }

    public void setIdpost(String idpost) {
        this.idpost = idpost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
