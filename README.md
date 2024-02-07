API

@ResponseBody{body 부분에 리턴을 내가 직접 넣겠다}

memberrepossitory ,member 생성
회원 도메인과 리포지토리 생성함

JPA들어가자 



리턴값은 뷰 리졸버가 화면을 찾아서 화면을 처리한다.

웹개발에는  
-정적컨텐츠
-MVC,템플릿엔진
-API로 개발을 이룰수있다


정적콘텐츠는 어느 기능을넣을순없지만 내가 원하는걸 딱 집어넣을수있다
컨테이너가 스태틱을 먼저 컨트롤러에서 찾아보고 없으면 스태틱에서 찾아서 반환한다


return 값이 null일수있을경우 Optional.ofNullable 을 사용하여 감싸서 반환한다
