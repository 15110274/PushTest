package com.example.tanph.pushtest;


import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;
import com.microsoft.appcenter.push.Push;

public class MainActivity extends AppCompatActivity {

    TextView txtHello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCenter.start(getApplication(), "450852e1-e631-4f42-b3d8-20cc320e9808", Analytics.class, Crashes.class, Push.class);



        txtHello=findViewById(R.id.txtHello);
        txtHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConstraintLayout constraintLayout = findViewById(R.id.layout);
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            }
        });
        txtHello.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ConstraintLayout constraintLayout = findViewById(R.id.layout);
                constraintLayout.setBackgroundColor(getResources().getColor(R.color.white));
                return false;
            }
        });
    }
}

