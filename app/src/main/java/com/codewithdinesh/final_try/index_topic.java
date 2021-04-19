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

public class index_topic extends AppCompatActivity {
    Button  btn_prev;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;

    Button btn_algebra,btn_matrix,btn_coordinate,btn_statistics,btn_transformation,btn_trigonometry,btn_vector,btn_limit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index_topic);
  //
        //for tool bar
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //for navigation
        NavigationView nav = (NavigationView) findViewById(R.id.navmenu);
        // drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        //this is for --- toggle

        drawerLayout =(DrawerLayout)findViewById(R.id.drawer1);//problem was here this is typecasting

        toggle = new ActionBarDrawerToggle(this,drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);//problem was here
        toggle.syncState();//problem was here

        //for navigation when we click what should happen
        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.menu_home:
                        Intent inn=new Intent(index_topic.this,Nex.class);
                        startActivity(inn);

                        Toast.makeText(getApplicationContext(), "Home Panel is Open", Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.menu_about:

                        Intent intent=new Intent(index_topic.this,about_us.class);
                        startActivity(intent);


                        Toast.makeText(getApplicationContext(), "About Panel is Open", Toast.LENGTH_LONG).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.menu_rate:
                        Uri uri=Uri.parse("https://play.google.com/store/apps/details?"+getApplicationContext().getPackageName());
                        Intent in=new Intent(Intent.ACTION_VIEW,uri);
                        try{
                            startActivity(in);
                        }catch (Exception e){
                            Toast.makeText(getApplicationContext(), "Rate Panel is unable to open.", Toast.LENGTH_LONG).show();
                            drawerLayout.closeDrawer(GravityCompat.START);
                        }

                        //Toast.makeText(getApplicationContext(), "Rate Panel is Open", Toast.LENGTH_LONG).show();

                        break;

                    case R.id.menu_share:
                        try{
                            Intent i=new Intent(Intent.ACTION_SEND);
                            i.setType("text/plain");
                            i.putExtra(Intent.EXTRA_SUBJECT,"final_try");
                            i.putExtra(Intent.EXTRA_TEXT,"https://play.google.com/store/apps/detail?id="+getApplicationContext().getPackageName());
                            startActivity(Intent.createChooser(i,"Share With"));

                            Toast.makeText(getApplicationContext(), "Share Panel is Open", Toast.LENGTH_LONG).show();
                            drawerLayout.closeDrawer(GravityCompat.START);
                        }catch (Exception e){
                            Toast.makeText(getApplicationContext(), "Unable to share this app.", Toast.LENGTH_LONG).show();
                        }
                        //

                        break;


                }
                return true;
            }
        });





//
        btn_algebra=(Button) findViewById(R.id.button11);

        btn_algebra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(index_topic.this,algebra_pdf.class);
                startActivity(in);
            }
        });

        btn_coordinate=(Button) findViewById(R.id.button14);

        btn_coordinate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(index_topic.this,coordinate_pdf.class);
                startActivity(in);
            }
        });

        btn_matrix=(Button) findViewById(R.id.button13);

        btn_matrix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(index_topic.this,matrix_pdf.class);
                startActivity(in);
            }
        });

        btn_statistics=(Button) findViewById(R.id.button19);

        btn_statistics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(index_topic.this,statistics_pdf.class);
                startActivity(in);
            }
        });

        btn_transformation=(Button) findViewById(R.id.button18);

        btn_transformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(index_topic.this,transformation_pdf.class);
                startActivity(in);
            }
        });

        btn_trigonometry=(Button) findViewById(R.id.button15);

        btn_trigonometry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(index_topic.this,trigonometry_pdf.class);
                startActivity(in);
            }
        });

        btn_vector=(Button) findViewById(R.id.button16);

        btn_vector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(index_topic.this,vector_pdf.class);
                startActivity(in);
            }
        });

        btn_limit=(Button) findViewById(R.id.button12);

        btn_limit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(index_topic.this,limit_pdf.class);
                startActivity(in);
            }
        });

        btn_prev=(Button) findViewById(R.id.prev2);

        btn_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(index_topic.this,subject_choice.class);
                startActivity(in);
            }
        });

    }
}
