<h1 align="center"> Maru </h1>

<p align="center">
  <img src="https://img.shields.io/badge/Kotlin-1.4.30-yellowgreen?logo=kotlin"/>
  <img src="https://img.shields.io/badge/Android-4.1.2-blue?logo=Android+Studio"/>
  <img src="https://img.shields.io/badge/targetSdk-30-green?logo=Android"/>
  <img src="https://img.shields.io/badge/minSdk-26-green?logo=Android"/>
  <img src="https://github.com/bookmaru/MARU-Android/actions/workflows/build.yml/badge.svg"/>
</p>

<p align="center">
    <img src="https://user-images.githubusercontent.com/54518925/98941523-0eafeb00-2530-11eb-8bc2-b7c63702fe49.jpeg"/>
</p>

<p align="center">
  <h2 align="center">언제든 어디서든, 책과 사람을 이어주는 공간</h2>
  <p align="center">
  언제 어디서든 책과 사람을 이어주는 공간, 마루 온라인 독서 토론 플랫폼 마루를 만나보세요. <br />
  <b>[책을 읽고 사람과 잇다]</b> 책을 통해 다양한 사람들이 모여 밀도 있는 대화의 시간을 만들어 나갑니다. <br />
  <b>[언제나, 어디서나]</b> 국내 최초 온라인 독서 토론 전문 플랫폼 마루는 멀리 떨어져 있어도 마음을 잇는 법을 제시합니다. <br />
  <b>[소통하는 독서의 즐거움]</b> 독서 후의 여운을 사람들과 함께 나누면서 진정한 자아를 찾는 공간 여기는 마루입니다. <br />
  </p>
</p>
<br/>

<p align="center">
    <h2 align="center"> ✨LIVELY✨ ♥️LOVELY♥️  MARUROID </h2>
    <img src="https://user-images.githubusercontent.com/54518925/110631273-b0e39500-81e9-11eb-95da-d93e2e375dd2.png"/>
    <img src="https://user-images.githubusercontent.com/54518925/110631296-b4771c00-81e9-11eb-95f6-bfeb721caf3d.png"/>
