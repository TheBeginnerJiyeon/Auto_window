# 딕셔너리의 정의, 추가, 삭제 접근

car = {
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}

for k,v in car.items():
    print(k,v)

""" print(car["hi"]) KeyError: 'hi' """
print(car.get("hi")) # None

car2={}
for k,v in car.items():
    k,v=v,k
    car2[k]=v

print(car2)

dict_a={}
dict_b={"A":1,"B":"Baby",3:3.14,4:"four"}
# 여러 데이터 타입을 섞을 수 있음 >> 컬렉션 타입

dict_c={"flower":['진달래','개나리','목련']}

# 추가
# >> key-value 쌍을 명시해 주어야 함
# 딕션어리는 순서가 없음
# 접근: 반드시 'key'로 접근한다

dict_a['감탄사']='wow'
print(dict_a)
print(dict_a['감탄사'])
""" print(dict_a['wow']) KeyError: 'wow' """

# 삭제: key를 전달해 준다.\
del dict_a['감탄사']
print(dict_a)

# 딕션어리 함수

# keys
print(dict_b)
print(dict_b.keys())
print(type(dict_b.keys())) # <class 'dict_keys'> numpy array

# values: 딕셔너리의 값(value)만 보여줌
print(dict_b.values())

# items (제일 많이 보게될 거에요)
# tuple 형태로 key-value 쌍으로 짝지어 전달함

print(dict_b.items())
print(type(dict_b.items()))

# get: key를 전달하여 값을 가져옴
print(dict_b.get(3))
print(dict_b.get(7)) # None. 값이 없어서 오류도 안 남

# in은 'key'값의 유무를 확인
print(5 in dict_b)

# clear()은 딕셔너리의 모든 요소를 삭제한다
dict_b.clear()

print(dict_b)










