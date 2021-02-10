package app.student.hellostudent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class A2Step3Section3V8 extends AppCompatActivity {

    TextView btnCorrect;
    TextView btnWrong1;
    TextView btnWrong2;

    ImageView imgCorrect;

    TextView text_show;
    ImageView img_line;

    LinearLayout btnNext;
    LinearLayout btnPrevious;

    TextView btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2_step3_section3_v8);

        btnCorrect = (TextView) findViewById(R.id.btnCorrect);
        btnWrong1 = (TextView) findViewById(R.id.btnWrong1);
        btnWrong2 = (TextView) findViewById(R.id.btnWrong2);

        imgCorrect = (ImageView) findViewById(R.id.imgCorrect);
        imgCorrect.setVisibility(View.INVISIBLE);

        btnNext = (LinearLayout) findViewById(R.id.btnNext);
        btnPrevious = (LinearLayout) findViewById(R.id.btnPrevious);

        btnExit = (TextView) findViewById(R.id.btnExit);

        text_show = (TextView) findViewById(R.id.text_show);

        img_line = (ImageView) findViewById(R.id.img_line);

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(A2Step3Section3V8.this, A2Step3.class);
                startActivity(intent);
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(A2Step3Section3V8.this, A2Step3Section3V9.class);
                startActivity(intent);
                finish();
            }
        });

        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(A2Step3Section3V8.this, A2Step3Section3V7.class);
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
                imgCorrect.setImageDrawable(getResources().getDrawable(R.drawable.img_tick));
                imgCorrect.setBackground(getResources().getDrawable(R.drawable.button_green));
                imgCorrect.setVisibility(View.VISIBLE);
                img_line.setBackgroundColor(getResources().getColor(R.color.colorDarkGreen));
                text_show.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                text_show.setText(btnCorrect.getText());
            }
        });

        btnWrong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnCorrect.setTextColor(getResources().getColor(R.color.colorPrimary));
                btnWrong1.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                btnWrong2.setTextColor(getResources().getColor(R.color.colorPrimary));
                imgCorrect.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                imgCorrect.setBackground(getResources().getDrawable(R.drawable.button_red));
                imgCorrect.setVisibility(View.VISIBLE);
                img_line.setBackgroundColor(getResources().getColor(R.color.colorDarkRed2));
                text_show.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                text_show.setText(btnWrong1.getText());
            }
        });

        btnWrong2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnCorrect.setTextColor(getResources().getColor(R.color.colorPrimary));
                btnWrong1.setTextColor(getResources().getColor(R.color.colorPrimary));
                btnWrong2.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                imgCorrect.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                imgCorrect.setBackground(getResources().getDrawable(R.drawable.button_red));
                imgCorrect.setVisibility(View.VISIBLE);
                imgCorrect.setVisibility(View.VISIBLE);
                img_line.setBackgroundColor(getResources().getColor(R.color.colorDarkRed2));
                text_show.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                text_show.setText(btnWrong2.getText());
            }
        });
    }
}
