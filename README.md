#Cupcake Application
## 개요
Jetpack.ViewModel를 공유 viewModel 형태로 사용하는 심플앱이다.


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
 
 <img src="https://user-images.githubusercontent.com/40654227/184130328-c243c695-ced4-4861-8436-e95ec25a5097.png"/>


 ### StartFragment
 
 <img src="https://user-images.githubusercontent.com/40654227/184130509-fc4d124b-c01e-4188-a898-4e4a0aa88a99.png" height=400/>

  - `setQuantity()`: `1`, `6` 그리고 `12` 중에 선택한다.
  - `setFlavor()`: **FlavorFragment**에서 종류를 선택할 때, 기본값으로 **Vanilla**를 선택되어 있도록 **Vanilla**로 설정한다.

### FlavorFragment

<img src="https://user-images.githubusercontent.com/40654227/184130557-6ed0bb2f-2ee5-435a-a1ef-c2ae291aca8d.png" height=400/>

 - `resetOrder()`: 주문 취소 시, 주문 관련된 정보를 초기화한다.
 - `setFalvor()`: 주문할 컵 케이크 종류를 선택한다.
 - `flavor`: `RadioButton.checked` 상태값을 바인딩한다.
 - `price`: 가격 정보를 바인딩한다.

### PickupFragment

<img src="https://user-images.githubusercontent.com/40654227/184130604-ebc48e02-6c66-4ee5-a2a4-117eafc0251e.png" height=400/>

- `resetOrder()`: 주문 취소 시, 주문 관련된 정보를 초기화한다.
- `setDate()`: 주문할 날짜를 선택한다.
- `dateOptions`: `RadioButton.checked` 상태값을 바인딩한다.
- `price`: 가격 정보를 바인딩한다.
 
### SummaryFragment

<img src="https://user-images.githubusercontent.com/40654227/184130690-17c4399e-289c-43f8-b09e-8c2dff55f486.png" height=400/>

- `qauntity`: 수량 정보를 바인딩한다.
- `flavor`: 종류 정보를 바인딩한다.
- `date`: 주문 날짜 정보를 바인딩한다.
- `price`: 가격 정보를 바인딩한다.
