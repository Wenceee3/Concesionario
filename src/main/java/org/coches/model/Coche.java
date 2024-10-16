package org.coches.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;

@XmlRootElement (name = "coche")
public class Coche {
    private String marca;
    private String modelo;
    private String matricula;
    private int anio;
    private String fechaVenta;

    public Coche() {
    }

    public Coche(String marca, String modelo, String matricula, int anio, String fechaVenta) {
        this.marca = marca;
        this.anio = anio;
        this.fechaVenta = fechaVenta;
        this.modelo = modelo;
        this.matricula = matricula;
    }

    @XmlElement
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @XmlElement
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @XmlElement
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @XmlElement
    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @XmlElement
    public String getFechaVenta() {
        return fechaVenta;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Matricula: " + matricula + ", Año: " + anio + ", Fecha Venta: " + fechaVenta;
    }
}