package org.example;

import java.time.LocalDate;

public class Inscripcion {
    private Concurso concurso;
    private Participante participante;
    private LocalDate fechaInscripcion;

    public Inscripcion(Concurso concurso, Participante participante, LocalDate fechaInscripcion) {
        this.concurso = concurso;
        this.participante = participante;
        this.fechaInscripcion = fechaInscripcion;
    }

    public void inscribirParticipante(Participante participantes, LocalDate fechaInscripcion) {
        if (!concurso.esFechaValida(fechaInscripcion)) {
            System.out.println(" No puedes inscribirte fuera del rango de fechas del concurso " + participantes.getNombre());
        }
        concurso.agregarParticipante(participantes);

        if (concurso.esPrimeDia(fechaInscripcion)) {
            participante.agregarPuntos(10);
            System.out.println("" + participante.getNombre() + " se inscribio el primer dia y se se gano 10 puntos");
        } else {
            System.out.println("" + participante.getNombre() + " se inscribio correctamente");
        }
    }
}
