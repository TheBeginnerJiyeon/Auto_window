import re

txt = "The apple is dancing on the floor"
x = re.search(r"\ba\w+", txt)
print(x) # <re.Match object; span=(4, 9), match='apple'>

y=re.search(r"\bdan..",txt)
print(y) # <re.Match object; span=(13, 18), match='danci'>

z=re.findall(r" ",txt)
print(z) # [' ', ' ', ' ', ' ', ' ', ' ']


