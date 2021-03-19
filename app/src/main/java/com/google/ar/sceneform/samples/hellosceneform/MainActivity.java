package com.google.ar.sceneform.samples.hellosceneform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.util.Log;
public class MainActivity extends AppCompatActivity {
    public static final String Tag = MainActivity.class.getSimpleName();

    TextView v1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello);

        /*Bundle extras = getIntent().getExtras();
        int sum = Integer.parseInt(extras.getString("distance"));*/
        v1 = (TextView) findViewById(R.id.textView2);

        v1.setText("hello"+getIntent().getStringExtra("distance"));
        System.out.println("Tag ++++++++++++++++++++++++++++++++++"+Tag);
        System.out.println("Tag ++++++++++++++++++++++++++++++++++"+Tag);
        System.out.println("Tag ++++++++++++++++++++++++++++++++++"+Tag);
        System.out.println("Tag ++++++++++++++++++++++++++++++++++"+Tag);
        System.out.println("Tag ++++++++++++++++++++++++++++++++++"+Tag);
        System.out.println("Tag ++++++++++++++++++++++++++++++++++"+Tag);
        System.out.println("Tag ++++++++++++++++++++++++++++++++++"+Tag);
        System.out.println("result==========================="+getIntent().getStringExtra("distance"));








    }
}