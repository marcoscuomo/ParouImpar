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
    private TextView nComputador, somaTotal, parOuImpar, ganhador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
