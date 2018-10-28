package com.example.android.tourofleesburg;

public class Info {

    private String mInfoTitle;
    private int mInformation;
    private int mImageId;

    public Info(String infoTitle, int information, int imageId) {
        mInfoTitle = infoTitle;
        mInformation = information;
        mImageId = imageId;
    }

    public String getInfoTitle() {
        return mInfoTitle;
    }

    public int getInformation() {
        return mInformation;
    }

    public int getImageId() {
        return mImageId;
    }
}
