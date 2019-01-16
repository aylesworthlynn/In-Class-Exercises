
public class Big_O {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(bigODeterminer(1));
		System.out.println(bigODeterminer(2));
		System.out.println(bigODeterminer(5));
		System.out.println(bigODeterminer(10));
		System.out.println(bigODeterminer(50));
		System.out.println(bigODeterminer(100));
		System.out.println(bigODeterminer(1000));
	}



public static int bigODeterminer(int n) {
	int sum2 = 0;
	for (int k=1; k <= n; k*=2)
		for (int j=1; j<=k; j++)
			sum2++;
return sum2;
	}
}
