package day2;

public class banktransaction {
    String normalizeReference(String raw) {
        raw = raw.trim();
        String upper = raw.substring(0, 3).toUpperCase();
        String normalized = upper + raw.substring(3);

        for (int i = 0; i < normalized.length(); i++) {
            for (int j = i; j < 2; j++) {
                if (Character.isLetter(normalized.charAt(j))) {
                    continue;
                }
                if (Character.isDigit(normalized.charAt(i))) {
                    continue;
                }
            }
        }
        return normalized;
    }
}
