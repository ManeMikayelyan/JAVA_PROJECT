//import java.util.Arrays;
//import java.util.Scanner;
//
//public class bb {
//    public static void main(String[] args){
//        node a=new node(cinema_hall[0]);
//        node b=new node(cinema_hall[1]);
//        node c=new node(cinema_hall[2]);
//        node d=new node(cinema_hall[3]);
//        node e=new node(cinema_hall[4]);
//        node f=new node(cinema_hall[5]);
//        node g=new node(cinema_hall[6]);
//        binary_tree tree= new binary_tree();
//        tree.root=d;
//        tree.root.left=b;
//        tree.root.left.left=a;
//        tree.root.left.right=c;
//        tree.root.right=e;
//        tree.root.right.left=f;
//        tree.root.right.right=g;
//        user first=new user();
//        first.greeting();
//    }
//}
//class binary_tree{
//    node root;
//    binary_tree(){
//        root=null;
//    }
//
//}
//class nodee {
//    int[] row;
//    node left;
//    node right;
//
//
//    public node(int[] row) {
//        this.row = row;
//        this.left = left;
//        this.right = right;
//    }
//
//    public void reservation() {
////        int[][] cinema_hall = new int[7][7];
////        for (int i = 0; i < cinema_hall.length; i++) {
////            for (int j = 0; j < cinema_hall.length; j++) {
////                cinema_hall[i][j] = j + 1;
////            }
////        }
//        System.out.println("Here you can find available seats. Reserved seats are filled with '0'");
//        for (int[] l : cinema_hall) {
//            for (int i : l) {
//                System.out.print(i + "\t");
//            }
//            System.out.println("\n");
//
//            Scanner request = new Scanner(System.in);
//            System.out.println("How many seats do you wnat to reserve?");
//            int number = Integer.parseInt(request.nextLine());
//            for (int m = 0; m < number; m++) {
//                System.out.print("What row do you want to book?");
//                int row = Integer.parseInt(request.nextLine());
//                System.out.print("What seat do you want to book?");
//                int seat = Integer.parseInt(request.nextLine());
//                if (cinema_hall[row - 1][seat - 1] != 0) {
//                    cinema_hall[row - 1][seat - 1] = 0;
//                    System.out.print("Your reservation is successfully done");
//                } else if (cinema_hall[row][seat] == 0) {
//                    System.out.println("Sorry, that seat is alredy reserved, please select one of the avalable seats.");
//                    for (int[] l : cinema_hall) {
//                        for (int i : l) {
//                            System.out.print(i + "\t");
//                        }
//                        System.out.println("\n");
//                    }
//                }
//            }
//
//        }
//
//    }
//}
//
//    class user {
//        String name;
//
//        public void greeting() {
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("What is your name?");
//            name = scanner.nextLine();
//            System.out.println("Welcome to Cinema dear " + name + ".On March 19 at 12 o'clock will be premier of Morbius!!! Please reserve your seat beforehand");
//        }
//    }
//
//
