package mx.netsquare.beerfindebeta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);
    }

    public void login(View view) {
        Intent intentMap = new Intent(this, MapsActivity.class);
        startActivity(intentMap);
    }

    public void registro(View view) {
        Intent intentRegistro = new Intent(this, Registro.class);
        startActivity(intentRegistro);
    }

    public void recuperar(View view) {
        Intent intentRecuperar = new Intent(this, Recuperar.class);
        startActivity(intentRecuperar);

    }
}
