package com.example.Store.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="nombresProducto",nullable = false,length = 40)
    private String nombreProducto;
    @Column(name="referencia",nullable = false,length = 20)
    private String referencia;
    @Column(name="talla",nullable = false,length =5)
    private String talla;
    @Column(name="cantidadBodega",nullable = false)
    private Integer cantidadBodega;
    @Column(name="precioUnitario",nullable = false)
    private Integer precioUnitario;
    @Column(name="descripcion",nullable = false,length = 50)
    private String descripcion;
    @Column(name="fotografia",nullable = false,length = 250)
    private String fotografia;

    public Producto() {
    }

    public Producto(Integer id, String nombreProducto, String referencia, String talla,
                    Integer cantidadBodega, Integer precioUnitario, String descripcion, String fotografia) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.referencia = referencia;
        this.talla = talla;
        this.cantidadBodega = cantidadBodega;
        this.precioUnitario = precioUnitario;
        this.descripcion = descripcion;
        this.fotografia = fotografia;
    }
}
