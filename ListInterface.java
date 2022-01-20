/** 
 * Interface of a list and its functionality
 * @author Steven Maggio
 */
public interface ListInterface {
	
	/**
	 * Adds element to the bag
	 * @param element
	 */
	public void insert(Object element) throws ListIndexOutOfBoundsException, ListException;
	
	/**
	 * removes last item in the bag
	 * @throws ListIndexOutOfBoundsException
	 * @throws ListException
	 */
	public void removeLast() throws ListIndexOutOfBoundsException, ListException;
	
	/**
	 * removes an item at random index
	 * @throws ListIndexOutOfBoundsException
	 * @throws ListException
	 */
	public void removeRandom() throws ListIndexOutOfBoundsException, ListException;
	
	/**
	 * finds an item's first index in the list
	 * @param element
	 * @return pos
	 * @throws ListIndexOutOfBoundsException
	 * @throws ListException
	 */
	public int getItemIndex(Object element) throws ListIndexOutOfBoundsException,ListException;
	
	/**
	 * finds the item at a specified index
	 * @param position
	 * @return obj
	 * @throws ListIndexOutOfBoundsException
	 * @throws ListException
	 */
	public Object getItemAtIndex(int position) throws ListIndexOutOfBoundsException,ListException;
	
	/**
	 * returns the amount of items in the bag
	 * @return count
	 */
	public int size();
	
	
	/**
	 * if the bag is empty, will return true
	 * @return true/false
	 */
	public boolean isEmpty();
	
	/**
	 * empties the bag
	 * @throws ListException
	 */
	public void makeEmpty() throws ListException;
}