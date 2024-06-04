package com.example.assignment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Aizul's App");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.green2)));

        Calendar cl = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance(DateFormat.FULL).format(cl.getTime());

        TextView textDate = findViewById(R.id.text_date);
        textDate.setText(currentDate);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id =item.getItemId();

        if(id == R.id.mnu_home)
        {
            Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this, MainActivity.class));
        }
        else if (id == R.id.mnu_aboutme)
        {
            Toast.makeText(this, "About Me", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this, aboutme.class));
        }
        else if (id == R.id.mnu_hobbies)
        {
            Toast.makeText(this, "Hobbies", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this, hobbies.class));
        }
        else if (id == R.id.mnu_skills)
        {
            Toast.makeText(this, "Skills", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this, skills.class));
        }
        else if (id == R.id.mnu_timetable)
        {
            Toast.makeText(this, "Time Table", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this, timetable.class));
        }
        else if (id == R.id.mnu_uitm)
        {
            Toast.makeText(this, "UiTM", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this, uitm.class));
        }
        else if (id == R.id.mnu_istudent)
        {
            Toast.makeText(this, "iStudent Portal", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this, istudent.class));
        }

        return super.onOptionsItemSelected(item);
    }
}