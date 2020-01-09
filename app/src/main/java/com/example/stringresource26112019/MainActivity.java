package com.example.stringresource26112019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText mEditAccount , mEditPass;
    Button mbtnLogin;
    TextView mTxtDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditAccount=findViewById(R.id.edittextTaikhoan);
        mEditPass=findViewById(R.id.edittextMatkhau);
        mTxtDisplay=findViewById(R.id.textviewThongtin);
        mbtnLogin=findViewById(R.id.buttonDangnhap);

        mbtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String account= mEditAccount.getText().toString();
                String pass = mEditPass.getText().toString();

                if (account.equals("quoc") && pass.equals("123456"))
                {
                    String labelAccount = getResources().getString(R.string.label_showaccount);
                    String labelPass = getResources().getString(R.string.label_showpass);
                    mTxtDisplay.setText(labelAccount + account + "\n" +labelPass + pass);
                }else{
                    Toast.makeText(MainActivity.this, "Sai thong tin", Toast.LENGTH_SHORT);
                }
            }
        });
    }
}
