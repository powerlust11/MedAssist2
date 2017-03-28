package joeuser.medassist2.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import joeuser.medassist2.R;

public class CurrentPatientsActivity extends AppCompatActivity {

    String[] listOfPatients = {"Doe, John", "Ho, Anthony", "Alex Ramsey", "Mogonigal, Daniel", "Al-Kurdy, Ahmad", "Radford, Joseph"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_patients);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.list_view_patients, listOfPatients);

        ListView listView = (ListView) findViewById(R.id.ListViewPatients);
        listView.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_home) {
            Intent intent = new Intent(this, HomeScreenActivity.class);
            this.finish();
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

}
