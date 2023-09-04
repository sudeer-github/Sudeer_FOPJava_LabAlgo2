package com.gl.lab2.driver;
import java.util.Scanner;

import com.gl.lab2.service.MergeSortImpl;
import com.gl.lab2.service.CountNotes;

public class Main {

	public static void main(String[] args) {

			MergeSortImpl mergeSortImpl = new MergeSortImpl();
			CountNotes countNotes = new CountNotes();

			System.out.println("Enter the size of currency denominations ");
			Scanner sc = new Scanner(System.in);
			int size = sc.nextInt();
			int[] notes = new int[size];
			System.out.println("Enter the currency denominations value");
			for (int i = 0; i < size; i++) {
				notes[i] = sc.nextInt();
			}
			System.out.println("Enter the amount you want to pay");
			int amount = sc.nextInt();
			mergeSortImpl.sort(notes,0,notes.length-1);
			countNotes.notesCountImplementation(notes, amount);
			sc.close();
		}
        
	}

