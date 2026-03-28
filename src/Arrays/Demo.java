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



    }
}
