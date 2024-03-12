import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String[] wallpaper) {
        List<Integer> cList = new ArrayList<Integer>();
		List<Integer> rList = new ArrayList<Integer>();

		for (int i = 0; i < wallpaper.length; i++) {
			for (int j = 0; j < wallpaper[i].length(); j++) {
				char a = wallpaper[i].charAt(j);
				
				if (a == '#') {
					cList.add(i);
					rList.add(j);
					System.out.println(i + ", " + j);
					
				}
			}
//			System.out.println(wallpaper[i]);
		}
		
		int startC = cList.get(0);
		int startR = rList.get(0);
		int endC = cList.get(0);
		int endR = rList.get(0);
		for (int i = 0; i < cList.size(); i++) {
			
			if (startC > cList.get(i)) {
				startC = cList.get(i);
			}
			if (endC <= cList.get(i)) {
				endC = cList.get(i) + 1;
			}
			if (startR > rList.get(i)) {
				startR = rList.get(i);
			}
			if (endR <= rList.get(i)) {
				endR = rList.get(i) + 1;
			}
			
		}
        
        int[] answer = {startC, startR, endC, endR};
        
        return answer;
    }
}