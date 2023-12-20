num = int(input("Dame un numero: "))
i = 1
res = 1
if num == 1 or num == 0:
    print(f"{num}! = 1")
else:
    while i <= num:
        res *= i
        i += 1
    print(f"{num}! = {res}")