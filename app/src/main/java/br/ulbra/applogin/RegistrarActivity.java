package br.ulbra.applogin;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegistrarActivity extends AppCompatActivity {
    EditText edtNome, edtUser, edtPas1, edtPas2;
    Button btSalvar, btnVoltar;

    DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telado_cadastro_do_usuario);

        // INICIALIZA O BANCO
        db = new DBHelper(this);

        edtNome = findViewById(R.id.edNome);
        edtUser = findViewById(R.id.edUser);
        edtPas1 = findViewById(R.id.edPass1);
        edtPas2 = findViewById(R.id.edPass2);

        btSalvar = findViewById(R.id.btSalvar);
        btnVoltar = findViewById(R.id.btnVoltar);

        btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String userName = edtUser.getText().toString().trim();
                String pas1 = edtPas1.getText().toString().trim();
                String pas2 = edtPas2.getText().toString().trim();

                if (userName.equals("")) {

                    Toast.makeText(RegistrarActivity.this,
                            "Insira o LOGIN DO USUÁRIO",
                            Toast.LENGTH_SHORT).show();

                } else if (pas1.equals("") || pas2.equals("")) {

                    Toast.makeText(RegistrarActivity.this,
                            "Insira a SENHA DO USUÁRIO",
                            Toast.LENGTH_SHORT).show();

                } else if (!pas1.equals(pas2)) {

                    Toast.makeText(RegistrarActivity.this,
                            "As senhas não correspondem",
                            Toast.LENGTH_SHORT).show();

                } else {

                    long res = db.criarUtilizador(userName, pas1);

                    if (res > 0) {

                        Toast.makeText(RegistrarActivity.this,
                                "Registro OK",
                                Toast.LENGTH_SHORT).show();

                    } else {

                        Toast.makeText(RegistrarActivity.this,
                                "Erro ao registrar",
                                Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();

            }
        });
    }
}