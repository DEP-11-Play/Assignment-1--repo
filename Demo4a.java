public class Demo4a {
    public static void main(String[] args) {
        int day=28;
        int month =12;
        int year=2023,hour=23,minute=59,second=59;

        String color1="\033[32m",color2="\033[31m",color3="\033[33m";
        String color4="\033[34m",color5="\033[35m",color6="\033[36m";
        String RESET="\033[0m";

        System.out.printf("%s%d%s/%s%d%s/%s%d%s %s%d%s:%s%d%s:%s%d%s \n",color1,day,RESET,color2,month,RESET,color3,year,RESET,color4,hour,RESET,color5,minute,RESET,color6,second,RESET);
}
}
