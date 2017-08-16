package com.example.android.operaciones;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Principal extends AppCompatActivity {
 private TextView res;
    private EditText n1, n2;
    private Resources resources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        res=(TextView)findViewById(R.id.lblresultado);
        n1=(EditText)findViewById(R.id.txtnumero1);
        n2=(EditText)findViewById(R.id.txtnumero2);
        resources=this.getResources();
    }

    public void calcular(View v){
        int num1,num2,resl;
        num1 =Integer.parseInt(n1.getText().toString());
        num2 =Integer.parseInt(n2.getText().toString());

        if (n1.getText().toString().isEmpty()){
            n1.setError(resources.getString(R.string.Mensaje_error_uno));
        } if ( n2.getText().toString().isEmpty()){
            n2.setError(resources.getString(R.string.Mensaje_error_dos));
        }else{
            resl=num1+num2;
            res.setText(resl+"");
        }



    }

    public void borrarr(View v){
        n1.setText("");
        n2.setText("");
        res.setText("");
        n1.requestFocus();
    }

}
