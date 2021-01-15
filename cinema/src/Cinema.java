import java.util.Scanner;


public class Cinema {
    public static void main(String[] args) {
        int [] id_arr= new int[3];// just for example 3 user, here must be 25
        int[][] cinema_hall = new int[3][3];
        for (int i = 0; i < cinema_hall.length; i++) {
            for (int j = 0; j < cinema_hall.length; j++) {
                cinema_hall[i][j] = j + 1;
            }
        }

        for (int u = 0; u < 3; u++) {
            user users = new user();
            users.greeting();
            System.out.println("Dear "+ users.name + " here you can find available seats. Reserved seats are filled with '0'");
            id_arr[u]= users.id;
            for (int[] a : cinema_hall) {
                for (int i : a) {
                    System.out.print(i + "\t");
                }
                System.out.println("\n");
            }
            Scanner request = new Scanner(System.in);
            System.out.println("How many seats do you wnat to reserve?");
            int number = Integer.parseInt(request.nextLine());
            for (int m = 0; m < number; m++) {
                System.out.println("What row do you want to book?");
                int row = Integer.parseInt(request.nextLine());
                System.out.println("What seat do you want to book?");
                int seat = Integer.parseInt(request.nextLine());
                if (cinema_hall[row - 1][seat - 1] != 0) {
                    cinema_hall[row - 1][seat - 1] = 0;
                    System.out.println("Your reservation is successfully done");
                } else if (cinema_hall[row - 1][seat - 1] == 0) {
                    System.out.println("Sorry, that seat is alredy reserved, please select one of the avalable seats.");
                    for (int[] a : cinema_hall) {
                        for (int i : a) {
                            System.out.print(i + "\t");
                        }
                        System.out.println("\n");
                    }
                    System.out.println("What row do you want to book?");
                    int row_n = Integer.parseInt(request.nextLine());
                    System.out.println("What seat do you want to book?");
                    int seat_n = Integer.parseInt(request.nextLine());
                    if (cinema_hall[row_n - 1][seat_n - 1] != 0) {
                        cinema_hall[row_n - 1][seat_n - 1] = 0;
                        System.out.println("Your reservation is successfully done");
                    } else {
                        System.out.print("Reservation is failed");
                    }
                }

            }

        }
//        linear_search guests=new linear_search();
//        int find=guests.linear_search(names,25);
        binary_search guests=new binary_search();
        int find=guests.binary_search(id_arr,0,id_arr.length-1,30);


        if (find == 1){
            System.out.print("Guest has aleady done reservation");
        }
        else{
            System.out.print("There is not guest with that id");
        }

    }
}

class user {
    String name;
    int id;

    public void greeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name?");
        name = scanner.nextLine();
        System.out.print("What is your id?");
        id=Integer.parseInt(scanner.nextLine());
        System.out.println("Welcome to Cinema dear " + name + ".On March 19 at 12 o'clock will be premier of Morbius!!! Please reserve your seat beforehand");
    }
}
class linear_search {
    int[] arr;
    int id;

    public int linear_search(int[] arr, int id) {
        for (int i = 0; i < 2; i++) {
            if (arr[i] == id){
                return 1;
            }
        }
        return -1;
    }
}
class binary_search {
    public static int binary_search(int arr[], int a, int b, int c) {
        if (b >= a) {
            int mid = a + (b - a) / 2;
            if (arr[mid] == c)
                return mid;
            if (arr[mid] > c)
                return binary_search(arr, a, mid - 1, c);
            return binary_search(arr, mid + 1, b, c);
        }

        return -1;
    }
}
