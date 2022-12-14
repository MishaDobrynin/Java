/**
 * Write a description of class MyArrayList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyArrayList<E>{
    int size;
    Object[] array;
    public MyArrayList(){
        clear();
    }
    public void add(E e){
        if(size == array.length-1) adjust();
        array[size] = e;
        size++;
    }
    public void adjust(){
        Object[] hold = array;
        array = new Object[size + size/2];
        for(int i = 0; i < size; i++){
            array[i] = hold[i];
        }
    }
    public void clear(){
        array = new Object[10];
        size = 0;
    }
    public boolean contains(Object find){
        for(int i = 0; i < size; i++){
            if(find.equals(this.get(i))) return true;
        }
        return false;
    }
    public E get(int index){
        if(index >= 0 && index< size) return (E)array[index];
        return null;
    }
    public int indexOf(Object find){
        for(int i = 0; i < size; i++){
            if(find.equals(array[i])) return i;
        }
        return -1;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public E remove(int index){
        if(index < size){
            E hold = (E)array[index];
            for(int i = index; i < size; i++){
                array[i] = array[i+1];
            }
            size--;
            return hold;
        }
        return null;
    }
    public boolean remove(Object find){
        int index = this.indexOf(find);
        if(index == -1) return false;
        this.remove(index);
        return true;
    }
    public int size(){
        return this.size;
    }
    public void trimToSize(){
        Object[] hold = new Object[size];
        for(int i = 0; i < size; i++){
            hold[i] = array[i];
        }
        array = hold;
    }
}