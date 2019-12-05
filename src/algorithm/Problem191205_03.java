package algorithm;

public class Problem191205_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
//	루시와 엘라 찾기
//	SELECT animal_id, name, sex_upon_intake
//	FROM animal_ins
//	WHERE name='Lucy' or name='Ella' or name='Pickle' or name='Rogan' or name='Sabrina' or name='Mitty' 
//	ORDER BY animal_id
//	
//	이름에 el이 들어가는 동물 찾기
//	SELECT animal_id, name
//	FROM animal_ins
//	WHERE UPPER(name) LIKE '%EL%' AND animal_type ='Dog'
//	ORDER BY name
//
//	중성화 여부 파악하기
//	SELECT  A.ANIMAL_ID
//	    ,   A.NAME
//	    ,   CASE    WHEN INSTR(A.SEX_UPON_INTAKE,'Neutered')>0 or INSTR(A.SEX_UPON_INTAKE,'Spayed')>0
//	                THEN 'O'
//	                ELSE 'X'
//	        END AS 중성화
//	FROM   ANIMAL_INS A 
//	ORDER BY A.ANIMAL_ID
	
//	오랜 기간 보호한 동물(2)
//	SELECT *
//	FROM
//	(SELECT A.ANIMAL_ID, A.NAME
//	FROM    ANIMAL_INS A
//	            INNER JOIN ANIMAL_OUTS B
//	                ON  A.ANIMAL_ID =   B.ANIMAL_ID
//	ORDER BY   A.DATETIME-B.DATETIME)
//	WHERE ROWNUM<=2
//	
//	DATETIME에서 DATE로 변환
//	SELECT ANIMAL_ID, NAME, to_char(DATETIME,'yyyy-mm-dd') as 날짜
//	FROM ANIMAL_INS
//	ORDER BY ANIMAL_ID
	
}
