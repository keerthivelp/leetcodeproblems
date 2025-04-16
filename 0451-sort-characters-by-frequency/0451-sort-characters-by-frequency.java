class Solution {
    public String frequencySort(String s) {
        Map <Character,Integer> mp=new HashMap<>();
        for(char c:s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }

        List<Character> charac=new ArrayList<>(mp.keySet());

        charac.sort((a,b)->mp.get(b)-mp.get(a));
        StringBuilder result=new StringBuilder();

        for(char k:charac){
            int frequ=mp.get(k);
            for(int i=0;i<frequ;i++){
                result.append(k);
            }
        }
        return result.toString();
    }
}