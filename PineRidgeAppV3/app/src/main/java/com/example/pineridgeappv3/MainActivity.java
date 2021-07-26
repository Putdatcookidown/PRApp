package com.example.pineridgeappv3;

/**
 Written By Tom Kersch 12-3-2019

 Main Activity of Baltimore Golf Academy Companion App
 Creates landing page for navigation to Handicap, Instruction, Scheduling, and Course information

 */

//Imports
        import android.graphics.Color;
        import android.os.Bundle;
        import android.widget.Toolbar;
        import androidx.appcompat.app.AppCompatActivity;
        import com.google.android.material.snackbar.Snackbar;
        import com.google.android.material.floatingactionbutton.FloatingActionButton;
        import android.view.View;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.widget.Button;
        import android.widget.Toast;
        import android.content.Intent;
        import android.net.Uri;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Connection to layout activity_main
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.hasExpandedActionView();

        //Button creation
        Button handicapButton = findViewById(R.id.buttonHandicap);
        Button instructionButton = findViewById(R.id.buttonInstruction);
        Button scheduleButton = findViewById(R.id.buttonSchedule);
        Button courseButton = findViewById(R.id.buttonCourse);

        //Handicap button customization
        handicapButton.setTextColor(Color.WHITE);
        handicapButton.setShadowLayer(0.01f, 2, -2, Color.BLACK);

        //Instruction Button customization
        instructionButton.setTextColor(Color.WHITE);
        instructionButton.setShadowLayer(0.01f, 2, -2, Color.BLACK);

        //Handicap Button on click to Handicap page
        handicapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),HandicapActivity.class);
                startActivity(intent);

            }
        });

        //Instruction Button on click to Instruction page
        instructionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),InstructionActivity.class);
                startActivity(intent);
            }
        });

        //Schedule Button to Baltimore Golf Academy Website
        scheduleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.baltimoregolfacademy.com/junior-programs-2"));
                startActivity(intent);
            }
        });

        //Course Button to Classic 5 website
        courseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://www.classic5golf.com"));
                startActivity(intent);
            }
        });

        //Toolbar on click to toolbar dropdown
        toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),InstructionActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
