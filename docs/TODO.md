## GUI
- 모든 GUI 관련 클래스는 graphics 패키지 내에 존재해야 합니다.
- JLabel, JTextField, JButton을 하나의 컴포넌트로 작성하고 MainFrame 위에 4개 배치하세요.
- JTextField와 JButton의 이벤트 리스너는 같은 기능을 해야합니다.
- MainFrame 위에 별도의 JButton을 2개 추가하세요.
- 각 컴포넌트에 바인딩해야할 이벤트는 차후 제공될 예정입니다.

## Logic
- 모든 Logic 컴포넌트는 graphics 패키지의 어떠한 파일도 import 해서는 안됩니다.
- 간단한 파일 입출력 기능을 작성하세요.
- 데이터의 형식은 model 패키지에서 정의 될 예정입니다.
- 입력 받은 데이터를 다른 패키지에서 사용 할 수 있게 String 반환값을 가진 `getData()` 함수를 작성하세요.
- 데이터 파일의 출력 양식은 `[model].toString()` 메서드로 제공 될 예정입니다.
- 데이터 파일은 res 디렉터리 내에 존재해야합니다.
- 데이터 파일의 이름은 data.txt입니다.


## Model
- GUI 컴포넌트와 Logic 을 중계할 모델을 만드세요.
- `toString()`을 통하여 모델의 전체 데이터를 나타 낼 수 있어야 합니다.