# 조건문

""" if (A):
        pass
    elif (B):
        pass
    else:
        break
 """

# 주민등록번호로 성별(남/여) 구분하기

try:
    num= int(input("input the number!!"))
    if num % 2==0: # 나머지가 0인 짝수
        print("여자")
    elif num%2==1:
        print("남자")
except Exception as e:
    print("error occured..",e)

# 의류 사이즈 분류 150/190

size=int(input("number"))
if size<=150:
    print("아동용")
elif size>=190:
    print("맞춤옷")
else:
    print("성인용")


# for 반복문  .  for i in range

print(range(3))
print(type(range(3)))
print(list(range(3)))  

for i in range(1,4):
    for j in range(1,10):
        print(f"{i}x{j}={i*j}")

# while 무한반복, 정지조건(pass, continue, break)
# break: while 반복문 밖으로
# continue: 다음 코드 실행 안하고 넘어감
# pass: 아무것도 하지 않고 넘어감

number=0

while number<5:
    print(number)
    number+=1

number=0
while True:
    if number>=5:
        break
    else:
        print(number)
        number+=1

# continue
        
number=0

while number<=4:    
    if number>5:
        continue
    print(number)
    number+=1

# pass
    
number=0

while number<6:
    if number%2==0:
        print(number,"even")
    else:
        print(number,"odd")
    number+=1
    


