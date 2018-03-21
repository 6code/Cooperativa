package com.tucurui.laboratorio.cooperativa.act;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.tucurui.laboratorio.cooperativa.R;
import com.tucurui.laboratorio.cooperativa.models.Venda;

import java.util.ArrayList;
import java.util.List;

public class VendaActivity extends AppCompatActivity {

    TextView tw;
    private AlertDialog dialog1;
    private AlertDialog dialog2;
    private AlertDialog dialog3;
    private AlertDialog dialog4;
    private AlertDialog dialog5;
    private ListView lw1;
    private ListView lw2;
    private List<String> list;
    private ArrayAdapter<String> adapter1;
    private ArrayAdapter<String> adapter2;
    private ArrayAdapter<String> adapter3;
    private ArrayAdapter<String> adapter4;
    private ArrayAdapter<String> adapter5;
    private Venda venda = new Venda();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venda);

        venda.setProdruto("");
        venda.setComprador("");
        venda.setQuantidade("");
        venda.setValor("");
        venda.setCriterio("Proporcional");

        tw = findViewById(R.id.id_TEXTVIEW_statusvenda);
        tw.setText(venda.toString());

        Button btn1 = findViewById(R.id.id_btn_venda_selecionarProduto);
        Button btn2 = findViewById(R.id.id_btn_venda_selecionarComprador);
        Button btn3 = findViewById(R.id.id_btn_venda_defnirQuantidade);

        Button btn5 = findViewById(R.id.id_btn_venda_defnirCriterio);
        Button btn6 = findViewById(R.id.id_btn_venda_realizarVenda);



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

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), PersonalizarCriterioActivity.class);
                intent.putExtra("produto", venda.getProdruto());
                intent.putExtra("comprador", venda.getComprador());
                intent.putExtra("valor", venda.getValor());
                intent.putExtra("quantidade", venda.getQuantidade());
                intent.putExtra("criterio", venda.getCriterio());

                startActivity(intent);

            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Venda realizada com sucesso!!", Toast.LENGTH_LONG).show();
                finish();
            }
        });


    }


    public void alerta1() {

        LayoutInflater inflater = getLayoutInflater();

        View view = inflater.inflate(R.layout.alerta_venda_selecionarproduto, null);

        final List<String> list1 = new ArrayList<>();
        list1.add("Ferro");
        list1.add("Papelão");
        list1.add("Plastico");



        lw1 = view.findViewById(R.id.id_venda_listcompradores);
        adapter1 = new ArrayAdapter<String>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, list1);
        lw1.setAdapter(adapter1);


        lw1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                venda.setProdruto(list1.get(i));
                tw.setText(venda.toString());
                dialog1.dismiss();

            }
        });

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Produto: ");
        builder.setView(view);
        dialog1 = builder.create();
        dialog1.show();
    }

    public void alerta2() {

        LayoutInflater inflater = getLayoutInflater();

        View view = inflater.inflate(R.layout.alerta_venda_selecionarcomprador, null);

        final List<String> list2 = new ArrayList<>();
        list2.add("Metalurgica são josé");
        list2.add("Prefeitura Municipal");
        list2.add("Joã franciso da silva");

        lw2 = view.findViewById(R.id.id_venda_listcompradores);
        adapter2 = new ArrayAdapter<String>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, list2);
        lw2.setAdapter(adapter2);


        lw2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                venda.setComprador(list2.get(i));
                tw.setText(venda.toString());
                dialog2.dismiss();
            }
        });

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Comprador: ");
        builder.setView(view);
        dialog2 = builder.create();
        dialog2.show();

    }

    public void alerta3() {

        LayoutInflater inflater = getLayoutInflater();

        View view = inflater.inflate(R.layout.alerta_venda_definirquantidade, null);

        Button btn4 = view.findViewById(R.id.id_btn_defnirQtdeValor);

        final EditText editText1 = view.findViewById(R.id.id_edit_qtde);
        final EditText editText2 = view.findViewById(R.id.id_edit_valor);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Float v = Float.valueOf(editText2.getText().toString().trim());
                Float q = Float.valueOf(editText1.getText().toString().trim());

                Float valor = v * q;

                venda.setQuantidade(editText1.getText().toString().trim());
                venda.setValor(String.valueOf(valor));
                tw.setText(venda.toString());
                dialog3.dismiss();
            }
        });


        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Quantidade/Valor: ");
        builder.setView(view);
        dialog3 = builder.create();
        dialog3.show();

    }


}
