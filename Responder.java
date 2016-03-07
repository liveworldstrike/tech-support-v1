import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    //atributo para elejir una respuesta aleatoria 
    private Random aleatorio;
    //atributo que guarda las respuestas 
    private ArrayList<String> respuestas;
    //atributo que guarda la palabras clave con sus respuestas 
    HashMap<String ,String > respuestasPalabras;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        respuestas = new ArrayList<String>();
        respuestasPalabras = new HashMap<>();

        respuestas.add("ouuuuuuuu");
        respuestas.add("mas preciso ");
        respuestas.add("y un pepino eso no es posible ");
        respuestas.add("suena aburrido");
        respuestas.add("no te entiendo bro ");

        respuestasPalabras.put("apruebo","siiiiiiiiiiiiiiii");
        respuestasPalabras.put("suspendo","uooooooooooooooo");
        respuestasPalabras.put("nifu","buenoooooo");
        respuestasPalabras.put("npi","ajjajajajajajajjajaja");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String respuestaUsuario)
    {
        String respuestaUsuario1 = respuestasPalabras.get(respuestaUsuario);
        if ( respuestaUsuario1 == null) {
            respuestaUsuario1 = respuestas.get(aleatorio.nextInt(respuestas.size()));
        }
        return respuestaUsuario1;

    }
}
