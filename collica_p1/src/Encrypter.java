public class Encrypter {
    private String originalNumString;
    private String encryptedNumString;
    int [] originalNumArray;
    int [] encryptedNumArray;

    public String encrypt(String number){
        this.originalNumString = number;

        originalNumArray = convertToArray(originalNumString);
        encryptedNumArray = addSeven(originalNumArray);
        encryptedNumArray = getRemainder(encryptedNumArray);
        encryptedNumArray = swapDigits(encryptedNumArray);
        encryptedNumString = convertToString(encryptedNumArray);

        return encryptedNumString;

    }

    public String convertToString(int[] encryptedNumbers){
        String Number = "";
        int size = encryptedNumbers.length;
        char[] numbers = new char[encryptedNumbers.length];

        for(int i = 0; i < size; i++){
            numbers[i] = Character.forDigit((encryptedNumbers[i]), 10);
        }

        for(int j = 0; j < size; j++){
            Number += String.valueOf(numbers[j]);
        }

        return Number;
    }

    public int[] convertToArray(String numberToEncrypt){
        char[] numbers = new char[numberToEncrypt.length()];
        int size = numberToEncrypt.length();
        int [] numArray = new int [size];

        for(int i = 0; i < size; i++){
            numbers[i] = numberToEncrypt.charAt(i);
        }

        for(int j = 0; j < size; j++){
            numArray[j] = Character.getNumericValue(numbers[j]);
        }

        return numArray;
    }

    public int[] addSeven(int[] numberToEncrypt){
        int size = numberToEncrypt.length;
        for(int i = 0; i < size; i++){
            numberToEncrypt[i] += 7;
        }
        return numberToEncrypt;
    }

    public int[] getRemainder(int[] numberToEncrypt){
        int size = numberToEncrypt.length;
        for(int i = 0; i < size; i++){
            numberToEncrypt[i] %= 10;
        }
        return numberToEncrypt;
    }

    public int[] swapDigits(int[] numberToEncrypt){
        int temp = 0;

        //swap first and third digit
        temp = numberToEncrypt[0];
        numberToEncrypt[0] = numberToEncrypt[2];
        numberToEncrypt[2] = temp;

        temp = 0;

        //swap second and fourth digit
        temp = numberToEncrypt[1];
        numberToEncrypt[1] = numberToEncrypt[3];
        numberToEncrypt[3] = temp;

        return numberToEncrypt;
    }

}