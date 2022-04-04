package persistencia;

import dominio.Habitante;
import java.util.List;

public interface IHabitantesAPIRest {
    
    public boolean agregar (Habitante habitante);
    public boolean actualizar (Habitante habitante);
    public boolean eliminar (Long idHabitante);
    public Habitante consultarPorId (Long idHabitante);
    public List<Habitante> consultarTodos(); 
    
}
