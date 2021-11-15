package Assignment4;

public class LCM {

    public int findLCM(int [] arr){
        int divisor = 2;
        int lcmOfElements = 1;

        while (true) {
            int counter = 0;
            boolean divisible = false;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0)
                    throw new RuntimeException(String.format("%d Numbers cannot be less than 0", arr[i]));
                if (arr[i] == 0)
                    return 0;
                if (arr[i] == 1)
                    counter++;
                if (arr[i] % divisor == 0) {
                    divisible = true;
                    arr[i] = arr[i] / divisor;
                }
            }
            if (divisible)
                lcmOfElements = lcmOfElements * divisor;
            else
                divisor++;
            if (counter == arr.length)
                return lcmOfElements;
        }
    }

    public static void main(String[] args) {
        LCM lcm = new LCM();
        int arr[] = {10, 7, 32 };
        System.out.println("LCM of given number : " + lcm.findLCM(arr));
    }

}


