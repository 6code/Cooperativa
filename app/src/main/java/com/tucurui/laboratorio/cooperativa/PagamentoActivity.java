package com.tucurui.laboratorio.cooperativa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class PagamentoActivity extends AppCompatActivity {

    private Button pag;
    private TextView c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagamento);

        pag = (Button) findViewById(R.id.idRealizarPag);
        c = (TextView) findViewById(R.id.idColab);

        Intent intent = getIntent();
        c.setText(intent.getStringExtra("colaborador"));

    }
}
