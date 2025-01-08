import java.util.*;
public class ArrayOperationTool{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of your array:");
        int size=sc.nextInt();
        int[]arr = new int[size];
        System.out.println("Enter "+size+" elements:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        while(true)
        {
            System.out.println("\nArray Operations Menu:");
            System.out.println("1. Add an element");
            System.out.println("2. Delete an element");
            System.out.println("3. Search for an element");
            System.out.println("4. Reverse the array");
            System.out.println("5. Sort the array");
            System.out.println("6. Display the array");
            System.out.println("7. Exit");
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                        arr=addElement(arr,sc);
                        
                        break;
                case 2:
                        arr=deleteElement(arr,sc);
                        break;
                case 3:
                        searchElement(arr,sc);
                        break;
                case 4:
                        arr=reverseArray(arr);
                        break;
                case 5:
                        sortArray(arr,sc);
                        break;
                case 6:
                        System.out.println("Array: "+Arrays.toString(arr));
                        break;
                case 7:
                        System.out.println("Exiting");
                        return;
                default:
                        System.out.println("Try selecting a valid choice man.");
            }
        }
    }
    public static int[] addElement(int[]arr,Scanner sc)
    {
        System.out.println("Enter the element you want to add: ");
        int element=sc.nextInt();
        System.out.println("Enter the position you want to add the element:");
        int position=sc.nextInt();
        if(position<0||position>arr.length){
            System.out.println("Invalid pos");
            return arr;
        }
        int [] newArr=new int[arr.length+1];
        for(int i=0,j=0;i<newArr.length;i++)
        {
            if(i==position)
            {
                newArr[i]=element;
            }
            else{
                newArr[i]=arr[j];
                j++;
            }
        }
        return newArr;
    }
    public static int[] deleteElement(int[]arr,Scanner sc)
    {
        System.out.println("Enter the position you want to remove element from:");
        int position=sc.nextInt();
        if(position<0||position>arr.length){
            System.out.println("Invalid pos");
            return arr;
        }
        int [] newArr=new int[arr.length-1];
        for(int i=0,j=0;i<arr.length;i++)
        {
            if(i!=position)
            {
                newArr[j]=arr[i];
                j++;
            }
        }
        return newArr;
    }
    public static void searchElement(int[]arr,Scanner sc)
    {
        System.out.println("Enter the element you want to search:");
        int element=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==element)
            {
                System.out.println("Element found at position "+i);
                return;   
            }
        }
        System.out.println("Element not found");
    }
    public static int[] reverseArray(int[] arr)
    {
        for(int i=0;i<arr.length/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        return arr;
    }
    public static int[] sortArray(int[] arr,Scanner sc)
    {
        System.out.println("Choose 1.Ascending or 2.Descending:");
        int option=sc.nextInt();
        if(option==1){
            Arrays.sort(arr);
        }
        else if(option==2)
        {
           Arrays.sort(arr);
           for(int i=0;i<arr.length/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        }
        else{
            System.out.println("Invalid option");
        }
        return arr;
    }
}
