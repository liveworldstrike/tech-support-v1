import java.util.Random;
import java.util.ArrayList;
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
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        respuestas = new ArrayList<String>();

        respuestas.add("ouuuuuuuu");
        respuestas.add("mas preciso ");
        respuestas.add("y un pepino eso no es posible ");
        respuestas.add("suena aburrido");
        respuestas.add("no te entiendo bro ");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        return respuestas.get(aleatorio.nextInt(respuestas.size()));
    }
}
