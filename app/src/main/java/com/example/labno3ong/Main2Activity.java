package com.example.labno3ong;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void showData(View v){
        FileInputStream reader = null;
        String data = "";
        try {
            reader = openFileInput("data1.txt");
            int token;
            while((token=reader.read()) != -1){
                data = data + (char)token;
            }
        }
        catch (FileNotFoundException e) {
            Log.d("error","File not found...");
        } catch (IOException e) {
            Log.d("error", "IO Error..");
        }
        Toast.makeText(this,"data saved", Toast.LENGTH_LONG).show();
    }
    public void nextScreen(View V){
        Intent intent1 = new Intent(this, Main2Activity.class);
        startActivity(intent1);
        Log.d("4ITB", "next screen success");
    }
}
