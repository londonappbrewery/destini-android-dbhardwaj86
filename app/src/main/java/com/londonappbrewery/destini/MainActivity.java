package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryView;
    private Button mButtonTop;
    private Button mButtonBottom;
    int mStoryIndex;

    private Stories[] mStories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryIndex = 0;
        mStoryView = (TextView) findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);
        mStories = new Stories[]{
                new Stories (R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2),
                new Stories (R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2),
                new Stories (R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2),
                new Stories (R.string.T4_End, 0,0),
                new Stories (R.string.T5_End,  0,0),
                new Stories (R.string.T6_End,  0,0),
        };

        mStoryView.setText(mStories[mStoryIndex].getStoryID());
        mButtonTop.setText(mStories[mStoryIndex].getTopID());
        mButtonBottom.setText(mStories[mStoryIndex].getBottomID());

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex == 0 || mStoryIndex == 1)
                    mStoryIndex = 2;
                else if (mStoryIndex == 2) {
                    mStoryIndex = 5;
                }
                updateStory();
                updateTop();
                updateBottom();
            }
        });

        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex == 0)
                    mStoryIndex = 1;
                else if (mStoryIndex == 1){
                    mStoryIndex = 3;
                }
                else if (mStoryIndex == 2){
                    mStoryIndex = 4;
                }
                updateStory();
                updateTop();
                updateBottom();
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }

    public void updateStory(){
        mStoryView.setText(mStories[mStoryIndex].getStoryID());
    }
    public void updateTop(){
        if (mStoryIndex < 3)
            mButtonTop.setText(mStories[mStoryIndex].getTopID());
        else
            mButtonTop.setVisibility(View.GONE);
    }
    public void updateBottom(){
        if (mStoryIndex < 3)
            mButtonBottom.setText(mStories[mStoryIndex].getBottomID());
        else
            mButtonBottom.setVisibility(View.GONE);
    }
}
