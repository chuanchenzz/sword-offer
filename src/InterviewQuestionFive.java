public class InterviewQuestionFive {

    public static void main(String[] args){
        int[][] sortArray = new int[][]{{1,2,8,9},
                {2,4,9,12},
                {4,7,10,13},
                {6,8,11,15}};
        System.out.print(findIntegerFromTwoArray(sortArray,0,sortArray[0].length - 1,5));
    }

    public static boolean findIntegerFromTwoArray(int[][] sortArray,int startRow, int endColumn, int sourceInt){
        if(sortArray == null){
            throw new IllegalArgumentException();
        }
        if(startRow >= sortArray.length || endColumn < 0){
            return false;
        }
        if(endColumn >= 0 && startRow <= sortArray.length) {
            for (int i = endColumn; i >= 0; i--) {
                if (sortArray[startRow][i] == sourceInt) {
                    return true;
                } else if (sortArray[startRow][i] > sourceInt) {
                    endColumn--;
                }
            }
        }
        if(endColumn >= 0 && startRow <= sortArray.length) {
            for (int j = startRow; j < sortArray.length; j++) {
                if (sortArray[j][endColumn] == sourceInt) {
                    return true;
                } else if (sortArray[j][endColumn] < sourceInt) {
                    startRow++;
                }
            }
        }
        return findIntegerFromTwoArray(sortArray,startRow,endColumn,sourceInt);
    }
}
