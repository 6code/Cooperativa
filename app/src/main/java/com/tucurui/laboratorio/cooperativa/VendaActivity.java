package com.tucurui.laboratorio.cooperativa;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class VendaActivity extends AppCompatActivity {

    private AlertDialog dialog1;
    private AlertDialog dialog2;
    private AlertDialog dialog3;
    private AlertDialog dialog4;
    private AlertDialog dialog5;

    private ListView lw1;
    private ListView lw2;
    private ListView lw3;
    private ListView lw4;
    private ListView lw5;

    private List<String> list;
    private ArrayAdapter<String> adapter1;
    private ArrayAdapter<String> adapter2;
    private ArrayAdapter<String> adapter3;
    private ArrayAdapter<String> adapter4;
    private ArrayAdapter<String> adapter5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venda);


        list = new ArrayList<>();
        list.add("exemplo");
        list.add("exemplo");
        list.add("exemplo");
        list.add("exemplo");
        list.add("exemplo");
        list.add("exemplo");
        list.add("exemplo");
        list.add("exemplo");
        list.add("exemplo");
        list.add("exemplo");
        list.add("exemplo");
        list.add("exemplo");
        list.add("exemplo");
        list.add("exemplo");
        list.add("exemplo");
        list.add("exemplo");
        list.add("exemplo");
        list.add("exemplo");

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

        lw1 = view.findViewById(R.id.id_venda_listcompradores);
        adapter1 = new ArrayAdapter<String>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, list);
        lw1.setAdapter(adapter1);


        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Produto: ");
        builder.setView(view);
        dialog1 = builder.create();
        dialog1.show();

    }

    public void alerta2() {

        LayoutInflater inflater = getLayoutInflater();

        View view = inflater.inflate(R.layout.alerta_venda_selecionarcomprador, null);

        lw2 = view.findViewById(R.id.id_venda_listcompradores);
        adapter2 = new ArrayAdapter<String>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, list);
        lw2.setAdapter(adapter2);


        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Comprador: ");
        builder.setView(view);
        dialog2 = builder.create();
        dialog2.show();

    }

    public void alerta3() {

        LayoutInflater inflater = getLayoutInflater();

        View view = inflater.inflate(R.layout.alerta_venda_definirquantidade, null);


        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Qunatirade: ");
        builder.setView(view);
        dialog3 = builder.create();
        dialog3.show();

    }

    public void alerta4() {

        LayoutInflater inflater = getLayoutInflater();

        View view = inflater.inflate(R.layout.alerta_venda_definirvalor, null);


        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Valor: ");
        builder.setView(view);
        dialog4 = builder.create();
        dialog4.show();

    }

    public void alerta5() {

        LayoutInflater inflater = getLayoutInflater();

        View view = inflater.inflate(R.layout.alerta_venda_definircriterio, null);

        lw5 = view.findViewById(R.id.id_venda_listcriterio);
        adapter5 = new ArrayAdapter<String>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, list);
        lw5.setAdapter(adapter5);


        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("");
        builder.setView(view);
        dialog5 = builder.create();
        dialog5.show();

    }
}
