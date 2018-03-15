package com.tucurui.laboratorio.cooperativa;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button iraotrabalho;
    private ListView listView;
    private ArrayAdapter<String> adapter;
    private List<String> list;
    private TextView tw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = new ArrayList<>();
        list.add("João fernandes - saldo R$: 200,00");
        list.add("Maria silva - saldo R$: 100,00");
        list.add("Eduardo lima - saldo R$: 230,00");
        list.add("Eurialdo mendes - saldo R$: 300,00");
        list.add("Heleno fulber - saldo R$: 60,00");
        list.add("Fernanda santos - saldo R$: 20,00");
        list.add("Telma ferreira - saldo R$: 400,00");
        list.add("Leonardo nascimento - saldo R$: 140,00");
        list.add("Maria de lurdes - saldo R$: 40,00");
        list.add("Tiana santos - saldo R$: 30,00");
        list.add("Eliene correia - saldo R$: 1200,00");

        listView = (ListView) findViewById(R.id.list);

        // Create an ArrayAdapter from List
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, list){
            @Override
            public View getView(int position, View convertView, ViewGroup parent){
                // Get the Item from ListView
                View view = super.getView(position, convertView, parent);

                // Initialize a TextView for ListView each Item
                TextView tv = (TextView) view.findViewById(android.R.id.text1);

                // Set the text color of TextView (ListView Item)
                tv.setTextColor(Color.RED);

                // Generate ListView Item using TextView
                return view;
            }
        };

        // DataBind ListView with items from ArrayAdapter
        listView.setAdapter(arrayAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(getApplicationContext(), PagamentoActivity.class);

                intent.putExtra("colaborador", list.get(i));
                startActivity(intent);

            }
        });


        iraotrabalho = (Button) findViewById(R.id.id_iraotrabalho);
        iraotrabalho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), TabActivity.class);
                startActivity(intent);

            }
        });



        tw = (TextView) findViewById(R.id.config);
        tw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), ConfiguracoesActivity.class);
                startActivity(intent);
            }
        });


    }
}
