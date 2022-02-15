package com.example.fristui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    TextView workingsTV;
    TextView resultsTV;
    String workings = "";
    EditText nameEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       initTextViews();

    }
    public void clickHandler(View view) {


        String value = nameEditText.getText().toString();   //using nameEdittext here
        Toast.makeText(this, value, Toast.LENGTH_SHORT).show();
    }

    private void initTextViews()
    {
        workingsTV = (TextView)findViewById(R.id.workingsTextView);
        resultsTV = (TextView)findViewById(R.id.resultTextView);
    }

    private void setWorkings(String numvalue) {
        workings= workings+numvalue;

        workingsTV.setText(workings);
    }


    public void OneOnClick (View view){
        setWorkings("1");
    }
    public void TwoOnClick (View view){
        setWorkings("2");
    }
    public void ThreeOnClick (View view){
        setWorkings("3");
    }
    public void PlusOnClick (View view){
        setWorkings("+");
    }

    public void FourOnClick (View view){
        setWorkings("4");
    }
    public void FiveOnClick (View view){
        setWorkings("5");
    }
    public void SixOnClick (View view){
        setWorkings("6");
    }
    public void MinusOnClick (View view){
        setWorkings("-");
    }
    public void SevenOnClick (View view){
        setWorkings("7");
    }
    public void EightOnClick (View view){
        setWorkings("8");
    }
    public void NineOnClick (View view){
        setWorkings("9");
    }
    public void ZeroOnClick (View view){
        setWorkings("0");
    }


    public void ClearOnClick (View view){
        workingsTV.setText("");
        workings = "";
        resultsTV.setText("");
        leftBracket = true;
    }
    boolean leftBracket= true;

    public void EqualOnClick (View view){
        setWorkings("=");
    }













}