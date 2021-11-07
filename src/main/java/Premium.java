public class Premium {
    private String gender;
    private int seater;

    public Premium(String gender, int seater) {
        this.gender = gender;
        this.seater = seater;
    }

    public double calPremium() {
        double pre = 0;

        if (gender.equals("Male")) {
            if (seater < 0 || seater > 100) {
                pre = -1; // Input không hợp lệ
            }
            if (seater > 0 && seater < 6) {
                pre = 1.5;
            }
            if (seater >= 6 && seater <= 11) {
                pre = 1.8;
            }
            if (seater >= 12 && seater <= 24) {
                pre = 2;
            }
            if (seater > 24 && seater <= 100) {
                pre = 3;
            }
        }

        if (gender.equals("Female")) {
            if (seater < 0 || seater > 100) {
                pre = -1; // Input không hợp lệ
            }
            if (seater > 0 && seater < 6) {
                pre = 1.2;
            }
            if (seater >= 6 && seater <= 11) {
                pre = 1.5;
            }
            if (seater >= 12 && seater <= 24) {
                pre = 1.8;
            }
            if (seater > 24 && seater <= 100) {
                pre = 2.5;
            }
        }

        return pre;
    }
//
//    public static void main(String args[]) {
//        Premium premium = new Premium("Male", 12);
//        System.out.println(premium.calPremium());
//    }
}


