package com.codewithdinesh.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class limit_pdf extends AppCompatActivity {
    PDFView limit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_limit_pdf);

        limit = (PDFView) findViewById(R.id.pdf_limit);
        limit.fromAsset("limit.pdf").load();
    }
}
