package com.tucurui.laboratorio.cooperativa.act;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.tucurui.laboratorio.cooperativa.R;

public class CadastroActivity extends AppCompatActivity {

    private AlertDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        Button button = findViewById(R.id.id_btn_cadastro_cadastrar);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                alerta();

            }
        });

    }

    public void alerta() {

        LayoutInflater inflater = getLayoutInflater();

        View view = inflater.inflate(R.layout.alerta_geralogin, null);

        TextView tl = view.findViewById(R.id.id_textLogin);

        GerarLogin gerarLogin = new GerarLogin();

        String msg = "Login: " + gerarLogin.gerarEmailAleatoro("exemplo") + "\n Senha: " + gerarLogin.gerarSenhaAleatoria();

        tl.setText(msg);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Anote seus dados de login");
        builder.setView(view);
        builder.setIcon(R.drawable.info);
        dialog = builder.create();
        dialog.show();

    }
}
