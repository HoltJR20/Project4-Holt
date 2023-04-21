import java.util.ArrayList;

/**
 * This is a child class of Cipher.
 * This class takes an ArrayList of ciphers and a string,
 * and encrypts the string based on the encryption of a Composition Cipher.
 */
public class CompositionCipher extends Cipher {
    ArrayList<Cipher> ciphers;

    /**
     * Constructor of Composition Cipher
     */
    public CompositionCipher() {

        ciphers = new ArrayList<Cipher>();
    }

    /**
     * Copy constructor of Composition Cipher
     */
    public CompositionCipher(CompositionCipher other) {
        this.ciphers = new ArrayList<Cipher>();
        for (int i = 0; i < other.ciphers.size(); i++) {
            this.ciphers.add(other.ciphers.get(i).newCopy());
        }
    }

    /**
     * Adds a cipher to the ciphers ArrayList
     */
    public void add(Cipher theCipher) {
        ciphers.add(theCipher);
    }

    /**
     * This override encrypts the char of each string based on the Composition Cipher Encryption
     */
    @Override
    public char encrypt(char c) {
        char result = c;
        for (int i = 0; i < this.ciphers.size(); i++) {
            result = this.ciphers.get(i).encrypt(result);
        }
        return result;
    }

    /**
     * This override decrypts a char of each string based on the Composition Cipher Decryption
     */
    @Override
    public char decrypt(char c) {
        char result = c;
        for (int i = this.ciphers.size() - 1; i >= 0; i--) {
            result = this.ciphers.get(i).decrypt(result);
        }
        return result;
    }

    /**
     * This override calls the copy of Composition Cipher
     */
    @Override
    public Cipher newCopy() {
        return new CompositionCipher(this);
    }
}

