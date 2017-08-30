package com.example.andrea.iotcorteuno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class InfoActivity extends AppCompatActivity {

    @BindView(R.id.nameinfo)
    TextView nombresin;

    @BindView(R.id.lastnameinfo)
    TextView apellidosin;

    @BindView(R.id.addressinfo)
    TextView direccionin;

    @BindView(R.id.emailinfo)
    TextView correoin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        ButterKnife.bind(this);

        String nombre =getIntent().getStringExtra("Nombres");
        String apellido = getIntent().getStringExtra("Apellidos");
        String direccion = getIntent().getStringExtra("Direccion");
        String correo = getIntent().getStringExtra("Email");

        nombresin.setText(nombre);
        apellidosin.setText(apellido);
        direccionin.setText(direccion);
        correoin.setText(correo);

    }
}
