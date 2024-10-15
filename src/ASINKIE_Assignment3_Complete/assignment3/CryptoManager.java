package assignment3;

public class CryptoManager {
    
    private static final char LOWER_BOUND = ' ';
    private static final char UPPER_BOUND = '_';
    private static final int RANGE = UPPER_BOUND - LOWER_BOUND + 1;

    public static boolean stringInBounds(String plainText) {
        for (char x : plainText.toCharArray()) {
            if (x > UPPER_BOUND || x < LOWER_BOUND) {
                return false;
            }
        }
        return true;
    }

    public static String encryptCaesar(String plainText, int key) {
        StringBuilder encryptedText = new StringBuilder();
        for (char x : plainText.toCharArray()) {
            int encryptedChars = (x - LOWER_BOUND + key) % RANGE + LOWER_BOUND;
            encryptedText.append((char) encryptedChars);
        }
        return encryptedText.toString();
    }

    public static String decryptCaesar(String encryptedText, int key) {
        StringBuilder decryptedText = new StringBuilder();
        for (char x : encryptedText.toCharArray()) {
            int decryptedChar = (x - LOWER_BOUND - key + RANGE) % RANGE + LOWER_BOUND;
            decryptedText.append((char) decryptedChar);
        }
        return decryptedText.toString();
    }

// Method to encrypt a string using the Bellaso Cipher
public static String encryptBellaso(String plainText, String bellasoStr) {
    StringBuilder encryptedText = new StringBuilder();

    for (int i = 0; i < plainText.length(); i++) {
        char plainChar = plainText.charAt(i);
        char bellasoChar = bellasoStr.charAt(i % bellasoStr.length());
        int shiftedValue = plainChar + bellasoChar;
        while (shiftedValue > UPPER_BOUND) {
            shiftedValue -= (UPPER_BOUND - LOWER_BOUND + 1);
        }
        encryptedText.append((char) shiftedValue);
    }
    return encryptedText.toString();
}

// Method to decrypt a string using the Bellaso Cipher
public static String decryptBellaso(String encryptedText, String bellasoStr) {
    StringBuilder decryptedText = new StringBuilder();

    for (int i = 0; i < encryptedText.length(); i++) {
        char encryptedChar = encryptedText.charAt(i);
        char bellasoChar = bellasoStr.charAt(i % bellasoStr.length());
        int shiftedValue = encryptedChar - bellasoChar;
        while (shiftedValue < LOWER_BOUND) {
            shiftedValue += (UPPER_BOUND - LOWER_BOUND + 1);
        }
        decryptedText.append((char) shiftedValue);
    }
    return decryptedText.toString();
}


    public static Object caesarEncryption(String string, int i) {
        return null;
    }

    public static Object caesarDecryption(String string, int i) {
        return null;
    }

    public static Object bellasoEncryption(String string, String string2) {
        return null;
    }

    public static Object bellasoDecryption(String string, String string2) {
        return null;
    }
}