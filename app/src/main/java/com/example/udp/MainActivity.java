package com.example.udp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton u,d,r,l,s;
    UDP_Client client1,client2;
    CheckBox r1,r2,mg;
    boolean r1_flag,r2_flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        r1=findViewById(R.id.r1);
        r2=findViewById(R.id.r2);
        mg=findViewById(R.id.mg);

        Intent i=getIntent();
        String ip1=i.getStringExtra("ip1");
        String ip2=i.getStringExtra("ip2");
        int port1=i.getIntExtra("port1",0);
        int port2=i.getIntExtra("port2",0);;

        //Toast.makeText(getApplicationContext(),""+ip1, Toast.LENGTH_LONG).show();
        try {
            client1=new UDP_Client(ip1,port1);
            //client1.send("sfsdfsdfsd");
            client2=new UDP_Client(ip2,port2);
            //client2.send("33333");
        }
        catch (Exception e)
        {
            finish();
        }

        r1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
               r1_flag=b;
                Toast.makeText(getApplicationContext(),""+b, Toast.LENGTH_SHORT).show();
            }
        });


        r2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                r2_flag=b;
                Toast.makeText(getApplicationContext(),""+b, Toast.LENGTH_SHORT).show();
            }
        });

        mg.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(!b)
                {
                    client1.send("m");
                }
                Toast.makeText(getApplicationContext(),""+b, Toast.LENGTH_SHORT).show();
            }
        });

        u=findViewById(R.id.upb);
        u.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    try {
                        if(r1_flag)
                            client1.send("f");
                        if (r2_flag)
                            client2.send("f");
                    }
                    catch (Exception e)
                    {

                    }
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    try {
                        if(r1_flag)
                            client1.send("s");
                        if (r2_flag)
                            client2.send("s");
                    }
                    catch (Exception e)
                    {

                    }
                }

                return true;
            }
        });

        d=findViewById(R.id.db);
        d.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    try {
                        if(r1_flag)
                            client1.send("b");
                        if (r2_flag)
                            client2.send("b");
                    }
                    catch (Exception e)
                    {

                    }
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    try {
                        if(r1_flag)
                            client1.send("s");
                        if (r2_flag)
                            client2.send("s");
                    }
                    catch (Exception e)
                    {

                    }
                }

                return true;
            }
        });


        r=findViewById(R.id.rb);
        r.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    try {
                        if(r1_flag)
                            client1.send("r");
                        if (r2_flag)
                            client2.send("r");
                    }
                    catch (Exception e)
                    {

                    }
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    try {
                        if(r1_flag)
                            client1.send("s");
                        if (r2_flag)
                            client2.send("s");
                    }
                    catch (Exception e)
                    {

                    }
                }

                return true;
            }
        });

        l=findViewById(R.id.lb);
        l.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    try {
                        if(r1_flag)
                            client1.send("l");
                        if (r2_flag)
                            client2.send("l");
                    }
                    catch (Exception e)
                    {

                    }
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    try {
                        if(r1_flag)
                            client1.send("s");
                        if (r2_flag)
                            client2.send("s");
                    }
                    catch (Exception e)
                    {

                    }
                }

                return true;
            }
        });

        s=findViewById(R.id.sb);
        s.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    try {
                        if(r1_flag)
                            client1.send("s");
                        if (r2_flag)
                            client2.send("s");
                    }
                    catch (Exception e)
                    {

                    }
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    try {
                        if(r1_flag)
                            client1.send("s");
                        if (r2_flag)
                            client2.send("s");
                    }
                    catch (Exception e)
                    {

                    }
                }

                return true;
            }
        });
    }
}