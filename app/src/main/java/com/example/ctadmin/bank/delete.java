package com.example.ctadmin.bank;

    import android.content.Context;

    import android.content.Intent;

    import android.database.sqlite.SQLiteDatabase;

    import android.database.sqlite.SQLiteException;

    import android.database.sqlite.SQLiteOpenHelper;

    import android.os.Bundle;

    import android.provider.ContactsContract;
    import android.view.View;
    import android.widget.Button;
    import android.widget.EditText;
    import android.support.v7.app.AppCompatActivity;
    import android.widget.Toast;



public class delete extends AppCompatActivity {

        Button delete;

        EditText del;

        SQLiteDatabase db;
    SQLiteOpenHelper d;




        @Override

        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_delete);



            delete=(Button)findViewById(R.id.delete);

            del=(EditText)findViewById(R.id.del);

            final Context context=this;

            try

            {

                db=openOrCreateDatabase("Banking1",SQLiteDatabase.CREATE_IF_NECESSARY,null);

            }

            catch(SQLiteException e)

            {

                e.printStackTrace();

                System.out.print("ERROR.............");

            }

            delete.setOnClickListener(new View.OnClickListener() {

                @Override

                public void onClick(View v) {

                    String t=(del.getText().toString());

                    try

                    {

                        String d="DELETE FROM bank WHERE id="+t;

                        db.execSQL(d);

                    }

                    catch(Exception e)

                    {

                        System.out.print("Error..................");

                    }



                    del.setText("");

                    Toast.makeText(delete.this, "Deleted...", 2000).show();

                    Intent i=new Intent(context,admin.class);

                    startActivity(i);

                }

            });

        }

    }
