package com.chz.array.impl;

import com.chz.array.DynamicArray;

public class DynamicArrayImpl<T> implements DynamicArray<T> {
	
	public static final int STEP = 8;
	
	private int size = 0;
	private Object[] elements;
	
	public DynamicArrayImpl() {
		this.elements = new Object[0];
	}
	
	public DynamicArrayImpl(int initialCapacity) {
		this.elements = new Object[initialCapacity];
	}
	
	@Override
	public int size() {
		return this.size;
	}

	@Override
	public int capacity() {
		return elements.length;
	}

	@Override
	public boolean is_empty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	@Override
	public T at(int index) {
		if (index < size) {
			return (T) elements[index];
		}
		return null;
	}

	@Override
	public void push(T item) {
		if (size < elements.length) {
			int index = size + 1;
			elements[index-1] = item;
		} else {
			Object[] newElements = new Object[elements.length + STEP];
			for (int i=0; i<elements.length; i++) {
				newElements[i] = elements[i];
			}
			newElements[elements.length] = item;
			elements = newElements;
		}
		size++;
	}

	@Override
	public void insert(int index, T item) {
		if (index > elements.length || index < 0) {
			return;
		}
		
		if (size < elements.length) {
			for (int i=size+1; i>=index; i--) {
				elements[i] = elements[i-1];
			}
			elements[index-1] = item;
		} else {
			Object[] newElements = new Object[elements.length + STEP];
			for (int i=0; i<elements.length; i++) {
				newElements[i] = elements[i];
			}
			for (int i=size+1; i>=index; i--) {
				newElements[i] = elements[i-1];
			}
			newElements[index-1] = item;
			elements = newElements;
		}
		size++;
	}

	@Override
	public void prepend(T item) {
		insert(0, item);
	}

	@Override
	public void pop() {
		
	}

	@Override
	public void delete(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int remove(T item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int find(T item) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
