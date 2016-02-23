package com.salesianoscadiz.dam2.penagarciajosemanuel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class actividadDos extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{

    //Declaramos variables
    private Switch mEstado = null;
    private TextView mCaja = null;
    private float discSons = 0;
    private int incremento = 0;
    private float importe = 40f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_dos);

        mEstado = (Switch) findViewById(R.id.estado);
        mEstado.setOnCheckedChangeListener(this);

        mCaja = (TextView) findViewById(R.id.cajatexto);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            mCaja.setVisibility(View.VISIBLE);
        } else {
            //discSons = 0;
        }
    }

    public void showText(View v) {
        mCaja.setVisibility(View.VISIBLE);
        mCaja.setText("El importe de su póliza es " + ((importe - discSons) + incremento) + " € / mes ");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_actividad_dos, menu);
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
