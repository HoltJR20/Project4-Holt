/**
 *
 * @author HOLTJR20
 * This is an abstract parent class that initializes
 * 5 different methods for the child classes.
 */
public abstract class Cipher {
    /**
     *
     * @param c
     * @return
     * This method is different for all child classes, so the method is abstract
     * so as not to initialize.
     */
    public abstract char encrypt(char c);
    /**
     *
     * @param c
     * @return
     * This method is also different for all child classes, so the method is abstract
     */
    public abstract char decrypt (char c);
    /**
     *
     * @param s
     * @return String result
     *
     * This method is the same for all child classes. it just takes a string and encrypts each
     * individual letter, based on the child's encryption for each char.
     */
    public String encrypt (String s) {
        StringBuilder result = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            result.append(encrypt(s.charAt(i)));
        }
        return result.toString();
    }
    /**
     *
     * @param s
     * @return String result
     *
     * This method is the same for all child classes. it just takes a string and decrypts each
     * individual letter, based on the child's decryption for each char.
     *
     */
    public String decrypt (String s) {
        StringBuilder result = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            result.append(decrypt(s.charAt(i)));
        }
        return result.toString();

    }

    /**
     *
     * @return
     *
     * This method is different for all child classes, so the method is made abstract.
     */
    public abstract Cipher newCopy();
}

