package day2;

public class vowelandconsonantcounter {
    void countvowelandconsonant(String text) {
        text.toLowerCase();
        int vowel = 0;
        int consonant = 0;
        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o'
                    || text.charAt(i) == 'u') {
                vowel += 1;
            } else if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                consonant += 1;
            }
        }

    }
}
