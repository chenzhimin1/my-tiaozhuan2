package com.example.administrator.activitychangetestchenzhimin1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
  private Button button1;
          private static final String LIFETAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(LIFETAG, "Create: ");
        button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View view){
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(LIFETAG, "start");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(LIFETAG, "Resume");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(LIFETAG,"Restart");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(LIFETAG,"Pause");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(LIFETAG, "Destroy");
    }
}
