# 원소로 반복 for

my_sum=0 # 초기화

nums=[1,2,3]

for i in nums:
    my_sum=my_sum+i
    print("added ",i)

print("result:",my_sum)

nums=[1,2,3,4,5,6,7,8]

for i in nums:
    print(i)

# 변수 mix 에 있는 쌀알 갯수

mix="쌀"
mix='쌀'*100

count=0

for i in range(len(mix)):
    count+=1

print(count)

count=0
for i in mix:
    count+=1

print(count,"^^")

mix2=["쌀","보리","쌀"]*100

count2=0
for i in mix2:
    if i=="보리":
        print("yes!")
        count2+=1

print(count2)

# 반복할 숫자의 범위
print(range(10)) # range(0, 10)
print(list(range(10))) # [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

for i in range(15,11,-2):
    print(i)

for i in range(5):
    print("안녕!")

print("hello")

for i in range(10):
    print("hi!")


for i in range(1,10,1):
    for j in range(1,10,1):
        print(f"{i}*{j}={i*j}")


