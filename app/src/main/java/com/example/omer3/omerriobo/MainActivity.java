package com.example.omer3.omerriobo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText ed1 ,ed2 ,ed3;
Button btn1;
WebView web1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText) findViewById(R.id.ed1);
        ed2=(EditText) findViewById(R.id.ed2);
        ed3=(EditText) findViewById(R.id.ed3);
        btn1=(Button) findViewById(R.id.btn1);
        web1=(WebView) findViewById(R.id.web1);
    }
    public void omer1(View view){
        String st=ed1.getText().toString();
        String st1=ed2.getText().toString();
        String st2=ed3.getText().toString();
       double var = Double.parseDouble(st);//A
       double var1=Double.parseDouble(st1);//B
       double var2=Double.parseDouble(st2);//C


        String url="https://www.google.co.il/webhp?sourceid=chrome-instant&ion=1&espv=2&ie=UTF-8#q=";
        url=url+ var + "x%5E2%2B" + var1 + "x%2B" + var2;
        web1.loadUrl(url);



    }
}
