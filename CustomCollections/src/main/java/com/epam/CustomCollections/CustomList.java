package com.epam.CustomCollections;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;

public class CustomList {
	public <T> List<T> asList(T[] a) {
	    return new MyNewCustomList<T>(a);
	}

	private static class MyNewCustomList<T> extends AbstractList<T> {

		private Object a[];
	    private int size = 10;
	    private static final int DEFAULT_CAPACITY = 10;
	    
	    public MyNewCustomList(T[] arr) {
	        a = new Object[DEFAULT_CAPACITY];
	        a = arr;
	    }
	 
	    public boolean add(T e) {
	        if (size == a.length) {
	            ensureCapacity();
	        }
	        a[size++] = e;
	        return true;
	    }
	    
	    public void add(int i, T e) {
	        if (size == a.length) {
	            ensureCapacity();
	        }
	        System.arraycopy( a, i , a, i + 1, size++) ;
	        a[i] = e;
	    }
	     
	    public T get(int i) {
	        if (i >= size || i < 0) {
	            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
	        }
	        return (T) a[i];
	    }

	    public T remove(int i) {
	        if (i >= size || i < 0) {
	            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
	        }
	        Object item = a[i];
	        int numElts = a.length - ( i + 1 ) ;
	        System.arraycopy( a, i + 1, a, i, numElts ) ;
	        size--;
	        return (T) item;
	    }
	     
	    public int size() {
	        return size;
	    }
	     
	    public String toString() 
	    {
	         StringBuilder sb = new StringBuilder();
	         sb.append('[');
	         for(int i = 0; i < size ;i++) {
	             sb.append(a[i].toString());
	             if(i<size-1){
	                 sb.append(", ");
	             }
	         }
	         sb.append(']');
	         return sb.toString();
	    }
	     
	    private void ensureCapacity() {
	        int newSize = a.length * 2;
	        a = Arrays.copyOf(a, newSize);
	    }
	}
}
	


