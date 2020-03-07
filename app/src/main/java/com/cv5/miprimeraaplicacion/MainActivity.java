package com.cv5.miprimeraaplicacion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    String miUsuario = "cv5";
    String miPass = "123";
    EditText miEditTextUsuario;
    EditText miEditTextPass;

    ListView listView;

    ArrayList<String> miArraylist;
    ArrayAdapter<String> miArrayAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miEditTextUsuario = findViewById(R.id.editText1);
        miEditTextPass = findViewById(R.id.editText2);

        listView = findViewById(R.id.listView);

        miArraylist = new ArrayList<>();

        miArraylist.add("Cristian");
        miArraylist.add("PAtricia");
        miArraylist.add("Eduardo");

        miArrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, miArraylist);


        listView.setAdapter(miArrayAdapter);

    }


    public void mensaje(View view) {

        String userUsuario = miEditTextUsuario.getText().toString();
        String userPass  = miEditTextPass.getText().toString();

        if(userUsuario.equals(miUsuario) && userPass.equals(miPass)) {

            Intent IrPantalla2 = new Intent(MainActivity.this,PantallaDeBienvenida.class);
            startActivity(IrPantalla2);


        }else{
            Toast.makeText(this, "Incorrecto", Toast.LENGTH_SHORT).show();
        }





    }



}
