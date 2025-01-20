import java.util.ArrayList;
import java.util.Iterator;

public class List {
    public ArrayList<Object> elements;

    public List(ArrayList newElements) {
        this.elements = new ArrayList();
        Iterator var2 = newElements.iterator();

        while(var2.hasNext()) {
            Object newElement = var2.next();
            this.elements.add(this.getNewObject(newElement));
        }

    }

    public List(List that) {
        this(that.elements);
    }

    private Object getNewObject(Object o) {
        return o instanceof List ? new List((List)o) : o;
    }

    public Object getElement(int index) {
        return this.elements.get(index);
    }

    public int getSize() {
        return this.elements.size();
    }

    public void addElement(Object o) {
        this.elements.add(this.getNewObject(o));
    }

    public void setElement(int index, Object o) {
        this.elements.set(index, this.getNewObject(o));
    }
}
