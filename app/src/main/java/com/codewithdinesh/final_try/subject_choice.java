package com.codewithdinesh.final_try;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;


public class subject_choice extends AppCompatActivity {
    Button btn_index, btn_prev, btn_com;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_choice);

            //for tool bar
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);

            //for navigation
            NavigationView nav = (NavigationView) findViewById(R.id.navmenu);
            // drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
            //this is for --- toggle

            drawerLayout = (DrawerLayout) findViewById(R.id.drawer1);//problem was here this is typecasting

            toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
            drawerLayout.addDrawerListener(toggle);//problem was here
            toggle.syncState();//problem was here

            //for navigation when we click what should happen
            nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    switch (menuItem.getItemId()) {
                        case R.id.menu_home:
                            Intent inn=new Intent(subject_choice.this,Nex.class);
                            startActivity(inn);

                            Toast.makeText(getApplicationContext(), "Home Panel is Open", Toast.LENGTH_LONG).show();
                            drawerLayout.closeDrawer(GravityCompat.START);
                            break;

                        case R.id.menu_about:

                            Intent intent = new Intent(subject_choice.this, about_us.class);
                            startActivity(intent);


                            Toast.makeText(getApplicationContext(), "About Panel is Open", Toast.LENGTH_LONG).show();
                            drawerLayout.closeDrawer(GravityCompat.START);
                            break;

                        case R.id.menu_rate:
                            Uri uri = Uri.parse("https://play.google.com/store/apps/details?" + getApplicationContext().getPackageName());
                            Intent in = new Intent(Intent.ACTION_VIEW, uri);
                            try {
                                startActivity(in);
                            } catch (Exception e) {
                                Toast.makeText(getApplicationContext(), "Rate Panel is unable to open.", Toast.LENGTH_LONG).show();
                                drawerLayout.closeDrawer(GravityCompat.START);
                            }

                            //Toast.makeText(getApplicationContext(), "Rate Panel is Open", Toast.LENGTH_LONG).show();

                            break;

                        case R.id.menu_share:
                            try {
                                Intent i = new Intent(Intent.ACTION_SEND);
                                i.setType("text/plain");
                                i.putExtra(Intent.EXTRA_SUBJECT, "final_try");
                                i.putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/detail?id=" + getApplicationContext().getPackageName());
                                startActivity(Intent.createChooser(i, "Share With"));

                                Toast.makeText(getApplicationContext(), "Share Panel is Open", Toast.LENGTH_LONG).show();
                                drawerLayout.closeDrawer(GravityCompat.START);
                            } catch (Exception e) {
                                Toast.makeText(getApplicationContext(), "Unable to share this app.", Toast.LENGTH_LONG).show();
                            }
                            //

                            break;


                    }
                    return true;
                }
            });


            btn_index = (Button) findViewById(R.id.button2);
            btn_index.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent in = new Intent(subject_choice.this, index_topic.class);
                    startActivity(in);
                }
            });


            btn_com = (Button) findViewById(R.id.activity3_3);
            btn_com.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent in = new Intent(subject_choice.this, compulsory_maths.class);
                    startActivity(in);
                }
            });

        btn_prev=(Button) findViewById(R.id.prev2);

        btn_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(subject_choice.this,Nex.class);
                startActivity(in);
            }
        });


        }
    }


