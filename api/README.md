Golf_Match api module architecture
1. DDD(Domain Driven Design) Design
   1. 기존 MVC 패턴의 문제(비직관성, 과도한 커플링, 소규모 기능도 많은 작업이 필요) 를 보완하는 기법 
   2. DDD 4 Layer
      1. Interface Layer
         1. 외부 영역의 요청 및 응답을 처리하는 계층
         2. Controller, Dto, Mapper 가 포함
      2. Application Layer
         1. Interface Layer 로 부터 받은 요청 기능에 대한 처리
         2. Facade pattern 으로 묶어서 제공 (?)
      3. Domain Layer
         1. Service 영역을 담당
         2. 실제 구현은 하지않고 추상 레벨을 높여야
         3. 외부의 요청이 변경하더라 Domain 은 변경 불가
         4. 외부의 요청이 변하더라도 Criteria, Command 를 통해서 도메인 내부에서 처리 가능한 규격화된 객체로 변경
         5. Entity 반환이 아닌 Info 형태로 변환하여 반환
      4. Infrastructure Layer
         1. Domain Layer 의 구현체
         

2. Directory structure
````
golf_match
    L admin
        L admin 관련 내용
    L api
        L golf_match 관련 api 담당
    L core
        L 공통 프레임워크 담당
    
````
