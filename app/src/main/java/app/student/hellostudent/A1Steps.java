package app.student.hellostudent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class A1Steps extends AppCompatActivity {
    TextView btn_step1;
    TextView btn_step2;
    TextView btn_step3;
    TextView btn_change_level;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a1_steps);

        btn_step1 = (TextView) findViewById(R.id.btn_a1_step1);
        btn_step1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(A1Steps.this, A1Step1Sections.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e_go_to_step_2) {}
            }
        });

        btn_step2 = (TextView) findViewById(R.id.btn_a1_step2);
        btn_step2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(A1Steps.this, A1Step2Sections.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e_go_to_step_2) {}
            }
        });

        btn_step3 = (TextView) findViewById(R.id.btn_a1_step3);
        btn_step3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(A1Steps.this, A1Step3Sections.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e_go_to_step_3) {}
            }
        });

        btn_change_level = (TextView) findViewById(R.id.btn_a1_change_level);
        btn_change_level.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(A1Steps.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e_change_step) {}
            }
        });
    }
}
