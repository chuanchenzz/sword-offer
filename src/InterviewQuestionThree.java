public class InterviewQuestionThree {

    public static void main(String[] args){
        int[] intArray = new int[]{2,3,1,0,2,5,3};
        System.out.print(findRepeatDigital(intArray));
    }
    /**
     *
     * @param intArray
     * @return no result: -1
     */
    public static int findRepeatDigital(int[] intArray){
        if(intArray == null || intArray.length == 0){
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < intArray.length; i++){
            if(intArray[i] < 0 || intArray[i] > intArray.length - 1){
                throw new IllegalArgumentException();
            }
        }
        for(int i = 0; i < intArray.length; i++){
            while(intArray[i] != i){
                if(intArray[intArray[i]] == intArray[i]){
                    return intArray[i];
                }else {
                    swap(intArray,i,intArray[i]);
                }
            }
        }
        return -1;
    }

    private static void swap(int[] intArray, int sourceIndex, int swapIndex){
        int temp = intArray[sourceIndex];
        intArray[sourceIndex] = intArray[swapIndex];
        intArray[swapIndex] = temp;
    }
}
