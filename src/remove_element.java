import java.util.Scanner;

public class remove_element {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 6, 5, 8, 7, 9};
        int arr2[] = delete(arr);
        System.out.print("arr[] = { ");
        for (int i = 0; i < arr2.length-1; i++){
            System.out.print(arr2[i] + "\t");
        }
        System.out.print("}");


    }
    public  static int[] delete(int arr2[]){
        int index = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter element need delete: ");
        int inputX = scanner.nextInt();
        for(int i = 0; i < arr2.length; i++){
            if(inputX == arr2[i]){
                index = i;
                break;
            }
        }
        if(index != -1){
            for(int j = index; j < arr2.length - 1; j++){
                arr2[j] = arr2[j + 1];
            }
            arr2[arr2.length - 1] = 0;
        }
        return arr2;
    }
}
