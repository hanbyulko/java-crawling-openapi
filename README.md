# Java 기반 미세먼지, 날씨 검색 어플리케이션 구현

  <br/>

## Introduction
서울시 실시간 미세먼지, 날씨 검색 어플리케이션

  <br/>

  <br/>
  
## Required Library 
- ojdbc6.jar
- json-simple-1.1.1.jar
- jsoup-1.6.0.jar 

  <br/>

## Requirements Specification

- 서울 지역별 실시간 날씨, 미세먼지 검색 기능
- 댓글 작성, 자신이 작성한 댓글 수정, 삭제 기능
- 실시간 미세먼지 관련 기사 크롤링 기능


  <br/>

## Class Diagram
![image](https://user-images.githubusercontent.com/49690751/73124363-e5908f00-3fdd-11ea-99e7-76d0a7b662b7.PNG)


  <br/>
  
  
  
 ## 주요 기능
 ***날씨 및 미세먼지 조회***
 ![image](https://user-images.githubusercontent.com/49690751/73124360-e3c6cb80-3fdd-11ea-9310-385870da8ce0.png)
 >날씨 및 미세먼지 데이터 http request 및 결과 json값 라이브러리 이용해 파싱해 DB에 저장
 
  <br/>
 
 ***실시간 미세먼지 관련 기사 조회***
 ![image](https://user-images.githubusercontent.com/49690751/73124381-17095a80-3fde-11ea-9f5f-d229618d1932.png)
 >jsoup라이브러리를 이용해 미세먼지 관련 기사 크롤링 후 콘솔창 화면 크기에 맞게  출력


