package com.det.vas.detoxify;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    EditText ed_email, ed_pass;
    Button btn_sign;
    ImageView img_face, img_google, img_twitter;
    TextView txt_sign, txt_skip, txt_forgot;
    String email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed_email = (EditText) findViewById(R.id.ed_email);
        ed_pass = (EditText) findViewById(R.id.ed_pass);
        btn_sign = (Button) findViewById(R.id.btn_sign);
        img_face = (ImageView) findViewById(R.id.img_face);
        img_google = (ImageView) findViewById(R.id.img_google);
        img_twitter = (ImageView) findViewById(R.id.img_twitter);
        txt_sign = (TextView) findViewById(R.id.txt_sign);
        txt_skip = (TextView) findViewById(R.id.txt_skip);
        txt_forgot = (TextView) findViewById(R.id.txt_forgot);


        ed_email.setOnClickListener(this);
        ed_pass.setOnClickListener(this);
        btn_sign.setOnClickListener(this);
        img_face.setOnClickListener(this);
        img_google.setOnClickListener(this);
        img_twitter.setOnClickListener(this);
        txt_sign.setOnClickListener(this);
        txt_skip.setOnClickListener(this);
        txt_forgot.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v == txt_forgot) {
            final Dialog dialog = new Dialog(MainActivity.this);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            // Include dialog.xml file
            dialog.setContentView(R.layout.forgot_dailog);


            // Set dialog title
            dialog.setTitle("Custom Dialog");

            // set values for custom dialog components - text, image and button


            dialog.show();
        }

        if ((v == btn_sign)) {
            email = ed_email.getText().toString();
            password = ed_pass.getText().toString();


            if (email.equals("")) {
                ed_email.setError("Enter Email");
            } else if (password.equals("")) {
                ed_pass.setError("Enter Password");
            } else if (password.length() < 8) {
                Toast.makeText(getApplication(), "Password Should be contains minimum 8 characters", Toast.LENGTH_SHORT).show();
            } else {

                Intent in= new Intent(MainActivity.this,HomeScreen.class);
                startActivity(in);

            }
        }
    }
}
