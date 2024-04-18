# append(): list 에서 추가

_list=[]
_list.append(1)
_list.append(2)
_list.append(3)
print(_list)

# sort() 정렬

list2=["banana","apple","caramel"]
list2.sort()
print(list2)
_list.sort(reverse=True)
print(_list)

""" sequence의 indexing과 slicing
    indexing: sequence 에서 한 원소를 가져옴
    Slicing: sequence에서 일부분을 가져옴 """


list_4=[1,2,3,4,5,6]
print(list_4[3:])
print(list_4[:])
print(list_4[::-1])

my_str="impossible"
my_list=["Apple","Banana","chamwea","Durian"]

print(my_str[2])
print(my_list[2:])

# sequence 길이와 멤버 조사하기

my_str="abc"
print(len(my_str)) # lenght 길이
print('d' in my_str) # False >> 존재 안함

# Dictionary  추가 연습

my_dict={"사과":"Apple","바나나":"banana","당근":"carrot"}

print(my_dict["당근"])

# 추가
my_dict["망고"]="mango"
print(my_dict)

# 가능?
bad_dict={1:"one",1:"yi","1":11}
print(bad_dict) # {1: 'yi', '1': 11} key는 중복되면 안 됨 값만 중복 가능!!

good_dict={1:['one','yi'],2:['two','er']}
print(good_dict)
print(good_dict[2])
print(good_dict[2][1])

""" aa={[1,2,3]:"num"}
print(aa)     aa={[1,2,3]:"num"}
TypeError: unhashable type: 'list' list는 키로 사용 불가!!!"""

b={(1,2,3): "num"}
print(b)
# 튜플은 가능하다 immutable >> 고정된 값 >> dict 가능

my_dict={}
my_dict[1]="integer"
my_dict["a"]="string"
my_dict[(1,2,3)]="tuple"


# try_ except : 에러 방지용
try:
    my_dict[[1,2,3]]="list"
except Exception as e:
    print("why error?", e) # why error? unhashable type: 'list'

try:
    a=set(1,2,3)
    my_dict[]="set"
except Exception as e:
    print("why error?", e)












