package com.example.myapplicationii;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etNotaI;
    private EditText etNotaII;
    private EditText etNotaIII;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNotaI = (EditText) findViewById(R.id.etNotaI);
        etNotaII = (EditText) findViewById(R.id.etNotaII);
        etNotaIII = (EditText) findViewById(R.id.etNotaIII);
        tvResultado = (TextView) findViewById(R.id.tvResultado);

    }
    public void promediar (View view){
        String str_I = this.etNotaI.getText().toString();
        String str_II = this.etNotaII.getText().toString();
        String str_III = this.etNotaIII.getText().toString();

        if (str_I.isEmpty() || str_II.isEmpty() || str_III.isEmpty())
            Toast.makeText(getApplicationContext(), "Todos los campos deben de ser llenados", Toast.LENGTH_SHORT).show();
        else {
            float I = Float.parseFloat(str_I);
            float II = Float.parseFloat(str_II);
            float III = Float.parseFloat(str_III);

            float prom = (I + II + III) / 3;

            String str_prom = String.valueOf(prom);

            tvResultado.setText(str_prom);

        }

    }
}