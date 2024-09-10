package com.gauravpatil.kindnesscabinet.AboutUs;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.gauravpatil.kindnesscabinet.R;

public class About_Us_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        // Email Click
        TextView tvEmail = findViewById(R.id.tvEmail);
        tvEmail.setOnClickListener(v -> {
            Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
            emailIntent.setData(Uri.parse("mailto:support@kindnesscabinet.com"));
            startActivity(emailIntent);
        });

        // Website Click
        TextView tvWebsite = findViewById(R.id.tvWebsite);
        tvWebsite.setOnClickListener(v -> {
            Intent webIntent = new Intent(Intent.ACTION_VIEW);
            webIntent.setData(Uri.parse("https://ppl-ai-code-interpreter-files.s3.amazonaws.com/web/direct-files/3c95afb04807eb299d0d8a2bb78e755f/325ea452-5cd4-45d8-a46d-911314f65e60/index.html?utm_source=perplexity"));
            startActivity(webIntent);
        });

        Toast.makeText(this, "About Us", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "About Us", Toast.LENGTH_SHORT).show();
    }
}