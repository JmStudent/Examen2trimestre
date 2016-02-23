package com.salesianoscadiz.dam2.penagarciajosemanuel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class Principal extends AppCompatActivity {

    //Creamos variables
    private EditText mInsertAge = null;
    private EditText mInsertSons = null;
    private float discSons = 0;
    private int incremento = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        //Damos valores a las variables
        mInsertAge = (EditText) findViewById(R.id.insertaedad);
        mInsertSons = (EditText) findViewById(R.id.insertaHijos);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        //return super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        //int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*
        if (id == R.id.action_settings) {
            return true;
        }
        */
        switch (item.getItemId()) {
            case R.id.borrar:
                mInsertAge.setText("");
                mInsertSons.setText("");
                discSons = 0;
                incremento = 0;
                break;
            case R.id.cambiar:
                String edadCadena = mInsertAge.getText().toString();
                if(TextUtils.isEmpty(edadCadena)) {
                    mInsertAge.setError("Este campo no puede quedar vacío");
                    break;
                }
                String edadCadena2 = mInsertSons.getText().toString();
                if(TextUtils.isEmpty(edadCadena2)) {
                    mInsertSons.setError("Este campo no puede quedar vacío");
                    break;
                }
                Intent myIntent = new Intent(this, actividadDos.class);
                myIntent.putExtra("disSons", discSons).putExtra("incremento", incremento);
                startActivity(myIntent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
