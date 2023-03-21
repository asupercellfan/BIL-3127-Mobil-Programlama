package com.example.firstandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

public class MainActivity : extends AppCompatActivity()
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
    public void topla(View_v)
    {
        EditText aedit1, aedit2;
        TextView atxt1;
        float no1, no2, sum;
        aedit1 = (EditText) findViewById (R.id.edit1);
        aedit2 = (EditText) findViewById (R.id.edit2);
        atxt1 = (TextView) findViewById (R.id.txt1);
        no1 = Float.parseFloat(aedit1.getText().toString());
        no2 = Float.parseFloat(aedit2.getText().toString());
        sum = no1 + no2;
        atxt1.setText((String.valueOf(sum)));
    }
    public void cikar(View_v)
    {
        EditText aedit1, aedit2;
        TextView atxt1;
        float no1, no2, sum;
        aedit1 = (EditText) findViewById (R.id.edit1);
        aedit2 = (EditText) findViewById (R.id.edit2);
        atxt1 = (TextView) findViewById (R.id.txt1);
        no1 = Float.parseFloat(aedit1.getText().toString());
        no2 = Float.parseFloat(aedit2.getText().toString());
        sum = no1 - no2;
        atxt1.setText((String.valueOf(sum)));
    }
    public void carp(View_v)
    {
        EditText aedit1, aedit2;
        TextView atxt1;
        float no1, no2, sum;
        aedit1 = (EditText) findViewById (R.id.edit1);
        aedit2 = (EditText) findViewById (R.id.edit2);
        atxt1 = (TextView) findViewById (R.id.txt1);
        no1 = Float.parseFloat(aedit1.getText().toString());
        no2 = Float.parseFloat(aedit2.getText().toString());
        sum = no1 * no2;
        atxt1.setText((String.valueOf(sum)));
    }
    public void bol(View_v)
    {
        EditText aedit1, aedit2;
        TextView atxt1;
        float no1, no2, sum;
        aedit1 = (EditText) findViewById (R.id.edit1);
        aedit2 = (EditText) findViewById (R.id.edit2);
        atxt1 = (TextView) findViewById (R.id.txt1);
        no1 = Float.parseFloat(aedit1.getText().toString());
        no2 = Float.parseFloat(aedit2.getText().toString());
        sum = no1 / no2;
        atxt1.setText((String.valueOf(sum)));
    }
    public void mod(View_v)
    {
        EditText aedit1, aedit2;
        TextView atxt1;
        float no1, no2, sum;
        aedit1 = (EditText) findViewById (R.id.edit1);
        aedit2 = (EditText) findViewById (R.id.edit2);
        atxt1 = (TextView) findViewById (R.id.txt1);
        no1 = Float.parseFloat(aedit1.getText().toString());
        no2 = Float.parseFloat(aedit2.getText().toString());
        sum = no1 % no2;
        atxt1.setText((String.valueOf(sum)));
    }
