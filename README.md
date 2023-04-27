# webflux

Spring boot  เป็นการนำเอา Library ทั้งหมดของ Spring มาใช้งานให้ง่ายขึ้น

Spring ดั้งเดิมเน้น Configuration นั้นคือปี 2001 - 2007 เขาคิดแบบนั้น

ปัจจุบันเน้นความสะดวกรวดเร็ว ใน Sprong เรียกว่า Auto Configuration


Reactive stack หรือ Webflux

spring-boot-starter-webflux


java-27
'-- pom.xml
'-- code
'    '-- service
'         '-- Start.java
'-- web
'    '-- application.properties
'    '-- public
'          '-- index.html, photo.jpg
'-- test
'    '-- service
'         '-- Test.java


Spring Boot Standard Stack
'-- Default web server is Tomcat

/read-branch
1 ----->

/read-product
2 ----->

/read-staff
3 ------>

Tomcat
   ----- 1 ------------->
               '----- 2 ------------->
                             '----- 3 ------------->


คำว่า Reactive หรือ Webflux แทบไม่มีคสามหมายพิเศษ

Spring Boot Webflux Stack
'-- Default web server is Netty
'-- Also know as: Reactive Stack or Non-Blocking 
'-- Also know as: Asynchronous

Java 1.2       -> Java 2
Java 1.3       -> Java 3
Java 1.8       -> Java 8
Java 1.20     -> Java 20


Program ทั่วไปจะ Control ตัวมันเอง
เริ่มทำงานจาก main() มีคำสั่ง 1, 2, 3 ตามลำดับ


Context หรือ ApplicationContext
คือ Program ใน Spring จะไม่ Control ตัวมันเอง
Program ใน Spring จะควบคุมการทำงานผ่าน Context
เรียกแนวคิดนี้ว่า Inversion od Control (IoC)

1. GenericApplicationContext
2. ClassPathXmlApplicationContext
3. AnnotationConfigApplicationContext
4. SpringApplication


การใช้ JDBC ต้องส่งคำสั่งภาษา SQL เข้าไป ก็ไม่มีปัญหาอะไร
แต่บางคนอยากให้มีปัญหา เช่นต้องการวางยาเสพติด
โดยการเลือกใช้คำสั่ง SQL ที่ใช้ได้เฉพาะ DBMS ที่กำหนดไว้
จะเปลี่ยน DBMS ไม่ได้ เช่น เปลี่ยนจาก SQL Server เป็น MySQL ทำไม่ได้


ต่อมามีคนคิด Library ขึ้นมาหลายตัว ซึ่งทำงานบน JDBC
ซึ่ง Library พวกนี้จะไม่สนใจ DBMS สลับ DBMS ได้แน่นอน


ไม่ว่าจะอ่านเขียนฐานข้อมูลตัวไหนก็ตาม
ในโลกนี้ มีเพียงสิ่งเดียวที่ต้องใช้ คืิอ Connection String


String connectionString = ".....";
String source = "....";

สำหรับ ๋JDBC และ MySQL จะมี Connection String แบบนี้

String source = "jdbc:mysql://127.0.0.0/db27?user=user27&password=p27";


Library ที่ทำงานบน JDBC ไม่จำเป็นต้องสร้าง Table อะไรทั้งสิ้น
Spring Boot Data JDBC ก็เหมือนกัน


create database db27 default chartset 'UTF8';

create user user27 indextified with mysql_native_password by 'p27';

grant all on db27.* to user27;


ีuse db27;
create table branch (

);

unique คือห้ามซ้ำกัน เช่น ห้ามเอา Email เดิมมาสมัคร
not null คือ ต้องมีข้อมูล
auto_increment คือ นับ 1, 2, 3 เป็นคำสั่งเฉพาะของ MySQL



มี Library มากมาย ~ 30 ตัว  ที่ทำงานอยู่บน JDBC
ทั้ง 30 ตัว ทำงานคล้ายกัน และมีเป้าหมายเดียวกัน
คือทำให้ Code ภาษา Java อ่านเขียน DBMS ได้ทุกตัว (สลับ DBMS ได้)

Object Relational Mapping 
คือการทำ



Spring Stereotype 6 Types
1. @Component
2. @Repository     for reading writing data
3. @Service        for business logic
4. @Indexed        for fast lookup
5. @Controller     for create MVC web application
6. @RestController for creating web service







