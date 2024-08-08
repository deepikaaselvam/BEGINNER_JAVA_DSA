package ArrayConcept;
public class SelectionSort {
    public static void main(String[] args) {
        int[]array={5,9,4,12,16};
        int n=array.length;
        int smallest=array[0];
        for(int i=0;i<n;i++)
        {
        
        if(array[i]<smallest)
        {
           
        }
        int temp=smallest;
        smallest=array[i];
        array[i]=temp;
        System.out.print(array[i]+" ");
        }


    }
    
}
