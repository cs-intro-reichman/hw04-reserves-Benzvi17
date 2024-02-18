public class arrayTest (int [] array) {
        int [] arr = new int [array.length+1];
        for (int i = 0; i < array.length; i++) {
            arr[array[i]]=array[i];
        }
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] == 0) {
                return arr[j];
            }
        }
    
    }


