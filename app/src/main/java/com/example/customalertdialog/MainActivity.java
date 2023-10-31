package com.example.customalertdialog;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

//    FloatingActionButton fab;
//    Toolbar toolbar;
//    AlertDialog.Builder dialog;
//    LayoutInflater inflater;
//    View dialogView;
//    EditText txt_nama, txt_usia, txt_alamat, txt_status;
//    TextView txt_hasil;
//    String nama, usia, alamat, status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

//        txt_hasil   = (TextView) findViewById(R.id.txt_hasil);
//        fab         = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                txt_hasil.setText(null);
////                DialogForm();
//            }
//        });
    }

    // untuk mengosongi edittext
//    private void kosong(){
//        txt_nama.setText(null);
//        txt_usia.setText(null);
//        txt_alamat.setText(null);
//        txt_status.setText(null);
//    }
//
//    private void DialogForm() {
//        dialog = new AlertDialog.Builder(MainActivity.this);
//        inflater = getLayoutInflater();
//        dialogView = inflater.inflate(R.layout.form_data, null);
//        dialog.setView(dialogView);
//        dialog.setCancelable(true);
//        dialog.setIcon(R.mipmap.ic_launcher);
//        dialog.setTitle("Form Biodata");
//
//        txt_nama    = (EditText) dialogView.findViewById(R.id.txt_nama);
//        txt_usia    = (EditText) dialogView.findViewById(R.id.txt_usia);
//        txt_alamat  = (EditText) dialogView.findViewById(R.id.txt_alamat);
//        txt_status = (EditText) dialogView.findViewById(R.id.txt_status);
//
//        kosong();
//
//        dialog.setPositiveButton("SUBMIT", new DialogInterface.OnClickListener() {
//
//            @Override
//            public void onClick(DialogInterface dialogInterface, int which) {
//                nama = txt_nama.getText().toString();
//                usia = txt_usia.getText().toString();
//                alamat = txt_alamat.getText().toString();
//                status = txt_status.getText().toString();
//
//                txt_hasil.setText("Nama : " + nama + "\n" + "Usia : " + usia + "\n" + "Alamat : " + alamat + "\n" + "Status : " + status);
//                dialog.setMessage("");
//            }
//        }).setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
//
//            @Override
//            public void onClick(DialogInterface dialogInterface, int which) {
//                dialog.setMessage("");
//            }
//        });
//
//        dialog.show();
//    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}