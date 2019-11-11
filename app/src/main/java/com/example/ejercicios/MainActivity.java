package com.example.ejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //Actividad 1

    /*private TextView tvSaludo;
    private TextView tvNombre;
    private TextView tvApellido;
    private Button bSaludo;
    */

    //Actividad 2

    /*private TextView tvFact;
    private TextView tvExplain;
    private TextView tvNumero;
    private Button bCalcula;
    private TextView tvResult;
     */

    //Actividad 3

    /*private TextView tvTitulo;
    private TextView tvDesc;
    private ImageView ivMoneda;
    private TextView tvGanador;
    private Button bCara;
    private Button bCruz;*/

    //Actividad 4

    private TextView tvTitulo;
    private Button bPiedra;
    private Button bTijera;
    private Button bPapel;
    private TextView tvResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rps);


        //Actividad 1
        /*tvSaludo = findViewById(R.id.tvSaludo);
        tvNombre = findViewById(R.id.tvNombre);
        tvApellido = findViewById(R.id.tvApellido);
        bSaludo = findViewById(R.id.bSaludo);

        bSaludo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hola "+tvNombre.getText()+" "+tvApellido.getText(), Toast.LENGTH_SHORT).show();
            }
        });*/

        //Actividad 2

        /*tvFact = findViewById(R.id.tvFact);
        tvExplain = findViewById(R.id.tvExplain);
        tvNumero = findViewById(R.id.tvNumero);
        bCalcula = findViewById(R.id.bCalcula);
        tvResult = findViewById(R.id.tvResult);

        bCalcula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int res=1;
                int num;
                num = Integer.parseInt(tvNumero.getText().toString());

                if (num==0) {
                    res=0;
                }else {
                    for(int i=num; i>0; i--) {
                        res=res*i;
                    }
                }


                tvResult.setText(String.valueOf(res));
            }
        });

         */

        //Actividad 3

        /*tvTitulo = findViewById(R.id.tvTitulo);
        tvDesc = findViewById(R.id.tvDesc);
        ivMoneda = findViewById(R.id.ivMoneda);
        bCara = findViewById(R.id.bCara);
        bCruz = findViewById(R.id.bCruz);
        tvGanador = findViewById(R.id.tvGanador);

        bCara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rnd = new Random();
                int numGanador;
                final int numCara=0;
                numGanador=rnd.nextInt(2);
                if (numGanador==0) {
                    ivMoneda.setImageResource(R.drawable.euro_cara);
                }else {
                    ivMoneda.setImageResource(R.drawable.euro_cruz);
                }

                if(numCara==numGanador){
                    tvGanador.setText("Has ganado");
                }else{
                    tvGanador.setText("Has perdido");
                }
            }
        });

        bCruz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rnd = new Random();
                int numGanador;
                final int numCara=1;

                numGanador=rnd.nextInt(2);
                if (numGanador==0) {
                    ivMoneda.setImageResource(R.drawable.euro_cara);
                }else {
                    ivMoneda.setImageResource(R.drawable.euro_cruz);
                }

                if(numCara==numGanador){
                    tvGanador.setText("Has ganado");
                }else{
                    tvGanador.setText("Has perdido");
                }
            }
        });*/

        //Actividad 4

        tvTitulo = findViewById(R.id.tvTitulo);
        bPapel = findViewById(R.id.bPapel);
        bTijera = findViewById(R.id.bTijera);
        bPiedra = findViewById(R.id.bPiedra);
        tvResultado = findViewById(R.id.tvResultado);

        final int PIEDRA = 0;
        final int PAPEL = 1;
        final int TIJERA = 2;

        bPapel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rnd = new Random();
                int rps;

                rps = rnd.nextInt(3);

                if(rps == PAPEL) {
                    tvResultado.setText("HAS EMPATADO");
                }else if(rps == TIJERA){
                    tvResultado.setText("HAS PERDIDO");
                }else {
                    tvResultado.setText("HAS GANADO");
                }

            }
        });

        bPiedra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rnd = new Random();
                int rps;

                rps = rnd.nextInt(3);

                if(rps == PIEDRA) {
                    tvResultado.setText("HAS EMPATADO");
                }else if(rps == PAPEL){
                    tvResultado.setText("HAS PERDIDO");
                }else {
                    tvResultado.setText("HAS GANADO");
                }
            }
        });

        bTijera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rnd = new Random();
                int rps;

                rps = rnd.nextInt(3);

                if(rps == TIJERA) {
                    tvResultado.setText("HAS EMPATADO");
                }else if(rps == PIEDRA){
                    tvResultado.setText("HAS PERDIDO");
                }else {
                    tvResultado.setText("HAS GANADO");
                }
            }
        });

    }
}
