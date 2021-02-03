import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {

		// n = number of socks
		// ar = array of socks
		int staticSock = 0;
		int checkSock = 0;
		int sockCount = 0;
		int pairs = 0;

		for (int i = 0; i <= ar.length - 1; i++) {
			if (ar[i] != 0) {
				staticSock = ar[i];
				for (int j = 0; j < ar.length; j++) {
					checkSock = ar[j];
					if (checkSock == staticSock && staticSock != 0) {
						sockCount++;
						if (sockCount == 2) {
							pairs++;
							sockCount = 0;
						}
					}
				}
				sockCount = 0;
				int[] tempAr = new int[ar.length];
				for (int k = 0; k < tempAr.length; k++) {
					if (ar[i] != ar[k]) {
						tempAr[k] = ar[k];
					}
				}
				ar = tempAr;
			}
		}
		return pairs;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] ar = new int[n];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = sockMerchant(n, ar);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
