public class Demo6c {
    public static void main(String[] args) {
        String white="\033[0m",color1="\033[32m",color2="\033[31m",color3="\033[33m";
        String boldWhite="\033[0;1m";
        String city="CITY";
        String state= "STATE";
        String population = "POPULATION";
        String city1="Los Angeles",city2="California",city3="York";
        int pop1=3966936,pop2=8336817;
        
        System.out.printf("%s+%2$15s+%2$15s+%2$15s+\n",color1,"---------------");
        System.out.printf("|%s%-15s%s|%s%-15s%s|%s%15s%s|\n",boldWhite,city,color1,boldWhite,state,color1,boldWhite,population,color1);
        System.out.printf("%s+%2$15s+%2$15s+%2$15s+\n",color1,"---------------");
        System.out.printf("|%s%-15s%s|%s%-15s%s|%s%,-15d%s|\n",white,city1,color1,white,city2,color1,color2,pop1,color1);
         System.out.printf("|%sNew %s%-11s%s|%sNew %s%-11s%s|%s%,-15d%s|\n",color3,white,city3,color1,color3,white,city3,color1,color2,pop2,color1);
        System.out.printf("%s+%2$15s+%2$15s+%2$15s+\n",color1,"---------------");
        
    }
}
