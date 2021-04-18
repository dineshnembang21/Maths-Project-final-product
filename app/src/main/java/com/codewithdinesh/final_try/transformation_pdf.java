package com.codewithdinesh.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class transformation_pdf extends AppCompatActivity {
PDFView transformation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transformation_pdf);
        //for pdf
        transformation= (PDFView) findViewById(R.id.pdf_transformation);
       transformation.fromAsset("transformation.pdf").load();
    }
}
