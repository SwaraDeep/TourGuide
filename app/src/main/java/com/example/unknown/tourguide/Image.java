package com.example.unknown.tourguide;

public class Image {

    private String mitemName;
    private int mitemId;

    public Image(String itemName, int itemId){
        mitemName = itemName;
        mitemId = itemId;
    }

    public int getMitemId() {
        return mitemId;
    }

    public String getMitemName() {
        return mitemName;
    }
}
