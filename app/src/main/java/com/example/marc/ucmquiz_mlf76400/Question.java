package com.example.marc.ucmquiz_mlf76400;

/**
 * Created by Marc on 1/31/2018.
 */

public class Question {

    private int mTextresId;
    private boolean mAnswerTrue;

    public int getTextresId() {
        return mTextresId;
    }

    public void setTextresId(int textresId) {
        mTextresId = textresId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public Question(int textResID, boolean answerTrue){
        mTextresId = textResID;
        mAnswerTrue = answerTrue;
    }

}
