public class Main {
    public static void main(String[] args) {
        int[][] floats = new int[2][3];  
        
        floats[0][0] = 101;
        floats[0][1] = 102;
        floats[0][2] = 103;
        floats[1][0] = 201;
        floats[1][1] = 202;
        floats[1][2] = 203;

        System.out.println("Printing a 2-D array using for loop:");
        
        for (int i = 0; i < floats.length; i++) {  
            for (int j = 0; j < floats[i].length; j++) {  
                System.out.print(floats[i][j] + " ");  
            }
            System.out.println();  
        }
    }
}
