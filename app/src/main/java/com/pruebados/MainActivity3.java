package com.pruebados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    String tv_total,tv_h,tv_m;
    Button btn_contar;
    Spinner SP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btn_contar = (Button)findViewById(R.id.button2);
        SP = (Spinner)findViewById(R.id.spinner);

        Bundle B = getIntent().getExtras();
        tv_total=(""+B.getString("TOTAL"));
        tv_h=(""+B.getString("HH"));
        tv_m=(""+B.getString("MM"));

        btn_contar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(SP.getSelectedItemPosition()==0)
                {
                    Toast.makeText(getApplicationContext(),"COMPLETE LA INFORMACION",Toast.LENGTH_LONG).show();
                }
                else
                {
                    int total_hh = 0;
                    int total_mm = 0;
                    int total_tmp = Integer.parseInt(tv_total)+1;
                    if(SP.getSelectedItemPosition()==1) {
                        total_hh = Integer.parseInt(tv_h) + 1;
                        total_mm = Integer.parseInt(tv_m);
                    }else {
                        total_mm = Integer.parseInt(tv_m) + 1;
                        total_hh = Integer.parseInt(tv_h);
                    }
                    Intent I = new Intent(getApplicationContext(),MainActivity2.class);
                    I.putExtra("TOTAL", total_tmp+"");
                    I.putExtra("HH", total_hh+"");
                    I.putExtra("MM", total_mm+"");
                    startActivity(I);
                }
            }
        });
    }
}
















