package app.student.hellostudent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView btn_a1;
    TextView btn_a2;
    TextView btn_verbs_list;
    TextView btn_revision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_a1=(TextView) findViewById(R.id.btnA1);
        btn_a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(MainActivity.this, A1Steps.class);
                    startActivity(intent);
                    } catch (Exception error_a1) {}
            }
        });

        btn_a2=(TextView) findViewById(R.id.btnA2);
        btn_a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(MainActivity.this, A2Steps.class);
                    startActivity(intent);
                    } catch (Exception error_a2) {}
            }
        });

        btn_verbs_list=(TextView) findViewById(R.id.btnVerbsList);
        btn_verbs_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(MainActivity.this, VerbsListV1.class);
                    startActivity(intent);
                } catch (Exception error_goto_verbs_list) {}
            }
        });

        btn_revision = (TextView) findViewById(R.id.btnRevision);
        btn_revision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(MainActivity.this, RevisionV1.class);
                    startActivity(intent);
                } catch (Exception error_goto_revison) {}
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
