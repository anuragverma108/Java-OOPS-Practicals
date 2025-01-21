public class DesignPattern{
    public static void Triangle(int height){
        for (int i=0; i<height;i++){
            for (int j=0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void Rectangle(int length, int width){
        for (int i=0; i<length;i++){
            for (int j=0; j<width;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void Square(int length){
        Rectangle(length,length);
    }
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("triangle")) {
                if (i + 1 < args.length) {
                    Triangle(Integer.parseInt(args[i + 1]));
                    i++; // Skip the next argument since it's already used
                } else {
                    System.out.println("Invalid input: Missing height for triangle");
                }
            } else if (args[i].equals("rectangle")) {
                if (i + 2 < args.length) {
                    Rectangle(Integer.parseInt(args[i + 1]), Integer.parseInt(args[i + 2]));
                    i += 2; // Skip the next two arguments since they are already used
                } else {
                    System.out.println("Invalid input: Missing dimensions for rectangle");
                }
            } else if (args[i].equals("square")) {
                if (i + 1 < args.length) {
                    Square(Integer.parseInt(args[i + 1]));
                    i++; // Skip the next argument since it's already used
                } else {
                    System.out.println("Invalid input: Missing side length for square");
                }
            } else {
                System.out.println("Invalid input: Input should be triangle, rectangle or square");
            }
        }
    }    
}