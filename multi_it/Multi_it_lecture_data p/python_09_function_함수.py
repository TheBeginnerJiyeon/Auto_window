def hello():
    print("hello!")

hello()  # call.   hello!

def love_proof():
    print("love you really!!")

love_proof()

for i in range(5):
    for i in range(5):
        hello()

def no_more():
    print("nono")

[love_proof() for i in range(10) for j in range(2)]

count=0 # initialization

def thank_you():
    print("감사합니다")

thank_you()

while True:
    thank_you()
    count+=1
    if count==10:
        break

print(count)


# 매개변수가 있는 함수 정의

def hello(*names,**names2):
    for name in names:
        print(f"{name}님 환영합니다!!")
    for name in names2:
        print(f"{name}님 환영합니다!!")
  
hello("안지연") # 하나해도 * 임의 위치 변수로 for 가능!!!
hello("dkswldus","dkswl")

# 반환값이 있는 함수 return

def add_number(nums):
    new_num=[]
    for num in nums:
        num+=1
        new_num.append(num)

    return new_num

print(add_number([1,2,3,4,5]))


my_tuple=3,1,2,4

print(my_tuple)

print(sum(my_tuple))

print(len(my_tuple))

my_list=[10,20,30,40,50]

print(sum(my_list))

var1=sum(my_list)
var2=len(my_list) # 갯수 n
mean=var1/var2
print(f"{var1}/{var2}={mean}")


# 사용자 정의 함수

def plus(a,b):
    return a+b

print(plus(1,2))

def plus_print(a,b):
    print(a+b)

plus_print(1,4
           )
# cf 비교: return 값 있는 것은?
# return값 이용, 메모리 공간에 있는 a*b를 반환하라는 의미
def times_return(a,b):
    return a*b

print([a*b for a in [2] for b in [3]])

# method

my_list=[5,4,3,2,1]
my_list.append(50)
# 원소를 추가하는 매소드(리스트 뒤에 추가된 값)
print(my_list)

my_list.sort(reverse=False)
print(my_list)

my_dict={"one":1,"two":2,"three":3}

print(my_dict.keys(),type(my_dict.keys()))

print(my_dict.values(),type(my_dict.values()))

# 인자와 매개변수

def plusDouble(a,b): # 위치매개변수 (positional parameter)
    return 2*(a+b)

print(plusDouble(3,4)) # 임의로 입력한 값인 3,4를 인자라고 부른다

def solve(a,b): # a,b 매개변수
    return a*b

# solve() 함수에 3,4, 인자를 넣어보세요
print(solve(3,4))

print(solve(3,["너 생각"])) # ['너 생각', '너 생각', '너 생각']

def get_students(n):
    students={}    
    for i in range(n):
        value={}
        name=input("input name!")
        score=int(input("score"))
        value["score"]=score
        students[name]=value
    return students

def get_grade(score):
    if score>=90:
        return "A"
    elif score>=80:
        return "B"
    elif score>=70:
        return "C"
    elif score>=60:
        return "D"
    else:
        return"Failed..TT"
    
n= int(input("number of students"))
students=get_students(n)

for student_name in students:
    grade=get_grade(students[student_name]["score"])
    students[student_name]["grade"]=grade
    print(student_name,"got",grade)

print(students) # {'dkswl': {'score': 100, 'grade': 'A'}, 'wldus': {'score': 100, 'grade': 'A'}}

# 함수 vs method

print([my_dict.keys()]) # [dict_keys(['one', 'two', 'three'])]
print(list(my_dict)) # ['one', 'two', 'three']








