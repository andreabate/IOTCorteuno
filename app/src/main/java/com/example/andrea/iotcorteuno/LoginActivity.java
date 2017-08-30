package com.example.andrea.iotcorteuno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.namelogin)
    EditText names;

    @BindView(R.id.lastnamelogin)
    EditText lastnames;

    @BindView(R.id.addresslogin)
    EditText address;

    @BindView(R.id.emaillogin)
    EditText email;

    @BindView(R.id.enviarlogin)
    Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick (R.id.enviarlogin)
    public void enviar(){
        String nombres = names.getText().toString();
        String apellidos = lastnames.getText().toString();
        String direccion = address.getText().toString();
        String correo = email.getText().toString();

        Intent intent = new Intent(LoginActivity.this, InfoActivity.class);

        intent.putExtra("Nombres",nombres);
        intent.putExtra("Apellidos", apellidos);
        intent.putExtra("Direccion", direccion);
        intent.putExtra("Email", correo);

        startActivity(intent);


    }

}
