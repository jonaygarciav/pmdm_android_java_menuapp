package com.example.menuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        String mensaje;
        int id = item.getItemId();

        Toast aviso;
        switch (item.getItemId()) {
            case R.id.MenuOpc1:

                mensaje = "Opcion 1 pulsada!";
                aviso = Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_SHORT);
                aviso.show();

                return true;

            case R.id.MenuOpc2:

                mensaje = "Opcion 2 pulsada!";
                aviso = Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_SHORT);
                aviso.show();

                return true;

            case R.id.MenuOpc3:

                mensaje = "Opcion 3 pulsada!";
                aviso = Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_SHORT);
                aviso.show();

                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }

}
