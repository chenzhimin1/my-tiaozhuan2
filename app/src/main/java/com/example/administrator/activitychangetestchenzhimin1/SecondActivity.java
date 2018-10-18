package com.example.administrator.activitychangetestchenzhimin1;

import android.content.Intent;
import android.hardware.SensorDirectChannel;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    private Button button2;
    private static final String LIFETAG="SecondActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(LIFETAG, "Create: ");
        button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View view){
                Intent intent=new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent);}
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

