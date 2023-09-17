package task3;

import task2.Skirt;

public class Catalog {
    Object[] catalog = new Object[5];
    Laptops l1 = new Laptops("HP", 39990);
    Laptops l2 = new Laptops("Apple", 96990);
    Laptops l3 = new Laptops("Huawei", 73990);
     Phones p1 = new Phones("Samsung", 29999);
     Phones p2 = new Phones("POCO", 14999);

    public Object[] getCatalog() {
        return catalog;
    }

    public Laptops getL1() {
        return l1;
    }

    public Laptops getL2() {
        return l2;
    }

    public Laptops getL3() {
        return l3;
    }

    public Phones getP1() {
        return p1;
    }

    public Phones getP2() {
        return p2;
    }

    public int getCostFromName(String name)
    {
        switch (name){
            case "HP":
                return 39990;
            case "Apple":
                return 96990;
            case "Huawei":
                return 73990;
            case "Samsung":
                return 29999;
            case "POCO":
                return 14999;

        }
        return 0;
    }
    public void setCatalog()
     {
         this.catalog[0] = this.l1;
         this.catalog[1] = this.l2;
         this.catalog[2] = this.l3;
         this.catalog[3] = this.p1;
         this.catalog[4] = this.p2;
     }
     public void printCatalog(int code)
     {
         if (code == 1)// laptop
             for (int i = 0; i < 3; i++) {
                 System.out.println(toStr(catalog[i]));
             }
         else// phone
            for (int i = 2; i < 5; i++) {
             System.out.println(toStr(catalog[i]));
         }
     }

     public static String toStr(Object t)
     {

         if (t instanceof Laptops)
            return "Laptop " + ((Laptops) t).getName() + ". Его цена " + ((Laptops) t).getCost();
         else
             return "Phone " + ((Phones) t).getName() + ". Его цена " + ((Phones) t).getCost();
     }

     public void loading(){
         for (int i = 0; i < 6; i++) {
             System.out.print("\r" + "              ");
             System.out.print("Loading.");
             try {
                 Thread.sleep(500);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             System.out.print("\r" + "              ");
             System.out.print("Loading..");
             try {
                 Thread.sleep(500);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             System.out.print("\r" + "              ");
             System.out.print("Loading...");
             try {
                 Thread.sleep(500);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
         System.out.println();
     }

}
