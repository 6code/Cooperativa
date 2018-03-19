package com.tucurui.laboratorio.cooperativa.fragment;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.tucurui.laboratorio.cooperativa.R;
import com.tucurui.laboratorio.cooperativa.act.PagamentoActivity;

import java.util.ArrayList;
import java.util.List;


public class FragmentCaixa extends Fragment {

    private Context context;
    private Button iraotrabalho;
    private ListView listView;
    private ArrayAdapter<String> adapter;
    private List<String> list;
    private TextView tw;

    //captura o contexto de quem me chamou
    @Override
    public void onAttach(Context context) {
        this.context = context;
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_caixa, container, false);


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

        listView = v.findViewById(R.id.list);

        // Create an ArrayAdapter from List
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (context, android.R.layout.simple_list_item_1, list) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent){
                // Get the Item from ListView
                View view = super.getView(position, convertView, parent);

                // Initialize a TextView for ListView each Item
                TextView tv = view.findViewById(android.R.id.text1);

                // Set the text color of TextView (ListView Item)
                tv.setTextColor(Color.BLACK);

                // Generate ListView Item using TextView
                return view;
            }
        };

        // DataBind ListView with items from ArrayAdapter
        listView.setAdapter(arrayAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(context, PagamentoActivity.class);

                intent.putExtra("colaborador", list.get(i));
                startActivity(intent);

            }
        });


        return v;
    }

}
