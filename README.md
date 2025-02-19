# 게시판 서비스

가장 기본적이고 보편적인 게시판 기능을 둘러볼 수 있는 서비스입니다.
페이지네이션을 기본 정렬기능, 댓글 생성/삭제 기능, 해시태그 검색 페이지, 타임리프의 디커플 로직 적용, 스프링 시큐리티를 이용한 로그인 및 인증 기능을 구현한 프로젝트입니다.

각자의 기능들은 추후 유지보수를 위하여 테스트를 통한 BDD방식으로 진행하였습니다.

이후 버전에서는 좀더 기능들을 업그레이드 하여 대댓글, 소셜로그인 ,쇼핑몰과 연동 등을 진행할 예정입니다. 

## 개발 환경

* Intellij IDEA community 2023.1.1 
* Java 17
* Gradle 7.6.1
* Spring Boot 3.0.4

## 기술 세부 스택

Spring Boot

* Spring Boot Actuator
* Spring Web
* Spring Data JPA
* Rest Repositories
* Rest Repositories HAL Explorer
* Thymeleaf
* Spring Security
* H2 Database
* MySQL Driver
* Lombok
* Spring Boot DevTools
* Spring Configuration Processor

그 외

* QueryDSL 5.0.0
* Bootstrap 5.2.0-Beta1
* Heroku

## 데모 페이지
비용 절감을 위해 클라우드 서버가 자동 슬립 모드로 설정되어 있습니다. 링크를 클릭하면 서비스가 깨어납니다. 따라서 첫번째 클릭 반응이 15초 이상으로 다소 늦을 수 있습니다. 이후에는 비교적 원활하게 서비스를 구경하실 수 있습니다.

* 데모페이지 주소: https://project-board-lsg.herokuapp.com/  -- 삭제
  
* 아이디:lsg  패스워드:test1234  * 아이디:lsg2  패스워드:test1234

* 체크리스트 주소 : https://docs.google.com/spreadsheets/d/1uv1z8jJ8801joEwhq-w1a5I8P7S2tm0OmpLdfdea7F4/edit#gid=0

## 릴리즈, 프로젝트 진행도 

* endpoint&api-spec : https://docs.google.com/spreadsheets/d/11Jg0qmagAIiKoPYMH5W6HXZDbS_-LxPY12V4zHQ9cKw/edit#gid=0
* Releases: https://github.com/immediatelylee/PortFolio_Board_java17/releases
* project: https://github.com/users/immediatelylee/projects/3
