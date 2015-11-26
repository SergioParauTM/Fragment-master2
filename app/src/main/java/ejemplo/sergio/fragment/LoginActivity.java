package ejemplo.sergio.fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;

import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity  {


    private EditText mEmailView;
    private EditText mPasswordView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText edittext = (EditText) findViewById(R.id.edad);



        //      final EditText edittext2 = (EditText) findViewById(R.id.nombre);
//        final String personaID=  edittext2.getText().toString();




        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.headlines_fragment69, LoginFragment.newInstance()); // newInstance() is a static factory method.
        transaction.commit();





    }
}