
public class insertionSort{
 
       public static void main(String[] args)
       {
         int[] a={5,30,49,2,9,7};
         int temp,j;
         for(int i=0; i<a.length; i++)
          {
            temp=a[i];
            j=i-1;
           while(j>=0 && a[j]>temp)
           {
            a[j+1]=a[j];
             j--;
            }
         a[j+1]=temp;
        }
       for(int i=0; i<a.length; i++)
        {
           System.out.println(a[j);
        }
}