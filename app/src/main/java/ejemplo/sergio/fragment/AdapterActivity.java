package ejemplo.sergio.fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class AdapterActivity extends ArrayAdapter<String>   {

    //Atributos del adaptador

    private ArrayList<String> lista;
    private Context context;

    

    //Constructor del adaptador

    public AdapterActivity(Context context, ArrayList<String> lista) {
        super(context,0,lista);
        this.lista= lista;
        this.context = context;

    }


    //Este método se puede considerar como un bucle. Se leen todos los ítems de la lista
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

     /*   LayoutInflater inflater =( LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        if(convertView==null){
            inflater.inflate(R.layout.list_item,parent,false);
        }


        //Referencias a "list_item_accion.xml"
        ImageView imagen = (ImageView) convertView.findViewById(R.id.imageView);
        TextView texto = (TextView) convertView.findViewById(R.id.textView);

        texto.setText(lista.get(position));*/


        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.list_item, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.textView);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView);


        textView.setText(lista.get(position));

        String s = lista.get(position);
        if (s.equals("perfil")) {
            imageView.setImageResource(R.drawable.face);
           // textView.setBackgroundResource(R.color.colorPrimary);
        } else if(s.equals("juego")) {
            imageView.setImageResource(R.drawable.play);
        }else if (s.equals("instrucciones")){
            imageView.setImageResource(R.drawable.instru);
        }else if(s.equals("informacion")){
            imageView.setImageResource(R.drawable.info);
        }else{

        }

        //Se devuelve cada vez un item de la lista
        return rowView;




    }
}

