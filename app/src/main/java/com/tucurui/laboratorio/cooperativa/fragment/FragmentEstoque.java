package com.tucurui.laboratorio.cooperativa.fragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.tucurui.laboratorio.cooperativa.R;
import com.tucurui.laboratorio.cooperativa.act.VendaActivity;

public class FragmentEstoque extends Fragment {

    private AlertDialog alerta;

    //variavel para capturar contexto
    private Context context;


    //captura o contexto de quem me chamou
    @Override
    public void onAttach(Context context) {
        this.context = context;
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_estoque, container, false);


        Button venda = v.findViewById(R.id.id_venda);
        venda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, VendaActivity.class);
                startActivity(intent);
            }
        });

        return v;
    }

}
