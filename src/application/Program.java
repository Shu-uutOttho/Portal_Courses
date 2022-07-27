package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<Integer> A = new HashSet<>();
		Set<Integer> B = new HashSet<>();
		Set<Integer> C = new HashSet<>();

		int n, i, number;

		System.out.print("How many students for course A? ");
		n = sc.nextInt();
		System.out.println("Enter with Student Id number: ");
		for (i = 0; i < n; i++) {
			number = sc.nextInt();
			A.add(number);
		}
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		System.out.println("Enter with Student Id number: ");
		for (i = 0; i < n; i++) {
			number = sc.nextInt();
			B.add(number);
		}
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		System.out.println("Enter with Student Id number: ");
		for (i = 0; i < n; i++) {
			number = sc.nextInt();
			C.add(number);
		}
		Set<Integer> Total = new HashSet<>(A);
		Total.addAll(B);
		Total.addAll(C);

		System.out.println("Total Students: " + Total.size());
		sc.close();

	}

}
