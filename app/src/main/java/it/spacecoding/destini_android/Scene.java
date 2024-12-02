package it.spacecoding.destini_android;

class Scene {
    int mStoryID;
    int mAnswerOneID;
    int mAnswerTwoID;

    public Scene(int storyID, int answerOneID, int answerTwoID) {
        mStoryID = storyID;
        mAnswerOneID = answerOneID;
        mAnswerTwoID = answerTwoID;
    }

    public int getStoryID() {
        return mStoryID;
    }

    public void setStoryID(int storyID) {
        mStoryID = storyID;
    }

    public int getAnswerOneID() {
        return mAnswerOneID;
    }

    public void setAnswerOneID(int answerOneID) {
        mAnswerOneID = answerOneID;
    }

    public int getAnswerTwoID() {
        return mAnswerTwoID;
    }

    public void setAnswerTwoID(int answerTwoID) {
        mAnswerTwoID = answerTwoID;
    }
}
