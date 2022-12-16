package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         private NumberFormat nf =
                NumberFormat.getInstance(new Locale("us","US"));
        public NumberFormat getNumberFormat()
        {
            return nf;
        }
        public String getFormattedNmbr(double i)
        {
            return nf.format(i);
        }
    }

}