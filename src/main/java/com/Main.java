package com;
import java.time.LocalDate;
import java.time.LocalTime;
import com.entidades.citaEnfermeros;
import com.entidades.consultorio;
import com.entidades.citaMedico;
import com.entidades.Enfermero;
import com.entidades.Medico;
import com.entidades.Paciente;
import com.enumeraciones.Especialidad;
import com.enumeraciones.Estado;
import com.enumeraciones.TipoDocumento;
import com.enumeraciones.TipoDeSangre;
public class Main {  public static void main(String[] args) {
        
    Medico m = new Medico(3, 
    "Sofia", 
    "Cardenas", 
    TipoDocumento.TI, 
    1014667567L, 
    234546L, 
    Especialidad.ODONTOLOGIA);

    m.setNombres("Sofia");
    System.out.println(m.toString());

    Paciente p = new Paciente(4, 
                            "Miguel", 
                            "Diaz", 
                            TipoDocumento.TI, 
                            1012334455L,
                            "perrosdds@gmail.com",
                            3053027300L, 
                            LocalDate.of(2007, 1, 2), 
                            1.43, 
                            53.2, 
                            TipoDeSangre.AB, 
                            '+');

    System.out.println(p.toString());

    consultorio c = new consultorio(5, 
                                    "CLL 43 B SUR #636", 
                                    3134106936L);

    Enfermero e = new Enfermero(2, "Herly", "Mojica", TipoDocumento.TI, 2345321421L);

    citaMedico a = new citaMedico(LocalDate.of(2024, 4, 15), LocalTime.of(3, 20), "medicina general", p, m, Estado.Agendada);
    System.out.println(a.toString());

    citaEnfermeros b = new citaEnfermeros(LocalDate.of(2024, 4, 15), LocalTime.of(3, 27), "Revisión", p, e, Estado.Realizada);
    System.out.println(b.toString());
}
}   