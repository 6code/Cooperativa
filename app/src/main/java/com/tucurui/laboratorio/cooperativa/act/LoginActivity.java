package com.tucurui.laboratorio.cooperativa.act;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.tucurui.laboratorio.cooperativa.R;

public class LoginActivity extends AppCompatActivity {

    private Button logar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        logar = findViewById(R.id.id_login_logar);
        logar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), TabActivity.class);
                ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(),R.anim.entrada, R.anim.mover_direita);
                ActivityCompat.startActivity(LoginActivity.this, intent, activityOptionsCompat.toBundle());

                //startActivity(intent);



            }
        });


        TextView cadastar = findViewById(R.id.cadastrar);
        cadastar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), CadastroActivity.class);
                startActivity(intent);
            }
        });

    }
}
