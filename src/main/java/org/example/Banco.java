package org.example;

import java.util.Scanner;

public class Banco {
    private int id;
    private String nombreCuenta;
    private float balanceCuenta;
    private static int ultimoId;

    /*******************************CONSTRUCTORES********************************************/
    public Banco() {
        this.id = ++ultimoId;
    }

    public Banco(int id, String nombreCuenta, float balanceCuenta) {
        this();
        this.id = id;
        this.nombreCuenta = nombreCuenta;
        this.balanceCuenta = balanceCuenta;
    }
    /*****************************GETTERS AND SETTERS****************************************/
    public double getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public float getBalanceCuenta() {
        return balanceCuenta;
    }

    public void setBalanceCuenta(float balanceCuenta) {
        this.balanceCuenta = balanceCuenta;
    }

    /*******************************METODOS********************************************/
    public float credito(float importe){
        return this.balanceCuenta += importe;
    }

    public float debito(float importe){
        return this.balanceCuenta -= importe;
    }


    public String verDetalle() {
        return "Banco{" +
                "id=" + id +
                ", nombreCuenta='" + nombreCuenta + '\'' +
                ", balanceCuenta= $" + balanceCuenta +
                '}';
    }


}
