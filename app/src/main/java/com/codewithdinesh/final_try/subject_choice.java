package com.codewithdinesh.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class subject_choice extends AppCompatActivity {
    Button btn_index,btn_prev,btn_com;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_choice);




                btn_index=(Button) findViewById(R.id.button2);

                btn_index.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent in=new Intent(subject_choice.this,index_topic.class);
                        startActivity(in);
                    }
                });



                btn_com=(Button) findViewById(R.id.activity3_3);

                btn_com.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent in=new Intent(subject_choice.this,compulsory_maths.class);
                        startActivity(in);
                    }
                });

            }
        }

