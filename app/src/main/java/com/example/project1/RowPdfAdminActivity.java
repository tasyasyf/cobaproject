package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.File;

public class RowPdfAdminActivity extends AppCompatActivity {
    private WebView webView;
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_row_pdf_admin);

        WebView webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        String pdfPath = "file://" + Environment.getExternalStorageDirectory() + "/Book_file_local.pdf"; // Ganti nama file dengan yang sudah diunduh
        webView.loadUrl("https://docs.google.com/gview?embedded=true&url=" + pdfPath);



    }
}
