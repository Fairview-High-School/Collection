import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class ArrayCollection here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayCollection<E> implements Collection<E>
{
    private List<E> internalList;
    private int currentElement;
    
    public ArrayCollection()
    {
        internalList = new ArrayList<E>();
        currentElement = 0;
    }
    

}
