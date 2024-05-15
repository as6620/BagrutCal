package com.example.bagrutcal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
EditText etName, etLashon, etSafrut, etHistory, etEzrahot, etTanah;
TextView tV1, tV2, tV3, tV4, tV5, tV6, tV7, tV8, tV9, tV10;
Button btnNext1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }
    private void initViews() {
        etName = (EditText) findViewById(R.id.etName);
        etLashon = (EditText) findViewById(R.id.etLashon);
        etSafrut = (EditText) findViewById(R.id.etSafrut);
        etHistory = (EditText) findViewById(R.id.etHistory);
        etEzrahot = (EditText) findViewById(R.id.etEzrahot);
        etTanah = (EditText) findViewById(R.id.etTanah);
    }

    public void goNext1(View view) {
        String name = etName.getText().toString();
        String lashonStr = etLashon.getText().toString();
        String safrutStr = etSafrut.getText().toString();
        String historyStr = etHistory.getText().toString();
        String ezrahotStr = etEzrahot.getText().toString();
        String tanahStr = etTanah.getText().toString();

        if (name.isEmpty() | lashonStr.isEmpty() | safrutStr.isEmpty() | historyStr.isEmpty() | ezrahotStr.isEmpty() | tanahStr.isEmpty())
            Toast.makeText(this,"Edit Text empty, you should enter a number", Toast.LENGTH_SHORT);
        else{
            int lashonGrade = Integer.parseInt(lashonStr);
            int safrutGrade = Integer.parseInt(safrutStr);
            int historyGrade = Integer.parseInt(historyStr);
            int ezrahotGrade = Integer.parseInt(ezrahotStr);
            int tanahGrade = Integer.parseInt(tanahStr);

            if (lashonGrade > 100 | safrutGrade > 100 | historyGrade > 100 | ezrahotGrade > 100 | tanahGrade > 100)
                Toast.makeText(this, "Grade can't be more than 100!", Toast.LENGTH_SHORT);
            else {
                int average = (lashonGrade * 2 + safrutGrade * 2 + historyGrade * 2 + ezrahotGrade * 2 + tanahGrade * 2) / 10;

                Intent si = new Intent(this, BagrutSecondActivity.class);
                si.putExtra("average", average);
                si.putExtra("name", name);
                si.putExtra("lashonGrade", lashonGrade);
                si.putExtra("safrutGrade", safrutGrade);
                si.putExtra("historyGrade", historyGrade);
                si.putExtra("ezrahotGrade", ezrahotGrade);
                si.putExtra("tanahGrade", tanahGrade);
                startActivity(si);
            }
        }
    }
}