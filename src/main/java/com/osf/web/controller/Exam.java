package com.osf.web.controller;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Exam {
	
	public static void main(String[] args) {	
		String str = null;
		if("홍길동".equals(str)) {
			log.info("이름은 홍길동이 맞습니다.");
		}else {
			log.debug("나도 나올려나?");
			log.info("이름은 홍길이 아닙니다.");
		}
		log.warn("프로그램 비정상 종료, 그치만 문제는 없음");
	}
	
	
	
	/*
	 * Log4j level 순서
	 * 1. TRACE - 되게 상세한 정보
	 * 2. DEBUG - 개발에 필요한 정보
	 * 3. INFO - 정보 , 인포메이션 어떤 프로젝트가 톰캣에서 돌아가고 있다 등등 
	 * 4. WARN - WARNING 동작은해 , 동작은 하지만 위험하다.
	 * 5. ERROR - 실제 에러 , 예를 들면 500 에너 서버 이터널 에러 
	 * 6. FATAL - 진짜 치명적인 에러 .서버가 막 중단되거나 .. 그런거 
	 */
}
