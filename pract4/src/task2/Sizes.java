package task2;

public enum Sizes {
        XXS(32),
        XS(34),
        S(36),
        M(38),
        L(40);
        private final int euroSize;

        Sizes(int euroSize) {
            this.euroSize = euroSize;
        }

        private void getDescription(Sizes s)
        {
                if (s == XXS)
                {
                        System.out.println("Детский размер");
                }
                else {
                        System.out.println("Взрослый размер");
                }
        }



}
