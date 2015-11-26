package ejemplo.sergio.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements ListFragment.ListFragmentListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.headlines_fragment2, ListFragment.newInstance()); // newInstance() is a static factory method.
        transaction.commit();


        FragmentManager manager1 = getFragmentManager();
        FragmentTransaction transaction1 = manager1.beginTransaction();
        transaction1.replace(R.id.headlines_fragment3, LoginFragment.newInstance()); // newInstance() is a static factory method.
        transaction1.commit();


/*
        Bundle d = getIntent().getExtras();
        String nombre = d.getString("personaID");
        Log.i("persona", nombre);
*/

    }

    public void onListSelected(int position, String item){

        switch( position )
        {
            case 0:

                FragmentManager manager4 = getFragmentManager();
                FragmentTransaction transaction4 = manager4.beginTransaction();
                transaction4.replace(R.id.headlines_fragment3, LoginFragment.newInstance()); // newInstance() is a static factory method.
                transaction4.commit();

                break;
            case 1:
                FragmentManager manager5 = getFragmentManager();
                FragmentTransaction transaction5 = manager5.beginTransaction();
                transaction5.replace(R.id.headlines_fragment3, GameFragment.newInstance()); // newInstance() is a static factory method.
                transaction5.commit();



                break;

            case 2:
                Toast.makeText(MainActivity.this,"Ha elegido: " + item, Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(MainActivity.this, "Ha elegido: " + item, Toast.LENGTH_SHORT).show();
                break;

        }


        }






}
