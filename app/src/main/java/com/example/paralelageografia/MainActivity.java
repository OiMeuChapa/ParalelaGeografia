package com.example.paralelageografia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Promo1(View view) {


        Toast.makeText(this , "Sopa de Macaco R$ 50.00" , Toast.LENGTH_SHORT).show();
    }

    public void Promo2(View view) {


        Toast.makeText(this , "Buchada de Bode R$ 70.00" , Toast.LENGTH_SHORT).show();
    }

    public void Promo3(View view) {


        Toast.makeText(this , "Pao Com Linguica R$ 80.00" , Toast.LENGTH_SHORT).show();
    }

    public void Promo4(View view) {
      ;

        Toast.makeText(this , "Melancia R$ 150.00" , Toast.LENGTH_SHORT).show();
    }
}

