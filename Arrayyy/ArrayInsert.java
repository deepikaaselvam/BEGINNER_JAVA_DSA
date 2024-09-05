package Arrayyy;
public class ArrayInsert {
    public static void main(String[] args) {
        int[]array={5,9,4,12,16};
        int n=array.length;
        int[]newArray=new int[n+1];int pos=2,element=78;
        for(int i=0;i<newArray.length;i++)
        {
            if(i<pos)
            {
                newArray[i]=array[i];
            }
            if(i==pos)
            newArray[pos]=element;
            n++;
            if(i>pos)
            {
                newArray[i]=array[i];
            }
            System.out.print(newArray[i]+" ");
        }
        
    }
    
}
