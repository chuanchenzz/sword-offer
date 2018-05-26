import java.util.HashMap;
import java.util.Map;

public class InterviewQuestionFour {

    public static void main(String[] args){
        int[] intArray = new int[]{2,3,1,4,2,5,3};
        System.out.print(findRepeatDigitalWhithoutAdditionalSpace(intArray));
    }

    public static int findRepeatDigitalWhithAdditionalSpace(int[] intArray){
        if(intArray == null || intArray.length == 0){
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < intArray.length; i++){
            if(intArray[i] < 1 || intArray[i] > intArray.length){
                throw new IllegalArgumentException();
            }
        }
        Map<Integer,Integer> spaceMap = new HashMap<>(intArray.length);
        for (int i = 0; i < intArray.length; i++){
            if(spaceMap.get(intArray[i]) != null){
                return intArray[i];
            }else {
                spaceMap.put(intArray[i],i);
            }
        }
        return -1;
    }

    public static int findRepeatDigitalWhithoutAdditionalSpace(int[] intArray){
        if(intArray == null || intArray.length == 0){
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < intArray.length; i++){
            if(intArray[i] < 1 || intArray[i] > intArray.length){
                throw new IllegalArgumentException();
            }
        }
        int startIndex = 1;
        int endIndex = intArray.length;
        while(endIndex - startIndex > 1){
            int middle = (startIndex + endIndex) >> 1;
            if(count(intArray,startIndex,middle) > middle - startIndex + 1){
                endIndex = middle;
            }else {
                startIndex = middle;
            }
        }
        if(endIndex - startIndex == 1 && count(intArray,startIndex,startIndex) > 1){
            return startIndex;
        }else {
            return endIndex;
        }
    }

    private static int count(int[] intArray,int min, int max){
        int count = 0;
        for (int i = 0; i < intArray.length; i++){
            if(intArray[i] >= min && intArray[i] <= max){
                count++;
            }
        }
        return count;
    }
}
