import java.util.Scanner;
public class PracticeArray {
    public static void main(String arg[]){
        // int[] age= new int[5];
        // age[0]=20;
        // age[1]=25;
        // age[2]=30;
        // age[3]=35;
        // age[4]=40;

        //  using for loop 

        // for(int i=0;i<=4;i++){
        //     System.out.println(age[i]);
        // }

        // using for each loop
        // for(int x:age){
        //     System.out.println(x);

        // }

        // using while loop
        // int i=0;
        // while(i<=4){
        //     System.out.println(age[i]);
        //     i++;
        // }



        // System.out.println(age[0]);
        // System.out.println(age[1]);
        // System.out.println(age[2]);
        // System.out.println(age[3]);
        // System.out.println(age[4]);

        // int[] age ={20,30,40,50};
        // System.out.println(age[1]);

        // int [] [] multiarray={{10,20,30},{40,50,60},{70,80,90}};
        // System.out.println(multiarray[0][0]);
        // System.out.println(multiarray[0][1]);
        // System.out.println(multiarray[0][2]);

        // System.out.println(multiarray[1][0]);
        // System.out.println(multiarray[1][1]);
        // System.out.println(multiarray[1][2]);

        // String [] name ={"java","python","html","css"};
        // System.out.println(name.length);

        // Question1-calculate the sum of array {1,2,3,4,5};
        // int arr[]={1,2,3,4,5};
        // int sum=0;
        // for(int i=0;i<arr.length;i++){
        //     sum=sum+arr[i];
        // }
        // System.out.println(sum);

        // find number of elements in an array:
        // int [] marks ={90,95,100,98,99};
        // System.out.println(marks.length);


        //user input in array
        Scanner sc =new Scanner(System.in);
        int [] marks=new int [5];
        for(int i=0;i<marks.length;i++){
            System.out.print("enter the marks");
            marks[i]=sc.nextInt();

        }
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]+ "");

        }

        



        



    }


}
    