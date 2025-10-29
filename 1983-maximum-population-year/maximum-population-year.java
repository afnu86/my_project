class Solution {
    public int maximumPopulation(int[][] logs) {
      int arr[] = new int [101];
      for(int[] log : logs){
        arr[log[0] - 1950]++;
        arr[log[1] - 1950]--;
      }
      int max = arr[0],maxyr= 1950;
      for(int i=1;i<arr.length;i++){
        arr[i] = arr[i] + arr[i-1];
        if(arr[i]>max){
            max = arr[i];
            maxyr = i + 1950;
        }
      }
      return maxyr;
        }
    }