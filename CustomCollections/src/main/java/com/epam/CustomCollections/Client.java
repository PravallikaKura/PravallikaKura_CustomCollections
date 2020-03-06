package com.epam.CustomCollections;

import java.util.List;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CustomList cl = new CustomList();
		String a[] = {"Pravallika", "Priyanka", "PrudhveRaj", "Reshma", "Shamma", "Praneetha", "Samiksha", "Varsha", "Nikitha", "Alia"};
		List<String> list = cl.asList(a);
		list.add("Ammu");
		System.out.println("Size : " + list.size());
		System.out.println("List : " + list.toString());
		System.out.println("List : " + list.get(5));
		list.remove(5);
		System.out.println("List : " + list.toString());
		sc.close();
		

	}

}
