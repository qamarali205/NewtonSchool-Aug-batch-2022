public static int[] implementMergeSort(int arr[], int start, int end)
{
    // Your code here
    // You can have your own function where you will use 
  // start and end position for divide purpose 
  if(start<end){
    int mid=start+(end-start)/2;
    implementMergeSort(arr, start, mid);
    implementMergeSort(arr, mid+1, end);
    merge(arr, start, mid, end);
  }
  return arr; 
}

public static void merge(int[] arr, int start, int mid, int end){
  int merged[]=new int[end-start+1];
  int n1=start;
  int n2=mid+1;
  int x=0;
  while(n1<=mid && n2<=end){
    if(arr[n1]<arr[n2]){
      merged[x]=arr[n1];
      x++; n1++;
    }
    else{
      merged[x]=arr[n2];
      x++; n2++;
    }
  }

  while(n1<=mid){
    merged[x]=arr[n1];
      x++; n1++;
  }

  while(n2<=end){
    merged[x]=arr[n2];
      x++; n2++;
  }

  for(int i=0, j=start; i<merged.length; i++, j++){
    arr[j]=merged[i];
  }
}