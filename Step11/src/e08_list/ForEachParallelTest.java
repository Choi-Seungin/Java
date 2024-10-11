package e08_list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ForEachParallelTest {
	
	public static void main(String[] args) {
		ArrayList<StudentDTO> list = new ArrayList<StudentDTO>();
		//샘플 데이터 10건 리스트에 추가
		list.add(new StudentDTO("S001", "홍길동", "컴퓨터공학", 3.8));
        list.add(new StudentDTO("S002", "김영희", "전자공학", 3.6));
        list.add(new StudentDTO("S003", "이철수", "기계공학", 3.7));
        list.add(new StudentDTO("S004", "박지민", "화학", 3.9));
        list.add(new StudentDTO("S005", "최민수", "토목공학", 3.5));
        list.add(new StudentDTO("S006", "정은지", "수학", 3.4));
        list.add(new StudentDTO("S007", "김민주", "물리학", 3.2));
        list.add(new StudentDTO("S008", "이수현", "생명과학", 3.7));
        list.add(new StudentDTO("S009", "장동건", "영어영문학", 3.6));
        list.add(new StudentDTO("S010", "윤아", "심리학", 3.8));
		
        //전체 학생 정보 출력
		//for(StudentDTO dto : list) dto.printInfo();
		
		//forEach, Consumer 익명 클래스로 작성
//		list.forEach(new Consumer<StudentDTO>() {
//
//			@Override
//			public void accept(StudentDTO t) {
//				t.printInfo();
//			}
//			
//		});
      //forEach를 람다식으로 적용하여 작성
      		list.forEach(t -> t.printInfo());
		
		//학생 전체 평점의 평균을 출력
		double avg = 0.0;
		ArrayList<Double> scoreList = new ArrayList<Double>();
		list.forEach(t -> scoreList.add(t.getScore()));
		//acc : 누적된 값(리턴되서 받은 값), cur 현재 데이터
		//리스트에 있는 값을 계산해서 리턴
		avg = scoreList.parallelStream().reduce(0.0, (acc,cur) -> acc + cur);
		avg /= list.size();
		System.out.println("전체 학생 평점 평균 : " + avg);
		//평점이 제일 높은 학생 정보를 출력
		StudentDTO max = list.parallelStream().reduce(list.get(0), (acc, cur) -> acc.getScore() < cur.getScore() ? cur : acc); 
		max.printInfo();
		System.out.println("--------------------------");
		//평점이 3.0이상인 학생 정보를 출력
//		for(StudentDTO dto : list) {
//			if(dto.getScore() >= 3.5)
//				dto.printInfo();
//		}
		List<StudentDTO> filterList = list.parallelStream().filter(t -> t.getScore() >= 3.0).toList();
		filterList.forEach(t -> t.printInfo());
	}
}

