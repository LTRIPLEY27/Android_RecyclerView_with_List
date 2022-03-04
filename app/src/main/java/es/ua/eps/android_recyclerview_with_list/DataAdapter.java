package es.ua.eps.android_recyclerview_with_list;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

// CLASE QUE COPIARÁ LOS DATOS DE LA LISTA A LA RECYCLER
public class DataAdapter extends RecyclerView.Adapter <DataAdapter.ViewHolderDatos> {

    // DECLARAMOS LOS ATRIBUTOS DE LA LIST
    private ArrayList<String> lista;

    //CONSTRUCTOR DE LA CLASE, AL IGUAL QUE EN JAVA SOLO INSTANCIA LOS ELEMENTOS
    public DataAdapter(ArrayList<String> lista) {
        this.lista = lista;
    }

    //  MÉTODOS DEL VIEWHOLDER Y CICLER VIEW ADAPTER

    // ENLAZA LA ACTIVITY CON LA VIEW PARA RETORNAR INSTANCIAS

    @Override
    public ViewHolderDatos onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_list, null, false);
        return new ViewHolderDatos(view);  //INSTANCIA Y RETORNA LA CLASE VIEW PARA CADA ENTIDAD
    }

    //MÉTODO QUE ENLAZA EL VIEWHOLDERDATOS CON EL ADAPTADOR
    @Override
    public void onBindViewHolder(ViewHolderDatos holder, int position) {
        holder.asignaValor(lista.get(position)); //ENVIA Y ACTUALIZA LAS POSICIONES DE LA LISTA
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }


    // EN ÉSTE MÉTODO SE REFERENCIA LOS ELEMENTOS DEL LIST QUE DESEEMOS APREHENDER

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView texto;
        //EditText texto;

        public ViewHolderDatos(View itemView) {  // ASIGNA VALORES
            super(itemView);
            texto = itemView.findViewById(R.id.listar);  /// RECOGE LOS DATOS DEL EDITETXT Y LOS PASA A UN STRING
        }

        public void asignaValor(String s) { // SETTEA VALORES
            texto.setText(s);
        }
    }
}
