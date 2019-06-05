package com.sample;

public interface Container<E>  {
	 public Iterator<E> getIterator(E[] arr);
}
