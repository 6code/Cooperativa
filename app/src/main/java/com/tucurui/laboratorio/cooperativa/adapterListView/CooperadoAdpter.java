package com.tucurui.laboratorio.cooperativa.adapterListView;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import com.tucurui.laboratorio.cooperativa.R;
import com.tucurui.laboratorio.cooperativa.models.Cooperado;

import java.util.List;

public class CooperadoAdpter extends ArrayAdapter<Cooperado> {

    private Context context;
    private List<Cooperado> cooperados;

    public CooperadoAdpter(Context context, List<Cooperado> pedidoList) {
        super(context, R.layout.layout_listcriterio, pedidoList);
        this.context = context;
        this.cooperados = pedidoList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.layout_listcriterio, parent, false);

        TextView nomeSaldo = view.findViewById(R.id.id_nome_saldo);
        EditText valorSaldo = view.findViewById(R.id.id_editsaldo);

        Cooperado c = cooperados.get(position);

        nomeSaldo.setText(c.getNome() + " R$: ");

        return view;
    }
}
