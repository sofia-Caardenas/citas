package com.entidades;

import java.time.LocalDate;
import java.time.LocalTime;

import com.enumeraciones.Estado;

public class citaMedico {
       private LocalDate fecha;
    private LocalTime hora;
    private String motivoConsulta;
    private Paciente paciente;
    private Medico medico;
    private Estado estado;

    public citaMedico(LocalDate fecha, LocalTime hora, String motivoConsulta, Paciente paciente, Medico medico,
            Estado estado) {
        this.fecha = fecha;
        this.hora = hora;
        this.motivoConsulta = motivoConsulta;
        this.paciente = paciente;
        this.medico = medico;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "CitaMedico [fecha=" + fecha + ", hora=" + hora + ", motivoConsulta=" + motivoConsulta + ", paciente="
                + paciente + ", medico=" + medico + ", estado=" + estado + "]";
    }
    
}
