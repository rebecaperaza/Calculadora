package cr.ac.ucr.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView operacion;
    private String operador;
    private Double a, b;
    private Double resultado;
    private Button btn_suma;
    private Button btn_resta;
    private Button btn_ac;
    private Button btn_multiplicacion;
    private Button btn_division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operacion = findViewById(R.id.et_numeros);
        btn_suma = findViewById(R.id.suma);
        btn_resta = findViewById(R.id.resta);
        btn_ac = findViewById(R.id.limpiar);
        btn_multiplicacion = findViewById(R.id.multiplicacion);
        btn_division = findViewById(R.id.division);

    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.uno:
                operacion.setText("1");
                a = 1.0;
                break;
            case R.id.dos:
                operacion.setText("2");
                a = 2.0;
                break;
            case R.id.tres:
                operacion.setText("3");
                a = 3.0;
                break;
            case R.id.cuatro:
                operacion.setText("4");
                a = 4.0;
                break;
            case R.id.cinco:
                operacion.setText("5");
                a = 5.0;
                break;
            case R.id.seis:
                operacion.setText("6");
                a = 6.0;
                break;
            case R.id.siete:
                operacion.setText("7");
                a = 7.0;
                break;
            case R.id.ocho:
                operacion.setText("8");
                a = 8.0;
                break;
            case R.id.nueve:
                operacion.setText("9");
                a = 9.0;
                break;
            case R.id.cero:
                operacion.setText("0");
                a = 0.0;
                break;
            case R.id.igual:
                proceso();
                break;
        }
        if (btn_suma.isPressed()){
            operador = "+";
            b = a;
        } if (btn_resta.isPressed()){
            operador = "-";
            b = a;
        } if (btn_multiplicacion.isPressed()){
            operador = "*";
            b = a;
        }if (btn_division.isPressed()){
            operador = "/";
            b = a;
        }if (btn_ac.isPressed()){
            operacion.setText("0");
            a = 0.0;
            b = 0.0;
        }
    }

    private void proceso(){
        if (operador.equals("+")){
            resultado =  a + b;
        } if (operador.equals("-")){
            resultado = b - a;
        } if (operador.equals("*")){
            resultado = a * b;
        } if (operador.equals("/")){
            resultado = b / a;
        }
        operacion.setText(String.valueOf(resultado));
    }

}