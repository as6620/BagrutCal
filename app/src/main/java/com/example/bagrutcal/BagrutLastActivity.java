package com.example.bagrutcal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BagrutLastActivity extends AppCompatActivity {
    TextView tVGradeLashon, tVGradeSafrut, tVGradeHistory, tVGradeEzrahot, tVGradeTanah, tVNumMath, tVGradeMath, tVNumEnglish, tVGradeEnglish, tVOp1, tVNumOp1, tVGradeOp1, tVOp2, tVNumOp2, tVGradeOp2, tVOp3, tVNumOp3, tVGradeOp3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bagrut_last);
        initViews();
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

        int optionMegama = bl.getIntExtra("optionMegama", 1);

        tVGradeLashon.setText("" + lashonGrade);
        tVGradeSafrut.setText("" + safrutGrade);
        tVGradeHistory.setText("" + historyGrade);
        tVGradeEzrahot.setText("" + ezrahotGrade);
        tVGradeTanah.setText("" + tanahGrade);

        tVNumMath.setText("" + numMath);
        tVGradeMath.setText("" + gradeMath);
        tVNumEnglish.setText("" + numEnglish);
        tVGradeEnglish.setText("" + gradeEnglish);

        if (optionMegama == 15){
            tVOp1.setText("" + OP1Str);
            tVNumOp1.setText("" + yahalOP1);
            tVGradeOp1.setText("" + gradeOP1);

            tVOp2.setText("" + OP2Str);
            tVNumOp2.setText("" + yahalOP2);
            tVGradeOp2.setText("" + gradeOP2);

            tVOp3.setText("" + OP3Str);
            tVNumOp3.setText("" + yahalOP3);
            tVGradeOp3.setText("" + gradeOP3);
        }
        else if(optionMegama == 10){
            tVOp1.setText("" + OP2Str);
            tVNumOp1.setText("" + yahalOP2);
            tVGradeOp1.setText("" + gradeOP2);

            tVOp2.setText("" + OP3Str);
            tVNumOp2.setText("" + yahalOP3);
            tVGradeOp2.setText("" + gradeOP3);
        }
        else{
            tVOp1.setText("" + OP3Str);
            tVNumOp1.setText("" + yahalOP3);
            tVGradeOp1.setText("" + gradeOP3);

            tVOp2.setText("" + mavo);
            tVNumOp2.setText("" + yahalMavo);
            tVGradeOp2.setText("" + gradeMavo);

        }


    }
    private void initViews() {
        tVGradeLashon = (TextView) findViewById(R.id.tVGradeLashon);
        tVGradeSafrut = (TextView) findViewById(R.id.tVGradeSafrut);
        tVGradeHistory = (TextView) findViewById(R.id.tVGradeHistory);
        tVGradeEzrahot = (TextView) findViewById(R.id.tVGradeEzrahot);
        tVGradeTanah = (TextView) findViewById(R.id.tVGradeTanah);

        tVNumMath = (TextView) findViewById(R.id.tVNumMath);
        tVGradeMath = (TextView) findViewById(R.id.tVGradeMath);
        tVNumEnglish = (TextView) findViewById(R.id.tVNumEnglish);
        tVGradeEnglish = (TextView) findViewById(R.id.tVGradeEnglish);

        tVOp1 = (TextView) findViewById(R.id.tVOp1);
        tVNumOp1 = (TextView) findViewById(R.id.tVNumOp1);
        tVGradeOp1 = (TextView) findViewById(R.id.tVGradeOp1);
        tVOp2 = (TextView) findViewById(R.id.tVOp2);
        tVNumOp2 = (TextView) findViewById(R.id.tVNumOp2);
        tVGradeOp2 = (TextView) findViewById(R.id.tVGradeOp2);
        tVOp3 = (TextView) findViewById(R.id.tVOp3);
        tVNumOp3 = (TextView) findViewById(R.id.tVNumOp3);
        tVGradeOp3 = (TextView) findViewById(R.id.tVGradeOp3);
    }



    public void goPrev2(View view) {finish();}
}