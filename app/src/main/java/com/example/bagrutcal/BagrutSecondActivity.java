package com.example.bagrutcal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BagrutSecondActivity extends AppCompatActivity {
    SeekBar seekBar;
    TextView tVOP1, tVOP2, tVOP3, mavo, tVMavo;
    EditText eTNumMath, eTGradeMath, etTNumEnglish, eTGradeEnglish, eTOP1, gradeOP1, eTOP2,gradeOP2, eTOP3, gradeOP3, gradeMavo;
    int op = 5;
    int mavoYahal = 1;
    int bonusME5 = 30;
    int bonusME4 = 15;
    int bonus5 = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bagrut_second);

        initViews();

        eTOP1.setVisibility(View.INVISIBLE);
        gradeOP1.setVisibility(View.INVISIBLE);
        tVOP1.setVisibility(View.INVISIBLE);
        eTOP2.setVisibility(View.INVISIBLE);
        gradeOP2.setVisibility(View.INVISIBLE);
        tVOP2.setVisibility(View.INVISIBLE);
        eTOP3.setVisibility(View.INVISIBLE);
        gradeOP3.setVisibility(View.INVISIBLE);
        tVOP3.setVisibility(View.INVISIBLE);
        mavo.setVisibility(View.INVISIBLE);
        tVMavo.setVisibility(View.INVISIBLE);
        gradeMavo.setVisibility(View.INVISIBLE);
    }
    private void initViews() {
        eTNumMath = (EditText) findViewById(R.id.eTNumMath);
        eTGradeMath = (EditText) findViewById(R.id.eTGradeMath);
        etTNumEnglish = (EditText) findViewById(R.id.eTNumEnglish);
        eTGradeEnglish = (EditText) findViewById(R.id.eTGradeEnglish);

        seekBar = (SeekBar) findViewById(R.id.seekBar);

        eTOP1 = (EditText) findViewById(R.id.eTOP1);
        tVOP1 = (TextView) findViewById(R.id.tVOP1);
        gradeOP1 = (EditText) findViewById(R.id.gradeOP1);
        eTOP2 = (EditText) findViewById(R.id.eTOP2);
        tVOP2 = (TextView) findViewById(R.id.tVOP2);
        gradeOP2 = (EditText) findViewById(R.id.gradeOP2);
        eTOP3 = (EditText) findViewById(R.id.eTOP3);
        tVOP3 = (TextView) findViewById(R.id.tVOP3);
        gradeOP3 = (EditText) findViewById(R.id.gradeOP3);
        mavo = (TextView) findViewById(R.id.mavo);
        gradeMavo = (EditText) findViewById(R.id.gradeMavo);
        tVMavo = (TextView) findViewById(R.id.tVMavo);
    }


    public void goNext2(View view) {
        String numMathStr = eTNumMath.getText().toString();
        String gradeMathStr = eTGradeMath.getText().toString();
        String numEnglishStr = etTNumEnglish.getText().toString();
        String gradeEnglishStr = eTGradeEnglish.getText().toString();

        int progress = seekBar.getProgress();
        int numMath = Integer.parseInt(numMathStr);
        int gradeMath = Integer.parseInt(gradeMathStr);
        int numEnglish = Integer.parseInt(numEnglishStr);
        int gradeEnglish = Integer.parseInt(gradeEnglishStr);


        if (numMathStr.isEmpty() | gradeMathStr.isEmpty() | numEnglishStr.isEmpty() | gradeEnglishStr.isEmpty())
            Toast.makeText(this,"Edit Text empty, you should enter a number", Toast.LENGTH_SHORT);
        else if (gradeMath < 0 | gradeEnglish < 0 | gradeMath > 100 | gradeEnglish > 100 | numMath >= 3 && numMath <= 5 | numEnglish >= 3 && numEnglish <= 5)
            Toast.makeText(this,"Invalid input!", Toast.LENGTH_SHORT);
        else{
            Intent gi = getIntent();
            String name = gi.getStringExtra("name");
            int average = gi.getIntExtra("average", 0);
            int lashonGrade = gi.getIntExtra("lashonGrade", 0);
            int safrutGrade = gi.getIntExtra("safrutGrade", 0);
            int historyGrade = gi.getIntExtra("historyGrade", 0);
            int ezrahotGrade = gi.getIntExtra("ezrahotGrade", 0);
            int tanahGrade = gi.getIntExtra("tanahGrade", 0);

            if (numMath == 3) {
                gi.putExtra("gradeMath", gradeMath);
                gi.putExtra("numMath", 3);
                gi.putExtra("average", average + gradeMath * 3);
            }
            else if (numMath == 4) {
                gi.putExtra("gradeMath", gradeMath);
                gi.putExtra("numMath", 4);
                gi.putExtra("average", average + (gradeMath + bonusME4) * 4);
            }
            else if (numMath == 5) {
                gi.putExtra("gradeMath", gradeMath);
                gi.putExtra("numMath", 5);
                gi.putExtra("average", average + (gradeMath + bonusME5) * 5);
            }
            if (numEnglish == 3) {
                gi.putExtra("gradeEnglish", gradeEnglish);
                gi.putExtra("numEnglish", 3);
                gi.putExtra("average", average + gradeEnglish*3);
            }
            else if (numEnglish == 4){
                gi.putExtra("gradeEnglish", gradeEnglish);
                gi.putExtra("numEnglish", 4);
                gi.putExtra("average", average + (gradeEnglish + bonusME4) * 4);
            }
            else if (numEnglish == 5) {
                gi.putExtra("gradeEnglish", gradeEnglish);
                gi.putExtra("numEnglish", 5);
                gi.putExtra("average", average + (gradeEnglish + bonusME5) * 5);
            }
            if (progress == 0) {
                eTOP1.setVisibility(View.VISIBLE);
                gradeOP1.setVisibility(View.VISIBLE);
                tVOP1.setVisibility(View.VISIBLE);
                eTOP2.setVisibility(View.VISIBLE);
                gradeOP2.setVisibility(View.VISIBLE);
                tVOP2.setVisibility(View.VISIBLE);
            }
            //else if(progress == 1)
        }
    }

    public void goPrev1(View view) {finish();}
}