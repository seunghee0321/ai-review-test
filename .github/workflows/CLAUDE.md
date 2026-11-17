# CLAUDE.md

## 프로젝트
- Spring Boot / Java 21 / Gradle / H2
- controller → service → repository 구조

## 리뷰할 때 중점적으로 볼 것
- 예외 처리 누락 (Optional.get(), null 체크)
- 권한 확인 누락 (작성자만 수정·삭제 가능해야 함)
- 트랜잭션 경계, N+1 쿼리

## 지적하지 말 것
- 포매팅, 줄바꿈 같은 스타일 문제
- 확실하지 않은 추측성 지적