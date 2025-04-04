import org.example.Concurso;
import org.example.Participante;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConcursoTest {
    private Concurso concurso;

    @BeforeEach
    void setUp() {
        concurso = new Concurso("Concurso 002", LocalDate.of(2025, 3, 10), LocalDate.of(2025, 3, 20));
    }

    @Test
    void testAgregarParticipante() {
        Participante p1 = new Participante("Andrés");
        concurso.agregarParticipante(p1);
        assertEquals(1, concurso.cantidadParticipantes(), "El concurso debe tener 1 participante");
    }

    @Test
    void testAgregarVariosParticipantes() {
        concurso.agregarParticipante(new Participante("Andrés"));
        concurso.agregarParticipante(new Participante("José"));
        assertEquals(2, concurso.cantidadParticipantes(), "El concurso debe tener 2 participantes");
    }

    void testAgregarParticipantes() {
        // Agregar participantes
        concurso.agregarParticipante(new Participante("Andrés"));
        concurso.agregarParticipante(new Participante("José"));


        // Obtener la lista de participantes
        List<Participante> participantes = concurso.getParticipantes();

        // Verificar que la lista tiene los participantes correctos
        assertEquals(2, participantes.size(), "La lista debe tener 2 participantes");
        assertTrue(participantes.contains("Andrés"), "La lista debe contener a Andrés");
        assertTrue(participantes.contains("José"), "La lista debe contener a José");

    }
}

