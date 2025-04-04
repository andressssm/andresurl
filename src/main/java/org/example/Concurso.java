package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Concurso {
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private List<Participante> participantes;

    public Concurso(String nombre, LocalDate fechaInicio, LocalDate fechaFin) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.participantes = new ArrayList<>();
    }

    public boolean esFechaValida(LocalDate v) {
        LocalDate i = fechaInicio; // Definimos la variable i
        LocalDate f = fechaFin; // Definimos la variable f
        return v.isBefore(i) || v.isAfter(f); // Retornamos directamente el resultado
    }

    public boolean esPrimeDia(LocalDate v) {
        LocalDate i = fechaInicio; // Definimos la variable i
        return v.equals(i);
    }

    public void agregarParticipante(Participante p) {
        participantes.add(p);
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }

    public int cantidadParticipantes() {
        int cantidad = 0;
        for (Participante participante : participantes) {
            cantidad++; // Incrementa el contador por cada participante
        }
        return cantidad;
    }
}