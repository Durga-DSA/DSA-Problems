public class Solution {
    public bool UniqueOccurrences(int[] arr) {
        Dictionary<int,int> map = new Dictionary<int,int>();

        for(int i=0; i<arr.Length; i++){
            if(map.ContainsKey(arr[i]))
                map[arr[i]]++;
            else
                map[arr[i]] = 1;
        }

        HashSet<int> set = new HashSet<int>();
        foreach(var item in map.Values){
            if(set.Contains(item))
            {
                return false;
            }
            set.Add(item);
        }
        return true;
    }
}