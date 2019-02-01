public class MergeSort
{
    public static int steps = 0;
    public static void main(String[] args){

    }
    
    public static int[] sort(int[] array){
        //BASE CASE
        steps += 1;
        if(array.length <= 1){
            steps += 1;
            return array;
        }
        
        //SPLIT STEP
        int half = array.length / 2;
        int[] front = new int[half];
        int[] back = new int[array.length - half];
        steps += 6;
        for(int i = 0; i < array.length; i++){
            steps += 4;
            if(i < half){
                front[i] = array[i];
                steps += 2;
            }else{
                back[i - half] = array[i];
                steps += 2;
            }
        }

        //MERGESORT STEP
        front  = sort(front);
        back = sort(back);
        steps += 2;
        //MERGE STEP
        int fi = 0;
        int bi = 0;
        steps += 3;
        for(int i = 0; i < array.length; i++){
            steps += 7;
            if((bi >= back.length) || (fi < front.length  &&  front[fi] < back[bi])){
                array[i] = front[fi];
                fi++;
                steps += 3;
            }else{
                array[i] = back[bi];
                bi++;
                steps += 3;
            }
        }
        steps += 1;
        return array;
    }

}
