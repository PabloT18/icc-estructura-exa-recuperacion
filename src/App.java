import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        /// Llamadas necesarias a los metodos descritos en insctruciones y readme

    }

    public static List<Persona> add(int a, int b) {
        List<Persona> personas = new ArrayList<>();

        // Agregando 20 personas a la lista
        personas.add(new Persona("Carlos", "Gomez", 25));
        personas.add(new Persona("Ana", "Martinez", 30));
        personas.add(new Persona("Luis", "Gomez", 22));
        personas.add(new Persona("Beatriz", "Alvarez", 28));
        personas.add(new Persona("David", "Martinez", 40));
        personas.add(new Persona("Jorge", "Perez", 35));
        personas.add(new Persona("Marta", "Lopez", 18));
        personas.add(new Persona("Felipe", "Castro", 27));
        personas.add(new Persona("Gabriela", "Diaz", 23));
        personas.add(new Persona("Ricardo", "Ortega", 32));
        personas.add(new Persona("Sofia", "Vega", 29));
        personas.add(new Persona("Andres", "Gutierrez", 21));
        personas.add(new Persona("Paula", "Fernandez", 24));
        personas.add(new Persona("Esteban", "Ramirez", 31));
        personas.add(new Persona("Lorena", "Mendoza", 26));
        personas.add(new Persona("Diego", "Torres", 20));
        personas.add(new Persona("Raquel", "Navarro", 22));
        personas.add(new Persona("Francisco", "Morales", 34));
        personas.add(new Persona("Camila", "Silva", 19));
        personas.add(new Persona("Juan", "Reyes", 33));

        return personas;
    }
}
