package com.codewithdinesh.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class vector_pdf extends AppCompatActivity {
PDFView vector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vector_pdf);
        //for pdf
       vector = (PDFView) findViewById(R.id.pdf_vector);
      vector.fromAsset("vector.pdf").load();
    }
}
