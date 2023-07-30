public class Demo6b {
    public static void main(String[] args) {
        String color1="\033[32m",color2="\033[31m",color3="\033[33m";
        String color4="\033[34m";
        String name="NAME";
        String age="AGE";
        String name1="Alice";
        String name2="Bob";
        int age1=24;
        int age2=30;

        System.out.printf("%s%s\n",color1,"+---------------+-----+");
        System.out.printf("|%s%-15s%s| %s%3s %s|\n",color2,name,color1,color2,age,color1);
        System.out.printf("%s%s\n",color1,"+---------------+-----+");
        System.out.printf("|%s%-15s%s| %s%3d %s|\n",color3,name1,color1,color4,age1,color1);
        System.out.printf("|%s%-15s%s| %s%3d %s|\n",color3,name2,color1,color4,age2,color1);
        System.out.printf("%s%s\n",color1,"+---------------+-----+");

    }
    
}
