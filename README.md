# 키친포스

## 퀵 스타트

```sh
cd docker
docker compose -p kitchenpos up -d
```

## 요구 사항

- 키친포스를 구현한다.


- 메뉴그룹
    - [ ] 메뉴그룹을 입력할 수 있어야한다.
      > 메뉴 그룹은 메뉴 그룹명과 메뉴명 정보를 가진다.
        메뉴 그룹명은 초기값으로 두마리메뉴, 한마리메뉴, 순살파닭두마리메뉴, 신메뉴를 가진다.
      > 
    - [ ] 전체 메뉴 그룹을 조회할 수 있어야한다.


- 메뉴
    - [ ] 전체 메뉴 정보를 입력할 수 있어야한다.
      > 메뉴는 전시여부, 메뉴명, 가격, 메뉴그룹 정보를 가진다.  
        메뉴 명은 초기값으로 후라이드, 양념치킨, 반반치킨, 통구이, 간장치킨, 순살치킨을 가진다.
      > 
    - [ ] 메뉴는 전시 여부를 변경할 수 있어야 한다.
    - [ ] 메뉴 가격은 변경할 수 있어야한다.
    - [ ] 메뉴를 추가할 수 있어야한다.
    - [ ] 메뉴의 수량은 변경할 수 있어야한다.
    - [ ] 전체 메뉴를 조회할 수 있어야한다.


- 주문
  - [ ] 주문 정보를 입력할 수 있어야한다.
    > 주문은 배달주소, 주문날짜, 주문 상태, 주문 타입, 테이블, 메뉴 정보를 가진다.  
     주문 타입은 배달과 매장식사 중 선택해야한다.   
     배달 주소는 주문 타입이 배달일 경우에만 입력해야한다.(매장내 식사는 공란으로 처리)
    >
  - [ ] 주문 상태는 변경할 수 있어야한다.
    > 주문 상태는 상품 인수, 제조중, 배달 시작, 배달완료, 주문완료 상태값을 가진다.
  - [ ] 전체 주문 정보를 조회할 수 있어야한다.


- 테이블
    - [ ] 테이블 정보를 입력할 수 있어야한다. 
      > 테이블은 테이블 번호, 고객 수, 테이블 사용여부 정보를 가진다.
        테이블 번호는 1번 ~ 8번까지 중에 선택해야한다.
      > 
    - [ ] 테이블 고객 수를 변경할 수 있어야한다.
    - [ ] 테이블 사용여부를 변경할 수 있어야한다.
    - [ ] 전체 테이블 정보를 조회할 수 있어야한다.


- 제품
    - [ ] 제품 정보를 입력할 수 있어야한다. 
      >  제품은 제품명, 가격을 가진다.
    - [ ] 제품 가격은 변경할 수 있어야한다.
    - [ ] 전체 제품 정보를 조회할 수 있어야한다.

## 용어 사전

| 한글명 | 영문명 | 설명 |
|-----|-----|----|
|     |     |    |

## 모델링

