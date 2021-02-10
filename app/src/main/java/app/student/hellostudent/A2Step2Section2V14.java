package app.student.hellostudent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class A2Step2Section2V14 extends AppCompatActivity {

    ImageView img_wrong1;
    ImageView img_wrong2;
    ImageView img_wrong3;
    ImageView img_correct;

    LinearLayout btn_next;
    LinearLayout btn_previous;

    TextView text_wrong1;
    TextView text_wrong2;
    TextView text_wrong3;
    TextView text_correct;

    TextView btn_exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2_step2_section2_v14);

        text_wrong1 = (TextView) findViewById(R.id.textWrong1);
        img_wrong1 = (ImageView) findViewById(R.id.imgWrong1);
        text_wrong2 = (TextView) findViewById(R.id.textWrong2);
        img_wrong2 = (ImageView) findViewById(R.id.imgWrong2);
        text_wrong3 = (TextView) findViewById(R.id.textWrong3);
        img_wrong3 = (ImageView) findViewById(R.id.imgWrong3);
        text_correct = (TextView) findViewById(R.id.textCorrect);
        img_correct = (ImageView) findViewById(R.id.imgCorrect);
        btn_next = (LinearLayout) findViewById(R.id.btnNext);
        btn_previous = (LinearLayout) findViewById(R.id.btnPrevious);
        btn_exit = (TextView) findViewById(R.id.btnExit);

        resize_text();

        text_wrong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    restart();
                    resize_text();
                    text_wrong1.setTextSize(38);
                    text_wrong1.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                    img_wrong1.setVisibility(View.VISIBLE);
                }  catch (Exception error_wrong1) {}

            }
        });

        text_wrong2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    restart();
                    resize_text();
                    text_wrong2.setTextSize(38);
                    text_wrong2.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                    img_wrong2.setVisibility(View.VISIBLE);
                } catch (Exception error_wrong2) {}
            }
        });

        text_wrong3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    restart();
                    resize_text();
                    text_wrong3.setTextSize(38);
                    text_wrong3.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                    img_wrong3.setVisibility(View.VISIBLE);
                } catch (Exception error_wrong3) {}
            }
        });

        text_correct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    restart();
                    resize_text();
                    text_correct.setTextSize(39);
                    text_correct.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                    img_correct.setVisibility(View.VISIBLE);
                } catch (Exception error_correct) {}
            }
        });

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(A2Step2Section2V14.this, A2Step2Section2V15.class);
                    startActivity(intent);
                    finish();
                } catch (Exception error_next_a1_step2_sect2) {}
            }
        });

        btn_previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(A2Step2Section2V14.this, A2Step2Section2V13.class);
                    startActivity(intent);
                    finish();
                } catch (Exception error_next_a1_step2_sect2) {}
            }
        });

        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(A2Step2Section2V14.this, A2Step2.class);
                    startActivity(intent);
                    finish();
                } catch (Exception error_exit_a1_step2_sect2) {}
            }
        });
    }

    private void resize_text()
    {
        text_wrong1.setTextSize(36);
        text_wrong2.setTextSize(36);
        text_wrong3.setTextSize(36);
        text_correct.setTextSize(36);
    }

    private void restart()
    {
        text_wrong1.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        text_wrong2.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        text_wrong3.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
        text_correct.setTextColor(getResources().getColor(R.color.colorPrimaryDark));

        img_wrong1.setVisibility(View.INVISIBLE);
        img_wrong2.setVisibility(View.INVISIBLE);
        img_wrong3.setVisibility(View.INVISIBLE);
        img_correct.setVisibility(View.INVISIBLE);
    }
}
