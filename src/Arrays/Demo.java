package Arrays;

public class Demo {
    static void main() {
        int[] rollNumber;//declare 32 bits
        /**
         * new keywords is used to allocate the memory in the heap.
         * in this every memory is allocated with 32 bits memory
         */
        rollNumber = new int[100];//define

        for(int i=0;i<rollNumber.length;i++) {
            rollNumber[i]=i;
            System.out.println(rollNumber[i]);
        }
        //2d array
        int[][] marks = new int[3][];
        for(int i=0;i<marks.length;i++) {
            for(int j=0;j<marks[i].length;j++) {
                System.out.println(marks[i][j]);
            }
        }

        int[][][] arr = new int[3][][];
        //other way of declaration of array
        int[] arr={1,2,3,4};

        int[][] arr2={
                {1,2,3},
                {4,5,6,7},
                {8,9,10,11,12}
        };

    }
}
