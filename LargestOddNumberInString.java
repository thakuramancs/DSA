class LargestOddNumberInString{
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if (isOdd(num.charAt(i))) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }

    private boolean isOdd(char ch) {
        return ch == '1' || ch == '3' || ch == '5' || ch == '7' || ch == '9';
    }
}