package generic.muniapp;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Solicitud extends AppCompatActivity implements View.OnClickListener, DatePickerDialog.OnDateSetListener {
    private String array_spinner[];
    EditText pickerFecha, pickerHora;

    @Override
    public void onClick(View v) {
        DatePickerDialog dialog = new DatePickerDialog(this, this, 2016, 9, 19);
        dialog.show();
    }
    @Override
    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        this.pickerFecha.setText(year+" / "+monthOfYear+" / "+dayOfMonth);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitud);
            array_spinner=new String[5];
        array_spinner[0]="Opcion 1";
        array_spinner[1]="Opcion 2";
        array_spinner[2]="Opcion 3";
        array_spinner[3]="Opcion 4";
        array_spinner[4]="Opcion 5";
        Spinner s = (Spinner) findViewById(R.id.comboProblema);
        ArrayAdapter adapter = new ArrayAdapter(this,
        R.layout.spinner_item, array_spinner);
        s.setAdapter(adapter);

        Typeface miPropiaTypeFace = Typeface.createFromAsset(getAssets(), "fonts/Roboto-Light.ttf");

        TextView lblFecha= (TextView) findViewById(R.id.lblFecha);
        lblFecha.setTypeface(miPropiaTypeFace);
        TextView lblProblema= (TextView) findViewById(R.id.lblProblema);
        lblProblema.setTypeface(miPropiaTypeFace);
        TextView lblDescripcion= (TextView) findViewById(R.id.lblDescripcion);
        lblDescripcion.setTypeface(miPropiaTypeFace);
        EditText txtDescripcion = (EditText) findViewById(R.id.txtDescripcion);
        txtDescripcion.setTypeface(miPropiaTypeFace);

        Button btnContinuarSolicitud= (Button) findViewById(R.id.btnContinuarSolicitud);
        btnContinuarSolicitud.setTypeface(miPropiaTypeFace);

        pickerFecha = (EditText) findViewById(R.id.pickerFecha);
        this.pickerFecha.setOnClickListener(this);
        pickerHora = (EditText) findViewById(R.id.pickerHora);
        pickerHora.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(Solicitud.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        pickerHora.setText( selectedHour + ":" + selectedMinute);
                    }
                }, hour, minute, true);//Yes 24 hour time
                mTimePicker.setTitle("Seleccionar Hora");
                mTimePicker.show();

            }
        });
    }
}