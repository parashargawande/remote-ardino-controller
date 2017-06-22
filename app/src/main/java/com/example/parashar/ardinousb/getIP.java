package com.example.parashar.ardinousb;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class getIP extends AppCompatActivity {

    public String IP,PORT,activity;
    EditText ip,port;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_ip);
        Intent intent=getIntent();
        activity=intent.getStringExtra("activity");

        ip=(EditText) findViewById(R.id.editText);
        port=(EditText) findViewById(R.id.editText2);
        b1=(Button) findViewById(R.id.button3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IP=ip.getText().toString();
                PORT=port.getText().toString();

                if(IP.equals("") )
                {

                    ip.setError("required");

                }
                else if( PORT.equals(""))
                {
                    port.setError("required");
                }
                else
                {
                    if(activity.equals("client"))
                    {
                        Intent intent=new Intent(getIP.this,Client.class);
                        intent.putExtra("IP",IP);
                        intent.putExtra("PORT",PORT);
                        startActivity(intent);
                    }
                    else if(activity.equals("remote"))
                    {
                        Intent intent=new Intent(getIP.this,Remote.class);
                        intent.putExtra("IP",IP);
                        intent.putExtra("PORT",PORT);
                        startActivity(intent);
                    }

                }
            }
        });

    }
}
