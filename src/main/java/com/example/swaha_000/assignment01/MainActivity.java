package com.example.swaha_000.assignment01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void gotos(View view)
    {
        Intent nextpage= new Intent(MainActivity.this,Main2Activity.class);
        startActivity(nextpage) ;

    }
    public void gotox(View view)
    {
        Intent nextpages= new Intent(MainActivity.this,Instruction.class);
        startActivity(nextpages) ;

    }
}
