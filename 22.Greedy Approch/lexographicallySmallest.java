// Java implementation of the approach
import java.util.Arrays;

public class lexographicallySmallest {

	// Function to return the lexicographically
	// smallest string of length n that
	// satisfies the given condition
	public static char[] lexo_small(int n, int k)
	{
		char arr[] = new char[n];

		Arrays.fill(arr, 'a');

		// Iteration from the last position
		// in the array
		for (int i = n - 1; i >= 0; i--) {

			k -= i;

			// If k is a positive integer
			if (k >= 0) {

				// 'z' needs to be inserted
				if (k >= 26) {
					arr[i] = 'z';
					k -= 26;
				}

				// Add the required character
				else {
					arr[i] = (char)(k + 97 - 1);
					k -= arr[i] - 'a' + 1;
				}
			}

			else
				break;

			k += i;
		}

		return arr;
	}

	// Driver code
	public static void main(String[] args)
	{
		int n = 5, k = 42;

		char arr[] = lexo_small(n, k);

		System.out.print(new String(arr));
	}
}
