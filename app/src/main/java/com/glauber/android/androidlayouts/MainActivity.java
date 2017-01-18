package com.glauber.android.androidlayouts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button launchLinearButton = (Button) findViewById(R.id.launch_activity_linear_layout);
        launchLinearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), LinearLayoutActivity.class);
                startActivity(intent);
            }
        });

        Button launchRelativeButton = (Button) findViewById(R.id.launch_activity_relative_layout);
        launchRelativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RelativeLayoutActivity.class);
                startActivity(intent);
            }
        });

        Button launchRelative2Button = (Button) findViewById(R.id.launch_activity_relative2_layout);
        launchRelative2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), RelativeLayout2Activity.class);
                startActivity(intent);
            }
        });

        Button launchFrameButton = (Button) findViewById(R.id.launch_activity_frame_layout);
        launchFrameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), FrameLayoutActivity.class);
                startActivity(intent);
            }
        });

        Button launchFrame2Button = (Button) findViewById(R.id.launch_activity_frame2_layout);
        launchFrame2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), FrameLayout2Activity.class);
                startActivity(intent);
            }
        });

        Button launchTableButton = (Button) findViewById(R.id.launch_activity_table_layout);
        launchTableButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), TableLayoutActivity.class);
                startActivity(intent);
            }
        });

    }
}
