package com.juliarmanumar.resepmasakan;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.sufficientlysecure.htmltextview.HtmlTextView;

public class Tampilan_Resep extends AppCompatActivity {

    private TextView tv_judul;
    private HtmlTextView content_resep;
    private  HtmlTextView tv_bahan;
    private ImageView header_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan__resep);

        header_img = (ImageView) findViewById(R.id.header);
        tv_judul = (TextView) findViewById(R.id.tv_title);
        content_resep = (HtmlTextView) findViewById(R.id.show_resep);
        tv_bahan = (HtmlTextView) findViewById(R.id.bahan_resep);



        String title = getIntent().getStringExtra("judul");
        tv_judul.setText(title);

        String bahan = getIntent().getStringExtra("bahan");
        tv_bahan.setHtml(bahan);

        String content = getIntent().getStringExtra("content");
        content_resep.setHtml(content);


        int image = getIntent().getIntExtra("gambar", 0);
        header_img.setImageResource(image);




    }
}
