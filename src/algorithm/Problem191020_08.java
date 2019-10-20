package algorithm;

public class Problem191020_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public int solution(String skill, String[] skill_trees) {
		int answer = 0;

		char[] chr = skill.toCharArray();
		System.out.println(chr[0]);

		Loop1: for (int i = 0; i < skill_trees.length; i++) {
			int currentSkillNumber = 0;
			Loop2: for (int j = 0; j < skill_trees[i].length(); j++) {
				// 여기서 for문을 한번 써줘야 하는가
				for (int k = currentSkillNumber; k < chr.length; k++) {
					if (skill_trees[i].charAt(j) == chr[k] && k > currentSkillNumber)
						continue Loop1;
				}
				if (skill_trees[i].charAt(j) == chr[currentSkillNumber] && currentSkillNumber < chr.length - 1)
					currentSkillNumber++;
				if (j == skill_trees[i].length() - 1)
					answer++;
			}
		}

		return answer;
	}
	
}
