# 한 줄, 여러 줄 주석 처리
""" alt + shift + a(바꿈)
print("mulcam")
print("hihi") """


# 원시 데이터 타입 int, float, string, boolean

num_int=30
print(type(num_int)) # <class 'int'>

num_float=30.012
print(type(num_float)) # <class 'float'>

# boolean

a= True or False
print(a) # True

# operation - parameter

x=6
y=3
result1=x+y
result2=x-y
result3=x*y
result4=x/y
print(result1,result2,result3,result4)

""" print(1/0) ZeroDivisionError: division by zero """

print(x//y) # 몫

print(x%y) # 나머지

x=2
result=x**4
print(result)

# 조건 연산자
x=400
y=456
print(x==y,x>=y,x<y) # False False True

# 사용자에게 입력받기

""" a=input("임의의 숫자를 입력: ")
b=input("임의의 숫자를 입력: ")
print(type(a)) # 임의의 숫자를 입력: 3, <class 'str'>
print(type(int(a))) # <class 'int'>
# 입력값은 문자 >> 숫자로 변환해준다
a=int(a)
b=int(b)
print(a,b)
print(a*b,type(a*b)) """

# 논리 연산자

print(True or False) # True
print((3>2) or (2<3)) # True

# string -1. 덧셈, 곱셈, indexing, slicing

a="boy"
b="loves"
c="girl"

letter= a +" " + b + " " + c + "forever"
x="야야야야야....사랑한다고"
print(x*5) # 사랑한다고.....사랑한다고.....사랑한다고.....사랑한다고.....사랑한다고.....

# indexing
print(x[-5:]) # [-5:-1]로 하면 마지막은 제외니까 안됨!! 헷갈리지 말 것

print()

email='drwill@naver.com'
print(email[:5])
print(email[7])

tel='010-5123-7890'

print(tel[-9:-5])

주소='서울시 강남구 대치3동 멀티캠퍼스 옆 pc방'

print(주소[4:7],주소[8:12])

전주소="  서울시 강남구 선릉역 1번 출구"
처리한_전주소=전주소.strip()
처리한_전주소=전주소.lstrip()
print(처리한_전주소)

# 이 주소로 가려면 어느 지하철 무슨역?
index=처리한_전주소.find("역")
print(index, 처리한_전주소[index-2:index+1]) 

print(처리한_전주소.index("역")) # 10. index는 숫자도 가능
print(처리한_전주소.find("역")) # 10

""" print(처리한_전주소.index("왈")) # ValueError: substring not found """
print(처리한_전주소.find("뢍")) # -1 value error 안냄

""" # index() 
- 문자열, 리스트, 튜플 다 가능
- 찾고자 하는 값이 존재하면 그 위치의 index 반환
- 단 찾는 값이 없으면 >> 에러 발생(value error)

# find 문자열에 사용
- 주로 문자열에 사용
- 찾고자 하는 값이 존재하면 그 위치의 index 반환
- 단 찾는 값이 없으면 -1 반환
- 문자열 검색 시 , 예외 처리가 필요없다는 장점 """

""" a=1,2,3,4,5
print(a.find(1)) # AttributeError: 'tuple' object has no attribute 'find' """


# 문장 중 문자열이 몇 번째인지 세는 함수
# .count() 메소드

text="hi my name is jy"
print(text.find("name")) # 6

# 문자열 수정

greeting="Hello, everyone~!"
""" greeting[0]="h" # TypeError: 'str' object does not support item assignment
print(greeting)  """

greeting=greeting.lower()
print(greeting) # hello, everyone~!

greeting='H'+greeting[1:]
print(greeting)

# 대문자로 전환, 소문자로 전환

greeting=greeting.upper()
print(greeting) # HELLO, EVERYONE~!

greeting=greeting.capitalize()
print(greeting) # Hello, everyone~!

greeting=greeting.title()
print(greeting) # Hello, Everyone~!


# replace(대체하다)

a=greeting.replace("Hello","방가루")
print(a) # 방가루, Everyone~!

# split
splited=a.split(" ")
print(splited) # ['방가루,', 'Everyone~!']
# sep로 분리한 후 리스트로 변환

# list 

from collections.abc import Sequence
# 시퀀스: 데이터에 순서가 있음(인덱싱, 슬라이싱)

my_num=100
my_string="hello"
my_list=[1,2,3]

# 주어진 객체가 시퀀스인지 확인하는 코드
# sequence class의 instance 인가요?
print(isinstance(my_num, Sequence))
print(isinstance(my_string, Sequence))
print(isinstance(my_list, Sequence))

# indexing 과 slicing

a=[400,300,200]
print(a[-2])

# 중첩리스트 (리스트 안 리스트)
my_list=[1,2,["variety","is","the","spice","of","life"],4,5]

print(my_list[2][3:])

# List main method
# append, extend

txt=["I","like"]
a=txt.append("your smile")

print(txt) # ['I', 'like', 'your smile']
print(a) # None.  return값은 None이다/ 함수 정의

txt=["Do","You"]
txt.extend(["like","coffee?"]) # extend the elements from iterable
print(txt)

# append vs extend

# append: ..list 끝에 새로운 값 입력, 리스트나 다른 자료형 요소 추가 가능
my_list22=[1,2,3]
my_list22.append(4)
print("list2",my_list22)

my_list22.append([5,6])
print("list2",my_list22)


# extend : list(또는 string 같은 다른 interable에서)에 다른 list의 모든 요소 추가 >> 리스트 확장
TXT2=["do","you"]
TXT2.extend(["like","coffeeee?"])
print("txt2",TXT2)

TXT2.extend("like")
print(TXT2) # ['do', 'you', 'like', 'coffeeee?', 'l', 'i', 'k', 'e']



# insert
nums=[0,1,3,4]
nums.insert(2,2)
print(nums) 

letter=["you","are","my","love"]
letter[3]="everything"
print(letter[3])

letter.remove("are")
print(letter)

nums=[3,1,20,5,6]
nums.sort()
print(nums) # default=ascend

nums.sort(reverse=True)
print(nums)

# Tuple 

_tuple=("하이",1,3,14)
print(_tuple)
print(type(_tuple)) # <class 'tuple'>

tuple2=("Hi",[1,2,3],(3.14, 1.35, 4.26))
# tuple도 순서가 있다(인덱싱, 슬라이싱)\
""" tuple2[0]=0 # TypeError: 'tuple' object does not support item assignment """
""" del tuple2["Hi"] # TypeError: 'tuple' object does not support item deletion """

print(tuple2[2]) # (3.14, 1.35, 4.26)
print(tuple2[2][1]) # 1.35

list3=["Hi",1,3.14]
list3[0]=0
print(list3) # 리스트에서 인덱스, 슬라이싱 가능

del list3[2]
print(list3) # list 에서 del 이용해 특정 값 제거(인덱싱)


my_tuple=("Love","Love","Love","Love","Love")
print(my_tuple)
print(my_tuple.count("Love")) # 5
""" print(my_tuple.index("Hate")) # ValueError: tuple.index(x): x not in tuple """
print(my_tuple.index("Love")) # 0


# 딕셔너리 dictionary
dict1={"name":"will",
       "age":20,
       "shopping":[1,2,3]}
print(dict1)
print(type(dict1)) # <class 'dict'>
print(dict1["age"]) # indexing
dict1['country']="korea"
print(dict1) # {'name': 'will', 'age': 20, 'shopping': [1, 2, 3], 'country': 'korea'}
dict1["shopping"]="bag"
print(dict1) # {'name': 'will', 'age': 20, 'shopping': 'bag', 'country': 'korea'}

del dict1["shopping"]
print(dict1) # {'name': 'will', 'age': 20, 'country': 'korea'}



# \ : 줄 바꿈, 개행문자
your_dict=\
    {"name":"will",
       "age":20,
       "shopping":[1,2,3]}

print(dict1.keys()) # dict_keys(['name', 'age', 'country'])
print(list(dict1.keys())) # ['name', 'age', 'country']
print(dict1.values()) # dict_values(['will', 20, 'korea'])

valuelist=list(dict1.values())
print(valuelist) # ['will', 20, 'korea']


print(dict1.items()) # dict_items([('name', 'will'), ('age', 20), ('country', 'korea')]) 

item_list=dict1.items()

for k,v in item_list:
    print(k,v)


# 조건문
    
a=31
b=31

if a > b:
    print("a>b")
elif a==b:
    print("a==b")
else:
    print("a<b")


txt=" I don't care, please let me go"

if "let" in txt:
    print("let 존재") # let 존재
else:
    print("not exist")

# 반복문 사용 이유: 효율성!!
# for loop

print(range(10)) # range(0, 10)
print(list(range(10))) # [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]


for i in range(1,11):
    print(f"{i}번째 hi!")

else:
    print("종료") # 10번째 종료. for 다음에도 else를??


my_list=[10,20,30]
for i in my_list:
    print(i)
      

# enumerate
# 반복가능한(iterable) 객체(리스트, 튜플, 문자열) 입력으로 받아서
# 인덱스, 해당요소를 포함하는 내용 >> 반복문    

""" # for index, value in enumerate(반복가능한 객체):
    처리할 작업코드 """

fruits=['사과','배','체리','딸기']

# f string
for i, fruit in enumerate(fruits):
    print(f"{i}(인덱스)번째 과일은 {fruit}입니다")

# 한국-태국전 라인업 리스트 생성 후, enumerate 사용해
# 한국 축구대표팀 라인업 명단을 만들기
    
thai_soccer_players = ["Chatchai","Bihr","Kritsada","Narubadin",  "Theerathon","Phitiwat","Thanawat","Sarach","Chanathip","Teerasil",    "Supachok"
]

korean_soccer_players = ["Jung Sung-ryong","Cho Yong-hyung","Lee Jung-soo","Cha Du-ri","Lee Young-pyo","Ki Sung-yueng","Kim Jung-woo", "Lee Chung-yong","Park Ji-sung","Park Chu-young","Yeom Ki-hun"]

soccer_positions = ["골키퍼 (Goalkeeper)", "우외수 (Right-back)", "좌외수 (Left-back)", "중앙 수비수 (Center-back)", "중앙 수비수 (Center-back)", "수비형 미드필더 (Defensive midfielder)", "오른쪽 윙어 (Right winger)", "중앙 미드필더 (Central midfielder)", "공격수 (Striker)", "공격형 미드필더 (Attacking midfielder)", "왼쪽 윙어 (Left winger)"]

for i,v in enumerate(korean_soccer_players):
    print(f"한국 대표팀 {soccer_positions[i]}는 {v}입니다.")

for i,v in enumerate(thai_soccer_players):
    print(f"태국 대표팀 {soccer_positions[i]}는 {v}입니다.")

team_korea=['조현우','김영권','김영재','백승호']
for i,player in enumerate(team_korea):
    print(f"국가대표팀 {i+1}번째 선수는 {player}입니다.")

num_lists=[10,20,30]

for i, num in enumerate(num_lists):
    print(i+1,num)

# 실생활 응용
# 단가
prices=[1.2,3.4,2.5]

# 판매량
total_sales=[100,80,90]

for sales, price in zip(total_sales, prices):
    revenue=sales*price
    print(f"매출액: {revenue}")
# zip은 원소 갯수가 작은 것 까지 진행된다

# zip함수 : 두 개 이상의 반복(iterable)가능한 객체(list, tuple, string)을 병렬로 묶는 함수
# 각각 반복 가능 객체 같은 인덱스 요소 묶어서 튜플로 만듦

names=["양진욱","김민재","김지우","박소현","김선규","성수린"]
ages=[x for x in range(20,27)]
heights=[x for x in range(177,184)]

for name, age, height in zip(names,ages,heights):
    print(f"{name}의 나이는 {age}살이고 키는 {height}cm 입니다.")

# While
    
for i in range(3):
    print(i)

# for문 차이
    
while True: # break 필요!!
    print("무한반복 지옥 안 돼")
    break

i=1
while i<=10: # 정지조건
    print(f"{i}번째 사과")
    i+=1

# 사용자 정의 함수
    
def func1(para1,para2):
    price("function execution!")
    return 0

def add(num1, num2):
    result=num1+num2
    return result

print(add(20,40))

a=20
b=30
temp=add(a,b)
print(temp)

def fum2(a,v):
    return  # None 아무 것도 반환하지 않는다

print(fum2(1,2))  # None

def addition(num1,num2):
    result=num1+num2
    print(result)

a=20
b=40

print(addition(a,b))

def 더하기(num1,num2,num3=3,num4=0):
    result=num1+num2+num3+num4
    return result

print(더하기(1,2))

while True:
    int(input("size input"))
    










