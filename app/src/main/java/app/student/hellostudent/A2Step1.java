package app.student.hellostudent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class A2Step1 extends AppCompatActivity {

    TextView btnSection1;
    TextView btnSection2;
    TextView btnSection3;
    TextView btnSection4;
    TextView btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2_step1);

        btnSection1 = (TextView) findViewById(R.id.btnSection1);
        btnSection1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(A2Step1.this, A2Step1Section1.class);
                startActivity(intent);
                finish();
            }
        });

        btnSection2 = (TextView) findViewById(R.id.btnSection2);
        btnSection2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(A2Step1.this, A2Step1Section2.class);
                    startActivity(intent);
                    finish();
                }
                catch (Exception error_sect2) {};
            }
        });

        btnSection3 = (TextView) findViewById(R.id.btnSection3);
        btnSection3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(A2Step1.this, A2Step1Section3V1.class);
                    startActivity(intent);
                    finish();
                }
                catch (Exception error_sect3) {};
            }
        });

        btnSection4 = (TextView) findViewById(R.id.btnSection4);
        btnSection4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(A2Step1.this, A2Step1Section4V1.class);
                startActivity(intent);
                finish();
            }
        });

        btnExit = (TextView) findViewById(R.id.btnExit);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(A2Step1.this, A2Steps.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
