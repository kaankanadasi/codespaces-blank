package Princeton2;

public class Dragon {
    public static void main(String[] args) {
        String d0 = "F";
        String n0 = "F";
        String d1 = d0 + "L" + n0;
        String n1 = d0 + "R" + n0;
        String d2 = d1 + "L" + n1;
        String n2 = d1 + "R" + n1;
        String d3 = d2 + "L" + n2;
        String n3 = d2 + "R" + n2;
        String d4 = d3 + "L" + n3;
        String n4 = d3 + "R" + n3;
        String d5 = d4 + "L" + n4;

        System.out.println(d0);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
    }

}