</p>
<table align="center">
    <th align="center"> 이현우 </th>
    <th align="center"> 박세란 </th>
    <tr>
        <td align="center">
            <img src="https://github.com/l2hyunwoo.png?size=100"/>
        </td>
        <td align="center">
            <img src="https://github.com/sery270.png?size=100"/>
        </td>
    </tr>
    <tr>
        <td align="center">
            <h3 align="center"> LIVELY ANDROID "NUNU🏃‍" 이현우 </h3>
        </td>
        <td align="center">
            <h3 align="center"> LOVELY ANDROID "RANI🌿" 박세란 </h3>
        </td>
    </tr>
    <tr>
        <td>
            - [OUNCE](https://github.com/teamOunce/Ounce_Android) Android Lead 개발자
            </br>
            - [BeMe](https://github.com/TeamBeMe/BeMeAndroid) Android Lead 개발자
            </br>
            - [Maru](https://github.com/bookmaru/MARU-Android) Android Lead 개발자
            </br>
            - 우리는 잇습니다, 책과 사람을
            </br>
            - 일 벌이기 주의: 이 사람에게 프로젝트를 마구잡이로 던지지 마시오.
        </td>
        <td>
            - [Mongle](https://github.com/Sopt-Mongle/MongleAndroid_RELEASE) Android 개발자
            </br>
            - [ALGOALGO](https://github.com/ALGOALGO-swu/algoalgo-discord-bot) 디스코드 봇 Server 개발자
            </br>
            - 여기어때 정보보안실 사내프로그램 개발 인턴 (server)
            </br>
            - 더 나은 Android 어플리케이션 개발을 위해 [Android Jetpack && MVVM pattern](https://github.com/sery270/sunflower_clone)를 공부하고 있습니다. 🌱
            </br>
            - 벌레를 열심히 잡는편입니다. MARU Bug들도 맡겨주세요.
            </br>
            - 취급주의 : 음악이 끊기면 곤란합니다. 그리고 주기적으로 술 마셔주셔야 합니다.
            </br>
        </td>
    </tr>
</table>

## MARU Commit Convention
### Basic Struture
```
[type] : subject

body(optional)

footer
```

### Type
- feat: 새로운 기능
- fix: 버그 수정
- docs: 문서 수정
- style: 스타일 변경(코드 변경 X)
- refactor: 리팩토링
- test: 테스트 코드 추가/테스트 리팩토링
- chore: updating build tasks, package manager 설정

### Subject
- Subject는 50글자를 넘어가면 안된다
- 첫 시작은 대문자로 해야한다
- 마지막에 마침표(.)를 찍으면 안된다
- 어떤 변경점이 있는지 설명한다
- 명령조를 사용한다

### Body
- 부연 설명이나 커밋의 이유를 설명할 때만 사용
- Not How, Explauin What and Why
- 윗 부분과 1줄의 공백 필요
- 각 라인은 72자 초과 불가

### Footer
- Issue Tracker IDs를 적을 때 사용
- issue track : #{issue_number} 형태로 기입

## MARU Coding Convention For Clean Code
### Kotlin Style Guide
MARU는 [Google의 Kotlin Coding Style Guide](https://developer.android.com/kotlin/style-guide)를 따릅니다

### Class Layout
다음과 같은 순서 클래스를 구성합니다
- Property 선언과 초기화 블럭(intializer blocks)
- 추가적인 생성자
- 메소드 정의
- 컴패니언 오브젝트(Companion object)

### Naming Rule
#### Package
- 패키지의 이름은 항상 소문자로 하고, 밑줄을 사용하지 않습니다
- 두 개 이상의 단어를 한 번에 사용하는 것을 금지합니다

#### Class/Object
- Pascal Case
```
open class SampleName { /* ... */ }
object MoreSampleName : SampleName() { /* ... */ }
```

#### Function/Parameter/Variable
- Camel Case
```
val initList = mutableList<SampleData>()
fun getList: List<SampleData>() { /* ... */ }
```
#### Constant
- Upper Snake Case
- 상수는 companion objet에 넣어 보관합니다
```
companion object {
    const val MAX_COUNT = 8
}
```

### Formatting
#### Indenting
Tab 키를 써서 Indenting 합니다

#### 중괄호
괄호 뒤에 한 칸을 띄우고 사용합니다
```
if (elements != null) {
    for (element in elements) {
        // ...
    }
}
```

#### 괄호
- Control문(if/while/for)
    - 한 칸 띄어씁니다
- 생성자/Method
    - 붙여씁니다
```
if (isSpacing == true) { /*...*/ }
fun isSpacing() { /*...*/ }
```

#### Colon(:)
- 변수의 타입/함수 리턴 타입 결정
    - 콜론을 앞에 붙인다
- 상속받은 클래스/인터페이스 구분
    - 한 칸 띄어쓴다
```
fun isSpacing(): Boolean { /*...*/ }
class MainActivity : AppCompatActivity()
```

## Maru's Git Branch Strategy: Git-Flow
<img src = "https://user-images.githubusercontent.com/54518925/103665498-d5877a80-4fb6-11eb-81ad-de0c1a577083.png" />
<img src = "https://user-images.githubusercontent.com/54518925/103665503-d6b8a780-4fb6-11eb-9786-9b97bc83ceda.png" />
<img src = "https://user-images.githubusercontent.com/54518925/103665534-dd471f00-4fb6-11eb-9246-7fe89cf2aff0.png" />

## Tech Spec

- App Architecture based on MVVM Architecture
<p align="center">
  <img src="https://user-images.githubusercontent.com/54518925/104303381-5db4d500-550d-11eb-86b7-b8bda29a1987.png" style="zoom:50%;" />
</p>


## Open Source Library

| 라이브러리                                                   | 목적                                                    |
| ------------------------------------------------------------ | ------------------------------------------------------- |
| [Hilt](https://developer.android.com/jetpack/androidx/releases/hilt) | Library for Dependency Injection                        |
| [Navigation](https://developer.android.com/jetpack/androidx/releases/navigation) | Fragment간 화면 전환 용이                               |

