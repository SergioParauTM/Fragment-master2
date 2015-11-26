package ejemplo.sergio.fragment;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;


public class ListFragment extends Fragment {

    ListFragmentListener mCallback;



    public static ListFragment newInstance(){
        ListFragment f = new ListFragment();

        return f;
    }

    public interface ListFragmentListener{
        public void onListSelected(int position, String item);

    }

    public ListFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false);

    }




    public void onButtonPressed(Uri uri) {

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        // This makes sure that the container activity has implemented
        // the callback interface. If not, it throws an exception
        try {
            mCallback = (ListFragmentListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnHeadlineSelectedListener");
        }
    }







    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        final String[] menulist = new String[]{"perfil", "juego", "instrucciones", "informacion"
        };


        ArrayList<String> Lista = new ArrayList<String>(Arrays.asList(menulist));


        AdapterActivity adapter = new AdapterActivity(getActivity(),Lista);

        final ListView listview= (ListView) getActivity().findViewById(R.id.listView);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new nuestroListenner());



    }


    @Override
    public void onDetach() {
        super.onDetach();

    }




    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(Uri uri);
    }

    private class nuestroListenner implements AdapterView.OnItemClickListener{

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            String item = (String) parent.getItemAtPosition(position);
            mCallback.onListSelected(position,item);

        }
    }

}

