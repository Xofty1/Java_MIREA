package task1;



public class Year {
    public enum Seasons{
        WINTER(1, -18),
        SPRING(2, 14),
        SUMMER(3,23),
        AUTUMN(4,10);
    private final int num;
    private final double temperature;

        public int getNum() {
            return num;
        }

        public double getTemperature() {
            return temperature;
        }


        private Seasons(int num, double temperature) {
            this.num = num;
            this.temperature = temperature;
        }

        public String toString() {
            switch (this) {
                case WINTER:
                    return "Winter: average temperature = " + getTemperature();
                case SPRING:
                    return "Spring: average temperature = " + getTemperature();
                case SUMMER:
                    return "Summer: average temperature = " + getTemperature();
                case AUTUMN:
                    return "Autumn: average temperature = " + getTemperature();
                default:
                    return "Unknown Season";
            }
        }

        public static String iLike(Seasons season) {
            switch (season) {
                case WINTER:
                    return "Я люблю зиму";
                case SPRING:
                    return "Я люблю весну";
                case SUMMER:
                    return "Я люблю лето";
                case AUTUMN:
                    return "Я люблю осень";
                default:
                    return "Unknown Season";
            }
        }
//        public String getDescription() {
//            return "Холодное время года";
//        }

        // Переопределение метода getDescription для лета
        public String getDescription() {
            if (this == SUMMER) {
                return "Теплое время года";
            } else {
                return "Холодное время года";
            }
        }
    }



    public static void main(String[] args) {
        //1
//        Seasons season = Seasons.WINTER;
//        System.out.println(season.toString());

        //5
//        System.out.println(season.getDescription());

        //6
//        for (Seasons season : Seasons.values())
//        {
//            System.out.println("Сезон: " + season);
//            System.out.println("Описание: " + season.getDescription());
//            System.out.println(season.getTemperature()+"\n");
//        }
    }
}
