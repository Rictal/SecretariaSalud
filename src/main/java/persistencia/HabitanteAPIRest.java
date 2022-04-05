package persistencia;

import dominio.Expediente;
import dominio.Habitante;
import dominio.Tutor;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HabitanteAPIRest implements IHabitantesAPIRest {

    private final List<Habitante> listaHabitantes;

    public HabitanteAPIRest() {
        this.listaHabitantes = new ArrayList<>();
        Expediente expediente = new Expediente();
        Tutor tutor = new Tutor();
        this.listaHabitantes.add(new Habitante(1L, "Carla Morrison", "Villa ITSON, SON", 32, new byte[5], tutor, expediente, "198203", "CMASDF12345", "Femenino", new Date()));
        this.listaHabitantes.add(new Habitante(2L, "Juan Vazquez", "Urbi Villa, SON", 21, new byte[5], tutor, expediente, "159244", "JUVAZ12345", "Masculino", new Date()));
        this.listaHabitantes.add(new Habitante(3L, "Mauricio Martinez", "Plano Oriente, SON", 28, new byte[5], tutor, expediente, "129384", "MM523451", "Masculino", new Date()));
    }

    @Override
    public boolean agregar(Habitante habitante) {
        habitante.setId((long) this.listaHabitantes.size() + 1);
        this.listaHabitantes.add(habitante);
        return true;
    }

    @Override
    public boolean actualizar(Habitante habitante) {
        int indice = this.listaHabitantes.indexOf(habitante);
        if (indice == -1) {
            return false;
        }
        Habitante habitanteAgregado = this.listaHabitantes.get(indice);
        habitanteAgregado.setNombre(habitante.getNombre());
        habitanteAgregado.setDireccion(habitante.getDireccion());
        habitanteAgregado.setEdad(habitante.getEdad());
        return true;
    }

    @Override
    public boolean eliminar(Long idHabitante) {
        return this.listaHabitantes.remove(new Habitante(idHabitante));
    }

    @Override
    public Habitante consultarPorId(Long idHabitante) {
        Habitante habitanteAgregado;
        for (int i = 0; i < this.listaHabitantes.size(); i++) {
            if (this.listaHabitantes.get(i).getId() == idHabitante) {
                habitanteAgregado = this.listaHabitantes.get(i);
                return habitanteAgregado;
            }
        }

        return null;
    }

    @Override
    public List<Habitante> consultarTodos() {
        return this.listaHabitantes;
    }

}
