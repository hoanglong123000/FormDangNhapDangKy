package com.example.formdangnhapdangky;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    private TextView Reglink;
    private EditText name;
    private EditText pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//Transfer data in Bundle to username textview and password textview in Register activity.
        name =  (EditText) findViewById(R.id.nametxt);
        pass =  (EditText) findViewById(R.id.passwordtxt);

        Reglink = (TextView) findViewById(R.id.registerlink);
        Bundle a = getIntent().getExtras();
        name.setText(a.getString("username", "Default"));
        pass.setText(a.getString("password", "Default"));


        // Complete register page.
        Reglink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Regbtn();
            }
        });

    }


    // Function of register button.
    public void Regbtn()
    {
        Intent completeregister = new Intent(this, MainActivity.class);
        // Create a package bundle to store username textview and password textview from Register activity.

        startActivity(completeregister);
    }


}