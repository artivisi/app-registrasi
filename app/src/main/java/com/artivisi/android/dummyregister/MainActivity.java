package com.artivisi.android.dummyregister;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.scottyab.showhidepasswordedittext.ShowHidePasswordEditText;

public class MainActivity extends AppCompatActivity {

    private ShowHidePasswordEditText password;
    private Button btRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        password = (ShowHidePasswordEditText) findViewById(R.id.etPassword);
        btRegister = (Button) findViewById(R.id.btnRegister);
        btRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Berhasil Register", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
