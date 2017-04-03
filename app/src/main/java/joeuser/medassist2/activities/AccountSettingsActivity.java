package joeuser.medassist2.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import joeuser.medassist2.R;
import joeuser.medassist2.fragments.ChangePasswordDialog;
import joeuser.medassist2.utilities.Constants;

public class AccountSettingsActivity extends AppCompatActivity implements ChangePasswordDialog.Listener {

    private SharedPreferences mSharedPreferences;
    private String mToken;
    private String mEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_settings);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button mBtChangePassword = (Button) findViewById(R.id.btn_change_password);
        mBtChangePassword.setOnClickListener(view -> showDialog());
        initSharedPreferences();

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


    private void initSharedPreferences() {

        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        mToken = mSharedPreferences.getString(Constants.TOKEN, "");
        mEmail = mSharedPreferences.getString(Constants.EMAIL, "");
    }

    private void showDialog() {

        ChangePasswordDialog fragment = new ChangePasswordDialog();

        Bundle bundle = new Bundle();
        bundle.putString(Constants.EMAIL, mEmail);
        bundle.putString(Constants.TOKEN, mToken);
        fragment.setArguments(bundle);

        fragment.show(getFragmentManager(), ChangePasswordDialog.TAG);
    }

    private void showSnackBarMessage(String message) {

        Snackbar.make(findViewById(R.id.activity_main), message, Snackbar.LENGTH_SHORT).show();

    }

    @Override
    public void onPasswordChanged() {

        showSnackBarMessage("Password Changed Successfully !");
    }

}
