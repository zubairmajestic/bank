package com.example.ctadmin.bank;


        import android.content.ContentValues;
        import android.content.Context;
        import android.content.Intent;
        import android.database.Cursor;
        import android.database.sqlite.SQLiteDatabase;
        import android.database.sqlite.SQLiteOpenHelper;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;
        public class create extends AppCompatActivity
        {
            Button create2;

            EditText editText1;

            EditText editText2;

            EditText editText3;

            SQLiteDatabase db;
            SQLiteOpenHelper d;



            @Override

            protected void onCreate(Bundle savedInstanceState) {

                super.onCreate(savedInstanceState);

                setContentView(R.layout.activity_create);

                create2=(Button)findViewById(R.id.create2);

                editText1=(EditText)findViewById(R.id.editText1);

                editText2=(EditText)findViewById(R.id.editText2);

                editText3=(EditText)findViewById(R.id.editText3);

                final Context context=this;

                try

                {

                    db=openOrCreateDatabase("Banking1",SQLiteDatabase.CREATE_IF_NECESSARY,null);

                    db.execSQL("CREATE TABLE bank (id integer PRIMARY KEY, type text, bal integer)");

                }

                catch(Exception e)

                {

                    e.printStackTrace();

                }

                create2.setOnClickListener(new View.OnClickListener() {

                    @Override

                    public void onClick(View v) {



                        String s=editText1.getText().toString();

                        String s1=editText2.getText().toString();

                        String s2=editText3.getText().toString();

                        //db.execSQL("INSERT INTO log VALUES (s)");



                        ContentValues values=new ContentValues();

                        values.put("id",s);

                        values.put("type",s1);

                        values.put("bal",s2);
                        if((db.insert("bank",null,values))!= -1)

                        {

                            Toast.makeText(create.this, "Inserted...", 2000).show();

                        }

                        else

                        {

                            Toast.makeText(create.this,"Error...",2000).show();

                        }


                        editText1.setText("");

                        editText2.setText("");

                        editText3.setText("");

                        Intent i=new Intent(context,admin.class);

                        startActivity(i);



                    }

                });

            }

        }





