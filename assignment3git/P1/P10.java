class P10{
	public static void main(String[] args){
		for (int i = 69; i >= 65; i--){
            for (int j =65; j <=i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k <= 69-i; k++) {
				int a  = (i+k);
				char b = (char)a;
                System.out.print(b+" ");
            }
        System.out.println();
        }
	}
}