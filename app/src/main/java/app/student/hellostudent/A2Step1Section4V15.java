package app.student.hellostudent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class A2Step1Section4V15 extends AppCompatActivity {

    TextView btnCorrect;
    TextView btnWrong1;
    TextView btnWrong2;

    TextView btnCheck;
    TextView btnRestart;

    ImageView imgCorrect;
    ImageView imgWrong1;
    ImageView imgWrong2;

    LinearLayout btnPrevious;

    TextView btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2_step1_section4_v15);

        btnCorrect = (TextView) findViewById(R.id.btnCorrect);
        btnWrong1 = (TextView) findViewById(R.id.btnWrong1);
        btnWrong2 = (TextView) findViewById(R.id.btnWrong2);

        btnCheck = (TextView) findViewById(R.id.btnCheck);
        btnRestart = (TextView) findViewById(R.id.btnRestart);

        imgCorrect = (ImageView) findViewById(R.id.imgCorrect);
        imgWrong1 = (ImageView) findViewById(R.id.imgWrong1);
        imgWrong2 = (ImageView) findViewById(R.id.imgWrong2);
        btnPrevious = (LinearLayout) findViewById(R.id.btnPrevious);

        btnRestart = (TextView) findViewById(R.id.btnRestart);

        btnExit = (TextView) findViewById(R.id.btnExit);

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(A2Step1Section4V15.this, A2Step1.class);
                startActivity(intent);
                finish();
            }
        });

        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(A2Step1Section4V15.this, A2Step1Section4V14.class);
                startActivity(intent);
                finish();
            }
        });

        btnCorrect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnCorrect.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                btnWrong1.setTextColor(getResources().getColor(R.color.colorPrimary));
                btnWrong2.setTextColor(getResources().getColor(R.color.colorPrimary));
                imgCorrect.setVisibility(View.VISIBLE);
                imgWrong1.setVisibility(View.INVISIBLE);
                imgWrong2.setVisibility(View.INVISIBLE);
            }
        });

        btnWrong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnCorrect.setTextColor(getResources().getColor(R.color.colorPrimary));
                btnWrong1.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                btnWrong2.setTextColor(getResources().getColor(R.color.colorPrimary));
                imgCorrect.setVisibility(View.INVISIBLE);
                imgWrong1.setVisibility(View.VISIBLE);
                imgWrong2.setVisibility(View.INVISIBLE);
            }
        });

        btnWrong2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnCorrect.setTextColor(getResources().getColor(R.color.colorPrimary));
                btnWrong1.setTextColor(getResources().getColor(R.color.colorPrimary));
                btnWrong2.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                imgCorrect.setVisibility(View.INVISIBLE);
                imgWrong1.setVisibility(View.INVISIBLE);
                imgWrong2.setVisibility(View.VISIBLE);
            }
        });

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgCorrect.setVisibility(View.INVISIBLE);
                imgWrong1.setVisibility(View.INVISIBLE);
                imgWrong2.setVisibility(View.INVISIBLE);
                btnCorrect.setTextColor(getResources().getColor(R.color.colorPrimary));
                btnWrong1.setTextColor(getResources().getColor(R.color.colorPrimary));
                btnWrong2.setTextColor(getResources().getColor(R.color.colorPrimary));
            }
        });
    }
}
