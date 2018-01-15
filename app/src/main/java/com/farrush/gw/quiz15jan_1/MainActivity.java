package com.farrush.gw.quiz15jan_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et;
    Button btn;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText) findViewById(R.id.et);
        btn = (Button) findViewById(R.id.btn);
        txt = (TextView) findViewById(R.id.txt);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = et.getText().toString();
                if(n.isEmpty()){
                    et.setError("Cant Be Empty");
                }else{
                    int a = Integer.parseInt(n);
                    if(a == 0){
                        txt.setText("This Null");
                    }else if((a >= 1) & (a <= 9)) {
                        txt.setText("This Not Null");
                    }else{
                        txt.setText("This Not Null, But This Not 0-9");
                    }
                }
            }
        });
    }
}
