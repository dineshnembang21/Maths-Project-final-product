package com.codewithdinesh.final_try;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class statistics_pdf extends AppCompatActivity {
PDFView statistics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics_pdf);
        //for pdf
        statistics = (PDFView) findViewById(R.id.pdf_statistics);
        statistics.fromAsset("statistics.pdf").load();
    }
}
