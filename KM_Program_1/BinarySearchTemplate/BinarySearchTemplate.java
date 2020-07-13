/*
    Grade = 100%, Great
*/
public class BinarySearchTemplate 
{
    public static void main(String[] args) 
    {
        int[] array = {13, 15, 18, 19, 22, 27, 32, 35, 39, 40, 42, 46,
                       50, 55, 60, 61, 63, 78};

        int n1 = 13; int n2 = 78; int n3 = 32;
        System.out.println(binarySearch(array, n1));
        System.out.println(binarySearch(array, n2));
        System.out.println(binarySearch(array, n3));
        System.out.println(binarySearchRecursion(array, n1, 0, 17, 8));
        System.out.println(binarySearchRecursion(array, n2, 0, 17, 8));
        System.out.println(binarySearchRecursion(array, n3, 0, 17, 8));
    }    
    public static int binarySearch(int[] sortedArray, int target)
    {
        int l = 0;
        int r = sortedArray.length-1;
        int m =0;
        while(l<=r)
        {
          m = (l + r)/2;  
          if(sortedArray[m]==target)
          {
              return m;
          }
          if(sortedArray[m]>target)
          {
              r = m-1;
              
          }
          
          else
          {
          l = m +1;
          }
        }
       
        
        return -1;
    }
    public static int binarySearchRecursion(int[] sortedArray, int target, 
                                           int left, int right, int middle)
    {
        //base case: not found at all
        if (left > right)
        {
            return -1;
        }
        middle = (left + right)/2;
        
        //base case: found on first trial
        if (sortedArray[middle] == target)
        {
            return middle;
        }
        
        
        //search the right sub array
        if (target > sortedArray[middle])
        {
           return binarySearchRecursion(sortedArray,target,middle+1,right,middle);
            
        }
        
        //search the left sub array
        else
        {
          return binarySearchRecursion(sortedArray,target,left,middle-1,middle);

        }
        
    }
}

