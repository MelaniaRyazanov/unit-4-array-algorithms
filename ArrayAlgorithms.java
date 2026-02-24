public class ArrayAlgorithms {

  private int[] intArray;

   /*
   * ASSUMPTIONS FOR THIS ASSIGNMENT:
   * 1) arraySize will always be >= 1
   * 2) Random numbers should be in the range 0 - 99 (inclusive)
   */

   public ArrayAlgorithms(int arraySize) {
      // REQUIRED: initialize intArray to be of size arraySize
      intArray = new int[arraySize]; 
   }

   public void populateArrayWithRandom() {
      // REQUIRED: populate intArray with random integers from 0 - 99
      for(int i = 0; i < intArray.length; i++){
         intArray[i] = (int) (Math.random() * 100);
         // System.out.println(intArray[i]);
      }
   }

   public void populateArrayWithSequential(int startNum) {
      // REQUIRED: populate intArray with sequential integers starting at startNum
      for (int i = 0; i < intArray.length; i++) {
         intArray[i] = startNum + i;
      }
   }

   public int findMax() {
      // REQUIRED: return the largest integer in intArray
      int maxNumber = 0;
      for(int max : intArray){
         if (max > maxNumber) { 
            maxNumber = max;
         }
      }
      return maxNumber;
   }

   public boolean hasDuplicates() {
      // REQUIRED: return true if there are duplicate values in the array
      // HINT: use a nested for loop
      for(int i = 0; i < intArray.length; i++){
         for(int j = i + 1; j < intArray.length; j++){
            int x = intArray[i];
            int y = intArray[j];
            if(x == y){
               return true;
            }
         }
      }
      return false;
   }

   public boolean isInArray(int intToFind) {
      // REQUIRED: return true if intToFind is in intArray.
      // NOTE: Use an enhanced for loop for this method
      for(int curInt : intArray){
         if(curInt == intToFind){
            return true;
         }
      }
      return false;
}
   public static void main(String[] args) {
      // REQUIRED:
      // 1) Create an ArrayAlgorithms object
      ArrayAlgorithms arrayAlgorithms = new ArrayAlgorithms(10);
      // 2) Populate the array with random numbers
      arrayAlgorithms.populateArrayWithRandom();
      // 3) Call and print the result of EACH REQUIRED method

      int max = arrayAlgorithms.findMax();
      System.out.println(max);
      
      boolean duplicate = arrayAlgorithms.hasDuplicates();
      System.out.println(duplicate);

      boolean isInArray = arrayAlgorithms.isInArray(2);
      System.out.println(isInArray);
}
}