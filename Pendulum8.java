import java.util.Scanner;

public class Pendulum8 {
    public static void main(String[] args) {
        System.out.println("Enter length of Array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the element");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        // sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

        }

        int[] result = new int[array.length];
        int mid = n / 2;
        result[mid] = array[0];// place min value

        int left = mid - 1;
        int right = mid + 1;
        boolean isleft = true;

        for (int i = 1; i < n; i++) {
            if (isleft) {
                result[right] = array[i];
                right++;
            } else {
                
                result[left] = array[i];
                left--;

            }
            isleft = !isleft;
        }
        System.arraycopy(result, 0, array, 0, array.length);

        System.out.println("Output:");
        for(int num: array){
            System.out.print(num + " ");
        }

        sc.close();
    }
}