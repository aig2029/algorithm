package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Problem191021_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = solution("CBD",new String[]{"BACDE", "CBADF", "AECB", "BDA"});
		System.out.println("값"+a);
	}
	
	public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        ArrayList<String> skillTrees = new ArrayList<String>(Arrays.asList(skill_trees));
        
        Iterator<String> it = skillTrees.iterator();
        
        while(it.hasNext()){
            if(skill.indexOf( it.next().replaceAll("[^"+skill+"]","")) != 0 ){
                it.remove();
            }
        }
        
        return skillTrees.size();
    }
	
}
