
/**
 * Décrivez votre classe Fraction ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Fraction
{
    private int x;
    private int y;
    private double result;
    
    public Fraction(int x,int y)
    {
        this.x = x;
        this.y = y;
    }
    
    @Override 
    public String toString()
    {
        return "le resultat de "+ x +"/"+ y;
    }
    
}
