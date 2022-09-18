package prakstrukdat_m7_binarytree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TreeApp {
    public static void main(String[] args) throws IOException {
        int value;
        String data;
        Tree theTree = new Tree();
        theTree.insert(50, "Ahmad");
        theTree.insert(25, "Rosa");
        theTree.insert(75, "Raisa");
        theTree.insert(12, "Naya");
        theTree.insert(37, "Gagas");
        theTree.insert(43, "Ainun");
        theTree.insert(30, "Beri");
        theTree.insert(33, "Vivid");
        theTree.insert(87, "Orin");
        theTree.insert(93, "Wiwid");
        theTree.insert(97, "Sasa");
        while (true) {
            System.out.print("Enter number of show(1), "
                    + "insert(2), find(3), delete(4), traverse(5), max(6), or min (7) : ");
            int choice = getInt();
            switch (choice) {
                case 1:
                    theTree.displayTree();
                    break;
                case 2:
                    System.out.print("Enter value and data to"
                            + " insert: ");
                    value = getInt();
                    data = getString();
                    theTree.insert(value, data);
                    break;
                case 3:
                    System.out.print("Enter value to find: ");
                    value = getInt();
                    Node found = theTree.find(value);
                    if (found != null) {
                        System.out.print("Found: ");
                        found.displayNode();
                        System.out.print("\n");
                    } else {
                        System.out.println("Could not find "
                                + value);
                    }
                    break;
                case 4:
                    System.out.print("Enter value to delete: ");
                    value = getInt();
                    boolean didDelete = theTree.delete(value);
                    if (didDelete) {
                        System.out.println("Deleted " + value);
                    } else {
                        System.out.println("Could not delete "
                                + value);
                    }
                    break;
                case 5:
                    System.out.print("Enter type 1, 2 or 3: ");
                    value = getInt();
                    theTree.traverse(value);
                    break;
                case 6:
                    Node max = theTree.max();
                    System.out.println("Max value is : {" + max.id + ", " + max.data + "}" );
                    break;
                case 7:
                    Node min = theTree.min();
                    System.out.println("Min value is : {" + min.id + ", " + min.data + "}" );
                    break;
                default:
                    System.out.println("Invalid entry ");
            }
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }
}
