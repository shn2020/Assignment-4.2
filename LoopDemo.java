public class LoopDemo {
	public static void main(String[] args) {
		// output first 100 odd numbers using for loop
		for (int i = 1; i <= 201; System.out.print(i + " "), i += 2);
		System.out.println();
		
		// output first 100 even numbers using do while loop
		int i = 0;
		do {
			i += 2;
			System.out.print(i + " ");
		} while (i <= 200);
		System.out.println();
		
		// draw a diamond shape using while loop
		 
		// initialize h is the height and width of the diamond
		// r to draw row, c to draw column, s to draw blank space
		int h = 5, r = 0, s = (h+1)/2, c;
		
		while (r <= h) {
			r++;
			if (r <= (h+1)/2) s--;
			else s++;
			c = 0;
			while (c <= h) {
				c ++;
				if (c <= s || c > (h - s)) System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println();
			
		}
	}
}
