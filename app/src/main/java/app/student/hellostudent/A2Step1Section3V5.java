package app.student.hellostudent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class A2Step1Section3V5 extends AppCompatActivity {

    TextView btnExit;
    TextView btnRestart;

    LinearLayout btnNext;
    LinearLayout btnPrevious;

    TextView text_past_simple_correct;
    ImageView img_past_simple_correct;

    TextView text_past_simple_wrong;
    ImageView img_past_simple_wrong;

    TextView text_past_part_correct;
    ImageView img_past_part_correct;

    TextView text_past_part_wrong;
    ImageView img_past_part_wrong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2_step1_section3_v5);

        btnExit = (TextView) findViewById(R.id.btnExit);
        btnRestart = (TextView) findViewById(R.id.btnRestart);

        btnNext = (LinearLayout) findViewById(R.id.btnNext);
        btnPrevious = (LinearLayout) findViewById(R.id.btnPrevious);

        text_past_simple_correct = (TextView) findViewById(R.id.text_past_simple_correct);
        img_past_simple_correct = (ImageView) findViewById(R.id.img_past_simple_correct);

        text_past_simple_wrong = (TextView) findViewById(R.id.text_past_simple_wrong);
        img_past_simple_wrong = (ImageView) findViewById(R.id.img_past_simple_wrong);

        text_past_part_correct = (TextView) findViewById(R.id.text_past_part_correct);
        img_past_part_correct = (ImageView) findViewById(R.id.img_past_part_correct);

        text_past_part_wrong = (TextView) findViewById(R.id.text_past_part_wrong);
        img_past_part_wrong = (ImageView) findViewById(R.id.img_past_part_wrong);

        text_past_simple_correct.setTextSize(30);
        text_past_simple_wrong.setTextSize(30);
        text_past_part_correct.setTextSize(30);
        text_past_part_wrong.setTextSize(30);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(A2Step1Section3V5.this, A2Step1Section3V6.class);
                startActivity(intent);
                finish();
            }
        });

        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(A2Step1Section3V5.this, A2Step1Section3V4.class);
                startActivity(intent);
                finish();
            }
        });

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_past_simple_correct.setTextColor(getResources().getColor(R.color.colorPrimary));
                text_past_simple_wrong.setTextColor(getResources().getColor(R.color.colorPrimary));
                text_past_part_correct.setTextColor(getResources().getColor(R.color.colorPrimary));
                text_past_part_wrong.setTextColor(getResources().getColor(R.color.colorPrimary));

                img_past_simple_correct.setVisibility(View.INVISIBLE);
                img_past_simple_wrong.setVisibility(View.INVISIBLE);
                img_past_part_correct.setVisibility(View.INVISIBLE);
                img_past_part_wrong.setVisibility(View.INVISIBLE);
            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(A2Step1Section3V5.this, A2Step1.class);
                startActivity(intent);
                finish();
            }
        });

        text_past_simple_correct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    text_past_simple_wrong.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_past_simple_wrong.setTextSize(30);
                    text_past_simple_correct.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                    text_past_simple_correct.setTextSize(33);
                    img_past_simple_correct.setVisibility(View.VISIBLE);
                    img_past_simple_wrong.setVisibility(View.INVISIBLE);
                }
                catch (Exception e_past_simple_correct_click) {}
            }
        });

        text_past_simple_wrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    text_past_simple_correct.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_past_simple_correct.setTextSize(30);
                    text_past_simple_wrong.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                    text_past_simple_wrong.setTextSize(32);
                    img_past_simple_wrong.setVisibility(View.VISIBLE);
                    img_past_simple_correct.setVisibility(View.INVISIBLE);
                }
                catch (Exception e_past_simple_wrong_click) {}
            }
        });

        text_past_part_correct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    text_past_part_wrong.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_past_part_wrong.setTextSize(30);
                    text_past_part_correct.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                    text_past_part_correct.setTextSize(33);
                    img_past_part_correct.setVisibility(View.VISIBLE);
                    img_past_part_wrong.setVisibility(View.INVISIBLE);
                }
                catch (Exception e_past_part_correct_click) {}
            }
        });

        text_past_part_wrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    text_past_part_correct.setTextColor(getResources().getColor(R.color.colorPrimary));
                    text_past_part_correct.setTextSize(30);
                    text_past_part_wrong.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                    text_past_part_wrong.setTextSize(32);
                    img_past_part_wrong.setVisibility(View.VISIBLE);
                    img_past_part_correct.setVisibility(View.INVISIBLE);
                }
                catch (Exception e_past_part_wrong_click) {}
            }
        });

    }
}
