package com.example.laboratorio4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText edt_a, edt_b,edt_c;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_a=findViewById(R.id.etn_a);
        edt_b=findViewById(R.id.etn_b);
        edt_c=findViewById(R.id.etn_c);
        tv=findViewById(R.id.tv_res);
    }

    public void cal_for(View view){
        double a,b,c,x1, dis,x2;
        a=Float.parseFloat(edt_a.getText().toString());
        b=Float.parseFloat(edt_b.getText().toString());
        c=Float.parseFloat(edt_c.getText().toString());

        dis= Math.pow(b,2)-4*a*c;

        DecimalFormat df=new DecimalFormat("#.00");

        if(dis>0){
            x1=(-b+Math.sqrt(dis))/(2*a);
            x2=(-b-Math.sqrt(dis))/(2*a);

            tv.setText("Resultado: \nx1="+ String.valueOf(df.format(x1))+"\nx2="+String.valueOf(df.format(x2)));

        }else if(dis==0){
            x1=-b/(2*a);
            tv.setText("Resultado: \nx1="+ df.format(x1));
        }else{
            tv.setText("No hay resultado");
        }

    }
}