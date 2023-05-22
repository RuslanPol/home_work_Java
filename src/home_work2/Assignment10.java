package home_work2;

public class Assignment10 {
    public static void main(String[] args) {
        int[] arr = {10, -1, 0, 15, 2, 4, 7, -3, -4, 6, 0, 5, 12, -8};

        int countPositive = 0;
        int countNegative = 0;
        int countHonest = 0;
        int countOdd = 0;

        for (int i = 0; i < arr.length; i++) {
            int a=(arr[i] % 2 == 0)? countHonest++:countOdd++;
            if (arr[i] < 0) countNegative++;
            if (arr[i] > 0) countPositive++;
        }

        int honests[]=new int[countHonest];
        int odds[]=new int[countOdd];
        int positives[]=new int[countPositive];
        int negatives[]= new int[countNegative];

        int h=0;
        int o=0;
        int p=0;
        int n=0;

        for (int i = 0; i < arr.length; i++){
            if(arr[i]%2==0){
                honests[h]=arr[i];
                h++;
            }else{
                odds[o]=arr[i];
                o++;
            }
            if(arr[i]<0){
                negatives[n]=arr[i];
                n++;
            }
            if(arr[i]>0){
                positives[p]=arr[i];
                p++;
            }
        }

        System.out.println("\n");
        System.out.print("Основной массив: ");
        for(int el:arr){
            System.out.print(el +" ");
        }
        System.out.println("\n");
        System.out.print("Массив \"+\" элементов: ");
       for(int el:positives){
           System.out.print(el +" ");
       }
        System.out.println("\n");
        System.out.print("Массив \"-\" элементов: " );
       for(int el:negatives){
           System.out.print(el +" ");
       }
        System.out.println("\n");
        System.out.print("Массив четных элементов : " );
       for(int el:honests){
           System.out.print(el +" ");
       }
        System.out.println("\n");
        System.out.print("Массив  нечетных элементов : ");
       for(int el:odds){
           System.out.print(el +" ");
       }
        System.out.println("\n");

    }
}
