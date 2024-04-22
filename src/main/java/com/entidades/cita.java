package com.entidades;

import java.time.LocalDateTime;

public class cita {
    private Integer id;
    private LocalDateTime fecha;
    
    public cita(Integer id, LocalDateTime fecha) {
        this.id = id;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    
}
