# 엑셀 내 특정열 역치환
----------------------

## 홈페이지 오류 설명
> 특수문자들이 치환된 형태로 불려와, 원문을 판단하기 어려움.  
> .xlsx 파일에 오류 목록을 들여, 역치환 알고리즘 적용하여 저장
<br/>

## 사용환경
- Library : openpyxl
- Tool : Visual Code
- Language : Python   
<br/>



## 개발환경 설정
- python : 3.6.8
- pip : 18.1
- openpyxl : 3.0.5


### - pip 환경변수 설정
```
1. 제어판 -> 시스템 및 보안 -> 시스템창
2. 고급 시스템 설정 -> 환경변수
3. pip path 경로 추가
```

### - openpyxl 설치
```
pip install openpyxl
```   
<br/>


## 사용법
```
1. xlsx 파일명은 '1.xlsx'로 한다
2. 해당 xlsx 파일을 '2_replacing.py'와 같은 dir에 포함시킨다.
3. 콘솔창에 "python 2_replacing.py" 입력
4. "Which row do you want to change? : " -> 역치환하려는 str목록명 입력 (자동 upper 변환됨)
```

## 결과
### Before
![화면 캡처 2020-10-21 172053](https://user-images.githubusercontent.com/48303178/96693292-05fd4680-13c2-11eb-89f9-a449d4d4b3ee.jpg)  

### After
![화면 캡처 2020-10-21 172139](https://user-images.githubusercontent.com/48303178/96693296-072e7380-13c2-11eb-880d-de3132767284.jpg)