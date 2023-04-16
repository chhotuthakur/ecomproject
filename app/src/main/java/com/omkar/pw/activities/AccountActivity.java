package com.omkar.pw.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.omkar.pw.R;

public class AccountActivity extends AppCompatActivity {

    Button btn_login,btn_reg;

    private FirebaseAuth mAuth;
    private FirebaseUser mUser;
    EditText mail_log,pass_log,edtuname,edtphone,edtadd;
    String user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        btn_login =findViewById(R.id.btn_login);
        btn_reg = findViewById(R.id.btn_reg);


            btn_login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    login();
                }
            });

            btn_reg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    reg();
                }
            });




    }

   public void login(){

       Dialog myDialog = new Dialog(this);
       myDialog.setContentView(R.layout.login_page);
       Button login = (Button) myDialog.findViewById(R.id.login_btn);

       EditText edtmail = (EditText) myDialog.findViewById(R.id.mail_login);
       EditText edtpass = (EditText) myDialog.findViewById(R.id.pass_login);
       myDialog.show();
       myDialog.setCancelable(true);


       login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               mAuth = FirebaseAuth.getInstance();
               String mail = edtmail.getText().toString();
               String pass = edtpass.getText().toString();
               String type = "customer";

               mAuth.signInWithEmailAndPassword(mail,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                   @Override
                   public void onComplete(@NonNull Task<AuthResult> task) {

                       Toast.makeText(AccountActivity.this,"Login Success", Toast.LENGTH_LONG).show();
                       startActivity(new Intent(AccountActivity.this,MainActivity.class));


                   }
               });

           }
       });




   }

   public void reg(){

       Dialog regDialog = new Dialog(this);
       regDialog.setContentView(R.layout.reg_page);
       regDialog.setCancelable(true);
       Button reg = (Button) regDialog.findViewById(R.id.reg_btn);

       EditText edtmail = (EditText) regDialog.findViewById(R.id.edtmail);
       EditText edtpass = (EditText) regDialog.findViewById(R.id.edtpass);
       EditText edtuname = (EditText) regDialog.findViewById(R.id.edtuname);
       EditText edtphone = (EditText) regDialog.findViewById(R.id.edtphone);
       EditText edtadd = (EditText) regDialog.findViewById(R.id.edtadd);

       regDialog.show();





   }
}