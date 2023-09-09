package Princeton2.TriangleArea;

public class TriangleArea {
    public static void main(String[] args) {
        /*
        javac Princeton2/TriangleArea/TriangleArea.java
        cd /workspaces/codespaces-blank
        java -cp . Princeton2.TriangleArea.TriangleArea 3 4 5 
         */
        if (args.length != 3) {
            System.out.println("Provide three parameters.");
            return;
        }            
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[0]);
        int c = Integer.parseInt(args[0]);

        double s = (a + b + c) / 2.0;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println(area);
    }
}