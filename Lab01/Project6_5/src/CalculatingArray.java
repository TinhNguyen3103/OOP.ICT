import java.util.Arrays;
import java.util.Scanner;
public class CalculatingArray {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int n = 0;
		do {
			System.out.print("Enter the size of the array: ");
			n = keyboard.nextInt();
		} while (n <= 0);
		
		int arr[] = new int[n];
		int sum = 0;
		float average = 0;
		
		System.out.println("Enter the value of each elements: ");
		for (int i = 0; i < n; i++) {
			System.out.print("arr[" + i + "] = ");
			arr[i] = keyboard.nextInt();
			sum += arr[i];
		}
		average = sum/n;
		Arrays.sort(arr);
		System.out.println("The array after sorting: ");
		for (int i:arr) {
			System.out.print(i + "\t");
		}
		System.out.println("\nThe sum of the array: " + sum);
		System.out.println("The average value of the array: " + average);
	}
}
