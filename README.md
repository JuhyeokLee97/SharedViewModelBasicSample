## OrderViewModel - SharedViewModel
### 개요
#### 변수
 - `quantity`: 주문하려는 컵 케이크의 **수량**
 - `flavor`: 주문하려는 컵 케이크의 **종류**
 - `dateOptions`: 주문 가능한 **날짜 목록**
 - `date`: 주문하려는 **날짜**
 - `price`: **주문 가격**

#### 함수
 - `setQuantity()`: 주문하려는 컵 케이크의 **수량**을 설정한다. (call `updatePrice()`)
 - `setFlavor()`: 주문하려는 컵 케이크의 **종류**를 설정한다.
 - `setDate()`: 주문하려는 **날짜**를 설정한다.
 - `hasNoFlavorSet()`: 선택 된 컵 케이크의 **종류**가 있는지 검사한다.
 - `resetOrder()`: `quantity`, `flavor`, `date`, `price` 값들을 초기화한다.
 - `updatePrice()`: **가격** 정보를 업데이트한다.
 - `getPickupOptions()`: 선택 가능한 날짜를 `Date`형식으로 변경한다.
 
 ### 사용
 #### App Flow
 
 <img src=""/>
 
 ### StartFragment
 
 <img src=""/>
 
  - `setQuantity()`: `1`, `6` 그리고 `12` 중에 선택한다.
  - `setFlavor()`: **FlavorFragment**에서 종류를 선택할 때, 기본값으로 **Vanilla**를 선택되어 있도록 **Vanilla**로 설정한다.

### FlavorFragment

<img src=""/>

 - `resetOrder()`: 주문 취소 시, 주문 관련된 정보를 초기화한다.
 - `setFalvor()`: 주문할 컵 케이크 종류를 선택한다.
 - `flavor`: `RadioButton.checked` 상태값을 바인딩한다.
 - `price`: 가격 정보를 바인딩한다.

### PickupFragment

<img src=""/>

- `resetOrder()`: 주문 취소 시, 주문 관련된 정보를 초기화한다.
- `setDate()`: 주문할 날짜를 선택한다.
- `dateOptions`: `RadioButton.checked` 상태값을 바인딩한다.
- `price`: 가격 정보를 바인딩한다.
 
### SummaryFragment

<img src=""/>

- `qauntity`: 수량 정보를 바인딩한다.
- `flavor`: 종류 정보를 바인딩한다.
- `date`: 주문 날짜 정보를 바인딩한다.
- `price`: 가격 정보를 바인딩한다.
