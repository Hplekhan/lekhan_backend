import java.util.Scanner;

public class ArrayOpertions {

	public void createArray() {

		Scanner s= new Scanner(System.in);
		System.out.println("enter the array size");
		int size =s.nextInt();
		int arr[] = new int[size];
		int arr2[] = new int [size];
		
		System.out.println("entre the array elements for first array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
			
		}
		
		System.out.println("entre the array elements for second  array:");
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = s.nextInt();
			
		}
    }

    // PRINTING ARRAY
	public void printArr() {
		System.out.println("first array elemsts are: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println("Second array is :");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		
		System.out.println();
		System.out.println("=============================");
		int[] twoArrayMerge = isMerge(arr, arr2);
		System.out.println();
		System.out.println("Combine 2 arrays are :");
		for (int i = 0; i < twoArrayMerge.length; i++) {
			System.out.print(twoArrayMerge[i]+" ");
		}

	}

    //REVERSE ARRAY
	public void reverseArr() {
		
		for (int i = arr.length-1; i >= 0 ; i--) {
			
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		isAsc(arr);
		System.out.println("Sorting an array");
		for (int i : arr) {
			System.out.print(i+ " ");
			
		}

// MERGING ARRAY
	public static int[] Merge(int arr[], int arr2[]) {
		int [] mergeArray = new int [arr.length + arr2.length];
		
		for (int i = 0; i < arr.length; i++) {
			mergeArray[i] = arr[i];
		}
		
		for(int i=0;i<arr2.length;i++) {
			mergeArray[arr.length + i] = arr2[i];
		}
		
		for (int i = 0; i < mergeArray.length; i++) {
			System.out.print(mergeArray[i]+" ");
		}
		return mergeArray;
			
	}
	
	//MAXIMUM ARRAY
	public void maxNumber()
	{
		int[] arr1={1,2,4,5,6,8};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("max value is:" +max);
	}
	
	// MINIMUM ARRAY
	public void minNumber()
	{
		int[] arr1={1,2,4,5,6,8};
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("min value is :" +min);
	}
	
	
	public void UnionSort()
	{
		int a1[] =new int [] {2,6,1,9};

		int a2[] = new int [] {7,3,5,4};

		System.out.println("sorting of two array");

		int[] array1 = isFirsrtArray(a1);
		for (int i : array1) {
			System.out.print(i+ " ");

		}

		System.out.println();
		int[] array2 = isSecondArray(a2);
		for (int i2 : array2) {
			System.out.print(i2+" ");
		}
		
		
		System.out.println();
		 // Sort both arrays
        int[] sortedArray1 = isFirsrtArray(a1);
        int[] sortedArray2 = isSecondArray(a2);

        // Merge the sorted arrays
        int[] mergedArray = mergeArrays(sortedArray1, sortedArray2);

        // Print the merged array
        System.out.println("Merged sorted array:");
        for (int i : mergedArray) {
            System.out.print(i + " ");
        }
    }

	public static int[] mergeArrays(int[] arr1, int[] arr2) {
		int mergedLength = arr1.length + arr2.length;
		int[] mergedArray = new int[mergedLength];

		int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				mergedArray[k++] = arr1[i++];
			}
			else {
				mergedArray[k++] = arr2[j++];
			}
		}

		while (i < arr1.length) {
			mergedArray[k++] = arr1[i++];
		}

		while (j < arr2.length) {
			mergedArray[k++] = arr2[j++];
		}

		return mergedArray;
	}
	//	FIRST ARRAY SORTING
	public static int[] isFirsrtArray(int a1[]) {
		for (int i = 0; i < a1.length; i++) {
			for(int j=0;j<a1.length-1;j++) {
				if(a1[j]>a1[j+1]) {
					int temp = a1[j];
					a1[j] = a1[j+1];
					a1[j+1] = temp;
				}
			}
		}
		return a1;
	}

	}
	
	
    // INTERSECTION ARRAY
	public void intersection()
	{
		int[] arr1 = {2, 4, 5, 6};
        int[] arr2 = {5, 3, 4, 7};
        
        int[] arr3 = new int[Math.min(arr1.length, arr2.length)]; 

        int k = 0; 

       
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                arr3[k++] = arr1[i]; 
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++; 
            } else {
                j++; 
            }
        }

        // Print arr3
        System.out.print("arr3 = {");
        for (int l = 0; l < k; l++) {
            System.out.print(arr3[l]);
            if (l < k - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
	}
	

    // OCCURANCE OF ELEMENTS
	public void OccArr()
	{
		int[] arr= {1,7,3,7,6,7,5,5};
		int number=7;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==number)
			{
				count++;
			}
		}
		
		System.out.println(count);
	}
	
