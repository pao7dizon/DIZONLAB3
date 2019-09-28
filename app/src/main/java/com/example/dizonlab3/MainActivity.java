package com.example.dizonlab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    EditText schl1, schl2, schl3, schl4, schl5, schl6, schl7, schl8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        schl1 = findViewById(R.id.ed_schl1);
        schl2 = findViewById(R.id.ed_schl2);
        schl3 = findViewById(R.id.ed_schl3);
        schl4 = findViewById(R.id.ed_schl4);
        schl5 = findViewById(R.id.ed_schl5);

    }

    public void saveData(View view) throws IOException {
        String schl_1 = schl1.getText().toString() + "_";
        String schl_2 = schl2.getText().toString() + "_";
        String schl_3 = schl3.getText().toString() + "_";
        String schl_4 = schl4.getText().toString() + "_";
        String schl_5 = schl5.getText().toString() + "_";

        String FILENAME = "data1.txt";
        FileOutputStream fosWriter = null;
        fosWriter = openFileOutput(FILENAME, Context.MODE_PRIVATE);
        fosWriter.write(schl_1.getBytes());
        fosWriter.write(schl_2.getBytes());
        fosWriter.write(schl_3.getBytes());
        fosWriter.write(schl_4.getBytes());
        fosWriter.write(schl_5.getBytes());

        fosWriter.close();

        Toast.makeText(this, "data stored", Toast.LENGTH_LONG).show();

    }

    public void nextPage(View view) {
        Intent intent = new Intent(MainActivity.this, display.class);
        startActivity(intent);
    }
}
