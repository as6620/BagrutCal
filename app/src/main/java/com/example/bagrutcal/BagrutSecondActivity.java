package com.example.bagrutcal;

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
    EditText eTNumMath, eTGradeMath, etTNumEnglish, eTGradeEnglish, eTOP1, gradeOP1, eTOP2,gradeOP2, eTOP3, gradeOP3, gradeMavo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bagrut_second);

        initViews();
    }
    private void initViews() {
        eTNumMath = (EditText) findViewById(R.id.eTNumMath);
        eTGradeMath = (EditText) findViewById(R.id.eTGradeMath);
        etTNumEnglish = (EditText) findViewById(R.id.eTNumEnglish);
        eTGradeEnglish = (EditText) findViewById(R.id.eTGradeEnglish);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        eTOP1 = (EditText) findViewById(R.id.eTOP1);
        gradeOP1 = (EditText) findViewById(R.id.gradeOP1);
        eTOP2 = (EditText) findViewById(R.id.eTOP2);
        gradeOP2 = (EditText) findViewById(R.id.gradeOP2);
        eTOP3 = (EditText) findViewById(R.id.eTOP3);
        gradeOP3 = (EditText) findViewById(R.id.gradeOP3);
        gradeMavo = (EditText) findViewById(R.id.gradeMavo);
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
        int op = 5;
        int mavo = 1;


        if (numMathStr.isEmpty() | gradeMathStr.isEmpty() | numEnglishStr.isEmpty() | gradeEnglishStr.isEmpty())
            Toast.makeText(this,"Edit Text empty, you should enter a number", Toast.LENGTH_SHORT);
        else if (gradeMath < 0 | gradeEnglish < 0 | gradeMath > 100 | gradeEnglish > 100 | numMath >= 3 && numMath <= 5 | numEnglish >= 3 && numEnglish <= 5)
            Toast.makeText(this,"Invalid input!", Toast.LENGTH_SHORT);
        else{
            if (progress == 0)
                
        }
    }

    public void goPrev1(View view) {finish();}
}