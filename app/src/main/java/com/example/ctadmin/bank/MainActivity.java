package com.example.ctadmin.bank;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
private Button click;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        click = (Button)findViewById(R.id.click);
        click.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                click();
            }
        });
}

        private void click(){
            Intent intent=new Intent(this,admin.class);
            startActivity(intent);
        }

}
