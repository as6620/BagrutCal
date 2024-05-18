package com.example.bagrutcal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class BagrutSecondActivity extends AppCompatActivity {
    RadioButton rB6,rB10, rB15;
    TextView tVOP1, tVOP2, tVOP3, mavo, tVMavo;
    EditText eTNumMath, eTGradeMath, etTNumEnglish, eTGradeEnglish, eTOP1, eTGradeOP1, eTOP2, eTGradeOP2, eTOP3, eTGradeOP3, eTGradeMavo;
    String Mavo = "מבוא למדעים";
    Intent si;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bagrut_second);

        initViews();

        si = getIntent();

        eTNumMath.setText(si.getStringExtra("snumMath"));
        eTGradeMath.setText(si.getStringExtra("sgradeMath"));
        etTNumEnglish.setText(si.getStringExtra("snumEnglish"));
        eTGradeEnglish.setText(si.getStringExtra("snumEnglish"));

        eTOP1.setVisibility(View.INVISIBLE);
        eTGradeOP1.setVisibility(View.INVISIBLE);
        tVOP1.setVisibility(View.INVISIBLE);
        eTOP2.setVisibility(View.INVISIBLE);
        eTGradeOP2.setVisibility(View.INVISIBLE);
        tVOP2.setVisibility(View.INVISIBLE);
        eTOP3.setVisibility(View.INVISIBLE);
        eTGradeOP3.setVisibility(View.INVISIBLE);
        tVOP3.setVisibility(View.INVISIBLE);
        mavo.setVisibility(View.INVISIBLE);
        tVMavo.setVisibility(View.INVISIBLE);
        eTGradeMavo.setVisibility(View.INVISIBLE);
    }
    private void initViews() {
        eTNumMath = (EditText) findViewById(R.id.eTNumMath);
        eTGradeMath = (EditText) findViewById(R.id.eTGradeMath);
        etTNumEnglish = (EditText) findViewById(R.id.eTNumEnglish);
        eTGradeEnglish = (EditText) findViewById(R.id.eTGradeEnglish);

        eTOP1 = (EditText) findViewById(R.id.eTOP1);
        tVOP1 = (TextView) findViewById(R.id.tVOP1);
        eTGradeOP1 = (EditText) findViewById(R.id.eTGradeOP1);
        eTOP2 = (EditText) findViewById(R.id.eTOP2);
        tVOP2 = (TextView) findViewById(R.id.tVOP2);
        eTGradeOP2 = (EditText) findViewById(R.id.eTGradeOP2);
        eTOP3 = (EditText) findViewById(R.id.eTOP3);
        tVOP3 = (TextView) findViewById(R.id.tVOP3);
        eTGradeOP3 = (EditText) findViewById(R.id.eTGradeOP3);
        mavo = (TextView) findViewById(R.id.mavo);
        eTGradeMavo = (EditText) findViewById(R.id.eTGradeMavo);
        tVMavo = (TextView) findViewById(R.id.tVMavo);

        rB6 = (RadioButton) findViewById(R.id.rB6);
        rB10 = (RadioButton) findViewById(R.id.rB10);
        rB15 = (RadioButton) findViewById(R.id.rB15);
    }


    public void goNext2(View view) {
        Intent gi = new Intent(this, BagrutLastActivity.class);

        String numMathStr = eTNumMath.getText().toString();
        String gradeMathStr = eTGradeMath.getText().toString();
        String numEnglishStr = etTNumEnglish.getText().toString();
        String gradeEnglishStr = eTGradeEnglish.getText().toString();

        if (numMathStr.isEmpty() | gradeMathStr.isEmpty() | numEnglishStr.isEmpty() | gradeEnglishStr.isEmpty())
            Toast.makeText(this,"Edit Text/s empty", Toast.LENGTH_SHORT).show();
        else{
            int numMath = Integer.parseInt(numMathStr);
            int gradeMath = Integer.parseInt(gradeMathStr);
            int numEnglish = Integer.parseInt(numEnglishStr);
            int gradeEnglish = Integer.parseInt(gradeEnglishStr);

            if (gradeMath > 100 | gradeEnglish > 100 | numMath < 3 | numMath > 5 | numEnglish < 3 | numEnglish > 5)
                Toast.makeText(this,"Invalid input!", Toast.LENGTH_SHORT).show();
            else{
                gi.putExtra("name", si.getStringExtra("name"));
                gi.putExtra("average", si.getIntExtra("average", 1));
                gi.putExtra("lashonGrade", si.getIntExtra("lashonGrade", 1));
                gi.putExtra("safrutGrade", si.getIntExtra("safrutGrade", 1));
                gi.putExtra("historyGrade", si.getIntExtra("historyGrade", 1));
                gi.putExtra("ezrahotGrade", si.getIntExtra("ezrahotGrade", 1));
                gi.putExtra("tanahGrade", si.getIntExtra("tanahGrade", 1));

                if (numMath == 3) {
                    gi.putExtra("gradeMath", gradeMath);
                    gi.putExtra("numMath", 3);
                }
                else if (numMath == 4) {
                    gi.putExtra("gradeMath", gradeMath + 15);
                    gi.putExtra("numMath", 4);
                }
                else if (numMath == 5) {
                    gi.putExtra("gradeMath", gradeMath + 30);
                    gi.putExtra("numMath", 5);
                }
                if (numEnglish == 3) {
                    gi.putExtra("gradeEnglish", gradeEnglish);
                    gi.putExtra("numEnglish", 3);
                }
                else if (numEnglish == 4){
                    gi.putExtra("gradeEnglish", gradeEnglish + 15);
                    gi.putExtra("numEnglish", 4);
                }
                else if (numEnglish == 5) {
                    gi.putExtra("gradeEnglish", gradeEnglish + 30);
                    gi.putExtra("numEnglish", 5);
                }
                if (rB15.isChecked()){
                    String OP1Str = eTOP1.getText().toString();
                    String gradeOP1Str = eTGradeOP1.getText().toString();
                    String OP2Str = eTOP2.getText().toString();
                    String gradeOP2Str = eTGradeOP2.getText().toString();
                    String OP3Str = eTOP3.getText().toString();
                    String gradeOP3Str = eTOP3.getText().toString();

                    if (OP1Str.isEmpty() | gradeOP1Str.isEmpty() | OP2Str.isEmpty() | gradeOP2Str.isEmpty() | OP3Str.isEmpty() | gradeOP3Str.isEmpty())
                        Toast.makeText(this,"Edit Text/s empty", Toast.LENGTH_SHORT).show();
                    else{
                        int gradeOP1 = Integer.parseInt(gradeOP1Str);
                        int gradeOP2 = Integer.parseInt(gradeOP2Str);
                        int gradeOP3 = Integer.parseInt(gradeOP3Str);

                        if (gradeOP1 > 100 | gradeOP2 > 100 | gradeOP3 > 100)
                            Toast.makeText(this,"Grade can't be more than 100!", Toast.LENGTH_SHORT).show();
                        else{
                            gi.putExtra("OP1Str", OP1Str);
                            gi.putExtra("yahalOP1", 5);
                            gi.putExtra("gradeOP1", gradeOP1 + 20);
                            gi.putExtra("OP2Str", OP2Str);
                            gi.putExtra("yahalOP2", 5);
                            gi.putExtra("gradeOP2", gradeOP2 + 20);
                            gi.putExtra("OP3Str", OP3Str);
                            gi.putExtra("yahalOP3", 5);
                            gi.putExtra("gradeOP3", gradeOP3 + 20);
                            gi.putExtra("optionMegama", 15);

                            startActivity(gi);
                        }
                    }
                }
                else if (rB10.isChecked()){
                    String OP2Str = eTOP2.getText().toString();
                    String gradeOP2Str = eTGradeOP2.getText().toString();
                    String OP3Str = eTOP3.getText().toString();
                    String gradeOP3Str = eTOP3.getText().toString();

                    if (OP2Str.isEmpty() | gradeOP2Str.isEmpty() | OP3Str.isEmpty() | gradeOP3Str.isEmpty())
                        Toast.makeText(this,"Edit Text/s empty", Toast.LENGTH_SHORT).show();
                    else{
                        int gradeOP2 = Integer.parseInt(gradeOP2Str);
                        int gradeOP3 = Integer.parseInt(gradeOP3Str);

                        if (gradeOP2 > 100 | gradeOP3 > 100)
                            Toast.makeText(this,"Grade can't be more than 100!", Toast.LENGTH_SHORT).show();
                        else{
                            gi.putExtra("OP2Str", OP2Str);
                            gi.putExtra("yahalOP2", 5);
                            gi.putExtra("gradeOP2", gradeOP2 + 20);
                            gi.putExtra("OP3Str", OP3Str);
                            gi.putExtra("yahalOP3", 5);
                            gi.putExtra("gradeOP3", gradeOP3 + 20);
                            gi.putExtra("optionMegama", 10);

                            startActivity(gi);
                        }
                    }
                }
                else if (rB6.isChecked()){
                    String OP3Str = eTOP3.getText().toString();
                    String gradeOP3Str = eTOP3.getText().toString();
                    String gradeMavoStr = eTGradeMavo.getText().toString();

                    if (gradeMavoStr.isEmpty() | OP3Str.isEmpty() | gradeOP3Str.isEmpty())
                        Toast.makeText(this,"Edit Text/s empty", Toast.LENGTH_SHORT).show();
                    else{
                        int gradeOP3 = Integer.parseInt(gradeOP3Str);
                        int gradeMavo = Integer.parseInt(gradeOP3Str);

                        if (gradeOP3 > 100 | gradeMavo > 100)
                            Toast.makeText(this,"Invalid input!", Toast.LENGTH_SHORT);
                        else{
                            gi.putExtra("OP3Str", OP3Str);
                            gi.putExtra("yahalOP3", 5);
                            gi.putExtra("gradeOP3", gradeOP3 + 20);
                            gi.putExtra("mavo", Mavo);
                            gi.putExtra("yahalMavo", 1);
                            gi.putExtra("gradeMavo", 1);
                            gi.putExtra("optionMegama", 6);

                            startActivity(gi);
                        }
                    }
                }
            }
        }
    }

    public void goPrev1(View view) {
        si.putExtra("sgradeMath", eTGradeMath.getText().toString());
        si.putExtra("snumMath", eTNumMath.getText().toString());
        si.putExtra("sgradeEnglish", eTGradeEnglish.getText().toString());
        si.putExtra("snumEnglish", etTNumEnglish.getText().toString());

        setResult(RESULT_OK, si);
        finish();
    }

    public void go15(View view) {
        eTOP1.setVisibility(View.VISIBLE);
        eTGradeOP1.setVisibility(View.VISIBLE);
        tVOP1.setVisibility(View.VISIBLE);
        eTOP2.setVisibility(View.VISIBLE);
        eTGradeOP2.setVisibility(View.VISIBLE);
        tVOP2.setVisibility(View.VISIBLE);
        eTOP3.setVisibility(View.VISIBLE);
        eTGradeOP3.setVisibility(View.VISIBLE);
        tVOP3.setVisibility(View.VISIBLE);

        mavo.setVisibility(View.INVISIBLE);
        tVMavo.setVisibility(View.INVISIBLE);
        eTGradeMavo.setVisibility(View.INVISIBLE);

    }
    public void go10(View view) {
        eTOP1.setVisibility(View.VISIBLE);
        eTGradeOP1.setVisibility(View.VISIBLE);
        tVOP1.setVisibility(View.VISIBLE);
        eTOP2.setVisibility(View.VISIBLE);
        eTGradeOP2.setVisibility(View.VISIBLE);
        tVOP2.setVisibility(View.VISIBLE);

        eTOP3.setVisibility(View.INVISIBLE);
        eTGradeOP3.setVisibility(View.INVISIBLE);
        tVOP3.setVisibility(View.INVISIBLE);
        mavo.setVisibility(View.INVISIBLE);
        tVMavo.setVisibility(View.INVISIBLE);
        eTGradeMavo.setVisibility(View.INVISIBLE);
    }

    public void go6(View view) {
        eTOP3.setVisibility(View.VISIBLE);
        eTGradeOP3.setVisibility(View.VISIBLE);
        tVOP3.setVisibility(View.VISIBLE);
        mavo.setVisibility(View.VISIBLE);
        tVMavo.setVisibility(View.VISIBLE);
        eTGradeMavo.setVisibility(View.VISIBLE);

        eTOP1.setVisibility(View.INVISIBLE);
        eTGradeOP1.setVisibility(View.INVISIBLE);
        tVOP1.setVisibility(View.INVISIBLE);
        eTOP2.setVisibility(View.INVISIBLE);
        eTGradeOP2.setVisibility(View.INVISIBLE);
        tVOP2.setVisibility(View.INVISIBLE);
    }
}