Feature: To validate fb login
@smoke
Scenario Outline: To validate with valid datas
Given To enter into login page
When to enter user "<user>" and pass "<pass>"
Then To validate the currecent url page
 
Examples:
|user|pass|
|Yugesh|882|
|Guru|928|
 
@sanity
Scenario: To validate with Invalid datas
Given To enter into login page
When to enter user "Yugesh" and pass "2772"
Then To validate the currecent url page
 