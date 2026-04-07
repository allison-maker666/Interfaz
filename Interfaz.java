/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfaz;

/**
 *
 * @author Juan Almanza, Allison Farias, Juan Pinzon
 */

interface Vehiculo {
    void encender();
    void apagar();
    int obtenerVelocidad();
}

class Carro implements Vehiculo {
    private int velocidad;

    // Implementación de los métodos
    @Override
    public void encender() {
        System.out.println("El carro está encendido");
        velocidad = 0;
    }

    @Override
    public void apagar() {
        System.out.println("El carro está apagado");
        velocidad = 0;
    }

    @Override
    public int obtenerVelocidad() {
        return velocidad;
    }

    // Método propio de la clase
    public void acelerar(int incremento) {
        velocidad += incremento;
        System.out.println("Velocidad actual: " + velocidad);
    }
}

public class Interfaz {
    public static void main(String[] args) {
        Carro miCarro = new Carro();

        miCarro.encender();
        miCarro.acelerar(50);
        System.out.println("Velocidad: " + miCarro.obtenerVelocidad());
        miCarro.apagar();
    }
}