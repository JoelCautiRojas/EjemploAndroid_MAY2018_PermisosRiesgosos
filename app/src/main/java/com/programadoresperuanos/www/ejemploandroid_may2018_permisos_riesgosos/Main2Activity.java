package com.programadoresperuanos.www.ejemploandroid_may2018_permisos_riesgosos;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RelativeLayout;

import static android.Manifest.permission.ACCESS_COARSE_LOCATION;
import static android.Manifest.permission.ACCESS_FINE_LOCATION;
import static android.Manifest.permission.ADD_VOICEMAIL;
import static android.Manifest.permission.BODY_SENSORS;
import static android.Manifest.permission.CALL_PHONE;
import static android.Manifest.permission.CAMERA;
import static android.Manifest.permission.GET_ACCOUNTS;
import static android.Manifest.permission.PROCESS_OUTGOING_CALLS;
import static android.Manifest.permission.READ_CALENDAR;
import static android.Manifest.permission.READ_CALL_LOG;
import static android.Manifest.permission.READ_CONTACTS;
import static android.Manifest.permission.READ_EXTERNAL_STORAGE;
import static android.Manifest.permission.READ_PHONE_STATE;
import static android.Manifest.permission.READ_SMS;
import static android.Manifest.permission.RECEIVE_MMS;
import static android.Manifest.permission.RECEIVE_SMS;
import static android.Manifest.permission.RECEIVE_WAP_PUSH;
import static android.Manifest.permission.RECORD_AUDIO;
import static android.Manifest.permission.SEND_SMS;
import static android.Manifest.permission.USE_SIP;
import static android.Manifest.permission.WRITE_CALENDAR;
import static android.Manifest.permission.WRITE_CALL_LOG;
import static android.Manifest.permission.WRITE_CONTACTS;
import static android.Manifest.permission.WRITE_EXTERNAL_STORAGE;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    RelativeLayout l;
    Snackbar snak1, snak2;
    CheckBox ch1,ch2,ch3,ch4,ch5,ch6,ch7,ch8,ch9,ch10,ch11,ch12,ch13,ch14,ch15,ch16,ch17,ch18,ch19,ch20,ch21,ch22,ch23,ch24;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;

    String[] matrizPermisos1 = new String[]{READ_CALENDAR,WRITE_CALENDAR,CAMERA,READ_CONTACTS,WRITE_CONTACTS,GET_ACCOUNTS,ACCESS_FINE_LOCATION,ACCESS_COARSE_LOCATION,RECORD_AUDIO,READ_PHONE_STATE,CALL_PHONE,READ_CALL_LOG,WRITE_CALL_LOG,ADD_VOICEMAIL,USE_SIP,PROCESS_OUTGOING_CALLS,BODY_SENSORS,SEND_SMS,RECEIVE_SMS,READ_SMS,RECEIVE_WAP_PUSH,RECEIVE_MMS,READ_EXTERNAL_STORAGE,WRITE_EXTERNAL_STORAGE};
    String[] matrizPermisos2 = new String[]{READ_CALENDAR,WRITE_CALENDAR};
    String[] matrizPermisos3 = new String[]{CAMERA};
    String[] matrizPermisos4 = new String[]{READ_CONTACTS,WRITE_CONTACTS,GET_ACCOUNTS};
    String[] matrizPermisos5 = new String[]{ACCESS_FINE_LOCATION,ACCESS_COARSE_LOCATION};
    String[] matrizPermisos6 = new String[]{RECORD_AUDIO};
    String[] matrizPermisos7 = new String[]{READ_PHONE_STATE,CALL_PHONE,READ_CALL_LOG,WRITE_CALL_LOG,ADD_VOICEMAIL,USE_SIP,PROCESS_OUTGOING_CALLS};
    String[] matrizPermisos8 = new String[]{BODY_SENSORS};
    String[] matrizPermisos9 = new String[]{SEND_SMS,RECEIVE_SMS,READ_SMS,RECEIVE_WAP_PUSH,RECEIVE_MMS};
    String[] matrizPermisos10 = new String[]{READ_EXTERNAL_STORAGE,WRITE_EXTERNAL_STORAGE};
    int ALL_PERMISSION = 1;
    int CALENDAR_PERMISSION = 2;
    int CAMERA_PERMISSION = 3;
    int CONTACTS_PERMISSION = 4;
    int LOCATION_PERMISSION = 5;
    int MICROPHONE_PERMISSION = 6;
    int PHONE_PERMISSION = 7;
    int SENSORS_PERMISSION = 8;
    int SMS_PERMISSION = 9;
    int STORAGE_PERMISSION = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        l = findViewById(R.id.milayout2);
        ch1 = findViewById(R.id.checkBox1);
        ch2 = findViewById(R.id.checkBox2);
        ch3 = findViewById(R.id.checkBox3);
        ch4 = findViewById(R.id.checkBox4);
        ch5 = findViewById(R.id.checkBox5);
        ch6 = findViewById(R.id.checkBox6);
        ch7 = findViewById(R.id.checkBox7);
        ch8 = findViewById(R.id.checkBox8);
        ch9 = findViewById(R.id.checkBox9);
        ch10 = findViewById(R.id.checkBox10);
        ch11 = findViewById(R.id.checkBox11);
        ch12 = findViewById(R.id.checkBox12);
        ch13 = findViewById(R.id.checkBox13);
        ch14 = findViewById(R.id.checkBox14);
        ch15 = findViewById(R.id.checkBox15);
        ch16 = findViewById(R.id.checkBox16);
        ch17 = findViewById(R.id.checkBox17);
        ch18 = findViewById(R.id.checkBox18);
        ch19 = findViewById(R.id.checkBox19);
        ch20 = findViewById(R.id.checkBox20);
        ch21 = findViewById(R.id.checkBox21);
        ch22 = findViewById(R.id.checkBox22);
        ch23 = findViewById(R.id.checkBox23);
        ch24 = findViewById(R.id.checkBox24);
        btn1 = findViewById(R.id.boton1);
        btn2 = findViewById(R.id.boton2);
        btn3 = findViewById(R.id.boton3);
        btn4 = findViewById(R.id.boton4);
        btn5 = findViewById(R.id.boton5);
        btn6 = findViewById(R.id.boton6);
        btn7 = findViewById(R.id.boton7);
        btn8 = findViewById(R.id.boton8);
        btn9 = findViewById(R.id.boton9);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        validarAllCheckBox();
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.boton1:
                if(Build.VERSION.SDK_INT < Build.VERSION_CODES.M){
                    generarSnack1();
                }else{
                    if(ActivityCompat.checkSelfPermission(getApplicationContext(),READ_CALENDAR) == PackageManager.PERMISSION_GRANTED &&
                            ActivityCompat.checkSelfPermission(getApplicationContext(),WRITE_CALENDAR) == PackageManager.PERMISSION_GRANTED){
                        generarSnack1();
                    }else{
                        if(ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,READ_CALENDAR) ||
                                ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,WRITE_CALENDAR)){
                            generarSnack2(matrizPermisos2,CALENDAR_PERMISSION);
                        }else{
                            requerirPermisos(matrizPermisos2,CALENDAR_PERMISSION);
                        }
                    }
                }
                break;
            case R.id.boton2:
                if(Build.VERSION.SDK_INT < Build.VERSION_CODES.M){
                    generarSnack1();
                }else{
                    if(ActivityCompat.checkSelfPermission(getApplicationContext(),CAMERA) == PackageManager.PERMISSION_GRANTED){
                        generarSnack1();
                    }else{
                        if(ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,CAMERA)){
                            generarSnack2(matrizPermisos3,CAMERA_PERMISSION);
                        }else{
                            requerirPermisos(matrizPermisos3,CAMERA_PERMISSION);
                        }
                    }
                }
                break;
            case R.id.boton3:
                if(Build.VERSION.SDK_INT < Build.VERSION_CODES.M){
                    generarSnack1();
                }else{
                    if(ActivityCompat.checkSelfPermission(getApplicationContext(),READ_CONTACTS) == PackageManager.PERMISSION_GRANTED &&
                            ActivityCompat.checkSelfPermission(getApplicationContext(),WRITE_CONTACTS) == PackageManager.PERMISSION_GRANTED &&
                            ActivityCompat.checkSelfPermission(getApplicationContext(),GET_ACCOUNTS) == PackageManager.PERMISSION_GRANTED){
                        generarSnack1();
                    }else{
                        if(ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,READ_CONTACTS) ||
                                ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,WRITE_CONTACTS) ||
                                ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,GET_ACCOUNTS)){
                            generarSnack2(matrizPermisos4,CONTACTS_PERMISSION);
                        }else{
                            requerirPermisos(matrizPermisos4,CONTACTS_PERMISSION);
                        }
                    }
                }
                break;
            case R.id.boton4:
                if(Build.VERSION.SDK_INT < Build.VERSION_CODES.M){
                    generarSnack1();
                }else{
                    if(ActivityCompat.checkSelfPermission(getApplicationContext(),ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED &&
                            ActivityCompat.checkSelfPermission(getApplicationContext(),ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED){
                        generarSnack1();
                    }else{
                        if(ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,ACCESS_COARSE_LOCATION) ||
                                ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,ACCESS_FINE_LOCATION)){
                            generarSnack2(matrizPermisos5,LOCATION_PERMISSION);
                        }else{
                            requerirPermisos(matrizPermisos5,LOCATION_PERMISSION);
                        }
                    }
                }
                break;
            case R.id.boton5:
                if(Build.VERSION.SDK_INT < Build.VERSION_CODES.M){
                    generarSnack1();
                }else{
                    if(ActivityCompat.checkSelfPermission(getApplicationContext(),RECORD_AUDIO) == PackageManager.PERMISSION_GRANTED){
                        generarSnack1();
                    }else{
                        if(ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,RECORD_AUDIO)){
                            generarSnack2(matrizPermisos6,MICROPHONE_PERMISSION);
                        }else{
                            requerirPermisos(matrizPermisos6,MICROPHONE_PERMISSION);
                        }
                    }
                }
                break;
            case R.id.boton6:
                if(Build.VERSION.SDK_INT < Build.VERSION_CODES.M){
                    generarSnack1();
                }else{
                    if(ActivityCompat.checkSelfPermission(getApplicationContext(),READ_PHONE_STATE) == PackageManager.PERMISSION_GRANTED &&
                            ActivityCompat.checkSelfPermission(getApplicationContext(),CALL_PHONE) == PackageManager.PERMISSION_GRANTED &&
                            ActivityCompat.checkSelfPermission(getApplicationContext(),READ_CALL_LOG) == PackageManager.PERMISSION_GRANTED &&
                            ActivityCompat.checkSelfPermission(getApplicationContext(),WRITE_CALL_LOG) == PackageManager.PERMISSION_GRANTED &&
                            ActivityCompat.checkSelfPermission(getApplicationContext(),ADD_VOICEMAIL) == PackageManager.PERMISSION_GRANTED &&
                            ActivityCompat.checkSelfPermission(getApplicationContext(),USE_SIP) == PackageManager.PERMISSION_GRANTED &&
                            ActivityCompat.checkSelfPermission(getApplicationContext(),PROCESS_OUTGOING_CALLS) == PackageManager.PERMISSION_GRANTED){
                        generarSnack1();
                    }else{
                        if(ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,READ_PHONE_STATE) ||
                                ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,CALL_PHONE) ||
                                ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,READ_CALL_LOG) ||
                                ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,WRITE_CALL_LOG) ||
                                ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,ADD_VOICEMAIL) ||
                                ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,USE_SIP) ||
                                ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,PROCESS_OUTGOING_CALLS)){
                            generarSnack2(matrizPermisos7,PHONE_PERMISSION);
                        }else{
                            requerirPermisos(matrizPermisos7,PHONE_PERMISSION);
                        }
                    }
                }
                break;
            case R.id.boton7:
                if(Build.VERSION.SDK_INT < Build.VERSION_CODES.M){
                    generarSnack1();
                }else{
                    if(ActivityCompat.checkSelfPermission(getApplicationContext(),BODY_SENSORS) == PackageManager.PERMISSION_GRANTED){
                        generarSnack1();
                    }else{
                        if(ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,BODY_SENSORS)){
                            generarSnack2(matrizPermisos8,SENSORS_PERMISSION);
                        }else{
                            requerirPermisos(matrizPermisos8,SENSORS_PERMISSION);
                        }
                    }
                }
                break;
            case R.id.boton8:
                if(Build.VERSION.SDK_INT < Build.VERSION_CODES.M){
                    generarSnack1();
                }else{
                    if(ActivityCompat.checkSelfPermission(getApplicationContext(),SEND_SMS) == PackageManager.PERMISSION_GRANTED &&
                            ActivityCompat.checkSelfPermission(getApplicationContext(),RECEIVE_SMS) == PackageManager.PERMISSION_GRANTED &&
                            ActivityCompat.checkSelfPermission(getApplicationContext(),READ_SMS) == PackageManager.PERMISSION_GRANTED &&
                            ActivityCompat.checkSelfPermission(getApplicationContext(),RECEIVE_WAP_PUSH) == PackageManager.PERMISSION_GRANTED &&
                            ActivityCompat.checkSelfPermission(getApplicationContext(),RECEIVE_MMS) == PackageManager.PERMISSION_GRANTED){
                        generarSnack1();
                    }else{
                        if(ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,SEND_SMS) ||
                                ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,RECEIVE_SMS) ||
                                ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,READ_SMS) ||
                                ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,RECEIVE_WAP_PUSH) ||
                                ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,RECEIVE_MMS)){
                            generarSnack2(matrizPermisos9,SMS_PERMISSION);
                        }else{
                            requerirPermisos(matrizPermisos9,SMS_PERMISSION);
                        }
                    }
                }
                break;
            case R.id.boton9:
                if(Build.VERSION.SDK_INT < Build.VERSION_CODES.M){
                    generarSnack1();
                }else{
                    if(ActivityCompat.checkSelfPermission(getApplicationContext(),READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED &&
                            ActivityCompat.checkSelfPermission(getApplicationContext(),WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED){
                        generarSnack1();
                    }else{
                        if(ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,READ_EXTERNAL_STORAGE) ||
                                ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,WRITE_EXTERNAL_STORAGE)){
                            generarSnack2(matrizPermisos10,STORAGE_PERMISSION);
                        }else{
                            requerirPermisos(matrizPermisos10,STORAGE_PERMISSION);
                        }
                    }
                }
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mimenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.opcion1:
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                return true;
            case R.id.opcion2:
                startActivity(new Intent(getApplicationContext(),Main2Activity.class));
                return true;
            case R.id.opcion3:
                solicitarTodos();
                return true;
            case R.id.opcion4:
                configurarAplicacion();
                return true;
            case R.id.opcion5:
                startActivity(new Intent(getApplicationContext(),Main3Activity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        validarAllCheckBox();
        switch (requestCode){
            case 1:
                if(grantResults[0] == PackageManager.PERMISSION_GRANTED && grantResults[1] == PackageManager.PERMISSION_GRANTED &&
                    grantResults[2] == PackageManager.PERMISSION_GRANTED && grantResults[3] == PackageManager.PERMISSION_GRANTED &&
                    grantResults[4] == PackageManager.PERMISSION_GRANTED && grantResults[5] == PackageManager.PERMISSION_GRANTED &&
                    grantResults[6] == PackageManager.PERMISSION_GRANTED && grantResults[7] == PackageManager.PERMISSION_GRANTED &&
                    grantResults[8] == PackageManager.PERMISSION_GRANTED && grantResults[9] == PackageManager.PERMISSION_GRANTED &&
                    grantResults[10] == PackageManager.PERMISSION_GRANTED && grantResults[11] == PackageManager.PERMISSION_GRANTED &&
                    grantResults[12] == PackageManager.PERMISSION_GRANTED && grantResults[13] == PackageManager.PERMISSION_GRANTED &&
                    grantResults[14] == PackageManager.PERMISSION_GRANTED && grantResults[15] == PackageManager.PERMISSION_GRANTED &&
                    grantResults[16] == PackageManager.PERMISSION_GRANTED && grantResults[17] == PackageManager.PERMISSION_GRANTED &&
                    grantResults[18] == PackageManager.PERMISSION_GRANTED && grantResults[19] == PackageManager.PERMISSION_GRANTED &&
                    grantResults[20] == PackageManager.PERMISSION_GRANTED && grantResults[21] == PackageManager.PERMISSION_GRANTED &&
                    grantResults[22] == PackageManager.PERMISSION_GRANTED && grantResults[23] == PackageManager.PERMISSION_GRANTED){
                    generarSnack1();
                }else{
                    generarSnack2(matrizPermisos1,ALL_PERMISSION);
                }
                break;
            case 2:
                if(grantResults[0] == PackageManager.PERMISSION_GRANTED && grantResults[1] == PackageManager.PERMISSION_GRANTED){
                    generarSnack1();
                }else{
                    generarSnack2(matrizPermisos2,CALENDAR_PERMISSION);
                }
                break;
            case 3:
                if(grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    generarSnack1();
                }else{
                    generarSnack2(matrizPermisos3,CAMERA_PERMISSION);
                }
                break;
            case 4:
                if(grantResults[0] == PackageManager.PERMISSION_GRANTED && grantResults[1] == PackageManager.PERMISSION_GRANTED &&
                        grantResults[2] == PackageManager.PERMISSION_GRANTED){
                    generarSnack1();
                }else{
                    generarSnack2(matrizPermisos4,CONTACTS_PERMISSION);
                }
                break;
            case 5:
                if(grantResults[0] == PackageManager.PERMISSION_GRANTED && grantResults[1] == PackageManager.PERMISSION_GRANTED){
                    generarSnack1();
                }else{
                    generarSnack2(matrizPermisos5,LOCATION_PERMISSION);
                }
                break;
            case 6:
                if(grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    generarSnack1();
                }else{
                    generarSnack2(matrizPermisos6,MICROPHONE_PERMISSION);
                }
                break;
            case 7:
                if(grantResults[0] == PackageManager.PERMISSION_GRANTED && grantResults[1] == PackageManager.PERMISSION_GRANTED &&
                        grantResults[2] == PackageManager.PERMISSION_GRANTED && grantResults[3] == PackageManager.PERMISSION_GRANTED &&
                        grantResults[4] == PackageManager.PERMISSION_GRANTED && grantResults[5] == PackageManager.PERMISSION_GRANTED &&
                        grantResults[6] == PackageManager.PERMISSION_GRANTED){
                    generarSnack1();
                }else{
                    generarSnack2(matrizPermisos7,PHONE_PERMISSION);
                }
                break;
            case 8:
                if(grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    generarSnack1();
                }else{
                    generarSnack2(matrizPermisos8,SENSORS_PERMISSION);
                }
                break;
            case 9:
                if(grantResults[0] == PackageManager.PERMISSION_GRANTED && grantResults[1] == PackageManager.PERMISSION_GRANTED &&
                        grantResults[2] == PackageManager.PERMISSION_GRANTED && grantResults[3] == PackageManager.PERMISSION_GRANTED &&
                        grantResults[4] == PackageManager.PERMISSION_GRANTED){
                    generarSnack1();
                }else{
                    generarSnack2(matrizPermisos9,SMS_PERMISSION);
                }
                break;
            case 10:
                if(grantResults[0] == PackageManager.PERMISSION_GRANTED && grantResults[1] == PackageManager.PERMISSION_GRANTED){
                    generarSnack1();
                }else{
                    generarSnack2(matrizPermisos10,STORAGE_PERMISSION);
                }
                break;
            default:
                break;
        }
    }

    public void validarAllCheckBox(){
        validarCheckBox(ch1,READ_CALENDAR);             validarCheckBox(ch2,WRITE_CALENDAR);
        validarCheckBox(ch3,CAMERA);                    validarCheckBox(ch4,READ_CONTACTS);
        validarCheckBox(ch5,WRITE_CONTACTS);            validarCheckBox(ch6,GET_ACCOUNTS);
        validarCheckBox(ch7,ACCESS_FINE_LOCATION);      validarCheckBox(ch8,ACCESS_COARSE_LOCATION);
        validarCheckBox(ch9,RECORD_AUDIO);              validarCheckBox(ch10,READ_PHONE_STATE);
        validarCheckBox(ch11,CALL_PHONE);               validarCheckBox(ch12,READ_CALL_LOG);
        validarCheckBox(ch13,WRITE_CALL_LOG);           validarCheckBox(ch14,ADD_VOICEMAIL);
        validarCheckBox(ch15,USE_SIP);                  validarCheckBox(ch16,PROCESS_OUTGOING_CALLS);
        validarCheckBox(ch17,BODY_SENSORS);             validarCheckBox(ch18,SEND_SMS);
        validarCheckBox(ch19,RECEIVE_SMS);              validarCheckBox(ch20,READ_SMS);
        validarCheckBox(ch21,RECEIVE_WAP_PUSH);         validarCheckBox(ch22,RECEIVE_MMS);
        validarCheckBox(ch23,READ_EXTERNAL_STORAGE);    validarCheckBox(ch24,WRITE_EXTERNAL_STORAGE);
    }

    private void validarCheckBox(CheckBox ch,String permiso) {
        if(ActivityCompat.checkSelfPermission(getApplicationContext(),permiso) == PackageManager.PERMISSION_GRANTED){
            ch.setChecked(true);
        }else{
            ch.setChecked(false);
        }
    }

    private void requerirPermisos(String[] matrizPermisos,int indice) {
        ActivityCompat.requestPermissions(Main2Activity.this,matrizPermisos,indice);
    }

    private void configurarAplicacion() {
        Uri uri = Uri.fromParts("package",getPackageName(),null);
        Intent configuracion = new Intent();
        configuracion.setAction(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
        configuracion.setData(uri);
        startActivity(configuracion);
    }

    private void solicitarTodos() {
        if(verificarPermisos()){
            generarSnack1();
        }else{
            if(ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,READ_CALENDAR) || ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,WRITE_CALENDAR) ||
                    ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,CAMERA) || ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,READ_CONTACTS) ||
                    ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,WRITE_CONTACTS) || ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,GET_ACCOUNTS) ||
                    ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,ACCESS_FINE_LOCATION) || ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,ACCESS_COARSE_LOCATION) ||
                    ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,RECORD_AUDIO) || ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,READ_PHONE_STATE) ||
                    ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,CALL_PHONE) || ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,READ_CALL_LOG) ||
                    ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,WRITE_CALL_LOG) || ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,ADD_VOICEMAIL) ||
                    ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,USE_SIP) || ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,PROCESS_OUTGOING_CALLS) ||
                    ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,BODY_SENSORS) || ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,SEND_SMS) ||
                    ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,RECEIVE_SMS) || ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,RECEIVE_WAP_PUSH) ||
                    ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,RECEIVE_MMS) || ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,READ_EXTERNAL_STORAGE) ||
                    ActivityCompat.shouldShowRequestPermissionRationale(Main2Activity.this,WRITE_EXTERNAL_STORAGE)){
                generarSnack2(matrizPermisos1,ALL_PERMISSION);
            }else{
                requerirPermisos(matrizPermisos1,ALL_PERMISSION);
            }
        }
    }

    private boolean verificarPermisos() {
        if(Build.VERSION.SDK_INT < Build.VERSION_CODES.M){
            return true;
        }
        if(ActivityCompat.checkSelfPermission(getApplicationContext(),READ_CALENDAR) == PackageManager.PERMISSION_GRANTED &&
            ActivityCompat.checkSelfPermission(getApplicationContext(),WRITE_CALENDAR) == PackageManager.PERMISSION_GRANTED &&
            ActivityCompat.checkSelfPermission(getApplicationContext(),CAMERA) == PackageManager.PERMISSION_GRANTED &&
            ActivityCompat.checkSelfPermission(getApplicationContext(),READ_CONTACTS) == PackageManager.PERMISSION_GRANTED &&
            ActivityCompat.checkSelfPermission(getApplicationContext(),WRITE_CONTACTS) == PackageManager.PERMISSION_GRANTED &&
            ActivityCompat.checkSelfPermission(getApplicationContext(),GET_ACCOUNTS) == PackageManager.PERMISSION_GRANTED &&
            ActivityCompat.checkSelfPermission(getApplicationContext(),ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED &&
            ActivityCompat.checkSelfPermission(getApplicationContext(),ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED &&
            ActivityCompat.checkSelfPermission(getApplicationContext(),RECORD_AUDIO) == PackageManager.PERMISSION_GRANTED &&
            ActivityCompat.checkSelfPermission(getApplicationContext(),READ_PHONE_STATE) == PackageManager.PERMISSION_GRANTED &&
            ActivityCompat.checkSelfPermission(getApplicationContext(),CALL_PHONE) == PackageManager.PERMISSION_GRANTED &&
            ActivityCompat.checkSelfPermission(getApplicationContext(),READ_CALL_LOG) == PackageManager.PERMISSION_GRANTED &&
            ActivityCompat.checkSelfPermission(getApplicationContext(),WRITE_CALL_LOG) == PackageManager.PERMISSION_GRANTED &&
            ActivityCompat.checkSelfPermission(getApplicationContext(),ADD_VOICEMAIL) == PackageManager.PERMISSION_GRANTED &&
            ActivityCompat.checkSelfPermission(getApplicationContext(),USE_SIP) == PackageManager.PERMISSION_GRANTED &&
            ActivityCompat.checkSelfPermission(getApplicationContext(),PROCESS_OUTGOING_CALLS) == PackageManager.PERMISSION_GRANTED &&
            ActivityCompat.checkSelfPermission(getApplicationContext(),BODY_SENSORS) == PackageManager.PERMISSION_GRANTED &&
            ActivityCompat.checkSelfPermission(getApplicationContext(),SEND_SMS) == PackageManager.PERMISSION_GRANTED &&
            ActivityCompat.checkSelfPermission(getApplicationContext(),RECEIVE_SMS) == PackageManager.PERMISSION_GRANTED &&
            ActivityCompat.checkSelfPermission(getApplicationContext(),READ_SMS) == PackageManager.PERMISSION_GRANTED &&
            ActivityCompat.checkSelfPermission(getApplicationContext(),RECEIVE_WAP_PUSH) == PackageManager.PERMISSION_GRANTED &&
            ActivityCompat.checkSelfPermission(getApplicationContext(),RECEIVE_MMS) == PackageManager.PERMISSION_GRANTED &&
            ActivityCompat.checkSelfPermission(getApplicationContext(),READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED &&
            ActivityCompat.checkSelfPermission(getApplicationContext(),WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED){
            return true;
        }
        return false;
    }

    public void generarSnack1()
    {
        snak1 = Snackbar.make(l,"Todos los permisos ya fueron aceptados.",Snackbar.LENGTH_INDEFINITE);
        snak1.show();
    }

    public void generarSnack2(final String[] matrizPer, final int i)
    {
        snak2 = Snackbar.make(l,"Algunos permisos no fueron aceptados",Snackbar.LENGTH_INDEFINITE);
        snak2.setActionTextColor(getResources().getColor(R.color.colorProgramadoresPeruanosPrimary));
        snak2.setAction("Solicitar", new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                requerirPermisos(matrizPer,i);
            }
        });
        snak2.show();
    }
}
