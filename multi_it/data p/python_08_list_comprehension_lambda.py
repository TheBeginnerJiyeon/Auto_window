number=[]

for i in range(11):
    number.append(i)

print(number)

num=[i for i in range(11)]
print(num)

# list_comprehension

list_x=[x for x in range(11)]
print(list_x)

odds=[x for x in range(11) if x%2==1]
print(odds)

odd2=[x for x in range(11) if x%2==1 and x<5]
print(odd2)

odd3=[]
for x in range(10+1):
    if x%2==1 and x<5:
        odd3.append(x)

odd4=[x for x in range(11) if x%2==1 if x<7]
print(odd4)

# 이중 for, list comprehension
가게=['올리브영','세븐일레븐','엘지25']
제품=['폰 충전기','물티슈','콜라']

살거=[(x,y) for x in 가게 if x=="올리브영" for y in 제품 if y=="콜라"]
print(살거)


# lambda 람다 // 
# 람다식: 매개변수와 매개변수가 들어간 식(함수) 한 줄 표현
# 매번 변수를 다르게 정의하기 귀찮아서 

a=lambda x,y: x+y
print(a(1,2)) 

print((lambda x,y: 2**x +3)(2,3))

print(lambda x,y: x+y) # <function <lambda> at 0x00000237C15B08B0> 함수다



