package com.example.app;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Arrays;


// REGISTER DOES NOT WORK


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String url = "https://trackdatcash.herokuapp.com/expenses/login";
        String userId = "5ca6da956d073a0017df78f6";

        String test = Authentication.login(url, "lexiitest@test.com", "lexiitest");

        test = Authentication.parseJWT(test);
        test = Authentication.getUserId(test, "this-is-a-really-long-secret-key-yeehaw");

        TextView tv = findViewById(R.id.tvText);
        tv.setText(test);

    }



    // delete route - Not a post route so we wont use it
//    public static String delete(String url){
//        JSONObject payload = new JSONObject();
//
//    }
//

    // route to return specific expense in database
    // NOT USING EXPENSESROUTES.ROUTE('/:ID').GET

}

