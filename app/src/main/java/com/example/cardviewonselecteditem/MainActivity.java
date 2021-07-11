package com.example.cardviewonselecteditem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;




    public class MainActivity extends AppCompatActivity {


        private RecyclerView miRecicler;
        private RecyclerView.Adapter miAdapter;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            // Buscamos el control para cargar los datos
            miRecicler = (RecyclerView) findViewById(R.id.rvPeliculas);

            // Añadimos que  el tamaño del RecyclerView no se cambiará

            miRecicler.setHasFixedSize(true);

            miRecicler.setLayoutManager(new LinearLayoutManager(this));
            //Especificamos el adaptador con la lista a visualizar
            miAdapter = new Adaptador(DatosClientes());
            miRecicler.setAdapter(miAdapter);

        }


        public List<Peliculas> DatosClientes() {


            List<Peliculas> Lista = new ArrayList<>();
            Lista.add(new Peliculas("Destino de Caballero", "Touchstone Pictures", R.drawable.destino_caballero));
            Lista.add(new Peliculas("Final Fantasy", "Columbia TriStar Films", R.drawable.finalfantasy));
            Lista.add(new Peliculas("El Quinto Elemento", "Touchstone Pictures", R.drawable.el_quinto_elemento));
            Lista.add(new Peliculas("Le llaman Bodhi", "Touchstone Pictures", R.drawable.le_llaman_bodhi));
            Lista.add(new Peliculas("Toy Story", "Walt Disney Pictures", R.drawable.toy_story));
            Lista.add(new Peliculas("Shrek", "United International Pictures", R.drawable.shrek));


            return Lista;
        }
    }

