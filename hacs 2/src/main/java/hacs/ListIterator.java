package hacs;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 *
 * @author Zhang ji Zhu Wei
 * @author mjfindler
 * @version 2.0 use <e> notation
 */

public class ListIterator implements Iterator<Object> {
    ArrayList<Object> theList;
    int CurrentNumber = -1;

    public ListIterator() {
    }

    public ListIterator(ArrayList<Object> list) {
        theList = list;
    }

    public boolean hasNext() {
        return CurrentNumber < theList.size() - 1;
    }

    public Object next() {
        if (hasNext() == true) {
            CurrentNumber++;
            return theList.get(CurrentNumber);
        } else {
            return null;
        }
    }

    public void remove() {
        theList.remove(CurrentNumber);
    }
}