package com.listaclima.elena.listaclima;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by gh on 05/07/2015.
 */
public class Adaptador extends BaseAdapter {

    private ArrayList<Datos> datos;
    private LayoutInflater inflate;
    private Context contexto;

    public Adaptador(ArrayList<Datos> dat, Context con)
    {
        this.datos=dat;
        inflate=LayoutInflater.from(con);
        contexto=con;


    }








    @Override
    public int getCount() {
        return datos.size();
    }

    @Override
    public Object getItem(int position) {
        return datos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView=inflate.inflate(R.layout.lista,null);
        Datos dat=datos.get(position);

        ImageView img  =(ImageView) convertView.findViewById(R.id.imagen);
        TextView dia =(TextView)convertView.findViewById(R.id.Dia);
        TextView clima =(TextView)convertView.findViewById(R.id.Clima);
        TextView temp = (TextView)convertView.findViewById(R.id.Temperatura);

        img.setImageDrawable(contexto.getResources().getDrawable(dat.getImagen()));
        dia.setText(dat.getDia());
        clima.setText(dat.getClima());
        temp.setText(dat.getTemperatura());

        return convertView;
    }
}
