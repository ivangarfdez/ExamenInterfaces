package com.example.ivan.interfacesexamenivangarcia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Declaramos todos los views que vamos a usar
        //editText

        final EditText nombre = (EditText) findViewById(R.id.escribenombre);
        final EditText localizacion = (EditText) findViewById(R.id.escribelocalizacion);

        //Grupo de botones radio
        final RadioGroup rGrupo = (RadioGroup) findViewById(R.id.eligesexo);

        //Boton radio
        final RadioButton radioHombre = (RadioButton) findViewById(R.id.btnhombre);
        final RadioButton radioMujer = (RadioButton) findViewById(R.id.btnmujer);

        //Declaramos el webview con el boton de FloridaOberta


        //Ahora usamos un Switch para poder
        //hacer la seleccion de un RadioButton
        String cadena = null;

        switch (rGrupo.getCheckedRadioButtonId()) {
            //Opcion1 Hombre
            case R.id.btnhombre:
                cadena = "Hombre";
                break;

            //Opcion2 Mujer
            case R.id.btnmujer:
                cadena = "Mujer";
                break;
        }

        //Listener boton aceptar.
        Button aceptar = (Button) findViewById(R.id.btnSeleccionar);
        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Cambiamos de clase.
                Intent intent = new Intent(getApplicationContext(), Main2.class);
                startActivity(intent);
            }
        });
            }



    public void floridaoberta(View button3) throws Exception {
        String link = "http://www.floridaoberta.com";
        Intent intent = null;
        intent = new Intent(intent.ACTION_VIEW, Uri.parse(link));
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        //Ahora tenemos que implementar un switch para que haga algo
        //de lo que seleccionemos.

        //Lo cogemos de submenu que hemos creado antes


        switch (item.getItemId()) {
            case R.id.escribenombre:
                Toast.makeText(getApplicationContext(), "Copiar", Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), "Pegar", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.escribelocalizacion:
                Toast.makeText(getApplicationContext(), "Copiar", Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), "Pegar", Toast.LENGTH_SHORT).show();
            default:
                return false;
        }
    }
}
