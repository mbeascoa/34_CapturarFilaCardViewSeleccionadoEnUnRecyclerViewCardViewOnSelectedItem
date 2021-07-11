package com.example.cardviewonselecteditem;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {

    private List<Peliculas> listaPeliculas;

    public Adaptador(List<Peliculas> ListaPelicula) {
        this.listaPeliculas = ListaPelicula;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_datos, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String tit = listaPeliculas.get(position).getTitulo();
        holder.txtnameTitulo.setText(tit);
        String distri = listaPeliculas.get(position).getDistribuidor();
        holder.txtDescripcion.setText(distri);
        int peli = listaPeliculas.get(position).getFoto();
        holder.fotoPeli.setImageResource(peli);
        holder.card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(holder.txtnameTitulo.getText().toString());
            }
        });
    }

    @Override
    public int getItemCount() {
        return listaPeliculas.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView txtnameTitulo, txtDescripcion;
        private ImageView fotoPeli;
        private CardView card1;
        public ViewHolder(View v) {
            super(v);
            txtnameTitulo = (TextView) v.findViewById(R.id.txtTitulo);
            txtDescripcion = (TextView)  v.findViewById(R.id.txtDistribuidor);
            fotoPeli= (ImageView) v.findViewById(R.id.img_FotoPeli);
            card1= (CardView) v.findViewById(R.id.cv_Pelicula);

        }
    }

}