package com.company;

import java.util.ArrayList;
import java.util.List;

public class Distribuidora {

    List<Producto> productos = new ArrayList<>();


    public void imprimir(){
        productos.add(new Perecedero("leche",100,1));
        productos.add(new Perecedero("queso",50,2));
        productos.add(new Perecedero("manteca",200,3));
        productos.add(new NoPerecedero("atun",20,"enlatado"));
        productos.add(new NoPerecedero("frijol",10,"granos"));
        productos.add(new NoPerecedero("arroz",30,"granos"));

        double sumatoria = 0;
        for (Producto producto: productos
             ) {

            sumatoria = sumatoria + producto.calcular(1);

        }
        System.out.println("Sumatoria de precios: "+sumatoria);

    }
}
