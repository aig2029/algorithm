package algorithm;

public class Problem191207_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
//	없어진 기록 찾기
//
//	SELECT o.animal_id, o.name
//
//	FROM animal_ins i
//
//	RIGHT JOIN animal_outs o
//
//	ON i.animal_id = o.animal_id
//
//	WHERE i.animal_id is NULL
//
//	ORDER BY o.animal_id
//
//
//
//	있었는데요 없었습니다
//
//	SELECT i.animal_id, i.name
//
//	FROM animal_ins i
//
//	FULL OUTER JOIN animal_outs o
//
//	ON i.animal_id = o.animal_id
//
//	WHERE o.datetime-i.datetime<0
//
//	ORDER BY i.datetime
//
//
//
//	오랜 기간 보호한 동물(1)
//
//	SELECT *
//
//	FROM
//
//	    (SELECT i.name, i.datetime
//
//	    FROM animal_ins i
//
//	    LEFT JOIN animal_outs o
//
//	    ON i.animal_id = o.animal_id
//
//	    WHERE o.animal_id is NULL
//
//	    ORDER BY i.datetime)
//
//	WHERE ROWNUM<=3
//
//
//
//	보호소에서 중성화한 동물
//
//	SELECT o.animal_id, o.animal_type, o.name
//
//	FROM animal_ins i
//
//	INNER JOIN animal_outs o
//
//	ON i.animal_id = o.animal_id
//
//	WHERE i.sex_upon_intake LIKE 'Intact%' and (o.sex_upon_outcome LIKE 'Spayed%' or o.sex_upon_outcome LIKE 'Neutered%')
//
//	ORDER BY o.animal_id

	
}
