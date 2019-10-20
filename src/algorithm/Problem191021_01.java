package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Problem191021_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = solution("CBD",new String[]{"BACDE", "CBADF", "AECB", "BDA"});
		System.out.println("값"+a);
	}
	
	public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        ArrayList<String> skillTrees = new ArrayList<String>(Arrays.asList(skill_trees));
        //ArrayList<String> skillTrees = new ArrayList<String>();
        Iterator<String> it = skillTrees.iterator();

        while (it.hasNext()) {
            
        	if (skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0) {
                it.remove();
                
            }
        	
            
        }
        // "BACDE", "CBADF", "AECB", "BDA"
        System.out.println(skill.indexOf("BACDE"));
        System.out.println("BACDE".replaceAll("[^" + skill + "]", ""));
        System.out.println(skill.indexOf("CDAF"));
        System.out.println("CBADF".replaceAll("[^" + skill + "]", ""));
        System.out.println(skill.indexOf("AECB"));
        System.out.println("AECB".replaceAll("[^" + skill + "]", ""));
        System.out.println(skill.indexOf("BDA".replaceAll("[^" + skill + "]", "")));
        System.out.println("BDA".replaceAll("[^" + skill + "]", ""));
        
        System.out.println();
        System.out.println("ABC".indexOf("BC"));
        answer = skillTrees.size();
        return answer;
    }
	
}
