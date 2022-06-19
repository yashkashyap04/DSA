package Recursion;

public class ReverseString {

    public static char [] swap (char [] array, int index1, int index2) {
        char temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;

        return array;
    }
    
    public static char [] reverseString (char [] string, int start, int end) {
        if (start < end) {
            string = swap(string, start, end);
            return reverseString(string, ++start, --end);
        }
        else {
            return string;
        }
    }

    public static void main(String[] args) {
        char [] string = {'h', 'e', 'l', 'l', 'o'};
        char [] reversed = reverseString(string, 0, string.length - 1);

        for (char character: reversed) {
            System.out.print(character);
        }
    }
}
