public class ArrayOps {
    public static void main(String[] args) {
        
    }
    
    public static int findMissingInt (int [] array) {
        int [] arr = new int [array.length+1];
        for (int i = 0; i < array.length; i++) {
            arr[array[i]]=array[i];
        }
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] == 0 && j!=0) {
                return j;
            }
        }

        return 0;
    }

    public static int secondMaxValue(int [] array) {
        int max = array[0];
        int secondMax = 0;
        for (int i = 0; i < array.length + 1 ; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        secondMax = max == array[0] && array.length > 1 ? array[1] : array[0];
        for (int j = 0; j < array.length; j++) {
            if(array[j]!= max ){
                secondMax = array[j];
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
       for (int i = 0; i < array1.length; i++) {
        boolean foundInArray2 = false;
        for (int j = 0; j < array2.length; j++) {
            if (array1[i] == array2[j]) {
                foundInArray2 = true;
            } 
        }
        if(!foundInArray2){
            return false;
        }
    }
    for (int i = 0; i < array2.length; i++) {
        boolean foundInArray1 = false;
        for (int j = 0; j < array1.length; j++) {
            if (array2[i] == array1[j]) {
                foundInArray1 = true;
            }
        }
        if(!foundInArray1){
            return false;
        }
    }
    return true;
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
