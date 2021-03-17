import java.util.Scanner;
public class AddingMatrices {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int m,n;
		
		System.out.println("A matrice has size of m*n.");
		System.out.print("Enter m: ");
		m = keyboard.nextInt();
		System.out.print("Enter n: ");
		n = keyboard.nextInt();
		
		int arr1[][] = new int[m][n];
		int arr2[][] = new int[m][n];
		int arr3[][] = new int[m][n];
		
		System.out.println("Enter the elements of the fisrt matrice: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("arr1["+ (i+1) + "][" + (j+1) + "] = ");
				arr1[i][j] = keyboard.nextInt();
			}
		}
		
		System.out.println("Enter the elements of the second matrice: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("arr2["+ (i+1) + "][" + (j+1) + "] = ");
				arr2[i][j] = keyboard.nextInt();
			}
		}
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		System.out.println("\nThe matrice after adding: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr3[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
