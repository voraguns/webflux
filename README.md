# webflux

Spring boot  เป็นการนำเอา Library ทั้งหมดของ Spring มาใช้งานให้ง่ายขึ้น<br>

Spring ดั้งเดิมเน้น Configuration นั้นคือปี 2001 - 2007 เขาคิดแบบนั้น<br>

ปัจจุบันเน้นความสะดวกรวดเร็ว ใน Sprong เรียกว่า Auto Configuration<br><br>


Reactive stack หรือ Webflux<br>

spring-boot-starter-webflux<br>


java-27<br>
'-- pom.xml<br>
'-- code<br>
'    '-- service<br>
'         '-- Start.java<br>
'-- web<br>
'    '-- application.properties<br>
'    '-- public<br>
'          '-- index.html, photo.jpg<br>
'-- test<br>
'    '-- service<br>
'         '-- Test.java<br><br>


Spring Boot Standard Stack<br>
'-- Default web server is Tomcat<br>

/read-branch<br>
1 -----><br><br>

/read-product<br>
2 -----><br><br>

/read-staff<br>
3 ------><br><br>

Tomcat<br>
   ----- 1 -------------><br>
               '----- 2 -------------><br>
                             '----- 3 -------------><br><br><br>


คำว่า Reactive หรือ Webflux แทบไม่มีคสามหมายพิเศษ<br><br>

Spring Boot Webflux Stack<br>
'-- Default web server is Netty<br>
'-- Also know as: Reactive Stack or Non-Blocking <br>
'-- Also know as: Asynchronous<br><br>

Java 1.2       -> Java 2<br>
Java 1.3       -> Java 3<br>
Java 1.8       -> Java 8<br>
Java 1.20      -> Java 20<br><br><br>


Program ทั่วไปจะ Control ตัวมันเอง<br>
เริ่มทำงานจาก main() มีคำสั่ง 1, 2, 3 ตามลำดับ<br><br><br>


Context หรือ ApplicationContext<br>
คือ Program ใน Spring จะไม่ Control ตัวมันเอง<br>
Program ใน Spring จะควบคุมการทำงานผ่าน Context<br>
เรียกแนวคิดนี้ว่า Inversion od Control (IoC)<br><br>

1. GenericApplicationContext<br>
2. ClassPathXmlApplicationContext<br>
3. AnnotationConfigApplicationContext<br>
4. SpringApplication<br><br><br>


การใช้ JDBC ต้องส่งคำสั่งภาษา SQL เข้าไป ก็ไม่มีปัญหาอะไร<br>
แต่บางคนอยากให้มีปัญหา เช่นต้องการวางยาเสพติด<br>
โดยการเลือกใช้คำสั่ง SQL ที่ใช้ได้เฉพาะ DBMS ที่กำหนดไว้<br>
จะเปลี่ยน DBMS ไม่ได้ เช่น เปลี่ยนจาก SQL Server เป็น MySQL ทำไม่ได้<br><br><br>


ต่อมามีคนคิด Library ขึ้นมาหลายตัว ซึ่งทำงานบน JDBC<br>
ซึ่ง Library พวกนี้จะไม่สนใจ DBMS สลับ DBMS ได้แน่นอน<br><br><br>


ไม่ว่าจะอ่านเขียนฐานข้อมูลตัวไหนก็ตาม<br>
ในโลกนี้ มีเพียงสิ่งเดียวที่ต้องใช้ คืิอ Connection String<br><br><br>


String connectionString = ".....";<br>
String source = "....";<br><br><br>

สำหรับ ๋JDBC และ MySQL จะมี Connection String แบบนี้<br><br>

String source = "jdbc:mysql://127.0.0.0/db27?user=user27&password=p27";<br><br><br>


Library ที่ทำงานบน JDBC ไม่จำเป็นต้องสร้าง Table อะไรทั้งสิ้น<br>
Spring Boot Data JDBC ก็เหมือนกัน<br><br><br>


create database db27 default chartset 'UTF8';<br><br>

create user user27 indextified with mysql_native_password by 'p27';<br><br>

grant all on db27.* to user27;<br><br><br>


use db27;<br>
create table branch (<br><br>

);<br><br>

unique คือห้ามซ้ำกัน เช่น ห้ามเอา Email เดิมมาสมัคร<br>
not null คือ ต้องมีข้อมูล<br>
auto_increment คือ นับ 1, 2, 3 เป็นคำสั่งเฉพาะของ MySQL<br><br><br><br>



มี Library มากมาย ~ 30 ตัว  ที่ทำงานอยู่บน JDBC<br>
ทั้ง 30 ตัว ทำงานคล้ายกัน และมีเป้าหมายเดียวกัน<br>
คือทำให้ Code ภาษา Java อ่านเขียน DBMS ได้ทุกตัว (สลับ DBMS ได้)<br><br>

Object Relational Mapping<br> 
คือการทำ<br><br><br><br>



Spring Stereotype 6 Types<br>
1. @Component เป็น Bean ทั่วไปที่ไม่ใช่ 2, 3<br>
2. @Repository     for reading writing data<br>
3. @Service        for business logic<br>
4. @Indexed        for fast lookup<br>
5. @Controller     for create MVC web application<br>
6. @RestController for creating web service<br><br><br>


create database db27 default chartset 'UTF8';<br><br>

create user user27 identified with mysql_native_password by 'p27';<br><br>

grant all on db27.* to user27;<br><br>

ีuse db27;<br>
create table branch (<br>
    number    int unique not null auto_increment,<br>
    name      varchar(200) not null unique,<br>
    area      float<br>
);<br>
insert into branch(name,area) values('New York', 80.0);<br>
insert into branch(name,area) values('London', 120.0);<br>
insert into branch(name,area) values('Paris', 100.0);<br>
insert into branch(name,area) values('Tokyo', 90.0);<br><br>

create table staff (<br>
    number   int unique not null auto_increment,<br>
    name     varchar(200) unique not null,<br>
    salary   float default 0.0,<br>
    gender   char default 'X'<br>
);<br><br>

<hr>
Keyword ที่ชื่อว่า new ใช้สร้าง instance<br>
- ถ้าจะอ้างอิง Instance ต้องใช้ Address<br><br>

Spring Beans คือ Manageable instance<br>
- ถ้าจะอ้างอิง Spring Bean ใช้ชื่อของ Bean<br>
- ใช้ Address ก็ได้<br>
- ในคู่มือของ Spring จะเรียก Spring Bean ว่า Managed Instance<br>
- คำว่า Manageable คือจะใช้ Address เดิมก็ได้ หรือสร้างใหม่หรือทำอะไรก็ได้<br>









