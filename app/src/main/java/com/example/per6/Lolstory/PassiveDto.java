package com.example.per6.Lolstory;

/**
 * Created by per6 on 3/27/18.
 */

public class PassiveDto {
    private ImageDto image;
    private String sanitizedDescription,name, description;

    public ImageDto getImage() {
        return image;
    }

    public void setImage(ImageDto image) {
        this.image = image;
    }

    public String getSanitizedDescription() {
        return sanitizedDescription;
    }

    public void setSanitizedDescription(String sanitizedDescription) {
        this.sanitizedDescription = sanitizedDescription;
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
}
