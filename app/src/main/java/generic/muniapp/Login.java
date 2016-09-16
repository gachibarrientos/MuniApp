package generic.muniapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Typeface miPropiaTypeFace = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Light.ttf");
        EditText usuario= (EditText) findViewById(R.id.txtUsuario);
        usuario.setTypeface(miPropiaTypeFace);
        EditText contraseña= (EditText) findViewById(R.id.txtContraseña);
        contraseña.setTypeface(miPropiaTypeFace);
        TextView btnRegistro= (TextView) findViewById(R.id.txtRegistro);
        btnRegistro.setTypeface(miPropiaTypeFace);
        Button btnIngresar= (Button) findViewById(R.id.btnIngresar);
        btnIngresar.setTypeface(miPropiaTypeFace);
        Button btnIngresarFacebook= (Button) findViewById(R.id.btnIngresarFace);
        btnIngresarFacebook.setTypeface(miPropiaTypeFace);
        Button btnIngresarInvitado= (Button) findViewById(R.id.btnIngresarInvitado);
        btnIngresarInvitado.setTypeface(miPropiaTypeFace);

        btnIngresarInvitado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Invitado();
            }


        });

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if(condicion)
                onLoginSucess();
                //else onLoginNonSucess;
            }
        });

        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }

    private void onLoginSucess() {
        Intent i = new Intent(Login.this, MenuPrincipal.class);
        startActivity(i);
    }

    private void Invitado() {
        Intent i = new Intent(Login.this, MenuPrincipal.class);
        startActivity(i);
    }
}
