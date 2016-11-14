package com.mehedi.hasan.calculator2935;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
private EditText txt_firstNo,txt_secondNo;
    private Button btn_add,btn_div,btn_min,btn_multi;
    private TextView txt_allResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init (){
        btn_add =(Button)findViewById(R.id.btn_add);
        btn_min =(Button)findViewById(R.id.btn_min);
        btn_div =(Button)findViewById(R.id.btn_div);
        btn_multi =(Button)findViewById(R.id.btn_multi);
        txt_firstNo=(EditText)findViewById(R.id.txt_firstNo);
        txt_secondNo=(EditText)findViewById(R.id.txt_secondNo);
        txt_allResult =(TextView)findViewById(R.id.txt_allResult);


        btn_add.setOnClickListener(this);
        btn_min.setOnClickListener(this);
        btn_div.setOnClickListener(this);
        btn_multi.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String num1,num2;
        num1=txt_firstNo.getText().toString();
         num2=txt_secondNo.getText().toString();
        switch(view.getId())
        {
            case R.id.btn_add:
                int add=Integer.parseInt(num1)+Integer.parseInt(num2);
                txt_allResult.setText(String.valueOf(add));
                break;
            case R.id.btn_min:

                int min=Integer.parseInt(num1)-Integer.parseInt(num2);
                txt_allResult.setText(String.valueOf(min));
                break;
            case R.id.btn_div:
//try{}{}
                int div=Integer.parseInt(num1)/Integer.parseInt(num2);
                txt_allResult.setText(String.valueOf(div));
                break;
            case R.id.btn_multi:

                int multi=Integer.parseInt(num1)*Integer.parseInt(num2);
                txt_allResult.setText(String.valueOf(multi));
                break;
        }

    }
}
