package com.codewithdinesh.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class coordinate_pdf extends AppCompatActivity {
PDFView coordinate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinate_pdf);
        //for pdf
        coordinate = (PDFView) findViewById(R.id.pdf_coordinate);
        coordinate.fromAsset("coordinate.pdf").load();
    }
}
