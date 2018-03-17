package com.tucurui.laboratorio.cooperativa;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class VendaActivity extends AppCompatActivity {

    private AlertDialog dialog1;
    private AlertDialog dialog2;
    private AlertDialog dialog3;
    private AlertDialog dialog4;
    private AlertDialog dialog5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venda);

        Button btn1 = findViewById(R.id.id_btn_venda_selecionarProduto);
        Button btn2 = findViewById(R.id.id_btn_venda_selecionarComprador);
        Button btn3 = findViewById(R.id.id_btn_venda_defnirQuantidade);
        Button btn4 = findViewById(R.id.id_btn_venda_defnirValor);
        Button btn5 = findViewById(R.id.id_btn_venda_defnirCriterio);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alerta1();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alerta2();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alerta3();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alerta4();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alerta5();
            }
        });


    }


    public void alerta1() {

        LayoutInflater inflater = getLayoutInflater();

        View view = inflater.inflate(R.layout.alerta_venda_selecionarproduto, null);


        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("");
        builder.setView(view);
        dialog1 = builder.create();
        dialog1.show();

    }

    public void alerta2() {

        LayoutInflater inflater = getLayoutInflater();

        View view = inflater.inflate(R.layout.alerta_venda_selecionarcomprador, null);


        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("");
        builder.setView(view);
        dialog2 = builder.create();
        dialog2.show();

    }

    public void alerta3() {

        LayoutInflater inflater = getLayoutInflater();

        View view = inflater.inflate(R.layout.alerta_venda_definirquantidade, null);


        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("");
        builder.setView(view);
        dialog3 = builder.create();
        dialog3.show();

    }

    public void alerta4() {

        LayoutInflater inflater = getLayoutInflater();

        View view = inflater.inflate(R.layout.alerta_venda_definirvalor, null);


        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("");
        builder.setView(view);
        dialog4 = builder.create();
        dialog4.show();

    }

    public void alerta5() {

        LayoutInflater inflater = getLayoutInflater();

        View view = inflater.inflate(R.layout.alerta_venda_definircriterio, null);


        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("");
        builder.setView(view);
        dialog5 = builder.create();
        dialog5.show();

    }
}
