package com.example.ctadmin.bank;


import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
    import android.app.Activity;
    import android.app.ListActivity;
    import android.database.Cursor;
    import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
    import android.database.sqlite.SQLiteException;
    import android.os.Bundle;
    import android.view.ViewGroup;

    import android.widget.*;

    import java.util.ArrayList;

    import java.util.List;



public class view extends AppCompatActivity  {

        SQLiteDatabase db;
    SQLiteOpenHelper d;


        @Override

        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_view);



            try

            {

                db=openOrCreateDatabase("Banking1",SQLiteDatabase.CREATE_IF_NECESSARY,null);

                Cursor c= db.rawQuery("SELECT * FROM bank",null);


                TextView bal=(TextView)findViewById(R.id.bal);

                c.moveToFirst();



                String temp="";

                while(! c.isAfterLast())

                {

                    String s2=c.getString(0);

                    String s3=c.getString(1);

                    String s4=c.getString(2);

                    temp=temp+"\n Id:"+s2+"\tType:"+s3+"\tBal:"+s4;

                    c.moveToNext();

                }

                bal.setText(temp);

            }

            catch(SQLiteException e)

            {



            }

        }

    }
