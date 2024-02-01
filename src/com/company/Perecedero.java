package com.company;

public class Perecedero extends Producto{

    private int diasPorCaducar;

    @Override
    public String toString() {
        return "Perecedero{" +
                "diasPorCaducar=" + diasPorCaducar +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }


    public Perecedero(String nombre, double precio, int diasPorCaducar) {
        super(nombre, precio);
        this.diasPorCaducar = diasPorCaducar;
    }

    public int getDiasPorCaducar() {
        return diasPorCaducar;
    }

    public void setDiasPorCaducar(int diasPorCaducar) {
        this.diasPorCaducar = diasPorCaducar;
    }

    @Override
    public double calcular(int cantidadDeProductos) {
        double precioTemp = super.calcular(cantidadDeProductos);
        switch (this.diasPorCaducar){
            case 1:
                return precioTemp/4;
            case 2:
                return precioTemp/3;
            case 3:
                return precioTemp/2;
            default:
                return precioTemp;
        }
    }
}
