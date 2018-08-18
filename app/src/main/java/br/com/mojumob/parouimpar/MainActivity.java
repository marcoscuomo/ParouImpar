package br.com.mojumob.parouimpar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Atributos
    private EditText edtNumero;
    private Button btnPar, btnImpar;
    private TextView txtNComputador, txtSomaTotal, txtParOuImpar, txtGanhador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicializações
        edtNumero = findViewById(R.id.edtNumero);
        btnImpar = findViewById(R.id.btnImpar);
        btnPar = findViewById(R.id.btnPar);
        txtNComputador = findViewById(R.id.txtNumeroComputador);
        txtSomaTotal = findViewById(R.id.txtNumeroResultado);
        txtParOuImpar = findViewById(R.id.txtParouImpar);
        txtGanhador = findViewById(R.id.txtGanhador);

    }
}
