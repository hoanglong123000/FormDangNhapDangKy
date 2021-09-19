package com.example.formdangnhapdangky;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private TextView ToRegisterPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToRegisterPage = (TextView) findViewById(R.id.registerlink);
        ToRegisterPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenRegisterPage();
            }
        });
    }

    public void OpenRegisterPage()
    {
        Intent toRegisterpage = new Intent(this, RegisterActivity.class);
        startActivity(toRegisterpage);
    }
}