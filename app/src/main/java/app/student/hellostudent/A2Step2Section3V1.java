package app.student.hellostudent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class A2Step2Section3V1 extends AppCompatActivity {
    TextView btnExit;
    EditText input_main;
    TextView btnCheck;
    TextView btnRestart;
    ImageView imgCorrect;
    LinearLayout btnNext;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a2_step2_section3_v1);

        btnExit = (TextView) findViewById(R.id.btnExit);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(A2Step2Section3V1.this, A2Step2.class);
                startActivity(intent);
                finish();
            }
        });

        btnNext = (LinearLayout) findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(A2Step2Section3V1.this, A2Step2Section3V2.class);
                startActivity(intent);
                finish();
            }
        });

        imgCorrect = (ImageView) findViewById(R.id.imgCorrect);

        input_main = (EditText) findViewById(R.id.text_input);
        input_main.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                imgCorrect.setVisibility(View.INVISIBLE);
            }
        });

        btnCheck = (TextView) findViewById(R.id.btnCheck);
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input_main.getText().toString().trim().equals("hurt"))
                {
                    imgCorrect.setImageDrawable(getResources().getDrawable(R.drawable.img_tick));
                    imgCorrect.setBackground(getResources().getDrawable(R.drawable.button_green));
                    imgCorrect.setVisibility(View.VISIBLE);
                }
                else if (!(input_main.getText().toString().trim().equals("")))
                {
                    imgCorrect.setImageDrawable(getResources().getDrawable(R.drawable.img_cross));
                    imgCorrect.setBackground(getResources().getDrawable(R.drawable.button_red));
                    imgCorrect.setVisibility(View.VISIBLE);
                }
            }
        });

        btnRestart = (TextView) findViewById(R.id.btnRestart);
        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgCorrect.setVisibility(View.INVISIBLE);
                input_main.setText("");
                closeKeyboard();
            }
        });

    }

    @Override
    protected void onStop() {
        super.onStop();
    }


    @Override
    protected void onStart() {super.onStart(); }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onPause() { super.onPause(); }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
    private void closeKeyboard()
    {
        View v = this.getCurrentFocus();
        if (v != null)
        {
            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(v.getWindowToken(), 0);

        }
    }
}
