package com.dam.dam_recyclerview;

public class Restaurante {
    private String nombre;
    private String urlPhotos;
    private float valoracion;
    private String direccion;

    public Restaurante(String nombre, String urlPhotos, float valoracion, String direccion) {
        this.nombre = nombre;
        this.urlPhotos = urlPhotos;
        this.valoracion = valoracion;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrlPhotos() {
        return urlPhotos;
    }

    public void setUrlPhotos(String urlPhotos) {
        this.urlPhotos = urlPhotos;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
