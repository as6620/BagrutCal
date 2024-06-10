package com.example.bagrutcal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BagrutLastActivity extends AppCompatActivity {
    TextView tVName, tVGradeLashon, tVGradeSafrut, tVGradeHistory, tVGradeEzrahot, tVGradeTanah, tVNumMath, tVGradeMath, tVNumEnglish, tVGradeEnglish, tVOp1, tVNumOp1, tVGradeOp1, tVOp2, tVNumOp2, tVGradeOp2, tVOp3, tVNumOp3, tVGradeOp3, allAvg, teV1, teV2, teV3, teV12, teV23, teV13;
    double  basicGrades;
    double sumGrades;
    double sumPoints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bagrut_last);
        initViews();
        Intent bl = getIntent();

        String name = bl.getStringExtra("name");
        int lashonGrade = bl.getIntExtra("lashonGrade" , 0);
        int safrutGrade = bl.getIntExtra("safrutGrade" , 0);
        int historyGrade = bl.getIntExtra("historyGrade" , 0);
        int ezrahotGrade = bl.getIntExtra("ezrahotGrade" , 0);
        int tanahGrade = bl.getIntExtra("tanahGrade" , 0);

        int gradeMath = bl.getIntExtra("gradeMath" , 0);
        int numMath = bl.getIntExtra("numMath" , 0);
        int gradeEnglish = bl.getIntExtra("gradeEnglish" , 0);
        int numEnglish = bl.getIntExtra("numEnglish" , 0);

        String OP1Str = bl.getStringExtra("OP1Str");
        int yahalOP1 = bl.getIntExtra("yahalOP1" , 0);
        int gradeOP1 = bl.getIntExtra("gradeOP1" , 0);

        String OP2Str = bl.getStringExtra("OP2Str");
        int yahalOP2 = bl.getIntExtra("yahalOP2" , 0);
        int gradeOP2 = bl.getIntExtra("gradeOP2" , 0);

        String OP3Str = bl.getStringExtra("OP3Str");
        int yahalOP3 = bl.getIntExtra("yahalOP3" , 0);
        int gradeOP3 = bl.getIntExtra("gradeOP3" , 0);

        String mavo = bl.getStringExtra("mavo");
        int yahalMavo = bl.getIntExtra("yahalMavo" , 0);
        int gradeMavo = bl.getIntExtra("gradeMavo" , 0);

        int optionMegama = bl.getIntExtra("optionMegama", 0);

        tVName.setText("       Hello " + name+"!");

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


            tVOp3.setVisibility(View.GONE);
            tVNumOp3.setVisibility(View.GONE);
            tVGradeOp3.setVisibility(View.GONE);
        }
        else{
            tVOp1.setText("" + OP3Str);
            tVNumOp1.setText("" + yahalOP3);
            tVGradeOp1.setText("" + gradeOP3);

            tVOp2.setText("" + mavo);
            tVNumOp2.setText("" + yahalMavo);
            tVGradeOp2.setText("" + gradeMavo);


            tVOp3.setVisibility(View.GONE);
            tVNumOp3.setVisibility(View.GONE);
            tVGradeOp3.setVisibility(View.GONE);
        }
        basicGrades = lashonGrade*2 + safrutGrade*2 + historyGrade*2 + ezrahotGrade*2 + tanahGrade*2;
        sumGrades = basicGrades + gradeMath*numMath + gradeEnglish*numEnglish + gradeOP1*yahalOP1 + gradeOP2*yahalOP2 + gradeOP3*yahalOP3 + gradeMavo;
        sumPoints = 10 + numMath + numEnglish + yahalOP1 + yahalOP2 + yahalOP3;

        allAvg.setText(""+sumGrades/sumPoints);

        int avgBasicGrades = lashonGrade*2 + safrutGrade*2 + historyGrade*2 + ezrahotGrade*2 + tanahGrade*2 + gradeMath*numMath + gradeEnglish*numEnglish;
        int avgBasicPoints = 10 + numMath + numEnglish;


        if (optionMegama == 15){
            //int sumteV1 = (gradeOP1*yahalOP1 + gradeOP2*yahalOP2 + gradeOP3*yahalOP3 + avgBasicGrades)/avgBasicPoints + yahalOP1 + yahalOP2 + yahalOP3;
            double sumteV1 = (gradeOP1*yahalOP1 + avgBasicGrades)/ (avgBasicPoints + yahalOP1);
            teV1.setText(""+sumteV1);

            double sumteV2 = (gradeOP2*yahalOP2 + avgBasicGrades)/ (avgBasicPoints + yahalOP2);
            teV2.setText(""+sumteV2);

            double sumteV3 = (gradeOP3*yahalOP3 + avgBasicGrades)/ (avgBasicPoints + yahalOP3);
            teV3.setText(""+sumteV3);

            double sumteV12 = (gradeOP1*yahalOP1 + gradeOP2*yahalOP2 + avgBasicGrades)/ (avgBasicPoints + yahalOP1 + yahalOP2);
            teV12.setText(""+sumteV12);

            double sumteV23 = (gradeOP2*yahalOP2 + gradeOP3*yahalOP3 + avgBasicGrades)/ (avgBasicPoints + yahalOP2 + yahalOP3);
            teV23.setText(""+sumteV23);

            double sumteV13 = (gradeOP1*yahalOP1 + gradeOP3*yahalOP3 + avgBasicGrades)/ (avgBasicPoints + yahalOP1 + yahalOP3);
            teV13.setText(""+sumteV13);
        }
        else if(optionMegama == 10) {
            double sumteV2 = (gradeOP2 * yahalOP2 + avgBasicGrades) / (avgBasicPoints + yahalOP2);
            teV2.setText("" + sumteV2);

            double sumteV3 = (gradeOP3 * yahalOP3 + avgBasicGrades) / (avgBasicPoints + yahalOP3);
            teV3.setText("" + sumteV3);
        }
    }
    private void initViews() {
        tVName = (TextView) findViewById(R.id.tVName);

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

        allAvg = (TextView) findViewById(R.id.allAvg);
        teV1 = (TextView) findViewById(R.id.teV1);
        teV2 = (TextView) findViewById(R.id.teV2);
        teV3 = (TextView) findViewById(R.id.teV3);
        teV12 = (TextView) findViewById(R.id.teV12);
        teV23 = (TextView) findViewById(R.id.teV23);
        teV13 = (TextView) findViewById(R.id.teV13);

    }



    public void goPrev2(View view) {finish();}
}