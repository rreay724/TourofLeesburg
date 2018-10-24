package com.example.android.tourofleesburg;

public class Info {

    private String mInfoTitle;
    private String mInformation;
    private int mImageId;

    public Info (String infoTitle, String information, int imageId){
        mInfoTitle = infoTitle;
        mInformation = information;
        mImageId = imageId;
    }

    public String getInfoTitle() {
        return mInfoTitle;
    }

    public String getInformation() {
        return mInformation;
    }

    public int getImageId() {
        return mImageId;
    }
}
