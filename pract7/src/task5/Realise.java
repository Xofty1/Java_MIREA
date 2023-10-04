package task5;

public class Realise implements S_method {
    private String str;

    @Override
    public int leng() {
        return str.length();
    }

    @Override
    public String not_even_s() {
        String new_s = new String();
        for (int i = 0; i < this.leng()+1; i++) {
            if (i % 2 == 1) {
                new_s += this.str.charAt(i-1);
            }
        }
        return new_s;
    }

    @Override
    public String rever() {
        String new_s = new String();
        for (int i = this.leng(); i > 0; i--) {
            new_s += this.str.charAt(i-1);
        }
            return new_s;

    }

    public Realise(String str) {
        this.str = str;
    }

    public static void main(String[] args) {
        Realise n = new Realise("ABCDE");
        System.out.println(n.leng());
        System.out.println(n.not_even_s());
        System.out.println(n.rever());
    }
}