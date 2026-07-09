// Last updated: 7/9/2026, 3:12:48 PM
class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {

        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < words.length) {

            int lineLength = words[i].length();
            int j = i + 1;

            // Find how many words fit in the current line
            while (j < words.length &&
                    lineLength + 1 + words[j].length() <= maxWidth) {
                lineLength += 1 + words[j].length();
                j++;
            }

            int numWords = j - i;
            StringBuilder line = new StringBuilder();

            // Last line or only one word -> left justify
            if (j == words.length || numWords == 1) {

                line.append(words[i]);

                for (int k = i + 1; k < j; k++) {
                    line.append(" ");
                    line.append(words[k]);
                }

                while (line.length() < maxWidth) {
                    line.append(" ");
                }

            } else {

                int totalChars = 0;
                for (int k = i; k < j; k++) {
                    totalChars += words[k].length();
                }

                int totalSpaces = maxWidth - totalChars;
                int gaps = numWords - 1;

                int spaces = totalSpaces / gaps;
                int extra = totalSpaces % gaps;

                for (int k = i; k < j; k++) {

                    line.append(words[k]);

                    if (k < j - 1) {

                        for (int s = 0; s < spaces; s++)
                            line.append(" ");

                        if (extra > 0) {
                            line.append(" ");
                            extra--;
                        }
                    }
                }
            }

            result.add(line.toString());
            i = j;
        }

        return result;
    }
}