package com.tucurui.laboratorio.cooperativa.adapterListView;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
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

        TextView t1 = view.findViewById(R.id.nome);
        TextView t2 = view.findViewById(R.id.qtdeEstoque);
        final TextView t3 = view.findViewById(R.id.qtdeVenda);
        final EditText text = view.findViewById(R.id.editVenda);
        Button btn = view.findViewById(R.id.btnAlterar);

        final Cooperado c = cooperados.get(position);

        t1.setText(c.getNome());
        t2.setText("quantidade no estoque: " + c.getEstoque() + "Kg");
        t3.setText("quantidade à ser vendido: " + c.getQtdVenda() + "Kg");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t3.setText("quantidade à ser vendido: " + text.getText().toString().trim() + "Kg");
                c.setQtdVenda(text.getText().toString().trim());

            }
        });



        return view;
    }
}
