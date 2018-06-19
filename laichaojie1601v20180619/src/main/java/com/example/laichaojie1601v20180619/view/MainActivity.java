package com.example.laichaojie1601v20180619.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.laichaojie1601v20180619.R;
import com.example.laichaojie1601v20180619.persenter.LoginPresenter;

public class MainActivity extends AppCompatActivity implements LoginPresenter.MainPresenter{

    private EditText name;
    private EditText posswrod;
    private EditText qr;
    private LoginPresenter loginPresenter;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        posswrod =  findViewById(R.id.posswrod);
        qr = findViewById(R.id.qr_posswrod);
        login = findViewById(R.id.login);
        loginPresenter = new LoginPresenter(this);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.toString() != qr.toString()){
                    Toast.makeText(MainActivity.this,"密码不一致",Toast.LENGTH_LONG).show();
                } else {
                    loginPresenter.loginClick("reg", name.getText().toString(), posswrod.getText().toString());
                    Toast.makeText(MainActivity.this,"已注册",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(intent);
                }
            }
        });

    }

    @Override
    public void lClick(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void rClick() {

    }

}
