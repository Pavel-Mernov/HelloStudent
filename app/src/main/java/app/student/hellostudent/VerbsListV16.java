package app.student.hellostudent;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.Locale;

public class VerbsListV16 extends AppCompatActivity {

    ConstraintLayout btnExit;
    ConstraintLayout btnNext;
    ConstraintLayout btnPrevious;
    private TextToSpeech TTS;
    ImageView imgSay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verbs_list_v16);

        btnExit = (ConstraintLayout) findViewById(R.id.btnExit);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(VerbsListV16.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (Exception verbs_list_exit_error) {}
            }
        });
        btnNext = (ConstraintLayout) findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(VerbsListV16.this, VerbsListV17.class);
                    startActivity(intent);
                    finish();
                } catch (Exception v1_next_error) {};
            }
        });
        btnPrevious = (ConstraintLayout) findViewById(R.id.btnPrevious);
        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(VerbsListV16.this, VerbsListV15.class);
                    startActivity(intent);
                    finish();
                } catch (Exception v1_next_error) {};
            }
        });

        imgSay = (ImageView) findViewById(R.id.imgSay);

        TTS = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS)
                {
                    int result = TTS.setLanguage(Locale.ENGLISH);

                    if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED)
                    {
                        Log.e("TTS", "Lang not supported");
                        return;
                    }
                }
                else
                {
                    Log.e("TTS", "Initialization failed");
                }
            }
        });

        imgSay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speak();
            }
        });
    }

    private void speak()
    {
        String text = "Eat. Ate. Eaten.";
        float pitch = (float) 0.8;
        float speed = (float) 1;

        TTS.setPitch(pitch);
        TTS.setSpeechRate(speed);
        TTS.speak(text, TextToSpeech.QUEUE_FLUSH, null);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        if (TTS != null)
        {
            TTS.stop();
            TTS.shutdown();
        }

        super.onDestroy();
    }


}
