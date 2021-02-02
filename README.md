# Kotlin으로 안드로이드 앱 만들어 보기

## Mad Camp(2020-winter) 첫째 주 프로젝트

### 1. 프로젝트 이름

오렌지:tangerine:

### 2. 기능 설명

**[전체]**

- 앱 아이콘은 오렌지 그림, 앱 이름은 '오렌지:tangerine:'로 표시된다.
- 앱을 켜면 오렌지 로고가 그려진 스플래시 화면이 먼저 표시된 후 MainActivity로 진입한다.
- 앱을 다운로드한 뒤 처음 실행할 경우 연락처, 통화기능, 촬영기능, 사진 및 미디어 엑세스 권한 허용 여부를 일괄적으로 확인한다. 전부 허용하면 앱을 사용할 수 있고, 허용되지 않은 권한이 하나라도 있으면 앱을 사용할 수 없다.
- 상단에 3개의 탭이 표시되고, 각 탭을 터치하거나 좌우로 스와이프하면 탭 간 이동이 가능하다.(ViewPager2 사용)

**[첫 번째 탭]** '연락처' 탭

- 기기 내 저장된 연락처들을 불러와 목록으로 표시한다. (CardView, RecyclerView 사용)
- 연락처 검색기능을 사용할 수 있다. 이름을 입력하는 즉시 해당 이름과 일치하는 연락처가 표시된다.
- 각 연락처의 프로필 이미지에, 해당 사람의 이름에 기반한 색상이 부여된다. (Character.getNumericValue 사용)
- 각 연락처마다 전화를 걸 수 있는 버튼이 표시된다.
- 각 연락처를 누르면 상세화면을 볼 수 있다. (Intent 사용)
- 오름차순 정렬, 내림차순 정렬을 선택할 수 있다.

**[두 번째 탭]** '갤러리' 탭

- 미리 저장된 drawable 이미지들을 바둑판식 목록으로 표시한다.(RecyclerView 사용)
- 상단에는 '사진 찍기' 버튼과 '앨범에서 찾기' 버튼으로 원하는 이미지 썸네일을 화면 상단에 띄울 수 있다.
- '사진 찍기' 버튼을 누르면 기기의 카메라가 실행된다. 사진을 촬영하고 확인 버튼을 누르면 "사진을 저장했습니다."라는 토스트 메시지를 띄우며 기기의 갤러리에 저장된다.
- 촬영한 이미지는 화면 상단에 표시된다.
- '앨범에서 찾기' 버튼을 누르면 기기의 갤러리에 진입한다. 마찬가지로 원하는 이미지를 선택하여 화면 상단에 띄울 수 있다.
- 바둑판식 목록에서 각 이미지를 누르면 상세화면을 볼 수 있다. 상세화면의 좌측에는 저장된 이미지들의 작은 목록을 또 볼 수 있고, 우측에는 선택한 이미지가 크게 보인다.(Intent 사용)
- 이미지 상세화면에서, 좌측의 작은 목록 중 이미지 하나를 누르면 마찬가지로 우측에 선택한 이미지가 띄워진다.

**[세 번째 탭]** '게임' 탭

- 오목 두는 게임을 플레이할 수 있다.
- 화면 상단에는 '1 PLAYER' 버튼과 '2 PLAYERS' 버튼으로 원하는 게임 환경을 선택할 수 있다. 선택하지 않고 바로 플레이하는 경우엔 자동으로 '1 PLAYER' 모드가 적용된다.
- '1 PLAYER' 버튼을 누르면 컴퓨터와 플레이하는 모드로 전환된다. 사용자가 먼저 오목을 두면 1초 뒤 컴퓨터도 난수를 발생시켜 오목을 둔다.
- '2 PLAYERS' 버튼을 누르면 사용자 두 명이 함께 플레이하는 모드로 전환된다. 서로 번갈아가며 직접 오목을 두면 된다.
- 오목 게임은 열이나 행에 전부 오목을 두게 되면 이긴다. 사용자가 이기면 사용자에게 점수 1점이, 컴퓨터나 PLAYER 2가 이기면 그들에게 점수 1점이 부여된다.
- 그 누구도 열이나 행에 전부 오목을 두지 못하면 비기게 되며, 누구도 점수를 얻지 않는다.
- 우측 상단의 '처음부터' 버튼을 누르면 점수가 초기화되며, 게임을 처음부터 시작한다.
