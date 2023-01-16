package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnA;
    Button btnB;
    Button btnC;
    TextView txtView;
    TextView Tutorial;

    public Button getBtnA() {
        return btnA;
    }

    public void setBtnA(Button btnA) {
        this.btnA = btnA;
    }

    public Button getBtnB() {
        return btnB;
    }

    public void setBtnB(Button btnB) {
        this.btnB = btnB;
    }

    public Button getBtnC() {
        return btnC;
    }

    public void setBtnC(Button btnC) {
        this.btnC = btnC;
    }

    public TextView getTxtView() {
        return txtView;
    }

    public void setTxtView(TextView txtView) {
        this.txtView = txtView;
    }

    public TextView getTutorial() {
        return Tutorial;
    }

    public void setTutorial(TextView tutorial) {
        Tutorial = tutorial;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setBtnA((Button)findViewById(R.id.btnA));
        this.setBtnB((Button)findViewById(R.id.btnB));
        this.setBtnC((Button)findViewById(R.id.btnC));
        this.setTutorial((TextView) findViewById(R.id.tutorial));
        this.setTxtView((TextView) findViewById(R.id.txt));
        this.getBtnA().setOnClickListener(this);
        this.getBtnB().setOnClickListener(this);
        this.getBtnC().setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
            if(view.getId() == R.id.btnA){
                this.getTxtView().setText("A is clicked");
            }
            if(view.getId() == R.id.btnB){
                this.getTxtView().setText("B is clicked");
            }
            if(view.getId() == R.id.btnC) {
                this.getTxtView().setText("C is clicked");
            }
    }
}

//https://youtu.be/FfgQRjR7YXY?t=1042