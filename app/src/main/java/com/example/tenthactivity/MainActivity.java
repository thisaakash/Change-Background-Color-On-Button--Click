package com.example.tenthactivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    ConstraintLayout c1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.dark);
        b2 = (Button) findViewById(R.id.light);
        c1 = (ConstraintLayout) findViewById(R.id.mainlayout);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c1.setBackgroundColor(Color.parseColor("#3498DB"));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c1.setBackgroundColor(Color.parseColor("#f39c12"));
            }
        });
    }
}