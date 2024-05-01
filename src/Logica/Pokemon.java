package Logica;

public abstract class Pokemon {

    // Declaración de variables que compartiran las hijas (pokemon)
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;

    // Declaración de métodos que también tendrán los pokemon, serán métodos abstractos
    // Los ataques serán placaje, arañazo y mordisco (--Comentar luego para un JavaDoc)

    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();

    // Quiero diferenciar a ataques según clases: fuego, planta,electrico y agua. Crear interfaz para cada uno de los pokemon


}
