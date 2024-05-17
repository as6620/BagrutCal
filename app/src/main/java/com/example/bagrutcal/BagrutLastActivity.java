package com.example.bagrutcal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BagrutLastActivity extends AppCompatActivity {
    TextView summary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bagrut_last);

        summary = (TextView) findViewById(R.id.summary);
        Intent bl = getIntent();

        int average = bl.getIntExtra("average" , 1);
        String name = bl.getStringExtra("name");
        int lashonGrade = bl.getIntExtra("lashonGrade" , 1);
        int safrutGrade = bl.getIntExtra("safrutGrade" , 1);
        int historyGrade = bl.getIntExtra("historyGrade" , 1);
        int ezrahotGrade = bl.getIntExtra("ezrahotGrade" , 1);
        int tanahGrade = bl.getIntExtra("tanahGrade" , 1);

        int gradeMath = bl.getIntExtra("gradeMath" , 1);
        int numMath = bl.getIntExtra("numMath" , 1);
        int gradeEnglish = bl.getIntExtra("gradeEnglish" , 1);
        int numEnglish = bl.getIntExtra("numEnglish" , 1);

        String OP1Str = bl.getStringExtra("OP1Str");
        int yahalOP1 = bl.getIntExtra("yahalOP1" , 1);
        int gradeOP1 = bl.getIntExtra("gradeOP1" , 1);

        String OP2Str = bl.getStringExtra("OP2Str");
        int yahalOP2 = bl.getIntExtra("yahalOP2" , 1);
        int gradeOP2 = bl.getIntExtra("gradeOP2" , 1);

        String OP3Str = bl.getStringExtra("OP3Str");
        int yahalOP3 = bl.getIntExtra("yahalOP3" , 1);
        int gradeOP3 = bl.getIntExtra("gradeOP3" , 1);

        String mavo = bl.getStringExtra("mavo");
        int yahalMavo = bl.getIntExtra("yahalMavo" , 1);
        int gradeMavo = bl.getIntExtra("gradeMavo" , 1);

        System.out.println("name: " + name + "            lashonGrade:" + lashonGrade + "");
    }

    public void goPrev2(View view) {finish();}
}