package it.spacecoding.destini_android;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private TextView storyTextView;
    private Button mTopButton;
    private Button mBottomButton;
    private int mIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
        storyTextView = findViewById(R.id.storyTextView);
        mTopButton = findViewById(R.id.buttonTop);
        mBottomButton = findViewById(R.id.buttonBottom);

        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                switch (mIndex){
//                    case 1:
//                        storyTextView.setText(R.string.T3_Story);
//                        mTopButton.setText(R.string.T3_Ans1);
//                        mBottomButton.setText(R.string.T3_Ans2);
//                        mIndex = 3;
//                        break;
//                    case 2:
//                        storyTextView.setText(R.string.T3_Story);
//                        mTopButton.setText(R.string.T3_Ans1);
//                        mBottomButton.setText(R.string.T3_Ans2);
//                        mIndex =
//                }

            }
        });
        mBottomButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Log.d("MainActivity","Bottom Button press.");

            }
        });
    }
}