/**
 * Representing a bag which implements listInterface
 * @author Steven Maggio
 *
 */
public class Bag implements ListInterface {
	
	
	private Object [] items; //array that holds the items
	
	/**
	 * Constructor that initiates the array
	 */
	public Bag() {
		//Object [] items=new Object [100];
		items=new Object [100]; //array of bag
	}
	
	/**
	 * Adds element to the bag
	 * @param element
	 */
	@Override
	public void insert(Object element) throws ListIndexOutOfBoundsException, ListException{
		// TODO Auto-generated method stub
		try {
		//goes through array
		for(int i = 0; i < items.length; i++) {
			//finds the first null in array
			if(items[i] == null) {
				//initializes element of array to the item
		        items[i] = element;
		        break;
		    }
		}
		}catch(ListIndexOutOfBoundsException e) {
			System.out.println("Out of bounds error");
		}catch(ListException e) {
			System.out.println("List exception");
		}
		    
	}

	/**
	 * removes last item in the bag
	 * @throws ListIndexOutOfBoundsException
	 * @throws ListException
	 */
	@Override
	public void removeLast() throws ListIndexOutOfBoundsException, ListException {
		// TODO Auto-generated method stub
		try {
		//goes through array backwards
		for(int i = items.length-1; i >=0; i--) {
			//finds the element that is not null
			if(items[i] != null) {
				//initializes the element to null
		        items[i] = null;
		        break;
		    }
		}
		}catch(ListIndexOutOfBoundsException e) {
			System.out.println("Out of bounds error");
		}catch(ListException e) {
			System.out.println("List exception");
		}
	}

	/**
	 * removes an item at random index
	 * @throws ListIndexOutOfBoundsException
	 * @throws ListException
	 */
	@Override
	public void removeRandom() throws ListIndexOutOfBoundsException, ListException {
		// TODO Auto-generated method stub
		try {
		//generating index of item to be removed
		Object [] itemsCopy=new Object [100];//makes copy array
		int a=(int)(Math.random()*size());//generate random number
		System.out.println(" at index: "+a);//prints what the random number is
		
		//removal process
		int j=0;
		for(int i = 0; i < items.length; i++) {
			//if i==value of removal index
			if(i == a) {
				//skip the index
				j++;
		    }
			//if index is within valid range
			if(j<items.length) {
				//copy index over
				itemsCopy[i] = items[j];
			}
			else {
				itemsCopy[i]=null;
			}
			j++;
		}
		
		//copying the temporary array to the actual array
		for(int k = 0; k < items.length; k++) {
	        items[k] = itemsCopy[k];
		}
		}catch(ListIndexOutOfBoundsException e) {
			System.out.println("Out of bounds error");
		}catch(ListException e) {
			System.out.println("List exception");
		}
	}

	/**
	 * finds an item's first index in the list
	 * @param element
	 * @return pos
	 * @throws ListIndexOutOfBoundsException
	 * @throws ListException
	 */
	@Override
	public int getItemIndex(Object element) throws ListIndexOutOfBoundsException, ListException {
		// TODO Auto-generated method stub
		try {
		int pos=-1; //index not found number
		//searching through array
		for(int i = 0; i < items.length; i++) {
			//if element is what we are looking for
			if(element.equals(items[i])) {
				//set return variable to index
		        pos=i;
		    }
		}
		
		return pos;
		}catch(ListIndexOutOfBoundsException e) {
			System.out.println("Out of bounds error");
		}catch(ListException e) {
			System.out.println("List exception");
		}
		return -1;
	}

	/**
	 * finds the item at a specified index
	 * @param position
	 * @return obj
	 * @throws ListIndexOutOfBoundsException
	 * @throws ListException
	 */
	@Override
	public Object getItemAtIndex(int position) throws ListIndexOutOfBoundsException, ListException {
		// TODO Auto-generated method stub
		try {
		Object obj=null;
		//searching through array
		for(int i = 0; i < items.length; i++) {
			//if index is what we are looking for
			if(i==position) {
				//we return the reference object
		        obj=items[i];
				return obj;
		    }
		}
		return obj;
		}catch(ListIndexOutOfBoundsException e) {
			System.out.println("Out of bounds error");
		}catch(ListException e) {
			System.out.println("List exception");
		}
		return null;
	}

	/**
	 * returns the amount of items in the bag
	 * @return count
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		int count=0;
		//searching through the array
		for(int i=0;i< items.length;i++) {
			//if item is not null, count increments
			if(items[i]!=null) count++;
		}
		return count;
	}
	
	
	/**
	 * if the bag is empty, will return true
	 * @return true/false
	 */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(size()==0) {
			return true;
		}
		else {
			return false;
		}
		
	}

	/**
	 * empties the bag
	 * @throws ListException
	 */
	@Override
	public void makeEmpty() throws ListException {
		// TODO Auto-generated method stub
		try {
		for(int i=0;i<items.length;i++) {
			items[i]=null;
		}
		}catch(ListException e) {
			System.out.println("List exception");
		}
		
	}

}
