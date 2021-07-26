package com.example.pineridgeappv3;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.*;
import java.net.URL;
import java.util.Scanner;



public class InstructionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instruction);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button myBagButton = findViewById(R.id.My_Bag);
        TextView instructorNotes = findViewById(R.id.BGA_Notes);
        Button flightscopeButton = findViewById(R.id.FlightScope);
        Button tpiButton = findViewById(R.id.TPI);
        TextView studentNotesView = findViewById(R.id.Student_Notes);

        myBagButton.setTextColor(Color.WHITE);
        myBagButton.setShadowLayer(0.01f, -2, 2, Color.BLACK);

        flightscopeButton.setTextColor(Color.WHITE);
        flightscopeButton.setShadowLayer(0.01f, -2, 2, Color.BLACK);

        flightscopeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.baltimoregolfacademy.com/"));
                startActivity(intent);
            }
        });

        myBagButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MyBagActivity.class);
                startActivity(intent);
            }
        });

        tpiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.baltimoregolfacademy.com/"));
                startActivity(intent);
            }
        });

        studentNotesView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),StudentNotesActivity.class);
                startActivity(intent);
            }
        });

        try {
            URL url = new URL("http://www.baltimoregolfacademy.com");
            Scanner instructorNoteScan = new Scanner(url.openStream());
            instructorNotes.append(instructorNoteScan.nextLine());
        }
        catch(IOException ex) {
            // there was some connection problem, or the file did not exist on the server.
            ex.printStackTrace(); // for now, simply output it.
        }
    }
}
