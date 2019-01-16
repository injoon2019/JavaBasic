class ThirteenSlashOne{
	public static void addOneDArr(int[] arr, int add){
		for(int i=0; i<arr.length; i++)
			arr[i] +=add;
	}

	public static void addTwoDArr(int[][] arr, int add){
		for(int i=0; i<arr.length; i++){
			addOneDArr(arr[i], 100);
		}
	}

	public static void main(String[] args){
		int[][] arr = { {0,0,0},{1,1,1},{2,2,2}};
		
		for(int i=0; i<arr.length;i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		addTwoDArr(arr,100);
		for(int i=0; i<arr.length;i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.println(arr[i][j]+"  ");
			}
			System.out.println();
		}
		
	}
}