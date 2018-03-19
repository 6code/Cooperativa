package com.tucurui.laboratorio.cooperativa.act;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.tucurui.laboratorio.cooperativa.R;
import com.tucurui.laboratorio.cooperativa.adapterListView.CooperadoAdpter;
import com.tucurui.laboratorio.cooperativa.models.Cooperado;

import java.util.ArrayList;
import java.util.List;

public class PersonalizarCriterioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personalizar_criterio);

        ListView lw5 = findViewById(R.id.id_venda_listcriterio);

        List cooperados = new ArrayList();

        cooperados.add(new Cooperado("joao silva de lima", "0"));
        cooperados.add(new Cooperado("joao silva de lima", "0"));
        cooperados.add(new Cooperado("joao silva de lima", "0"));
        cooperados.add(new Cooperado("joao silva de lima", "0"));
        cooperados.add(new Cooperado("joao silva de lima", "0"));
        cooperados.add(new Cooperado("joao silva de lima", "0"));
        cooperados.add(new Cooperado("joao silva de lima", "0"));
        cooperados.add(new Cooperado("joao silva de lima", "0"));
        cooperados.add(new Cooperado("joao silva de lima", "0"));
        cooperados.add(new Cooperado("joao silva de lima", "0"));
        cooperados.add(new Cooperado("joao silva de lima", "0"));
        cooperados.add(new Cooperado("joao silva de lima", "0"));
        cooperados.add(new Cooperado("joao silva de lima", "0"));
        cooperados.add(new Cooperado("joao silva de lima", "0"));
        cooperados.add(new Cooperado("joao silva de lima", "0"));
        cooperados.add(new Cooperado("joao silva de lima", "0"));
        cooperados.add(new Cooperado("joao silva de lima", "0"));
        cooperados.add(new Cooperado("joao silva de lima", "0"));


        ArrayAdapter<Cooperado> adapter = new CooperadoAdpter(getApplicationContext(), cooperados);
        lw5.setAdapter(adapter);


        Button button = findViewById(R.id.id_comfirmar);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });

    }
}
