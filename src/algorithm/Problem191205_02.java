package algorithm;

public class Problem191205_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
//	없어진 기록 찾기
//	SELECT B.animal_id, B.name
//	FROM animal_ins A
//	RIGHT JOIN animal_outs B
//	ON A.animal_id = B.animal_id
//	WHERE A.animal_id is NULL
//	ORDER BY B.animal_id
//	
//	있었는데요 없었습니다
//	SELECT B.animal_id, B.name
//	FROM animal_ins A
//	JOIN animal_outs B
//	ON A.animal_id = B.animal_id
//	WHERE B.datetime < A.datetime
//	ORDER BY A.datetime
//	
//	오랜 기간 보호한 동물(1)
//	SELECT *
//	FROM
//	    (SELECT A.name,A.datetime
//	    FROM animal_ins A
//	    LEFT OUTER JOIN animal_outs B
//	    ON A.animal_id = B.animal_id
//	    WHERE B.datetime is NULL
//	    ORDER BY A.datetime)
//	WHERE ROWNUM<=3
//	
//	보호소에서 중성화한 동물
//	SELECT i.animal_id, i.animal_type, i.name
//	FROM animal_ins i
//	INNER JOIN animal_outs o
//	ON i.animal_id = o.animal_id
//	WHERE i.SEX_UPON_INTAKE != o.SEX_UPON_OUTCOME
//	ORDER BY i.animal_id //

	
}
