public class MoveAllZeroesToEndEfficient {

    public static void main(String args[]){
        int a[] = {2,3,0,4,5,0,1,0,9,131,9,-1};
        int i=0, j=a.length-1;
        // printArray(a);

        while(a.length==a.length){

            for(i=0;a[i]!=0 && i<j;i++){
                continue;
            }
            for(j=a.length-1;a[j]==0 && j>i;j--){
                continue;
            }

            if(i>=j)
            break;

            System.out.println("swapping at "+i+","+j);
            printArray(a);
            //swap elements at i,j
            int temp = a[i];
            a[i]=a[j];
            a[j]=temp;

            System.out.println("swapped at "+i+","+j);
            printArray(a);

            // i++;
            // j--;
        }

        System.out.println("Final--------");
        printArray(a);
    }

    public static void printArray(int a[]){
            for(int i=0;i<=a.length-1;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }
    
}
