package com.example.iis5.contactsmenu;


import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button button;

//it starts main activity here
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button =(Button)findViewById(R.id.button); //invoking the button from xml

        button.setOnClickListener(new View.OnClickListener() {//by using onclicklistener it implements the
            @Override
            public void onClick(View view) { //onclick method

                Intent intent = new Intent(android.content.Intent.ACTION_VIEW); //here using intents it shows the contacts list by action view it performs
                intent.setData(ContactsContract.Contacts.CONTENT_URI); // by using start activity it starts the intent activity
                startActivity(intent );

            }


            });


        }



    }


