package es.ua.eps.android_recyclerview_with_list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> list;
    private RecyclerView reciclaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reciclaje = (RecyclerView) findViewById(R.id.reciclador);
        reciclaje.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        list = new ArrayList<String>();

        for(int i = 0; i < 20; i++){
            list.add("" + i);
        }

        //ENVIAMOSPOR PARÁMETROS LA LISTA AL ADAPTADOR
        DataAdapter data = new DataAdapter(list);

        //SETTEAMOS EL RECYCLER PARA QUE RECIBA EL ADAPTADOR
        reciclaje.setAdapter(data);
    }
}