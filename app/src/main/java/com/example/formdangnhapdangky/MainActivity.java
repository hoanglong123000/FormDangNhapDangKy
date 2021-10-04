package com.example.formdangnhapdangky;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private  EditText USERNAME;
    private  EditText PASSWORD;
    private TextView BackToLoginPage;
    private Button Regbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        USERNAME =  (EditText) findViewById(R.id.registerusername);
        PASSWORD =  (EditText) findViewById(R.id.registerpasswordtxt);




        // Return to Login page.
        BackToLoginPage = (TextView) findViewById(R.id.backtoLoginLink);
        BackToLoginPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BacktoMainActivity();
            }
        });

        // Function of Register button.
        Regbtn = (Button) findViewById(R.id.registerbtn);
        Regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Regisbtn();
            }
        });


    }

    public void Regisbtn()
    {
        Intent finnishedreg = new Intent(this, RegisterActivity.class);
        Bundle a = new Bundle();
        a.putString("username", USERNAME.getText().toString());
        a.putString("password", PASSWORD.getText().toString());
        finnishedreg.putExtras(a);

        startActivity(finnishedreg);
    }

    // function of back to login page.
    public void BacktoMainActivity()
    {
        Intent backtoMainActivity = new Intent(this, RegisterActivity.class);

        startActivity(backtoMainActivity);
    }

}