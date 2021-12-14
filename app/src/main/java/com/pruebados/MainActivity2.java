package com.pruebados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView tv_total,tv_h,tv_m;
    ImageButton BTN_FOTO;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv_total= (TextView) findViewById(R.id.txt_total);
        tv_h= (TextView) findViewById(R.id.txt_hombres);
        tv_m= (TextView) findViewById(R.id.txt_mujeres);
        BTN_FOTO=(ImageButton)findViewById(R.id.imageButton);
        Bundle B = getIntent().getExtras();
        tv_total.setText(""+B.getString("TOTAL"));
        tv_h.setText(""+B.getString("HH"));
        tv_m.setText(""+B.getString("MM"));
        BTN_FOTO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(getApplicationContext(),MainActivity3.class);
                String total_tmp = tv_total.getText().toString();
                String total_hh = tv_h.getText().toString();
                String total_mm = tv_m.getText().toString();
                I.putExtra("TOTAL", total_tmp);
                I.putExtra("HH", total_hh);
                I.putExtra("MM", total_mm);
                startActivity(I);
            }
        });
    }
}



















