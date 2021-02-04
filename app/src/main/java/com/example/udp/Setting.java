package com.example.udp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Setting extends AppCompatActivity {

    Button save;
    EditText ip1,ip2,port1,port2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        save=findViewById(R.id.save);
        ip1=findViewById(R.id.ip1);
        ip2=findViewById(R.id.ip2);
        port1=findViewById(R.id.port1);
        port2=findViewById(R.id.port2);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Setting.this,MainActivity.class);
                i.putExtra("ip1",ip1.getText().toString());
                i.putExtra("ip2",ip2.getText().toString());
                i.putExtra("port1",Integer.parseInt(port1.getText().toString()));
                i.putExtra("port2",Integer.parseInt(port2.getText().toString()));
                startActivity(i);
            }
        });
    }
}