package com.example.ctadmin.bank;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class admin extends AppCompatActivity {
private Button create;
    private Button delete;
    private Button view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        create = (Button) findViewById(R.id.create);
        create.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                create();
            }
        });
        delete = (Button) findViewById(R.id.delete);
        delete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                delete();
            }
        });

        view = (Button) findViewById(R.id.view);
        view.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                view();
            }
        });
    }

        private void create(){
            Intent intent=new Intent(this,create.class);
            startActivity(intent);
        }
    private void delete(){
        Intent intent=new Intent(this,delete.class);
        startActivity(intent);
    }

    private void view(){
        Intent intent=new Intent(this,view.class);
        startActivity(intent);
    }


}
