public class Decrypter {
    private String encryptedNumString;
    private String decryptedNumString;
    int [] encryptedNumArray;
    int [] decryptedNumArray;

    public String decrypt(String number){
        this.encryptedNumString = number;

        encryptedNumArray = convertToArray(encryptedNumString);
        decryptedNumArray = swapDigits(encryptedNumArray);
        decryptedNumArray = reverseRemainder(decryptedNumArray);
        decryptedNumString = convertToString(decryptedNumArray);

        return decryptedNumString;
    }

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

    public int[] swapDigits(int[] numberToDecrypt){
        int temp = 0;

        temp = numberToDecrypt[0];
        numberToDecrypt[0] = numberToDecrypt[2];
        numberToDecrypt[2] = temp;

        temp = 0;

        temp = numberToDecrypt[1];
        numberToDecrypt[1] = numberToDecrypt[3];
        numberToDecrypt[3] = temp;

        return numberToDecrypt;
    }

    public int[] reverseRemainder(int[] numberToDecrypt){
        int size = numberToDecrypt.length;
        for(int i = 0; i < size; i++){
            if(numberToDecrypt[i] <= 7) {
                numberToDecrypt[i] = ((numberToDecrypt[i] + 10) - 7);
            }else{
                numberToDecrypt[i] = numberToDecrypt[i] - 7;
            }
        }
        return numberToDecrypt;
    }

}