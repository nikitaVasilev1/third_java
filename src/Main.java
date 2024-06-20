
public class Main {
    public static void main(String[] args) {
        System.out.println(encryptThis("A wise old owl lived in an oak"));
        System.out.println(encryptThis("word hello"));
        System.out.println(encryptThis("word hello WorD"));
    }
    public static String encryptThis(String text) {
        String[] words = text.split(" ");
        StringBuilder encryptedMessage = new StringBuilder();

        for (String word : words) {
            if (word.length() > 1) {
                char firstLetter = word.charAt(0);
                char secondLetter = word.charAt(1);
                char lastLetter = word.charAt(word.length() - 1);
                encryptedMessage.append((int) firstLetter);
                encryptedMessage.append(lastLetter);
                if (word.length() > 2) {
                    encryptedMessage.append(word.substring(2, word.length() - 1));
                    encryptedMessage.append(secondLetter);
                }
            } else if (word.length() == 1) {
                encryptedMessage.append((int) word.charAt(0));
            }
            encryptedMessage.append(" ");
        }
            return encryptedMessage.toString().trim();
        }
    }

