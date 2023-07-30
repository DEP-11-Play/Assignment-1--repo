public class Demo6d {
    public static void main(String[] args) {
        String white="\033[0m",color1="\033[32m",color2="\033[31m",color3="\033[33m",color4="\033[34m";
        String boldWhite="\033[0;1m";
        String item="CITY";
        String quantity= "QUANTITY";
        String price = "PRICE";
        String item1="Apples",item2="Oranges";
        int quantity1=5, quantity2=10;
        double price1=0.99,price2=1.49;
        
        System.out.printf("%s+%2$10s+%2$10s+%3$8s+\n",color1,"----------","--------");
        System.out.printf("|%s%-10s%s|%s%-10s%s|%s%8s%s|\n",boldWhite,item,color1,boldWhite,quantity,color1,boldWhite,price,color1);
        System.out.printf("%s+%2$10s+%2$10s+%3$8s+\n",color1,"----------","--------");
        System.out.printf("%s| %s%-9s%s|%s%10d%s| %s$%s%6.2f%s|\n",color1,white,item1,color1,color4,quantity1,color1,color2,color3,price1,color1);
        System.out.printf("%s| %s%-9s%s|%s%10d%s| %s$%s%6.2f%s|\n",color1,white,item2,color1,color4,quantity2,color1,color2,color3,price2,color1);
        System.out.printf("%s+%2$10s+%2$10s+%3$8s+\n",color1,"----------","--------");
        
    }
}
