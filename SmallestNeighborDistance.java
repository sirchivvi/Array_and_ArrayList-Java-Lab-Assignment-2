class SmallestNeighborDistance {
    int findSmallestDistance(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return -1;
        }
        int minIndex = 0;
        int minDistance = Math.abs(arr[1] - arr[0]);
        
        for (int i = 1; i < arr.length - 1; i++) {
            int distance = Math.abs(arr[i + 1] - arr[i]);
            if (distance < minDistance) {
                minDistance = distance;
                minIndex = i;
            }
        }
        return minIndex;
    }
}
