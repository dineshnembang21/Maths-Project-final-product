package com.codewithdinesh.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class trigonometry_pdf extends AppCompatActivity {
PDFView trigonometry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trigonometry_pdf);
    //for pdf
        trigonometry = (PDFView) findViewById(R.id.pdf_trigonometry);
   trigonometry.fromAsset("trigonometry.pdf").load();
    }
}
