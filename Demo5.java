public class Demo5 {
    public static void main(String[] args) {
        int ISBNno_1=978;
        int ISBNno_2=3;
         int ISBNno_3=16;
        int ISBNno_4=1484100;
        String color1="\033[32m",color2="\033[31m",color3="\033[33m",color4="\033[35m";
        String RESET="\033[0m";

        System.out.printf("%s%d%s-%s%d%s-%s%d%s-%s%d%s\n", color1,ISBNno_1,RESET,color2,ISBNno_2,RESET,color3,ISBNno_3,RESET,color4,ISBNno_4,RESET);

    }
    
}
