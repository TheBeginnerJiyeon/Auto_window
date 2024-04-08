# Week 1: Introduction to Python - Variables and Data Types

# Integer Variable
age = 25
print("Age:", age)  # Output: Age: 25

# Float Variable
height = 5.11
print("Height:", height)  # Output: Height: 5.11

# String Variable
name = "John"
print("Name:", name)  # Output: Name: John

# Boolean Variable
is_student = True
print("Is Student:", is_student)  # Output: Is Student: True

# List Variable
numbers = [1, 2, 3, 4, 5]
print("Numbers:", numbers)  # Output: Numbers: [1, 2, 3, 4, 5]
# 리스트는 말 그대로 목록
# 리스트 안에는 아무거나 들어갈 수 있음(숫자, 문자...)

# Tuple Variable
coordinates = (10, 20)
print("Coordinates:", coordinates)  # Output: Coordinates: (10, 20)

# Dictionary Variable
person = {"name": "Alice", "age": 30}
print("Person:", person)  # Output: Person: {'name': 'Alice', 'age': 30}
a_dict={} # 빈딕셔너리 생성(초기화)
b_dict={'name':'김현우','age':25} # 값을 채운 딕셔너리

print(a_dict)
print(a_dict.values())

# a_dict['name']의 값은?
print(b_dict['name']) # key에 접근, value 값 추출


# Set Variable
fruits = {"apple", "banana", "orange"}
print("Fruits:", fruits)  # Output: Fruits: {'banana', 'apple', 'orange'}

""" can you give me more detailed explanation?
ChatGPT
Of course! Let's delve deeper into variables and data types in Python.

Variables:
Variables are essentially names that we give to memory locations in the computer's memory where we can store data. In Python, you can think of variables as containers that hold information. When you create a variable, you're essentially assigning a name to a value.

Data Types:
Data types specify the type of values that variables can hold. Each variable in Python has a data type associated with it, but you don't need to explicitly declare the data type when creating a variable. Python dynamically assigns the data type based on the value assigned to it.

Now, let's break down the common data types in Python:

Integer (int): Integers are whole numbers, positive or negative, without any decimal point. For example, 5, -10, 1000.

Float (float): Floats represent real numbers and are written with a decimal point. For example, 3.14, 0.001, -2.5.

String (str): Strings are sequences of characters, enclosed within single quotes (') or double quotes ("). For example, "hello", 'Python', "123".

Boolean (bool): Booleans represent truth values and can only be True or False. They are often used for logical operations and control flow. For example, True, False.

List (list): Lists are ordered collections of items, which can be of any data type. They are mutable, meaning their elements can be changed after creation. For example, [1, 2, 3], ['apple', 'banana', 'orange'].

Tuple (tuple): Tuples are ordered collections of items, similar to lists, but they are immutable, meaning their elements cannot be changed after creation. Tuples are defined using parentheses (). For example, (1, 2, 3), ('apple', 'banana', 'orange').

Dictionary (dict): Dictionaries are unordered collections of key-value pairs. Each key is associated with a value, and keys must be unique within a dictionary. Dictionaries are defined using curly braces {}. For example, {'name': 'John', 'age': 30}, {'fruit': 'apple', 'color': 'red'}.

Set (set): Sets are unordered collections of unique elements. They are defined using curly braces {} but without key-value pairs. For example, {1, 2, 3}, {'apple', 'banana', 'orange'}. """

# 문자열 응용 

first_name="Harry"
last_name="Potter"

name_=first_name+" "+last_name
print(name_)

# " " : 띄어쓰기도 특수 "문자"

a="3"
b="5"

print(a+b) # 35 string concat

""" b=1+"5" # TypeError: unsupported operand type(s) for +: 'int' and 'str' """

# 그럼 문자열에 숫자를 담은 것은 언제 쓰지?
# 문자와 숫자를 조합하는 경우에 사용!

myteam="drwill"
myid="55"

mynumber=myteam+myid
print(mynumber) # drwill55

# int

a='3'
b=5
c=int(a)+b
print(c)

