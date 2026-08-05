public class BubbleSort {

    public void sort(){
        int[] intArr = {54,35,92,65,77,21,32,86,51,33,50,29};

        for (int k=intArr.length-1;k>=0;k--){
            for(int i=0;i<k;i++){
                if(intArr[i]>intArr[i+1]){
                    int temp = intArr[i];
                    intArr[i] = intArr[i+1];
                    intArr[i+1] = temp;
                }
            }
        }


        for(int j=0;j<intArr.length;j++)
            System.out.println(intArr[j]);
    }
}
