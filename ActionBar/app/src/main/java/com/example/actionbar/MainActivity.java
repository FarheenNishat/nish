package com.example.actionbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar myactionbar=getSupportActionBar();
        myactionbar.setIcon(R.drawable.home);
        myactionbar.setTitle("  Welcome");
        myactionbar.setDisplayUseLogoEnabled(true);
        myactionbar.setDisplayShowHomeEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.download:
                Toast.makeText(this,"Download Started",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,Main2Activity.class));
                break;
            case R.id.refresh:
                Toast.makeText(this,"Refresh clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.send:
            Toast.makeText(this,"sending...",Toast.LENGTH_SHORT).show();
            break;

        }
        return super.onOptionsItemSelected(item);
    }
}