//   ASCENDING ORDER
    public static void Ascending(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
	   }
	}
	
	
	
	
	public void removeDup()
	{
		
		int arr[] = new int [] {2,2,3,4,5,5,6,7,3};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		int rd = removeDuplicate(arr);
		System.out.println();
		for (int i = 0; i < rd; i++) {
			System.out.print(arr[i]+" ");
		}
	
	public static int removeDuplicate(int arr[]) {
		
		int rd =0;
		for (int i = 1; i < arr.length-1; i++) {
			if(arr[rd] != arr[i]) {
				rd++;
				arr[rd] = arr[i];
			}
		}
		return rd+1;
	}

	}
	
    // DUPLICATES
	public void Duplicates()
	{
		int arr[] = {1, 2, 3, 1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            int count = 1; 
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++; 
                }
            }
            if (count > 1) {
                System.out.println("Duplicate number: " + arr[i] + "=====>"+"Count: " + count);
            }
        }
	}
	
	// ZIG ZAG
	public void zigzag()
	{
		int[] arr1 = {2, 3, 4, 5};
        int[] arr2 = {9, 8, 7, 6};
        int[] arr3 = new int[arr1.length + arr2.length];

        int index1 = 0;
        int index2 = 0;

        // Merge elements of arr1 and arr2 into arr3 alternately
        for (int i = 0; i < arr3.length; i += 2) {
            if (index1 < arr1.length) {
                arr3[i] = arr1[index1++];
            }
            if (index2 < arr2.length) {
                arr3[i + 1] = arr2[index2++];
            }
        }

        // Print the merged array arr3
        System.out.print("arr3 = {");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
            if (i < arr3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
	}
	
	
	// PATTREN-01
	public void pattrenOne()
	{
//		11111
//		22222
//		33333
//		44444
//		55555
		
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
    // PATTREN -02
	public void pattrenTwo()
	{
//		12345
//		12345
//		12345
//		12345
//		12345

		
		int n=5;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
//				row
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	// PATTREN -03
	public void pattrenThree()
	{
//		1
//		23
//		345
//		4567
//		56789

		
		int n=5;
		for(int i=1; i<=n; i++)
		{
			int k=i;
			for(int j=1; j<=n; j++)
			{			
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}
	}
	
    // PRIME NUMBER CHECK
	public void primeNumber()
	{
		int num = 4;
		boolean primeNumber = Prime(num);
		
		if(primeNumber == true) {
			System.out.println("it is prime");
		}
		else {
			System.out.println("not a prime");
		}
		
		
	}
	
	static boolean Prime(int num) {
		if(num == 0 || num == 1) {
			return false;
			
		}
		else if(num == 2) {
			return true;
		}
		else if(num%2 ==0) {
			return false;
			
		}
		return true;
	}

	
	
	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = scan.nextInt();
		int[] num1 = new int[n];
		System.out.println("enter the array ele:");
		for (int i = 0; i < num1.length; i++) {
		num1[i] = scan.nextInt();
		}
		

		System.out.println("enter the size of second array");
		int n2 = scan.nextInt();
		int[] num2 = new int[n2];
		System.out.println("enter the second array ele:");
		for (int i = 0; i < num2.length; i++) {
			num2[i] = scan.nextInt();
		}
		
		ArrayOpertions ob = new ArrayOpertions();
		ob.createArray();
		ob.printArray();
		ob.reverseArr();
		ob.mergeArr();
		ob.maxNumber();
		ob.minNumber();
		ob.UnionSort();
		ob.OccArr();
		ob.removeDup();
		ob.pattrenOne();
		ob.pattrenTwo();
		ob.pattrenThree();
		ob.removeDup();
		ob.primeNumber();
		ob.Ascending();
		ob.intersection();
		ob.Duplicates();
	
	}

