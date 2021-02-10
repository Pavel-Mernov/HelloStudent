package app.student.hellostudent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class A1Step3Sections extends AppCompatActivity {
    TextView section1, section2, section3, section4;
    TextView exit_step;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1_step3_sections);

        exit_step = (TextView) findViewById(R.id.textViewA1Step3ExitStep);
        exit_step.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(A1Step3Sections.this, A1Steps.class);
                    startActivity(intent);
                    finish();
                 } catch (Exception e_exit_step) {}
            }
        });

        section1 = (TextView) findViewById(R.id.textViewA1Step3Section1);
        section1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(A1Step3Sections.this, A1Step3Section1.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e_sect1) {}
            }
        });
        section2 = (TextView) findViewById(R.id.textViewA1Step3Section2);
        section2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(A1Step3Sections.this, A1Step3Section2V1.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e_sect2) {}
            }
        });
        section3 = (TextView) findViewById(R.id.textViewA1Step3Section3);
        section3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(A1Step3Sections.this, A1Step3Section3.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e_step3) {}
            }
        });
        section4 = (TextView) findViewById(R.id.textViewA1Step3Section4);
        section4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(A1Step3Sections.this, A1Step3Section4Question1.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e_step4) {}
            }
        });
    }
}
