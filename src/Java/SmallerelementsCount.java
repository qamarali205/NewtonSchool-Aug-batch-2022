static int smallerElements(int a[], int n, int k){
        //Enter your code here
        int left = 0, right = n;
 
        int mid = 0;
        while (left < right) {
        mid = (right + left) >> 1;
 
      // Check if key is present in array
      if (a[mid] == k) {
 
        // If duplicates are present it returns
        // the position of last element
        while (mid + 1 < n && a[mid + 1] == k)
          mid++;
        break;
      }
 
      else if (a[mid] > k)
        right = mid;
 
      // If key is greater, ignore left half
      else
        left = mid + 1;
    }
 
   
    while (mid > -1 && a[mid] > k)
      mid--;
 

    return mid + 1;
}