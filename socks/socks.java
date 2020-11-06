public class socks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		int[] ar = { 1, 1, 3, 1, 2, 1, 3, 3, 3, 3 };

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
		System.out.println(pairs + " pairs");

	}
}
