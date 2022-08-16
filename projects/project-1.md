# Project 1

## Overview
You will be building a Town Complaint Submission Application for a fictional town of your choice (have fun with it!) Gotham, Smallville, Hawkins etc.... Consitutents submit complaints for issues in their town. Council members will review issues and create meetings where the complaints will be discussed. Your application will be fully hosted on Azure.

### Presentation
You will demo the application in front of the batch. Patrick and Adam will be doing the assessing. You will be sending a link to your hosted application.


### Timeline
- 8/16
  - Seperate repos created for front-end and back-end
  - Skeleton code in GitHub
  - ERD submitted and approved
- 8/22
  - Create complaint works front-end to back end
- 8/29
  - DUE


## User Stories



### Important Terminology
- Unregistered Constituent
  - Any user of the application that is not logged in
- Council Member
  - A council memeber who has logged in
- Registered Constituent
  - A constituent who has logged in
- Complaint
  - A grievance sent by a community member


#### Complaint statuses

```mermaid
    flowchart LR

    complaintNew(Unreviewed Complaint)
    complaintHighPriority(Low Priority Complaint)
    complaintLowPriority(High Priority Complaint)
    complaintIgnored(Ignored Complaint)
    complaintAddessed(Addressed Complaint)
    review{Reviewed by Council Member}

    complaintNew --> review
    review ---> complaintHighPriority 
    review ---> complaintLowPriority 
    review ---> complaintIgnored 
    complaintLowPriority --> complaintAddessed
    complaintHighPriority --> complaintAddessed
```

### Primary User Stories
|As a| I Want To | So That|
|----|-----------|--------|
|Unregistered Constituent| Report Complaints | The Town Council can address them|
|Unregistered Constituent| View Meetings | I can attend meetings relavent to me |
|Council Member| Review Complaints | I can sort their priority or ignore them|
|Council Member | Create Meetings |  The town can dicuss complaints|
|Council Member | Attach complaints to meetings | contituents can attend meetings pertinent to them|


### Stretch User Stories
#### Do AFTER you have completed the primary user stories
|As a| I Want To | So That|
|----|-----------|--------|
|Unregistred Constituent| Request an account | I can access feautres available to Registered Constituent|
|Council Member | Approve Constituent Registration Request | I can verify constituent information |
|Registered Constituent| Request to speak at a specific meeting | I can voice my complaints directly|


## Deployment
- Backend must be containerized and deployed on Azure
- Database must be hosted on Azure 
- Front-end statically hosted on Azure
- Front-end code should be in a GitHub repo
- Backend-end code should be in a seperate GitHub repo
- CI tests for backend 
  - Jenkins or GitHub actions

## Technical Requirements
- All DAO methods tested
- Service methods with bussiness logic should be tested using Mockito
- Logging 
- Backend built using Javalin
- Front-end using HTML/CSS/JS

```sql

-- if you ever find yourself writing 2 tables that have very similar columns but refer to different types of people
-- you most likely want to have 1 table with a column denoting the role


create table app_user(
	user_id serial primary key,
	username varchar(40),
	password varchar(40),
	role varchar(30)
);

create table meeting(
	meeting_id serial primary key,
	address varchar(200),
	time int, -- use unix epoch time 
	summary varchar(200)
);

create table complaint(
	complaint_id serial primary key,
	description varchar(200),
	status varchar(40),
	meeting_id int references meeting(meeting_id) default -1
);


insert into meeting values(-1,'NO MEETING ASSIGNED', 0, 'NOT A REAL MEETING');


insert into app_user values (default, 'adamGator','pass123','COUNCIL');
insert into app_user values (default, 'patrick99', 'pat1','CONSTITUENT' );

insert into complaint values (default,'super villain blocking trash pick up', 'UNREVIEWED', null); -- works and accurately models the data
-- whenever I see a null value in my code I assume something went wrong
insert into complaint values (default,'Shadow monsters are rummaging in my backyard', 'UNREVIEWED');

```