# 특정 문자를 기준으로 문자열 나누기

# 이메일 주소에서 도메인 "gmail" 만 추출하기

myemail='test@gmail.com'

result=myemail[myemail.find("gmail"):myemail.find(".")]
print(result) # gmail
result=myemail.split('@')


result2=result[1].split('.')

print(result2[0]) # gmail  >> 우리가 알고 싶었던 것
print(result2[1]) # com >> 

# 한 줄로 한 번에 처리할 때
a=myemail.split("@")[1].split(".")[0]
print(a)

txt="서울시-마포구-망원동"
print(txt.replace("-",">"))

age=21

if age>19:
    print("성인입니다")

# elif : else if 의 줄임말. 여러개 조건 중 하나가 True인 경우 해당코드를 블록 실행함
    
score=85
if score>=90:
    print("A 등급")
elif score>=80:
    print("B 등급")
elif score>=70:
    print("C 등급")
else:
    print("Fail")

# else 문
    
""" else 문은 이전의 모든 조건이 False 일 때 실행됨
if나 elif 중 어느 것도 실행되지 않을 때 사용

if 조건:
    # 조건이 True일 때 실행되는 코드
else:
    # 위의 모든 조건이 False일 때 실행하는 코드
 """

print("-"*20)
email="drwill@yahoo.co.kr"
a=email.split(".")
b='.'.join([a[1],a[2]])
print(b)


과일=['사과','배','딸기']

a='.'.join(과일)
print(a,type(a))

import re
# re: regular expression 정규표현식

# join 함수
homepage="drwill.co.kr"
b=re.split(r'\.', homepage)[-2:]
#  정규 표현식(re)의 split() 함수 사용
# r'\.' : '.'을 기준, 문자열 분리
print(b)
result='.'.join(b)
print(result)

part="abcdefbbbb".split("b",maxsplit=1)
print(part)
# 최대한 1번만 분리하라 >> 리스트로 변환

# for loop

""" for 반복문은 주로 시퀀스(리스트, 튜플, 문자열) 항목들을 순화하거나, 특정 횟수 동안 반복 작업 수행할 때 사용됨 """
""" 
for 변수 in 리스트(튜플, 문자열):
    수행 문장
    수행 문장 """

fruits=['사과','베','감','귤']

for fruit in fruits:
    print(fruit)

print('-'*20)

""" # while loop
while 반복문은 주어진 조건이 True일 때만 코드 블록을 계속 실행한다
조건이 False가 되면 반복이 종료됨

while 조건문:
    수행할 문장1
    수행할 문장2
    수행할 문장3 """

count=1
while count<6:
    print(count)
    count+=1

print("*"*20)
# 반복문 + 조건문

""" total=0
while True:
    num=int(input("input number!(exit when input num is 0)"))
    if num==0:
        break
    total+=num

print("total: ",total) """


#

number=1

while number<=100:
    if number%3==0:
        print(number)    
    number+=1

""" # 커피 자판기 만들기
    
choice=input("커피 자판기를 사용하시겠습니까?(yes/no)\n")
# \n: new line 한 줄 띄어서 출력, "" 안에 있어야 함!!

if choice=='yes':
    while True:
        money=int(input("돈 넣어주세요(숫자로 입력 예: 1000, 10000)\n"))
        number=int(input("숫자를 선택해 주세요. 1번 아이스 아메리카노 2번 라떼 3번 콜드브루\n"))

        if number==1:
            print(f"you chose ice americano, the change is {money-1000} won.")
        elif number==2:
            print(f"you chose latte, the change is {money-1500} won.")
        elif number==3:
            print(f"you chose cold brew, the change is {money-1000} won.")
        else:
            print("없는 메뉴입니다")
            break

        another=input("wanna more? y/n")
        if another=="y":
            continue
        elif another=="n":
            break
        else:
            print("없는 메뉴입니다")
            break
 """

# 함수

def make_apple_juice(apple):
    return "사과주스"

print(make_apple_juice("apple"))


# 매개변수 
def addition(a,b):
    return a+b

result=addition(1,3)
print(result)




