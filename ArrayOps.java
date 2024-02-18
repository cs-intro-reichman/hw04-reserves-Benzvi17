public class ArrayOps {
    public static void main(String[] args) {
        
    }
    
    public static int findMissingInt (int [] array) {
        int [] arr = new int [array.length+1];
        for (int i = 0; i < array.length; i++) {
            arr[array[i]]=array[i];
        }
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] == 0) {
                return arr[j];
            }
        }

        return 0;
    }

    public static int secondMaxValue(int [] array) {
        int max = 0;
        int secondMax = 0;
        for (int i = 0; i < array.length + 1 ; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int j = 0; j < array.length; j++) {
            if (array[j]>secondMax && array[j] < max) {
                secondMax = array[j]; 
                
            }
            
        }
        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
       boolean isIdentical = false;
        for (int i = 0; i < Math.min(array2.length, array1.length); i++) {
            for (int j = 0; j < i; j++) {
                if(array1[i] ==  array2[j])
                    isIdentical = true;
            } 
        }
        return isIdentical;
    }

    public static boolean isSorted(int [] array) {
        int increase = 0;
        int decrease = 0;
        for (int i = 0; i < array.length-1; i++) {
            if(array[i] >= array[i+1])
            decrease++;

            if(array[i] <= array[+1])
            increase++;
    }
        
    if (increase==array.length-1 || decrease==array.length-1) {
        return true;
        }  else return false;
    
    }

}
