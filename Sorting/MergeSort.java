public class MergeSort
{
    public static int steps = 0;
    public static void main(String[] args){

    }
    
    public static int[] sort(int[] array){
        //BASE CASE
        if(array.length <= 1){
            return array;
        }
        
        //SPLIT STEP
        int half = array.length / 2;
        int[] front = new int[half];
        int[] back = new int[array.length - half];
        for(int i = 0; i < array.length; i++){
            if(i < half){
                front[i] = array[i];
            }else{
                back[i - half] = array[i];
            }
        }

        //MERGESORT STEP
        front  = sort(front);
        back = sort(back);
        
        //MERGE STEP
        int fi = 0;
        int bi = 0;
        for(int i = 0; i < array.length; i++){
            if((bi >= back.length) || (fi < front.length  &&  front[fi] < back[bi])){
                array[i] = front[fi];
                fi++;
            }else{
                array[i] = back[bi];
                bi++;
            }
        }
        
        return array;
    }

}
