package br.com.mojumob.parouimpar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //Atributos
    private EditText edtNumero;
    private Button btnPar, btnImpar;
    private TextView txtNComputador, txtSomaTotal, txtParOuImpar, txtGanhador;

    //Constantes
    private final String PAR = "par";
    private final String IMPAR = "impar";
    private final String VITORIA = "Parabéns, você ganhou :) ";
    private final String DERROTA = "Sinto muito, você perdeu :( ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicializações
        edtNumero      = findViewById(R.id.edtNumero);
        btnImpar       = findViewById(R.id.btnImpar);
        btnPar         = findViewById(R.id.btnPar);
        txtNComputador = findViewById(R.id.txtNumeroComputador);
        txtSomaTotal   = findViewById(R.id.txtNumeroResultado);
        txtParOuImpar  = findViewById(R.id.txtParouImpar);
        txtGanhador    = findViewById(R.id.txtGanhador);


        //Tratando ação de clique nos botoes
        btnPar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                parOuImpar(PAR);
            }
        });

        btnImpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                parOuImpar(IMPAR);
            }
        });

    }

    private void parOuImpar(String escolha) {

        //Criando o numero do computador
        int nComputador =  new Random().nextInt(11);
        String numeroPC = String.valueOf(nComputador);
        txtNComputador.setText(numeroPC);

        //Definindo o numero do usuario
        int nUsuario = Integer.parseInt(edtNumero.getText().toString());

        //Somando
        int soma = nComputador + nUsuario;
        String numeroTotal = String.valueOf(soma);
        txtSomaTotal.setText(numeroTotal);

        //Verificando se a soma é par ou impar
        double res = soma / 2;

        String resultado;
        if(res % 2 == 0){
            resultado = PAR;
            txtParOuImpar.setText(PAR);
        }else{
            resultado = IMPAR;
            txtParOuImpar.setText(IMPAR);
        }

        if((escolha == PAR && resultado == PAR) || (escolha == IMPAR && resultado == IMPAR)){
            txtGanhador.setText(VITORIA);
        }else{
            txtGanhador.setText(DERROTA);
        }
    }
}
