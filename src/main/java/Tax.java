class Tax {
    public double calc(int i) throws IllegalAccessException {
        if (i < 0) {
            throw new IllegalAccessException("年收入必须大于等于0");
        }
        double ans = 0.0;
        int k = i / 12;
        if (k <= 3000) {
            ans = 0.03 * i;
        } else if (k <= 12000) {
            ans = 0.1 * i - 12 * 210;
        } else if (k <= 25000) {
            ans = 0.2 * i - 12 * 1410;
        } else if (k <= 35000) {
            ans = 0.25 * i - 12 * 2660;
        } else if (k <= 55000) {
            ans = 0.3 * i - 12 * 4410;
        } else if (k <= 80000) {
            ans = 0.35 * i - 12 * 7160;
        } else {
            ans = 0.45 * i - 12 * 15160;
        }
        return ans;
    }
}