package kiemtra;
import java.util.Arrays;

	public class cau2 {
	
	    // a. Đếm số lượng phần tử chẵn
		
	    public static int countEven(int[] arr) {
	        int count = 0;
	        for (int num : arr) {
	            if (num % 2 == 0) {
	                count++;
	            }
	        }
	        return count;
	    }

	    // b. Kiểm tra mảng có được sắp xếp tăng dần hay không
	    
	    public static boolean isSorted(int[] arr) {
	        for (int i = 0; i < arr.length - 1; i++) {
	            if (arr[i] > arr[i + 1]) {
	                return false;
	            }
	        }
	        return true;
	    }

	    // c. Đếm số lượng phần tử có giá trị từ 4 đến 12
	    
	    public static int countRange(int[] arr, int start, int end) {
	        int count = 0;
	        for (int num : arr) {
	            if (num >= start && num <= end) {
	                count++;
	            }
	        }
	        return count;
	    }

	    // d. Tính tổng các phần tử của mảng
	    
	    public static int sumArray(int[] arr) {
	        int sum = 0;
	        for (int num : arr) {
	            sum += num;
	        }
	        return sum;
	    }

	    // e. Tính tổng các phần tử có giá trị lẻ
	    
	    public static int sumOdd(int[] arr) {
	        int sum = 0;
	        for (int num : arr) {
	            if (num % 2 != 0) {
	                sum += num;
	            }
	        }
	        return sum;
	    }

	    // f. Sắp xếp mảng tăng dần bằng giải thuật nổi bọt
	    
	    public static void bubbleSort(int[] arr) {
	        int n = arr.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	    }

	    // g. Tìm giá trị lớn nhất của mảng
	    
	    public static int maxValue(int[] arr) {
	        int max = arr[0];
	        for (int num : arr) {
	            if (num > max) {
	                max = num;
	            }
	        }
	        return max;
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 20, 3, 9, 4, 69, 7, 8, 23, 10};
	        
	
	        
	        System.out.println("Số lượng phần tử chẵn trong mảng là: " + countEven(arr));
	        System.out.println("Mảng có được sắp xếp tăng dần không: " + isSorted(arr));
	        System.out.println("Số lượng phần tử có giá trị từ 4 đến 12 là: " + countRange(arr, 4, 12));
	        System.out.println("Tổng các phần tử của mảng là: " + sumArray(arr));
	        System.out.println("Tổng các phần tử có giá trị lẻ là: " + sumOdd(arr));

	        bubbleSort(arr);
	        System.out.println("Mảng sau khi sắp xếp tăng dần: " + Arrays.toString(arr));

	        System.out.println("Giá trị lớn nhất của mảng là: " + maxValue(arr));
	    }
	}


	
