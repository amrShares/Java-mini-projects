class Lab_2_1
	{

		static int[] find_max_min(int[] numbers)

			{
				int max=numbers[0], min=numbers[0];
				for(int i =1; i < numbers.length; i++)
					{
						if (numbers[i] < min) min = numbers[i];
						if (numbers[i] > max) max = numbers[i];
					}
				return new int[] {max, min};
			}

 		static void merge(int array[], int p, int q, int r)
			{
    				int n1 = q - p + 1;
				int n2 = r - q;

				int L[] = new int[n1];
				int M[] = new int[n2];

    				for (int i = 0; i < n1; i++) L[i] = array[p + i];
    				for (int j = 0; j < n2; j++) M[j] = array[q + 1 + j];

    				int i, j, k;
    				i = 0;
    				j = 0;
    				k = p;


    				while (i < n1 && j < n2)
					{
      						if (L[i] <= M[j])
							{
        							array[k] = L[i];
        							i++;
							}
						else
							{
        							array[k] = M[j];
        							j++;
      							}
      						k++;
   					}

    				while (i < n1)
					{
      						array[k] = L[i];
      						i++;
      						k++;
    					}

    				while (j < n2)
					{
      						array[k] = M[j];
      						j++;
      						k++;
    					}
  			}

		static void merge_sort(int array[], int left, int right)
			{
    				if (left < right)
					{

      						int mid = (left + right) / 2;
      						merge_sort(array, left, mid);
      						merge_sort(array, mid + 1, right);
      						merge(array, left, mid, right);
    					}
  			}

		static int binary_search(int element, int []array, int left, int right)
			{
				if (left<=right)
					{
						int mid = (int)((left + right) / 2);
						if (array[mid] < element) return binary_search(element, array, mid+1, right);
						else if (array[mid] > element) return binary_search(element, array, left, mid-1);
						else return mid;	
					}
				else return -1;
			}

		static int linear_search(int element, int []array)
			{
				for (int i =0; i< array.length; i++)
					{
						if (array[i] == element) return i;
					}
				return -1;
			}
		

		public static void main(String[] args)
			{

				/*
				int[] numbers = new int[1000];
				for (int i = 0; i<1000; i++) numbers[i] = (int)(Math.random()*10000);
				long duration = System.nanoTime();
				
				int[] extrema = find_max_min(numbers);
				
				duration = System.nanoTime() - duration;
				System.out.println("duration in nano seconds: " + duration);
				System.out.print("max element is : " + extrema[0]);
				System.out.println(" min element is : " + extrema[1]);
				duration = System.nanoTime();

				merge_sort(numbers, 0, numbers.length -1);
				duration = System.nanoTime() - duration;
				System.out.println("duration in nano seconds: " + duration);
				System.out.print("max element is : " + numbers[numbers.length -1]);
				System.out.println(" min element is : " + numbers[0]);
				*/

				int[] numbers = new int[1000];
				for (int i = 0; i<1000; i++) numbers[i] = (int)(Math.random()*10000);
				merge_sort(numbers, 0, numbers.length -1);

				long duration = System.nanoTime();
				int index = linear_search(10, numbers);
				duration = System.nanoTime() - duration;
				System.out.println("duration in nano seconds: " + duration);
				System.out.println("found at : " + index);

				duration = System.nanoTime();
				index = binary_search(10, numbers, 0, numbers.length);
				duration = System.nanoTime() - duration;
				System.out.println("duration in nano seconds: " + duration);
				System.out.println("found at : " + index);				

								
			}

	}