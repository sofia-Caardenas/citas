package com.entidades;
import java.time.LocalDate;
import java.time.LocalTime;
import com.enumeraciones.Estado;

public class citaEnfermeros {
    private LocalDate fecha;
    private LocalTime hora;
    private String procedimientoRealizar;
    private Paciente paciente;
    private Enfermero enfermero;
    private Estado estado;

    // Constructor
    public citaEnfermeros(LocalDate fecha, LocalTime hora, String procedimientoRealizar, Paciente paciente,
            Enfermero enfermero, Estado estado) {
        this.fecha = fecha;
        this.hora = hora;
        this.procedimientoRealizar = procedimientoRealizar;
        this.paciente = paciente;
        this.enfermero = enfermero;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "CitaEnfermeros [fecha=" + fecha + ", hora=" + hora + ", procedimientoRealizar=" + procedimientoRealizar
                + ", paciente=" + paciente + ", enfermero=" + enfermero + ", estado=" + estado + "]";
    }
}