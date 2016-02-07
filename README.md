# BUBT-Dormitory
<b>BUBT Dormitory System</b> provides dormitory/hostel support for BUBT.

In this application we have only one user: <b>Manager</b>. Manager has several duties which will be listed below.
Fisrt it will  ask for Username and Password. Both <b>Username</b> and <b>Password</b> is: <b>admin</b>
After successful Login, you can see the menu like below:

![Alt text](http://imgur.com/AiOfSy0.png)

• There are several options. First if manager wants to add new student’s entry, then he will use <b>“New Admission”</b>.

In <b>“New Admission”</b>, manager needs to fill-up new comer student’s information. Here manager will find <b>“Available Room”</b> list to assign him in a room.This dormitory is a five storied building and each floor has ten rooms. 
So 1st floor has 101 to 110 rooms, 2nd floor has 201 to 210 rooms and so on.

![Alt text](http://imgur.com/eqBsVbM.png)

• Every room can consist up to <b>3</b> students. So whenever any room consist 3 students in it, it will not show on <b>“Available Room”</b> list.

• Click <b>“Back”</b> to return to menu. To see the students information who are right now living in dormitory click <b>“Student Information”</b>. Here we have two tables [Academic & Personal] to show their records.

![Alt text](http://imgur.com/KsN2Rgc.png)

• Manager can even search for information of any particular student.

![Alt text](http://imgur.com/dXo2jrL.png)

• Click “Back” to return to menu. In 3rd option we have <b>“Billing information”</b>. Here manager can create and generate bill for any particular student. Also we have a list of
students’ bills in <b>“Show Bill”</b> option. To generate a bill, manager will give student’s ID, choose the month and year. A PDF version of that bill will be generated.

![Alt text](http://imgur.com/jDritKG.png)

Then in the menu option, we have <b>“Complains”</b> section. In this section, student can complain against <b>Dormitory</b> or against <b>students</b>.

![Alt text](http://imgur.com/ANn60U1.png)

• If anyone leaves this dormitory, we have <b>“Delete Record”</b> option in the menu.

• Manager can also change his name and password by clicking <b>“Update Admin Information”</b>.

• Manager can also change Dormitory’s bill [Seat rent and meal] by clicking <b>“Update Bill”</b>.

• For more information please see the <b>“Help ?”</b> Option.

![Alt text](http://imgur.com/NVS67iv.png)

Note:In this project we use <b>SQLite</b> Database with <b>"dormitory.sqlite"</b> name. It was a group project for an university course.Thanks Hira to help me in this project. It's a Java Swing Project. Need JVM to run.
