class Pt15{
	public static void main(String args[]){
		for (int i=1;i<=6;i++){
			for(int j=1;j<=i;j++ )
			{
				System.out.print("*");
				switch (i){
					case 3 :
					System.out.print(" ");
					j++;
					break;
					case 4 :
					System.out.print("  ");
					j+=2;
					break;
					case 5 :
					System.out.print("   ");
					j+=3;
					break;
					
				}
			}
			System.out.println();
		}
		
	}
}