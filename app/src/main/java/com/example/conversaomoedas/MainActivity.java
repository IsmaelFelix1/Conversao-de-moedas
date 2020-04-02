package com.example.conversaomoedas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener {
    private  ViewHolder mViewHolder = new ViewHolder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.editValue = findViewById(R.id.edit_value);
        this.mViewHolder.TextDolar = findViewById(R.id.Text_dolar);
        this.mViewHolder.TextEuro = findViewById(R.id.TextEuro);
        this.mViewHolder.TextEuro = findViewById(R.id.TextEuro);
        this.mViewHolder.buttonCalculate = findViewById(R.id.buttonCalculate);
        this.mViewHolder.buttonCalculate.setOnClickListener(this);
        this.mViewHolder.TextDolar.setOnClickListener(this);
        this.clearValues();
    }


    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.buttonCalculate){
            String value = this.mViewHolder.editValue.getText().toString();
            if("".equals(value)) {
                Toast.makeText(this, R.string.informe_valor, Toast.LENGTH_LONG).show();
            } else{
                Double real = Double.valueOf(value);
            }
        }
    }

    private void clearValues(){
        this.mViewHolder.TextDolar.setText("");
    }
    private static class ViewHolder {

        EditText editValue;
        TextView TextDolar;
        TextView TextEuro;
        Button buttonCalculate;
    }
}
