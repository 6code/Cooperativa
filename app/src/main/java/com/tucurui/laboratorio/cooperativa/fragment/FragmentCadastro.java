package com.tucurui.laboratorio.cooperativa.fragment;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.tucurui.laboratorio.cooperativa.R;

import java.util.ArrayList;
import java.util.List;


public class FragmentCadastro extends Fragment {

    private AlertDialog alertaTipoR;
    private AlertDialog alertaAlterarTipoR;
    private Context context;

    //captura o contexto de quem me chamou
    @Override
    public void onAttach(Context context) {
        this.context = context;
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_cadastro, container, false);

        Button button = (Button) v.findViewById(R.id.tiporesiduo);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertaTipoR();
            }
        });


        return v;
    }



    //ALERTAS
    public void alertaTipoR() {

        LayoutInflater inflater = getLayoutInflater();

        View view = inflater.inflate(R.layout.alerta_tiporesiduo, null);

        List<String> list = new ArrayList<>();
        list.add("papelão");
        list.add("metal");
        list.add("garrafa pet");
        list.add("aluminium");
        list.add("ferro");
        list.add("aço");
        list.add("cobre");
        list.add("plastico");
        list.add("zinco");


        ListView lw = (ListView) view.findViewById(R.id.lisadetiposderesiduos);
        // Create an ArrayAdapter from List
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (context, android.R.layout.simple_list_item_1, list){
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

        lw.setAdapter(arrayAdapter);

        lw.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        alertaAlterarTipoR();

            }
        });

        Button salvar =(Button) view.findViewById(R.id.salvar);
        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertaTipoR.dismiss();
            }
        });

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Defina o tipo de resíduo: ");
        builder.setView(view);
        alertaTipoR = builder.create();
        alertaTipoR.show();

    }


    public void alertaAlterarTipoR() {

        LayoutInflater inflater = getLayoutInflater();

        View view = inflater.inflate(R.layout.alerta_alterar_tiporesiduo, null);

        Button btn = (Button) view.findViewById(R.id.alterar);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                alertaAlterarTipoR.dismiss();

            }
        });

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Alterar tipo de resíduo: ");
        builder.setView(view);
        alertaAlterarTipoR = builder.create();
        alertaAlterarTipoR.show();

    }


    }
