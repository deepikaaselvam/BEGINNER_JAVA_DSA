package Contests;

public class SingleEleI {
    public static void main(String[] args) {
        int answer=0;
        int[]array={1,1,2,2,3,3,4,5,5,6,6};
        for(int i=1;i<array.length-2;i++)
        {
            if(i==0 && array[i]!=array[i+1])
            {
                answer=array[i];
                continue;
            }
             else if(array[i-1]!=array[i] ||array[i]!=array[i+1])
            {
                answer=array[i];
            }
        }
        System.out.println(answer);
        int answer1=5;
        int newAnswer=++answer1+answer1;
        System.out.println(newAnswer);
    }
    
}
