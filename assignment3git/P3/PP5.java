class PP5{
	public static void main(String[] args){
		for (int i = 9; i >= 1; i--){
            for (int j =1; j <=i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k <= 9-i; k++) {
				
                System.out.print((i+k));
            }
			for (int k = 8; k >=i; k--) {
				
                System.out.print(k);
            }
        System.out.println();
        }
	}
}