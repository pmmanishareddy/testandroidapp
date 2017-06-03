package com.tested.chkrytestapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manisha_reddy);


        Button btn = (Button) findViewById(R.id.button);
        final TextView txtview = (TextView) findViewById(R.id.txtview);
        final EditText edttxt = (EditText) findViewById(R.id.edttxt);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edittextvalue = edttxt.getText().toString();

                txtview.setText(edittextvalue);
                // Toast.makeText(MainActivity.this, "Change Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });


        ontap();
    } //OnCreate End

    public void ontap() {
        System.out.println("Welcome to the world");
        Toast.makeText(MainActivity.this, "This is Manisha", Toast.LENGTH_LONG).show();
    }

}
