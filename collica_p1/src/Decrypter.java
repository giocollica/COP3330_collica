/*
    Giovanni Collica
    Programming Assignment 1
    COP 3330

    This java class is designed to take in
    a string of numbers and encrypt them
    according to a specific algorithm set
    out by the assignment.
 */

//main decrypter class
public class Decrypter {
    private String encryptedNumString;
    private String decryptedNumString;
    int [] encryptedNumArray;
    int [] decryptedNumArray;

    //main function to decrypt the given string
    public String decrypt(String number){
        this.encryptedNumString = number;

        encryptedNumArray = convertToArray(encryptedNumString);
        decryptedNumArray = swapDigits(encryptedNumArray);
        decryptedNumArray = reverseRemainder(decryptedNumArray);
        decryptedNumString = convertToString(decryptedNumArray);

        return decryptedNumString;
    }

    //function to convert the integer array into a string
    public String convertToString(int[] decryptedNumbers){
        String Number = "";
        int size = decryptedNumbers.length;
        char[] numbers = new char[decryptedNumbers.length];

        for(int i = 0; i < size; i++){
            numbers[i] = Character.forDigit((decryptedNumbers[i]), 10);
        }

        for(int j = 0; j < size; j++){
            Number += String.valueOf(numbers[j]);
        }

        return Number;
    }

    //function to convert the string into an integer array
    public int[] convertToArray(String numberToDecrypt){
        char[] numbers = new char[numberToDecrypt.length()];
        int size = numberToDecrypt.length();
        int [] numArray = new int [size];

        for(int i = 0; i < size; i++){
            numbers[i] = numberToDecrypt.charAt(i);
        }

        for(int j = 0; j < size; j++){
            numArray[j] = Character.getNumericValue(numbers[j]);
        }

        return numArray;
    }

    //function to swap the first and third digits and
    //the second and fourth digits
    public int[] swapDigits(int[] numberToDecrypt){
        int temp = 0;

        //swap first and third digit
        temp = numberToDecrypt[0];
        numberToDecrypt[0] = numberToDecrypt[2];
        numberToDecrypt[2] = temp;

        temp = 0;

        //swap second and fourth digit
        temp = numberToDecrypt[1];
        numberToDecrypt[1] = numberToDecrypt[3];
        numberToDecrypt[3] = temp;

        return numberToDecrypt;
    }

    //function to reverse the remainder and subtract
    //seven from each number from the array
    public int[] reverseRemainder(int[] numberToDecrypt){
        int size = numberToDecrypt.length;
        for(int i = 0; i < size; i++){
            /*
                The number will have 10 added and then 7
                subtracted if the number is less then or
                equal to 7. The number will have 7 subtracted
                if the number is greater than 7
            */
            if(numberToDecrypt[i] <= 7) {
                numberToDecrypt[i] = ((numberToDecrypt[i] + 10) - 7);
            }else{
                numberToDecrypt[i] = numberToDecrypt[i] - 7;
            }
        }
        return numberToDecrypt;
    }

}