package com.tucurui.laboratorio.cooperativa.fragment;

import android.content.Context;
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

import com.tucurui.laboratorio.cooperativa.R;

import java.util.ArrayList;
import java.util.List;


public class FragmentCadastro extends Fragment {

    private AlertDialog alertaTipoR;
    private AlertDialog alertaAlterarTipoR;
    private AlertDialog alertaCadastarFuncao;
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

        Button button1 = v.findViewById(R.id.tiporesiduo);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertaTipoR();
            }
        });

        Button button2 = v.findViewById(R.id.id_btn_cadastroCooperados);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertaCadastrarCooperados();
            }
        });

        Button button3 = v.findViewById(R.id.id_btn_cadastroCompradores);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertaCadastrarCompradores();
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


        ListView lw = view.findViewById(R.id.lisadetiposderesiduos);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(context, R.layout.support_simple_spinner_dropdown_item, list);
        lw.setAdapter(arrayAdapter);

        lw.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                alertaAlterarTipoR();

            }
        });

        Button salvar = view.findViewById(R.id.salvar);
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

        Button btn = view.findViewById(R.id.alterar);
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


    public void alertaCadastrarCooperados() {

        AlertDialog dialog;

        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.alerta_cadastar_cooperados, null);

        ListView listView = view.findViewById(R.id.id_list_alerta_cadastroCooperados);

        List<String> list = new ArrayList<>();

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

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(context, R.layout.support_simple_spinner_dropdown_item, list);
        listView.setAdapter(adapter);


        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Cadastrar cooperado: ");
        builder.setView(view);
        dialog = builder.create();
        dialog.show();

    }


    public void alertaCadastrarCompradores() {

        AlertDialog dialog;

        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.alerta_cadastro_compradores, null);

        ListView listView = view.findViewById(R.id.id_list_alerta_cadastroCompradores);

        List<String> list = new ArrayList<>();

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

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(context, R.layout.support_simple_spinner_dropdown_item, list);
        listView.setAdapter(adapter);


        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("cadastar comprador: ");
        builder.setView(view);
        dialog = builder.create();
        dialog.show();

    }

}


