package Assignment4;

public class Pangram {
    public static void main(String[] args)
    {
        String str = "We are the learning Java to xyzvb completely from EDYODA programs to gain quality knowledge";
        boolean[] value = new boolean[26];
        int index = 0;
        int flag = 1;
        for (int i = 0; i < str.length(); i++)
        {
            if ( str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
            {
                index = str.charAt(i) - 'A';
            }
            else if( str.charAt(i) >= 'a' &&  str.charAt(i) <= 'z')
            {
                index = str.charAt(i) - 'a';
            }
            value[index] = true;
        }
        for (int i = 0; i <= 25; i++)
        {
            if (value[i] == false)
                flag = 0;
        }
        if (flag == 1)
            System.out.print("The String is a Pangram String.");
        else
            System.out.print("The String is not a Pangram String.");
    }
}
