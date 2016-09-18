package generic.muniapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        Typeface miPropiaTypeFace = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Light.ttf");

        TextView lblPresentacion= (TextView) findViewById(R.id.lblPresentacion);
        lblPresentacion.setTypeface(miPropiaTypeFace);
        TextView lblSub= (TextView) findViewById(R.id.lblSubtitulo);
        lblSub.setTypeface(miPropiaTypeFace);
        TextView lblDetalle= (TextView) findViewById(R.id.lblDetalle);
        lblDetalle.setTypeface(miPropiaTypeFace);

        Button btnNuevoReclamo= (Button) findViewById(R.id.btnNuevoReclamo);
        btnNuevoReclamo.setTypeface(miPropiaTypeFace);
        Button btnInstrucciones= (Button) findViewById(R.id.btnInstrucciones);
        btnInstrucciones.setTypeface(miPropiaTypeFace);
        Button btnHistorial= (Button) findViewById(R.id.btnHistorial);
        btnHistorial.setTypeface(miPropiaTypeFace);
        Button btnPerfil= (Button) findViewById(R.id.btnPerfil);
        btnPerfil.setTypeface(miPropiaTypeFace);

        btnPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ingresarPerfil();
            }


        });
    }

    private void ingresarPerfil() {
        Intent i = new Intent(MenuPrincipal.this, Usuario.class);
        startActivity(i);
    }
}
