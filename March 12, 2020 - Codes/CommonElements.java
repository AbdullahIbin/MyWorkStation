public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 78, 11, 56};
        int[] arr2 = {11, 100, 43, 4, 90, 456};

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i] + " ");
                }
            }
        }
        System.out.println();
        int[][] arr3 = {{1, 3, 45, 64}, {65, 45, 12, 34, 90}};

        for(int i = 0; i < arr3.length - 1; i++){
            for(int j = 0; j < arr3[i].length; j++) {
                for (int k = 0; k < arr3[i+1].length; k++) {
                    if (arr3[i][j] == arr3[i + 1][k]) {
                        System.out.print(arr3[i][j] + " ");
                    }
                }
            }
        }
    }
}
