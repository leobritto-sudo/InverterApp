package com.example.inverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnInvert, btnLimpar;
    EditText eTxt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                btnInvert = (Button) findViewById(R.id.btnInvert);
                btnLimpar = (Button) findViewById(R.id.btnLimpar);
                eTxt1 = (EditText) findViewById(R.id.eTxt1);
                eTxt1.setHint("Digite um texto: ");
            }
            public void Limpar (View view)
            {
                eTxt1.setText(" ");
            }
            public void Inverter (View view)
            {
                StringBuilder sb  = new StringBuilder();
                for (int i = 0; i < eTxt1.length(); i++) {
                    char ch = eTxt1.getText().toString().charAt(i);
                    if (ch == ' ') {
                        sb.append(' ');
                        continue;
                    }
                    sb.append(i % 2 == 0 ? (char) (ch & 95) : (char)(ch | 32));
                }
                eTxt1.setText(new StringBuilder(sb).reverse().toString());

            }
        }

