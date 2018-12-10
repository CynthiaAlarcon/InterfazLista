package cynthia.interfazlista;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.InputType;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class VentanaDetalle {

    public VentanaDetalle(Context contexto) {
        final Dialog dialogo = new Dialog(contexto);
        dialogo.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialogo.setCancelable(false);
        dialogo.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialogo.setContentView(R.layout.activity_main);

        final EditText nombre = (EditText) dialogo.findViewById(R.id.nombreText);
        final EditText precio = (EditText) dialogo.findViewById(R.id.precio);
        final EditText cantidad = (EditText) dialogo.findViewById(R.id.cantidad);
        Button aceptar = (Button) dialogo.findViewById(R.id.aceptarbtn);
        Button cancelar = (Button) dialogo.findViewById(R.id.cancelar);

        nombre.setInputType(InputType.TYPE_CLASS_TEXT);
        precio.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);

        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogo.dismiss();
            }
        });

        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogo.dismiss();
            }
        });
        dialogo.show();
    }
}
