### 키오스크 프로젝트

1. Lv1 구현을 위해서는 조건과 반복의 개념을 알고 있어야 합니다!
- - 프로그램을 실행하면 메뉴판의 번호들을 보여줍니다.(대분류의 메뉴를 보여줌)
- 대분류 메뉴에 해당하는 숫자를 입력하면 선택하면 세부 메뉴들을 보여줍니다.
  - 예를 들어 햄버거에 해당하는 숫자를 입력 하면
    햄버거 1, 햄버거 2 처럼 세부 종류를 보여줘요.(출력 예시 참고)
- `**반복문**`을 이용해서 메뉴 선택할 수 있게 유지하고
  대분류 메뉴에서, 0번이 입력되면 프로그램을 종료합니다.

-main-

[ SHAKESHACK MENU ]
1. Burgers         | 앵거스 비프 통살을 다져만든 버거
2. Frozen Custard  | 매장에서 신선하게 만드는 아이스크림
3. Drinks          | 매장에서 직접 만드는 음료
4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주
0. 종료            | 프로그램 종료

-Bugers-

[ Burgers MENU ]
1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거
2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거
3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거
4. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거
5. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거
0. 뒤로가기       | 뒤로가기

-Frozen Custard-

[ Frozen Custard MENU ]
1. Shaker      | W 5.9 | 바닐라, 초콜렛, 솔티드 카라멜, 피넛버터
2. Cup & Cone  | W 4.9 | 바닐라, 초콜렛
3. Concrete    | W 5.9 | 쉐이크웻의 쫀득한 커스터드와 다양한 믹스-인의 조합
0. 뒤로가기     | 뒤로가기

-Drinks-
[ Drinks MENU ]
1. Lemonade      | W 3.9 | 매장에서 직접만드는 상큼한 레몬에이드
2. Iced Tea      | W 3.4 | 직접 유기농 홍차를 우려낸 아이스티
3. Fifty/Fifty   | W 3.5 | 레몬에이드와 아이스티의 만남
4. Soda          | W 2.7 | 코카콜라, 코카콜라 제로, 스프라이트, 환타
5. Bottled Water | W 1.0 | 지리산 프리미엄 생수
0. 뒤로가기       | 뒤로가기

-Beer-
[ Beer MENU ]
1. ShackMeister Ale   | W 9.8 | 쉐이크쉑 버거를 위해 특별히 양조한 에일 맥주
2. Magpie Brewing Co. | W 6.8 | Pale Ale, Porter, Wheat
3. The Hand and Malt  | W 6.8 | IPA, Mocha Stout
0. 뒤로가기      | 뒤로가기