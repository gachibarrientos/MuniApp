package generic.muniapp;
/**
 * Created by Gachi on 26/4/2016.
 */
import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;

import generic.muniapp.R;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Typeface miPropiaTypeFace = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Light.ttf");
        TextView tituloSplash= (TextView) findViewById(R.id.txtTituloSplash);
        tituloSplash.setTypeface(miPropiaTypeFace);
        TextView subtituloSplash= (TextView) findViewById(R.id.txtSubtituloSplash);
        subtituloSplash.setTypeface(miPropiaTypeFace);
        TextView txtLoading= (TextView) findViewById(R.id.txtLoading);
        txtLoading.setTypeface(miPropiaTypeFace);
        showBasicSplash();
        }

    private void showBasicSplash() {

        Thread thread = new Thread() {

            @Override
            public void run() {
                synchronized (this) {
                    try {
                        wait(5000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {

                        startActivity(new Intent(getBaseContext(),
                                Login.class));
                        finish();
                    }
                }
            }
        };

        // start thread
        thread.start();

    }

}