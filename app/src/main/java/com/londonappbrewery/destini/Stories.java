package com.londonappbrewery.destini;

/**
 * Created by deepak on 17-01-2018.
 */

public class Stories {
    private int mStoryID;
    private int mTopID;
    private int mBottomID;

    public Stories(int storyID, int topID, int bottomID) {
        mStoryID = storyID;
        mTopID = topID;
        mBottomID = bottomID;
    }

    public int getStoryID() {
        return mStoryID;
    }

    public void setStoryID(int storyID) {
        mStoryID = storyID;
    }

    public int getTopID() {
        return mTopID;
    }

    public void setTopID(int topID) {
        mTopID = topID;
    }

    public int getBottomID() {
        return mBottomID;
    }

    public void setBottomID(int bottomID) {
        mBottomID = bottomID;
    }
}
