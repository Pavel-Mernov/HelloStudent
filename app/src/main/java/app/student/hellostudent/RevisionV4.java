package app.student.hellostudent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;



import androidx.appcompat.app.AppCompatActivity;

public class RevisionV4 extends AppCompatActivity {

    LinearLayout btn_next;
    LinearLayout btn_previous;
    TextView btn_exit;

    LinearLayout btnA;
    LinearLayout btnB;
    LinearLayout btnC;
    LinearLayout btnD;

    TextView letterA;
    TextView letterB;
    TextView letterC;
    TextView letterD;

    TextView textA;
    TextView textB;
    TextView textC;
    TextView textD;

    TextView textShow;
    ImageView imgLine;
    ImageView imgCorrect;

    private void restart()
    {
        try {
            letterA.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            letterB.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            letterC.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            letterD.setTextColor(getResources().getColor(R.color.colorPrimaryDark));

            textA.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            textB.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            textC.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            textD.setTextColor(getResources().getColor(R.color.colorPrimaryDark));

            textShow.setText("");
            textShow.setTextColor(getResources().getColor(R.color.colorDarkRed2));

            imgLine.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            imgCorrect.setVisibility(View.INVISIBLE);
        }
        catch (Exception e) {}
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_revision_v4);

        btnA = (LinearLayout) findViewById(R.id.btnA);
        btnB = (LinearLayout) findViewById(R.id.btnB);
        btnC = (LinearLayout) findViewById(R.id.btnC);
        btnD = (LinearLayout) findViewById(R.id.btnD);
        letterA = (TextView) findViewById(R.id.letterA);
        letterB = (TextView) findViewById(R.id.letterB);
        letterC = (TextView) findViewById(R.id.letterC);
        letterD = (TextView) findViewById(R.id.letterD);
        textA = (TextView) findViewById(R.id.textA);
        textB = (TextView) findViewById(R.id.textB);
        textC = (TextView) findViewById(R.id.textC);
        textD = (TextView) findViewById(R.id.textD);
        textShow = (TextView) findViewById(R.id.text_show);
        imgCorrect = (ImageView) findViewById(R.id.imgCorrect);
        imgLine = (ImageView) findViewById(R.id.img_line);

        try {

        } catch (Exception e) {}

        btn_next = (LinearLayout) findViewById(R.id.btnNext);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(RevisionV4.this, RevisionV5.class);
                    startActivity(intent);
                    finish();
                } catch (Exception error_next_a1_step2_sect2) {}
            }
        });

        btn_previous = (LinearLayout) findViewById(R.id.btnPrevious);
        btn_previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(RevisionV4.this, RevisionV3.class);
                    startActivity(intent);
                    finish();
                } catch (Exception error) {}
            }
        });

        btn_exit = (TextView) findViewById(R.id.btnExit);
        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(RevisionV4.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (Exception error) {}
            }
        });

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restart();
                letterA.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                textA.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                textShow.setText(textA.getText());
                textShow.setTextColor(getResources().getColor(R.color.colorDarkGreen));
                imgLine.setBackgroundColor(getResources().getColor(R.color.colorDarkGreen));
                imgCorrect.setBackground(getResources().getDrawable(R.drawable.button_green));
                imgCorrect.setImageDrawable(getResources().getDrawable(R.drawable.img_tick));
                imgCorrect.setVisibility(View.VISIBLE);
            }
        });

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restart();
                letterB.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                textB.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                textShow.setText(textB.getText());
                imgLine.setBackgroundColor(getResources().getColor(R.color.colorDarkRed2));
                imgCorrect.setBackground(getResources().getDrawable(R.drawable.button_red));
                imgCorrect.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                imgCorrect.setVisibility(View.VISIBLE);
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restart();
                letterC.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                textC.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                textShow.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                textShow.setText(textC.getText());
                imgLine.setBackgroundColor(getResources().getColor(R.color.colorDarkRed2));
                imgCorrect.setBackground(getResources().getDrawable(R.drawable.button_red));
                imgCorrect.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                imgCorrect.setVisibility(View.VISIBLE);
            }
        });

        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restart();
                letterD.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                textD.setTextColor(getResources().getColor(R.color.colorDarkRed2));
                textShow.setText(textD.getText());
                imgLine.setBackgroundColor(getResources().getColor(R.color.colorDarkRed2));
                imgCorrect.setBackground(getResources().getDrawable(R.drawable.button_red));
                imgCorrect.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                imgCorrect.setVisibility(View.VISIBLE);
            }
        });
    }
}
