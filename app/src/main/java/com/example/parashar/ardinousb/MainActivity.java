package com.example.parashar.ardinousb;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button onClickServer,onClickClient,onClickRemote;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickServer=(Button) findViewById(R.id.button);
        onClickClient=(Button) findViewById(R.id.button2);
        onClickRemote=(Button) findViewById(R.id.button9);

        onClickServer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Server.class);
                startActivity(intent);
            }
        });
        onClickClient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,getIP.class);
                intent.putExtra("activity","client");
                startActivity(intent);
            }
        });
        onClickRemote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,getIP.class);
                intent.putExtra("activity","remote");
                startActivity(intent);
            }
        });
    }

}