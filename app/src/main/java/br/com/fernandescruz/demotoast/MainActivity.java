package br.com.fernandescruz.demotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import br.com.fernandescruz.toastlibrary.CustomToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomToast.showWarning(this,"Teste de Warning", Toast.LENGTH_LONG);
        CustomToast.showErro(this,"Teste de Erro", Toast.LENGTH_LONG);
        CustomToast.showInfo(this,"Teste de Info", Toast.LENGTH_LONG);
    }
}
