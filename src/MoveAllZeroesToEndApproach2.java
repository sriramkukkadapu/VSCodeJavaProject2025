public class MoveAllZeroesToEndApproach2 {

    public static void main(String args[]){
        int a[] = {2,3,0,4,5,0,1,0,9,131,9,-1};
        int nz=0,z=0;
        // printArray(a);

        while(nz<a.length){
            if(a[nz]!=0 ){//found 1 nz element then swap
                int temp = a[nz];
                a[nz]=a[z];
                a[z]=temp;

                //after swapping increment both indexes
                nz++;
                z++;
            }
            else
                nz++;
        }

        System.out.println("Final--------");
        printArray(a);
    }

    public static void printArray(int a[]){
            for(int i=0;i<=a.length-1;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
