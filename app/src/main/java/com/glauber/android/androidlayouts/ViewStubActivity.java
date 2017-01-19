package com.glauber.android.androidlayouts;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;

public class ViewStubActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_stub);

        Button inflateStubButton = (Button) findViewById(R.id.inflate_view_stub);
        inflateStubButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ViewStub) findViewById(R.id.view_stub)).inflate();
            }
        });


    }
}
