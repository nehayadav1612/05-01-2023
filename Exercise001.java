package com.collections.pll;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Exercise001 {

	public static void main(String[] args) {
		List<String> languages = new LinkedList<>();
		
		languages.add("C");
		languages.add("C++");
		languages.add("Java");
		languages.add("Kotlin");
		languages.add("Python");
		languages.add("Perl");
		languages.add("Ruby");
		
		//System.out.println("List of languages: " + languages);
		
		//1.
		System.out.println("List of languages");

		
		for(String language : languages)
			System.out.println(language);
		
		
		/*
		for(int i=0; i<languages.size(); i++)
			System.out.println(languages.get(i));
		*/
		
		/*
		Iterator<String> itr = languages.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		*/
		
		//2.
		languages.remove(5);
		System.out.println("List of languages after deleting the element at index 5");

		
		for(String language : languages)
			System.out.println(language);
		
		languages.remove("Kotlin");
		System.out.println("List of languages after deleting the element 'Kotlin'");

		
		for(String language : languages)
			System.out.println(language);
		
		// Remove all the scripting languages (Python, Ruby, Perl) 
		// with one statement and display the list.
		
		List<String> removeList = new LinkedList<String>();
		removeList.add("Python");
		removeList.add("Ruby");
		removeList.add("Perl");
		
		languages.removeAll(removeList);
		System.out.println("List of languages after deleting the elements  'Python, Ruby, Perl'");

		
		for(String language : languages)
			System.out.println(language);
		
		// remove all the list
		languages.removeAll(languages);
		
		System.out.println("List of languages after deleting all the elements.");

		/*
		for(String language : languages)
			System.out.println(language);
		*/
		
		System.out.println("Elements after deleting all the elements: " + languages.size());
		
	}

}
