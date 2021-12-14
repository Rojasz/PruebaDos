package com.pruebados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText us,ps;
    Button BTN;
    String user,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BTN = (Button) findViewById(R.id.button);
        us = (EditText)findViewById(R.id.txt_user);
        ps = (EditText)findViewById(R.id.txt_pass);

        BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user = String.valueOf(us.getText());
                pass = String.valueOf(ps.getText());
                if (user.equals("adm123") && pass.equals("adm123")) {
                    Intent I = new Intent(getApplicationContext(), MainActivity2.class);
                    I.putExtra("TOTAL", "0");
                    I.putExtra("HH", "0");
                    I.putExtra("MM", "0");
                    startActivity(I);
                } else{
                    Toast.makeText(getApplicationContext(),"DATOS INCORRECTOS"+us.getText(),Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}























