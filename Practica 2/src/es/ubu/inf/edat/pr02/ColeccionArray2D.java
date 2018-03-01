package es.ubu.inf.edat.pr02;

/**
 * Diego Gonzalez Roman
 * Practica 2    22/02/2018
 * v.1.0
 * 
 */

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ColeccionArray2D<E> extends AbstractCollection<E>{ 

	private E[][] elementos; 
	
	public ColeccionArray2D (E[][] cuadricula) {
		this.elementos = cuadricula;
	}
	

	private class Iterator2D implements Iterator<E>  { 
		private int posicion = -1;
		
		public Iterator2D() {
			
		}
		
		@Override
		public boolean hasNext() {
			return (posicion+1) < ancho() * alto();
		
		} 
		
		@Override
		public E next() {
			E next = elementos[++posicion/ancho()][posicion%ancho()];
			return next;		
		} 
		
		@Override
		public void remove() {
			elementos[posicion/ancho()][posicion%ancho()] = null;
		
		}
	}
		
			@Override
			public Iterator<E> iterator() {
				return new Iterator2D();
			}
		
			@Override
			public int size() {
				return alto() * ancho();
			}
			
			@Override
			public boolean add(E e) {
				throw new UnsupportedOperationException();
			}
		
			@Override
			public boolean contains(Object o) {
				Iterator<E> iterator = iterator();
				while (iterator.hasNext()) {
					E siguiente = iterator.next();
					if(siguiente != null && siguiente.equals(o)) {
						return true;
					}
				}
				return false;
			}
		
			@Override
			public boolean remove(Object o) {
				Iterator<E> iterator = iterator();
				while (iterator.hasNext()) {
					E siguiente = iterator.next();
					if( siguiente == o) {
						iterator.remove();
						return true;
					}
				}
				return false;
			}

			
			public boolean remove(Object o) {
				for (Iterator<E> iterator = iterator(); iterator.hasNext();) {
					if (iterator.next() == o) {
						iterator.remove();
						return true;
					}
				}
				return false;
			}

			
			
			
		
			private int ancho() {
				return elementos[0].length;
			}
		
			private int alto() {
				return elementos.length;
			
			}	
		
	}


