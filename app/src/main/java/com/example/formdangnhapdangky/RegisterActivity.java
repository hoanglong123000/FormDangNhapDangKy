package com.example.formdangnhapdangky;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    private TextView BackToLoginPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        BackToLoginPage = (TextView) findViewById(R.id.BacktoLoginLink);
        BackToLoginPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    BacktoMainActivity();
            }
        });

    }

    public void BacktoMainActivity()
    {
        Intent backtoMainActivity = new Intent(this, MainActivity.class);
        startActivity(backtoMainActivity);
    }



}