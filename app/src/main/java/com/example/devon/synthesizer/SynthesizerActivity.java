package com.example.devon.synthesizer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SynthesizerActivity extends AppCompatActivity {
    private static final String TAG = SynthesizerActivity.class.getName();

    private Button button1; //null Button objects
    private Button button2; //null Button objects


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

        button1=(Button)findViewById(R.id.button); //assign button on screen to Button object
        button2=(Button)findViewById(R.id.button2); //going to XML file, finding button on screen, now we can program it

    }
    public void onButton1Click(View v) {
        Log.i(TAG, "Button 1 Clicked");
    }

}
