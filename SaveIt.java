package com.example.cechuser.saveit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;
import android.widget.EditText;

import static com.example.cechuser.saveit.R.id.verificationSkip;
import static com.example.cechuser.saveit.R.layout.activity_save_it;


public class SaveIt extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";

    Button verificationSkip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_save_it);
    }


    public void PictureScreen(View v){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        View myView = findViewById(verificationSkip);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, "Hello");
        startActivity(intent);

    }

}

