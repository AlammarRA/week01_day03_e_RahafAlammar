import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("");
        System.out.println("Q1");
        //Q1
        String array1[] = {"Saleh", "Khalid", "Majed"};

        System.out.println(Arrays.toString(array1));

        System.out.println("");
        System.out.println("Q2");
        //Q2
        for (int i = 1; i <= 33; i++) {
            if ((i % 5) == 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }

        System.out.println("");
        System.out.println("Q3");
        //Q3
        String[] arrayR = {"Rahaf", "Sara", "Hala", "Noura", "Ghadah"};
        for (int i = arrayR.length - 1; i >= 0; i--) {
            System.out.print(arrayR[i] + " ");
        }

        System.out.println("");
        System.out.println("Q4");

        //Q4
        String[] name = {"Aseel", "Rahaf", "Sara", "Hala", "Alanoud", "Noura", "Ghadah", "Amal", "Ahmad", "Abdulrahman"};
        for (int i = 0; i < name.length; i++) {
            char indexName = name[i].charAt(0);
            if (indexName == 'A') {
                System.out.print(name[i] + " ");
            } else {
                continue;
            }
        }

        System.out.println("");
        System.out.println("Q5");
        //Q5
        printArrayName(name);
        //arrayNumber(23,77,80);

        System.out.println("");
        System.out.println("Q6");
        //Q6
        System.out.println(Arrays.toString(arrayNumber(23,77,80)));




        System.out.println("");
        System.out.println("Q7");
        //Q7
        System.out.println(arrayFullName("Rahaf","Alammar"));



        System.out.println("");
        System.out.println("Q8");
        //Q7
        System.out.println(sumAverage(55,66,77,88));



        System.out.println("");
        System.out.println("Q9");
        //Q7
        int arrayNum[] = {20,20,50,30,400,100,5,1000};
        System.out.println(maxNumber(arrayNum));

    }


    //Q5
    public static void printArrayName(String[] name) {
        for (int i = 0; i < name.length; i++)
            System.out.print(name[i]+" ");
    }

    //Q6
    public static int[] arrayNumber(int num1,int num2,int num3) {
        int[] arrayNum = new int[3];
        int i =0;
            arrayNum[i] = num1;
            arrayNum[i+1] = num2;
            arrayNum[i+2] = num3;
            return arrayNum;
    }


    //Q7
    public static String arrayFullName(String firstN , String lastN) {
        String message = "Hello "+firstN+" "+lastN;

        return message;
    }

    //Q8
    public static int sumAverage(int num1,int num2,int num3 , int num4) {
        int sum , average;
        sum = num1+num2+num3+num4;
        return sum/4;
    }



    //Q9
    public static int maxNumber(int[] arrayOfNum) {
        int maxNum = arrayOfNum[0];

        for (int i = 0; i < arrayOfNum.length; i++) {
            if(arrayOfNum[i]>maxNum)
                maxNum = arrayOfNum[i];
        }

        return maxNum;
    }


}